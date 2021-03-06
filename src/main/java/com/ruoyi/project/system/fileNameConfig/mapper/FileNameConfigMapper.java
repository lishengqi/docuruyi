package com.ruoyi.project.system.fileNameConfig.mapper;

import com.ruoyi.project.system.fileNameConfig.domain.FileNameConfig;
import java.util.List;	

/**
 * 文件命名配置 数据层
 * 
 * @author daivd
 * @date 2019-08-30
 */
public interface FileNameConfigMapper 
{
	/**
     * 查询文件命名配置信息
     * 
     * @param fileNameId 文件命名配置ID
     * @return 文件命名配置信息
     */
	public FileNameConfig selectFileNameConfigById(Integer fileNameId);
	
	/**
     * 查询文件命名配置列表
     * 
     * @param fileNameConfig 文件命名配置信息
     * @return 文件命名配置集合
     */
	public List<FileNameConfig> selectFileNameConfigList(FileNameConfig fileNameConfig);
	
	/**
     * 新增文件命名配置
     * 
     * @param fileNameConfig 文件命名配置信息
     * @return 结果
     */
	public int insertFileNameConfig(FileNameConfig fileNameConfig);
	
	/**
     * 修改文件命名配置
     * 
     * @param fileNameConfig 文件命名配置信息
     * @return 结果
     */
	public int updateFileNameConfig(FileNameConfig fileNameConfig);
	
	/**
     * 删除文件命名配置
     * 
     * @param fileNameId 文件命名配置ID
     * @return 结果
     */
	public int deleteFileNameConfigById(Integer fileNameId);
	
	/**
     * 批量删除文件命名配置
     * 
     * @param fileNameIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteFileNameConfigByIds(String[] fileNameIds);
	
}