package androidx.view.serialization;

import android.os.Bundle;
import androidx.view.NavType;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/navigation/serialization/UNKNOWN;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "key", "value", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "gh", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "qie", "(Ljava/lang/String;)Ljava/lang/String;", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UNKNOWN extends NavType<String> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final UNKNOWN f40488Z = new UNKNOWN();

    private UNKNOWN() {
        super(false);
    }

    @Override // androidx.view.NavType
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public void KN(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // androidx.view.NavType
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public String n(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // androidx.view.NavType
    public String qie(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return V8ValueNull.NULL;
    }

    @Override // androidx.view.NavType
    /* JADX INFO: renamed from: rl */
    public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
        return "unknown";
    }
}
