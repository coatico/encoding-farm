/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.web.dto;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thomas
 */
public class VideoDto {

	private List<VideoListDetailDto> list=new LinkedList<>();
	private VideoDetailDto detail = new VideoDetailDto();

	public List<VideoListDetailDto> getList() {
		return list;
	}

	public void setList(List<VideoListDetailDto> list) {
		this.list = list;
	}

	public VideoDetailDto getDetail() {
		return detail;
	}

	public void setDetail(VideoDetailDto detail) {
		this.detail = detail;
	}

}
