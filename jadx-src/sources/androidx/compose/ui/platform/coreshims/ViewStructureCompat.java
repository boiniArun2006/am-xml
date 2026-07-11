package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ViewStructureCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f33181n;

    @RequiresApi
    private static class Api23Impl {
        static void J2(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void O(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
            viewStructure.setId(i2, str, str2, str3);
        }

        static void Uo(ViewStructure viewStructure, float f3, int i2, int i3, int i5) {
            viewStructure.setTextStyle(f3, i2, i3, i5);
        }

        static Bundle n(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void nr(ViewStructure viewStructure, int i2, int i3, int i5, int i7, int i8, int i9) {
            viewStructure.setDimens(i2, i3, i5, i7, i8, i9);
        }

        static void rl(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void t(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }
    }

    public static ViewStructureCompat xMQ(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public void J2(CharSequence charSequence) {
        Api23Impl.J2((ViewStructure) this.f33181n, charSequence);
    }

    public ViewStructure KN() {
        return (ViewStructure) this.f33181n;
    }

    public void O(int i2, String str, String str2, String str3) {
        Api23Impl.O((ViewStructure) this.f33181n, i2, str, str2, str3);
    }

    public void Uo(float f3, int i2, int i3, int i5) {
        Api23Impl.Uo((ViewStructure) this.f33181n, f3, i2, i3, i5);
    }

    public Bundle n() {
        return Api23Impl.n((ViewStructure) this.f33181n);
    }

    public void nr(int i2, int i3, int i5, int i7, int i8, int i9) {
        Api23Impl.nr((ViewStructure) this.f33181n, i2, i3, i5, i7, i8, i9);
    }

    public void rl(String str) {
        Api23Impl.rl((ViewStructure) this.f33181n, str);
    }

    public void t(CharSequence charSequence) {
        Api23Impl.t((ViewStructure) this.f33181n, charSequence);
    }

    private ViewStructureCompat(ViewStructure viewStructure) {
        this.f33181n = viewStructure;
    }
}
