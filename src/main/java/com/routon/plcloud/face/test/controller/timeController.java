package com.routon.plcloud.face.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/time")
public class timeController {
	private Logger logger = LoggerFactory.getLogger(timeController.class);
	@RequestMapping("/attendanceRecord")
    public String attendanceRecord(){
    	
		return "conferenceManage/attendanceRecord";
    }
	
	@RequestMapping("/calendar")
    public String showFaceCompare(){
    	return "time/calendar";
    }
	
	@RequestMapping("/exportRecord")
    public String exportRecord(){
		logger.info("导出test====================11");
		System.err.println("导出test====================");
		return "conferenceManage/exportRecord";
    }
	
	/**
	 * 获取指定时间段的所有周末日期
	 * @param dBegin
	 * @param dEnd
	 * @return
	 */
	/*@RequestMapping("/queryTime2TimeWeekend")
	@ResponseBody
	public String findDates(String startTime, String endTime){
		  List<String> lDate = new ArrayList<String>();
		  Map<String, String> map = new HashMap<String, String>();
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		  
		  Date dBegin = null;
		  Date dEnd = null;
		  try {
			  dBegin = sdf.parse(startTime);
			  dEnd = sdf.parse(endTime);
		  } catch (Exception e) {
			  System.err.println("起始时间为空");
		  }
		
		  Calendar calBegin = Calendar.getInstance();
		  // 使用给定的 Date 设置此 Calendar 的时间
		  calBegin.setTime(dBegin);
		  Calendar calEnd = Calendar.getInstance();
		  // 使用给定的 Date 设置此 Calendar 的时间
		  calEnd.setTime(dEnd);
		  // 测试此日期是否在指定日期之后
		  while (dEnd.after(calBegin.getTime())){
			   // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
			   calBegin.add(Calendar.DAY_OF_MONTH, 1);
			   calBegin.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			   String sat_time = sdf.format(calBegin.getTime());
			   if(sat_time.compareTo(sdf.format(dBegin)) >= 0 && sdf.format(dEnd).compareTo(sat_time) >= 0){
				   lDate.add(sat_time);
			   }
			   
			   calBegin.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
			   String sun_time = sdf.format(calBegin.getTime());
			   if(sun_time.compareTo(sdf.format(dBegin)) >= 0 && sdf.format(dEnd).compareTo(sun_time) >= 0){
				   lDate.add(sun_time);
			   }
		  }
		  for(String time : lDate){
				map.put(time, "休");
	      }
		  return JSON.toJSONString(map);
	 }
	
	@RequestMapping("/queryYearTime")
	@ResponseBody
    public String queryTimeList(int year) {
		SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
		List<String> dateList = new ArrayList<String>();
		Map<String, String> map = new HashMap<String, String>();
				
		//int year = Calendar.getInstance().get(Calendar.YEAR);
		Calendar calendar = new GregorianCalendar(year, 0, 1);
		
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		String nowtime = "2019-11-03";
		
		int i = 1;
		while (calendar.get(Calendar.YEAR) < year + 1) {
		  calendar.set(Calendar.WEEK_OF_YEAR, i++);
		  calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		  if (calendar.get(Calendar.YEAR) == year) {
			  String time = simdf.format(calendar.getTime());
			  if(time.compareTo(nowtime) > 0){
				  dateList.add(time);
			  }
		  }
		  calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		  if (calendar.get(Calendar.YEAR) == year) {
			  String time = simdf.format(calendar.getTime());
			  if(time.compareTo(nowtime) > 0){
				  dateList.add(time);
			  }
		  }
		}
		
		for(String time : dateList){
			map.put(time, "休");
		}
		return JSON.toJSONString(map);
	}
	
	@RequestMapping("/queryMonthTime")
	@ResponseBody
	public String getWeekendInMonth(int year, int month) {
		Map<String, String> map = new HashMap<String, String>();
		List<String> list = new ArrayList<>();
		String monthStr = "";
		String dayStr = "";
		
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.YEAR, year);// 不设置的话默认为当年
	    calendar.set(Calendar.MONTH, month - 1);// 设置月份
	    calendar.set(Calendar.DAY_OF_MONTH, 1);// 设置为当月第一天
	    int daySize = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// 当月最大天数
	    if (month >= 1 && month <= 9) {
            monthStr = "0" + month;
        }else{
        	monthStr = ""+month;
        }
	    for (int i = 0; i < daySize-1; i++) {
	        calendar.add(Calendar.DATE, 1);//在第一天的基础上加1
	        int week = calendar.get(Calendar.DAY_OF_WEEK);
	        if (week == Calendar.SATURDAY || week == Calendar.SUNDAY) {// 1代表周日，7代表周六 判断这是一个星期的第几天从而判断是否是周末
	            int day = calendar.get(Calendar.DAY_OF_MONTH);
	            if (day >= 1 && day <= 9) {
	            	dayStr = "0" + day;
	            }else{
	            	dayStr = "" + day;
	            }
	        	list.add(year+"-"+monthStr+"-"+ dayStr);// 得到当天是一个月的第几天
	        }
	    }
	    
	    for(String time : list){
			map.put(time, "休");
		}
		return JSON.toJSONString(map);
	}*/
	
}
