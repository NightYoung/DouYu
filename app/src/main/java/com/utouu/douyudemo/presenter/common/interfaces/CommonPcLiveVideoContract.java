package com.utouu.douyudemo.presenter.common.interfaces;


import android.content.Context;

import com.utouu.douyudemo.base.BaseModel;
import com.utouu.douyudemo.base.BasePresenter;
import com.utouu.douyudemo.base.BaseView;
import com.utouu.douyudemo.model.logic.common.bean.OldLiveVideoInfo;

import okhttp3.Request;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:29
 **/
public interface CommonPcLiveVideoContract {

      interface View extends BaseView {
           void getViewPcLiveVideoInfo(OldLiveVideoInfo mLiveVideoInfo);
      }
    interface  Model extends BaseModel{
        Request getModelPcLiveVideoInfo(Context context, String room_id);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
              public abstract  void getPresenterPcLiveVideoInfo(String room_id);
      }

}
