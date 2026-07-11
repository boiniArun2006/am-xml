package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "rl", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", c.f62177j, "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "TestTagsAsResourceId", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsPropertiesAndroid {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SemanticsPropertiesAndroid f33294n = new SemanticsPropertiesAndroid();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final SemanticsPropertyKey TestTagsAsResourceId = new SemanticsPropertyKey("TestTagsAsResourceId", false, new Function2<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean n(Boolean bool, boolean z2) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return n(bool, bool2.booleanValue());
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f33295t = 8;

    public final SemanticsPropertyKey n() {
        return TestTagsAsResourceId;
    }

    private SemanticsPropertiesAndroid() {
    }
}
