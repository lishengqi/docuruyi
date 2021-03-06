package com.ruoyi.project.system.project.service;

import com.ruoyi.project.system.project.domain.Project;
import java.util.List;

/**
 * 平台等立项文件 服务层
 * 
 * @author daivd
 * @date 2019-11-10
 */
public interface IProjectService 
{
	/**
     * 查询平台等立项文件信息
     * 
     * @param projectId 平台等立项文件ID
     * @return 平台等立项文件信息
     */
	public Project selectProjectById(Integer projectId);
	
	/**
     * 查询平台等立项文件列表
     * 
     * @param project 平台等立项文件信息
     * @return 平台等立项文件集合
     */
	public List<Project> selectProjectList(Project project);
	
	/**
     * 新增平台等立项文件
     * 
     * @param project 平台等立项文件信息
     * @return 结果
     */
	public int insertProject(Project project);
	
	/**
     * 修改平台等立项文件
     * 
     * @param project 平台等立项文件信息
     * @return 结果
     */
	public int updateProject(Project project);
		
	/**
     * 删除平台等立项文件信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteProjectByIds(String ids);
	
}
