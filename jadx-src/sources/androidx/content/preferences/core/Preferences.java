package androidx.content.preferences.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/preferences/core/Preferences$Key;", "key", "rl", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "", c.f62177j, "()Ljava/util/Map;", "Landroidx/datastore/preferences/core/MutablePreferences;", "t", "()Landroidx/datastore/preferences/core/MutablePreferences;", "nr", "()Landroidx/datastore/preferences/core/Preferences;", "Key", "Pair", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Preferences {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", c.f62177j, "Ljava/lang/String;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Key<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String name;

        public Key(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public boolean equals(Object other) {
            if (other instanceof Key) {
                return Intrinsics.areEqual(this.name, ((Key) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/datastore/preferences/core/Preferences$Key;", c.f62177j, "Landroidx/datastore/preferences/core/Preferences$Key;", "()Landroidx/datastore/preferences/core/Preferences$Key;", "key", "rl", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pair<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Key key;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Object value;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Key getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Object getValue() {
            return this.value;
        }
    }

    public abstract Map n();

    public abstract Object rl(Key key);

    public final Preferences nr() {
        return new MutablePreferences(MapsKt.toMutableMap(n()), true);
    }

    public final MutablePreferences t() {
        return new MutablePreferences(MapsKt.toMutableMap(n()), false);
    }
}
