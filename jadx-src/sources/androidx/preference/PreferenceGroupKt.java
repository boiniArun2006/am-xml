package androidx.preference;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/preference/PreferenceGroup;", "", "Landroidx/preference/Preference;", c.f62177j, "(Landroidx/preference/PreferenceGroup;)Ljava/util/Iterator;", "preference-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PreferenceGroupKt {
    public static final Iterator n(PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, YmsTEL.mBwgefGZqz);
        return new PreferenceGroupKt$iterator$1(preferenceGroup);
    }
}
