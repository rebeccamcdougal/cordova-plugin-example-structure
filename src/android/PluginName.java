package com.testingplugin.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import android.app.Activity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//include any other imports

public class PluginName extends CordovaPlugin {


  @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("yourFunction")) {

            // Extract media path
            JSONObject options = data.getJSONObject(0);
            String item1 = options.optString("item1", "");
            String item2 = options.optString("item2", "");
            System.out.println("1: "+ item1 + "1: "+ item2);
            Activity activity = this.cordova.getActivity();
            activity.runOnUiThread(this.yourFunction(activity, item1, item2));
            return true;
        } else {
            return false;
        }
    }

    private Runnable yourFunction(final Activity mainActivity, final String item1, final String item2){

       System.out.println("Inside of yourFunction");

        return new Runnable() {
            public void run() {
                if (mainActivity != null) {
                    System.out.println("2: "+ item1 + "2: "+ item2);
                    //Run your code here

                } else {
                     return;
                }
            }
        };
    }
}