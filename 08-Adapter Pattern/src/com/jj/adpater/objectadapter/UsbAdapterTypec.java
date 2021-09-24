package com.jj.adpater.objectadapter;

/**
 * @author 张俊杰
 * @date 2021/9/24  - {TIME}
 */
public class UsbAdapterTypec  implements UsbService {
    private TypecService typecService;

    public UsbAdapterTypec(TypecService typecService){
        this.typecService = typecService;
    }
    @Override
    public void useUsb(){
        typecService.userTypeC();
    }
}
