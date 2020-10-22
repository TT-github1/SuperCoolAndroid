package com.tthappy.supercoolandroid.utils.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import java.util.List;

public class AppUtils {

    public static boolean checkPermissions(Context context, String permission) {
        if(context == null){
            return false;
        }

        PackageManager localPackageManager = context.getPackageManager();
        return localPackageManager.checkPermission(permission, context.getPackageName()) == PackageManager.PERMISSION_GRANTED;
    }

    /**
     * Get the current application version number
     */
    public static String getVersion(Context context) {
        String versionName = "";
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TextUtils.isEmpty(versionName) ? "" : versionName;
    }

    /**
     * To determine whether it contains a gyroscope
     */
    public static boolean isHaveGravity(Context context) {
        SensorManager manager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        if (manager == null) {
            return false;
        }
        return true;
    }

    /**
     * get PackageName
     */
    public static String getPackageName(Context context) {
        try {
            ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);

            List<ActivityManager.RunningTaskInfo> tasks = am.getRunningTasks(1);

            if (tasks != null && !tasks.isEmpty()) {
                return tasks.get(0).topActivity.getPackageName();
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 检测应用是否在前台运行
     */
    public static boolean isAppInForeground(Context context) {
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        return packageName.equalsIgnoreCase(getPackageName(context));
    }

    /**
     * 获取TelephonyManager
     */
    public static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    }

    /**
     * 获取PackageManager
     */
    public static PackageManager getPackageManager(Context context) {
        return context.getPackageManager();
    }

    /**
     * 返回手机已经安装包的list
     */
    public static List<PackageInfo> getInstalledPackages(Context context) {
        PackageManager pm = getPackageManager(context);
        return pm.getInstalledPackages(PackageManager.GET_PERMISSIONS);
    }

    /**
     * 获取ActivityManager
     */
    public static ActivityManager getActivityManager(Context context) {
        return (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
    }

    /**
     * 获取ConnectivityManager
     */
    public static ConnectivityManager getConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    /**
     * 获取WifiManager.
     */
    public static WifiManager getWifiManager(Context context) {
        if (context == null) {
            return null;
        }
        return (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }

    public static boolean isActivityDead(Activity activity) {
        return activity != null && (activity.isFinishing() || isActivityDestroyed(activity));
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && activity.isDestroyed();
    }
}
