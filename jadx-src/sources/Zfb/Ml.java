package Zfb;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f12561n = new Ml();

    public static final boolean Uo(View view) {
        if (VmF.j.nr(Ml.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            Ml ml = f12561n;
            if (ml.t((TextView) view) || ml.n((TextView) view) || ml.nr((TextView) view) || ml.J2((TextView) view) || ml.O((TextView) view)) {
                return true;
            }
            return ml.rl((TextView) view);
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return false;
        }
    }

    private Ml() {
    }

    private final boolean J2(TextView textView) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 112) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean O(TextView textView) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean n(TextView textView) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(Wre.gh(textView), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z2 = false;
                for (int i3 = length - 1; -1 < i3; i3--) {
                    char cCharAt = strReplace.charAt(i3);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iDigitToInt = CharsKt.digitToInt(cCharAt);
                    if (z2 && (iDigitToInt = iDigitToInt * 2) > 9) {
                        iDigitToInt = (iDigitToInt % 10) + 1;
                    }
                    i2 += iDigitToInt;
                    z2 = !z2;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean nr(TextView textView) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 96) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean rl(TextView textView) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String strGh = Wre.gh(textView);
            if (strGh != null && strGh.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strGh).matches();
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean t(TextView textView) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
