package com.alightcreative.app.motion.persist;

import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f45795n;
    private Wre nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SharedPreferences f45796t;

    public I28(Object defaultValue, boolean z2) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f45795n = defaultValue;
        this.rl = z2;
    }

    public /* synthetic */ I28(Object obj, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? false : z2);
    }

    public final Map n(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        SharedPreferences sharedPreferences = this.f45796t;
        if (sharedPreferences == null) {
            sharedPreferences = IvA.n.rl().getApplicationContext().getSharedPreferences("com.alightcreative.motion.smap." + property.getName(), 0);
            this.f45796t = sharedPreferences;
        }
        Wre wre = this.nr;
        if (wre != null) {
            return wre;
        }
        Intrinsics.checkNotNull(sharedPreferences);
        Wre wre2 = new Wre(sharedPreferences, this.f45795n, this.rl);
        this.nr = wre2;
        return wre2;
    }
}
