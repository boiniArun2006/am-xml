package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001:\u0001\u0010R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/BottomAppBarState;", "", "", "O", "()F", "Uo", "(F)V", "heightOffsetLimit", "rl", "J2", "heightOffset", "t", "nr", "contentOffset", c.f62177j, "collapsedFraction", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BottomAppBarState {
    void J2(float f3);

    float O();

    void Uo(float f3);

    float n();

    void nr(float f3);

    float rl();

    float t();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/BottomAppBarState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/BottomAppBarState;", "rl", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "Saver", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f24476n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final Saver Saver = ListSaverKt.n(new Function2<SaverScope, BottomAppBarState, List<? extends Float>>() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final List invoke(SaverScope saverScope, BottomAppBarState bottomAppBarState) {
                return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(bottomAppBarState.O()), Float.valueOf(bottomAppBarState.rl()), Float.valueOf(bottomAppBarState.t())});
            }
        }, new Function1<List<? extends Float>, BottomAppBarState>() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final BottomAppBarState invoke(List list) {
                return AppBarKt.O(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            }
        });

        private Companion() {
        }
    }
}
