package com.firebase.ui.auth.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Preconditions {
    @RestrictTo
    public static void checkConfigured(@NonNull Context context, @Nullable String str, @StringRes int... iArr) {
        for (int i2 : iArr) {
            if (context.getString(i2).equals("CHANGE-ME")) {
                throw new IllegalStateException(str);
            }
        }
    }

    @RestrictTo
    public static void checkUnset(@NonNull Bundle bundle, @Nullable String str, @NonNull String... strArr) {
        for (String str2 : strArr) {
            if (bundle.containsKey(str2)) {
                throw new IllegalStateException(str);
            }
        }
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t3, @NonNull String str, @Nullable Object... objArr) {
        if (t3 != null) {
            return t3;
        }
        if (objArr == null) {
            throw new NullPointerException(str);
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    @StyleRes
    public static int checkValidStyle(@NonNull Context context, int i2, @NonNull String str, @Nullable Object... objArr) {
        try {
            if ("style".equals(context.getResources().getResourceTypeName(i2))) {
                return i2;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
