package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class RemoteInput {
    private final Bundle J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f36325O;
    private final Set Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f36326n;
    private final boolean nr;
    private final CharSequence rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CharSequence[] f36327t;

    @RequiresApi
    static class Api20Impl {
        public static android.app.RemoteInput n(RemoteInput remoteInput) {
            Set setNr;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(remoteInput.xMQ()).setLabel(remoteInput.KN()).setChoices(remoteInput.O()).setAllowFreeFormInput(remoteInput.t()).addExtras(remoteInput.Uo());
            if (Build.VERSION.SDK_INT >= 26 && (setNr = remoteInput.nr()) != null) {
                Iterator it = setNr.iterator();
                while (it.hasNext()) {
                    Api26Impl.n(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.n(builderAddExtras, remoteInput.J2());
            }
            return builderAddExtras.build();
        }
    }

    @RequiresApi
    static class Api28Impl {
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    @RequiresApi
    static class Api26Impl {
        static RemoteInput.Builder n(RemoteInput.Builder builder, String str, boolean z2) {
            return builder.setAllowDataType(str, z2);
        }
    }

    @RequiresApi
    static class Api29Impl {
        static RemoteInput.Builder n(RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    static android.app.RemoteInput[] rl(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i2 = 0; i2 < remoteInputArr.length; i2++) {
            remoteInputArr2[i2] = n(remoteInputArr[i2]);
        }
        return remoteInputArr2;
    }

    public int J2() {
        return this.f36325O;
    }

    public CharSequence KN() {
        return this.rl;
    }

    public CharSequence[] O() {
        return this.f36327t;
    }

    public Bundle Uo() {
        return this.J2;
    }

    public Set nr() {
        return this.Uo;
    }

    public boolean t() {
        return this.nr;
    }

    public String xMQ() {
        return this.f36326n;
    }

    static android.app.RemoteInput n(RemoteInput remoteInput) {
        return Api20Impl.n(remoteInput);
    }

    public boolean mUb() {
        if (!t()) {
            if ((O() == null || O().length == 0) && nr() != null && !nr().isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
