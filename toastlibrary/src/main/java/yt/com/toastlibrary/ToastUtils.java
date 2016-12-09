package yt.com.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by LSM on 2016/12/9.
 */
public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
