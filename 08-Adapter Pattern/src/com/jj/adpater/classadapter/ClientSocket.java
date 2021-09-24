package com.jj.adpater.classadapter;

/**
 * 用户的插座
 * @author 张俊杰
 * @date 2021/9/24  - {TIME}
 */
public class ClientSocket {
    private UsbService usbService;
    public ClientSocket(UsbService usbService){
        this.usbService = usbService;
    }
    public void use(){
        usbService.useUsb();
    }

}
