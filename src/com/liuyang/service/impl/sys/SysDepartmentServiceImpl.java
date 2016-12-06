package com.liuyang.service.impl.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysdepartmentMapper;
import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.pojo.sys.SysdepartmentExample;
import com.liuyang.pojo.sys.SysdepartmentExtend;
import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.service.sys.SysDepartmentService;
import com.liuyang.utils.ShiroUtil;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.SysdepartmentVo;
import com.liuyang.vo.sys.SysfieldVo;

@Service
public class SysDepartmentServiceImpl  implements SysDepartmentService{
    @Autowired
    SysdepartmentMapper mapper;
    
    @Override
	public Sysdepartment getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Sysdepartment model) throws Exception {
		model.setId(0);
		ChangeModuleCascade(model);
		model.setCreatetime(new Date());
		model.setCreateperson(ShiroUtil.getSysUserName());
		if(model.getParentid()==null){
			model.setParentid(0);
		}
		return mapper.insert(model);
	}

	@Override
	public void update(Sysdepartment model) throws Exception {
		ChangeModuleCascade(model);
		mapper.updateByPrimaryKeySelective(model);
		
	}

	@Override
	public int delete(String ids) throws Exception {
		String[] iStrings = ids.split(",");
		return mapper.deleteByIds(iStrings);
	}
	@Override
	public List<Sysdepartment> getList() {
		SysdepartmentExample example=new SysdepartmentExample();
		SysdepartmentExample.Criteria criteria=example.createCriteria();
		return mapper.selectByExample(example);
	}

	@Override
	public SysdepartmentVo GetSubOrgs(SysdepartmentVo vo) {
		SysdepartmentVo vo2 = new SysdepartmentVo();
		vo.setPageIndex((vo.getPageNumber() - 1) * vo.getPageSize());
		vo2.setRows(mapper.selectTable(vo));
		vo2.setTotal(mapper.getAllCount());
		return vo2;
	}

   /**
    * 修改对象的级联ID，生成类似XXX.XXX.X.XX
    * @param model
    */
	private void ChangeModuleCascade(Sysdepartment model){
		String cascadeId="";
		int currentCascadeId = 1;  //当前结点的级联节点最后一位
		model.setParentid(model.getParentid()==null?0:model.getParentid());
		List<Sysdepartment> sysdepartments=mapper.selectDepartMentByParent(model);
		for (Sysdepartment sysdepartment : sysdepartments) {
            String[] strArray=sysdepartment.getCascadeid().split("\\.");
			int objCascadeId = Integer.parseInt(strArray[strArray.length-1]);
			if (currentCascadeId <= objCascadeId) currentCascadeId = objCascadeId + 1;
			
		}
		
		if (model.getParentid()!= 0) {
			Sysdepartment parentOrg = mapper.selectFirst(model);
			if (parentOrg != null) {
				cascadeId = parentOrg.getCascadeid() + "." + currentCascadeId;
				model.setParentname(parentOrg.getName()); 
			}
			else {
			
			}
		}
		else {
			cascadeId = "0." + currentCascadeId;
			
		}

		model.setCascadeid(cascadeId); 
	}
	

}
