package androidx.view.serialization;

import DGv.I28;
import DGv.Ml;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.view.serialization.serializers.SizeFSerializer;
import androidx.view.serialization.serializers.SizeSerializer;
import androidx.view.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LDGv/Ml;", "rl", "()LDGv/Ml;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateConfig.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,33:1\n31#2,2:34\n243#2:36\n243#2:37\n33#2:38\n*S KotlinDebug\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n*L\n26#1:34,2\n27#1:36\n28#1:37\n26#1:38\n*E\n"})
public final class SavedStateConfig_androidKt {
    public static final Ml rl() {
        I28 i28 = new I28();
        i28.nr(Reflection.getOrCreateKotlinClass(Size.class), SizeSerializer.f41918n);
        i28.nr(Reflection.getOrCreateKotlinClass(SizeF.class), SizeFSerializer.f41917n);
        i28.Uo(Reflection.getOrCreateKotlinClass(SparseArray.class), new Function1() { // from class: androidx.savedstate.serialization.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedStateConfig_androidKt.t((List) obj);
            }
        });
        return i28.KN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XA.Ml t(List argSerializers) {
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        return new SparseArraySerializer((XA.Ml) CollectionsKt.first(argSerializers));
    }
}
