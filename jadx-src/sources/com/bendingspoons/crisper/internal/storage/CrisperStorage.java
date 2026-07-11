package com.bendingspoons.crisper.internal.storage;

import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/crisper/internal/storage/CrisperStorage;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "scope", "", "setScope", "(Ljava/lang/String;)V", "key", "", "doesExistValueForKey", "(Ljava/lang/String;)Z", "", "value", "setIntForKey", "(Ljava/lang/Number;Ljava/lang/String;)V", "", "intForKey", "(Ljava/lang/String;)D", "setStringForKey", "(Ljava/lang/String;Ljava/lang/String;)V", "stringForKey", "(Ljava/lang/String;)Ljava/lang/String;", c.f62177j, "Landroid/content/SharedPreferences;", "rl", "Ljava/lang/String;", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrisperStorage {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private String scope;

    public CrisperStorage(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        this.scope = "";
    }

    @Keep
    public final boolean doesExistValueForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.contains(this.scope + key);
    }

    @Keep
    public final double intForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = this.sharedPreferences;
        String str = this.scope;
        return sharedPreferences.getLong(str + key, 0L);
    }

    @Keep
    public final void setIntForKey(Number value, String key) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().putLong(this.scope + key, value.longValue()).commit();
    }

    @Keep
    public final void setScope(String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
    }

    @Keep
    public final void setStringForKey(String value, String key) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().putString(this.scope + key, value).commit();
    }

    @Keep
    public final String stringForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = this.sharedPreferences.getString(this.scope + key, "");
        return string == null ? "" : string;
    }
}
