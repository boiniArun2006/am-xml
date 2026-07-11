package androidx.view.serialization;

import DGv.Dsr;
import DGv.I28;
import DGv.Ml;
import android.os.Bundle;
import androidx.view.serialization.serializers.SavedStateSerializer;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"LDGv/Ml;", c.f62177j, "LDGv/Ml;", "DEFAULT_SERIALIZERS_MODULE", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,138:1\n31#2,2:139\n243#2:141\n33#2:142\n*S KotlinDebug\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n*L\n137#1:139,2\n137#1:141\n137#1:142\n*E\n"})
public final class SavedStateConfigurationKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Ml f41898n;

    static {
        I28 i28 = new I28();
        i28.nr(Reflection.getOrCreateKotlinClass(Bundle.class), SavedStateSerializer.f41916n);
        f41898n = Dsr.rl(i28.KN(), SavedStateConfig_androidKt.rl());
    }
}
