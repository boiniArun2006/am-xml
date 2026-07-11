package Zfb;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.internal.vd;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre {
    private static Method nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f12562n = new Wre();
    private static final String rl = Wre.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static WeakReference f12563t = new WeakReference(null);

    private final float[] az(View view) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r3[0], r3[1]};
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private static final boolean HI(View view) {
        if (VmF.j.nr(Wre.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Wre wre = f12562n;
            Class clsJ2 = wre.J2("android.support.v4.view.NestedScrollingChild");
            if (clsJ2 != null && clsJ2.isInstance(parent)) {
                return true;
            }
            Class clsJ22 = wre.J2("androidx.core.view.NestedScrollingChild");
            if (clsJ22 != null) {
                if (clsJ22.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return false;
        }
    }

    public static final View.OnTouchListener KN(View view) {
        Field declaredField;
        try {
            if (VmF.j.nr(Wre.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                    return (View.OnTouchListener) obj2;
                } catch (NoSuchFieldException e2) {
                    vd.z(rl, e2);
                }
            } catch (ClassNotFoundException e3) {
                vd.z(rl, e3);
            } catch (IllegalAccessException e4) {
                vd.z(rl, e4);
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final View.OnClickListener Uo(View view) {
        Field declaredField;
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String gh(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                charSequenceValueOf = (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) ? null : selectedItem.toString();
            } else if (view instanceof DatePicker) {
                int year = ((DatePicker) view).getYear();
                int month = ((DatePicker) view).getMonth();
                int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                Intrinsics.checkNotNullExpressionValue(charSequenceValueOf, "format(format, *args)");
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                int iIntValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                int iIntValue2 = currentMinute.intValue();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                Intrinsics.checkNotNullExpressionValue(charSequenceValueOf, "format(format, *args)");
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ((RadioGroup) view).getChildAt(i2);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        charSequenceValueOf = ((RadioButton) childAt).getText();
                        break;
                    }
                }
            } else if (view instanceof RatingBar) {
                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
            }
            if (charSequenceValueOf == null) {
                return "";
            }
            String string = charSequenceValueOf.toString();
            return string == null ? "" : string;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final ViewGroup mUb(View view) {
        if (VmF.j.nr(Wre.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final View n(View view) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f12562n.Ik(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                VmF.j.rl(th, Wre.class);
            }
        }
        return null;
    }

    public static final JSONObject nr(View view) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f12563t = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                o(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List listRl = rl(view);
                int size = listRl.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put(nr((View) listRl.get(i2)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e2) {
                Log.e(rl, "Failed to create JSONObject for view.", e2);
                return jSONObject;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final void o(View view, JSONObject json) {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strGh = gh(view);
                String strXMQ = xMQ(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", t(view));
                json.put("id", view.getId());
                if (Ml.Uo(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", vd.gh(vd.EWS(strGh), ""));
                }
                json.put("hint", vd.gh(vd.EWS(strXMQ), ""));
                if (tag != null) {
                    json.put("tag", vd.gh(vd.EWS(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", vd.gh(vd.EWS(contentDescription.toString()), ""));
                }
                json.put("dimension", f12562n.O(view));
            } catch (JSONException e2) {
                vd.z(rl, e2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    private final View qie(float[] fArr, View view) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ty();
            Method method = nr;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.view.View");
                    View view2 = (View) objInvoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                        return (View) parent;
                    }
                } catch (IllegalAccessException e2) {
                    vd.z(rl, e2);
                } catch (InvocationTargetException e3) {
                    vd.z(rl, e3);
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                declaredField2.set(obj, onClickListener);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    public static final List rl(View view) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i2));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final int t(View view) {
        if (VmF.j.nr(Wre.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            int i2 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i2 |= 32;
            }
            if (HI(view)) {
                i2 |= 512;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? 65536 | i2 : view instanceof RadioGroup ? i2 | 16384 : ((view instanceof ViewGroup) && f12562n.ck(view, (View) f12563t.get())) ? i2 | 64 : i2;
                }
                return i2 | 4096;
            }
            int i3 = i2 | 1025;
            if (view instanceof Button) {
                i3 = i2 | 1029;
                if (view instanceof Switch) {
                    i3 = i2 | 9221;
                } else if (view instanceof CheckBox) {
                    i3 = 33797 | i2;
                }
            }
            return view instanceof EditText ? i3 | 2048 : i3;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return 0;
        }
    }

    public static final String xMQ(View view) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String string = hint.toString();
            return string == null ? "" : string;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    private Wre() {
    }

    private final boolean Ik(View view) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            return Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final Class J2(String str) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final JSONObject O(View view) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put(TtmlNode.LEFT, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e2) {
                Log.e(rl, "Failed to create JSONObject for dimension.", e2);
                return jSONObject;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final void ty() {
        if (!VmF.j.nr(this)) {
            try {
                if (nr == null) {
                    try {
                        Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                        nr = declaredMethod;
                        if (declaredMethod != null) {
                            declaredMethod.setAccessible(true);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } catch (ClassNotFoundException e2) {
                        vd.z(rl, e2);
                    } catch (NoSuchMethodException e3) {
                        vd.z(rl, e3);
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final boolean ck(View view, View view2) {
        View viewQie;
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") && (viewQie = qie(az(view), view2)) != null) {
                if (viewQie.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
