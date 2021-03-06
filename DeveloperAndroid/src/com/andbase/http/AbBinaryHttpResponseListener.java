/*
 * Copyright (C) 2013 www.418log.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.andbase.http;




// TODO: Auto-generated Javadoc
/**
 * 
 * Copyright (c) 2012 All rights reserved
 * 名称：AbBinaryHttpResponseListener.java 
 * 描述：Http二进制响应监听器
 * @author zhaoqp
 * @date：2013-11-13 上午9:00:52
 * @version v1.0
 */
public class AbBinaryHttpResponseListener extends AbHttpResponseListener{
	
	 /** The Constant TAG. */
    private static final String TAG = "AbBinaryHttpResponseListener";
	
	public AbBinaryHttpResponseListener() {
		super();
	}
	
	/**
	 * 描述：获取数据成功会调用这里.
	 */
    public void onSuccess(int statusCode,byte[] content) {};
    
    
    /**
     * 成功消息.
     */
    public void sendSuccessMessage(int statusCode,byte[] content){
    	sendMessage(obtainMessage(SUCCESS_MESSAGE, new Object[]{statusCode, content}));
    }
    

}
