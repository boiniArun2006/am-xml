package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class KeyEventDispatcher {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f36731n;
    private static Field nr;
    private static Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f36732t;

    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean O(Component component, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (component == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? component.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? rl((Activity) callback, keyEvent) : callback instanceof Dialog ? t((Dialog) callback, keyEvent) : (view != null && ViewCompat.KN(view, keyEvent)) || component.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener J2(Dialog dialog) {
        if (!f36732t) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                nr = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f36732t = true;
        }
        Field field = nr;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean n(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f36731n) {
            try {
                rl = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f36731n = true;
        }
        Method method = rl;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    public static boolean nr(View view, KeyEvent keyEvent) {
        return ViewCompat.xMQ(view, keyEvent);
    }

    private static boolean rl(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && n(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.KN(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        } else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch(activity, keyDispatcherState, activity);
    }

    private static boolean t(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        DialogInterface.OnKeyListener onKeyListenerJ2 = J2(dialog);
        if (onKeyListenerJ2 != null && onKeyListenerJ2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.KN(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        } else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch(dialog, keyDispatcherState, dialog);
    }
}
