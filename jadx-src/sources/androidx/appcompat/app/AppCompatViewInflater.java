package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import com.safedk.android.utils.SdksMapping;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object[] f13668n = new Object[2];
    private static final Class[] rl = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f13667t = {R.attr.onClick};
    private static final int[] nr = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f13666O = {R.attr.accessibilityPaneTitle};
    private static final int[] J2 = {R.attr.screenReaderFocusable};
    private static final String[] Uo = {"android.widget.", "android.view.", "android.webkit."};
    private static final SimpleArrayMap KN = new SimpleArrayMap();

    private static class DeclaredOnClickListener implements View.OnClickListener {
        private Context J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Method f13669O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f13670n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f13671t;

        private void n(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f13671t, View.class)) != null) {
                        this.f13669O = method;
                        this.J2 = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f13670n.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f13670n.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f13671t + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f13670n.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f13669O == null) {
                n(this.f13670n.getContext());
            }
            try {
                this.f13669O.invoke(this.J2, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }

        public DeclaredOnClickListener(View view, String str) {
            this.f13670n = view;
            this.f13671t = str;
        }
    }

    protected View Ik(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private void S(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    private static Context XQ(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.i7, 0, 0);
        int resourceId = z2 ? typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.VK2, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.R3E, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).t() == resourceId)) ? context : new ContextThemeWrapper(context, resourceId);
    }

    private View Z(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
        }
        try {
            Object[] objArr = this.f13668n;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return o(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = Uo;
                if (i2 >= strArr.length) {
                    return null;
                }
                View viewO = o(context, str, strArr[i2]);
                if (viewO != null) {
                    return viewO;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f13668n;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void n(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nr);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            ViewCompat.xg(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f13666O);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            ViewCompat.ofS(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, J2);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            ViewCompat.Po6(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private View o(Context context, String str, String str2) {
        String str3;
        SimpleArrayMap simpleArrayMap = KN;
        Constructor constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(rl);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f13668n);
    }

    protected AppCompatTextView HI(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected AppCompatCheckedTextView J2(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    protected AppCompatImageButton KN(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    protected AppCompatCheckBox O(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected AppCompatEditText Uo(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected AppCompatSeekBar az(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    protected AppCompatToggleButton ck(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    protected AppCompatRadioButton gh(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected AppCompatMultiAutoCompleteTextView mUb(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatButton nr(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected AppCompatRatingBar qie(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context2;
        View viewQie;
        context2 = (!z2 || view == null) ? context : view.getContext();
        if (z3 || z4) {
            context2 = XQ(context2, attributeSet, z3, z4);
        }
        if (z5) {
            context2 = TintContextWrapper.rl(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewQie = qie(context2, attributeSet);
                S(viewQie, str);
                break;
            case "CheckedTextView":
                viewQie = J2(context2, attributeSet);
                S(viewQie, str);
                break;
            case "MultiAutoCompleteTextView":
                viewQie = mUb(context2, attributeSet);
                S(viewQie, str);
                break;
            case "TextView":
                viewQie = HI(context2, attributeSet);
                S(viewQie, str);
                break;
            case "ImageButton":
                viewQie = KN(context2, attributeSet);
                S(viewQie, str);
                break;
            case "SeekBar":
                viewQie = az(context2, attributeSet);
                S(viewQie, str);
                break;
            case "Spinner":
                viewQie = ty(context2, attributeSet);
                S(viewQie, str);
                break;
            case "RadioButton":
                viewQie = gh(context2, attributeSet);
                S(viewQie, str);
                break;
            case "ToggleButton":
                viewQie = ck(context2, attributeSet);
                S(viewQie, str);
                break;
            case "ImageView":
                viewQie = xMQ(context2, attributeSet);
                S(viewQie, str);
                break;
            case "AutoCompleteTextView":
                viewQie = t(context2, attributeSet);
                S(viewQie, str);
                break;
            case "CheckBox":
                viewQie = O(context2, attributeSet);
                S(viewQie, str);
                break;
            case "EditText":
                viewQie = Uo(context2, attributeSet);
                S(viewQie, str);
                break;
            case "Button":
                viewQie = nr(context2, attributeSet);
                S(viewQie, str);
                break;
            default:
                viewQie = Ik(context2, str, attributeSet);
                break;
        }
        if (viewQie == null && context != context2) {
            viewQie = Z(context2, str, attributeSet);
        }
        if (viewQie != null) {
            rl(viewQie, attributeSet);
            n(context2, viewQie, attributeSet);
        }
        return viewQie;
    }

    protected AppCompatAutoCompleteTextView t(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatSpinner ty(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatImageView xMQ(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    private void rl(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13667t);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new DeclaredOnClickListener(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
