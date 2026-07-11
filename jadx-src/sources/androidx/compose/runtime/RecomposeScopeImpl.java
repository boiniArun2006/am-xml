package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u0002:\u0001nB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00072\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0019\u0010?\u0012\u0004\b@\u0010\u0018R\u0016\u0010B\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010DR*\u0010G\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010FR$\u0010L\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010O\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bP\u0010IR\u0011\u0010S\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bR\u0010IR$\u0010V\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010I\"\u0004\bU\u0010KR$\u0010Y\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010I\"\u0004\bX\u0010KR$\u0010\\\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010I\"\u0004\b[\u0010KR$\u0010_\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010I\"\u0004\b^\u0010KR$\u0010b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010I\"\u0004\ba\u0010KR$\u0010e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010I\"\u0004\bd\u0010KR$\u0010h\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010I\"\u0004\bg\u0010KR$\u0010k\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010I\"\u0004\bj\u0010KR\u0011\u0010m\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010I¨\u0006o"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "owner", "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/DerivedState;", "Landroidx/collection/MutableScatterMap;", "", "dependencies", "", "J2", "(Landroidx/compose/runtime/DerivedState;Landroidx/collection/MutableScatterMap;)Z", "Landroidx/compose/runtime/Composer;", "composer", "", "Uo", "(Landroidx/compose/runtime/Composer;)V", "value", "Landroidx/compose/runtime/InvalidationResult;", "S", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "g", "()V", "O", "invalidate", "Lkotlin/Function2;", "", "block", c.f62177j, "(Lkotlin/jvm/functions/Function2;)V", "token", "bzg", "(I)V", "iF", "instance", "nY", "(Ljava/lang/Object;)Z", "ViF", "(Landroidx/compose/runtime/DerivedState;Ljava/lang/Object;)V", "instances", "aYN", "te", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "KN", "(I)Lkotlin/jvm/functions/Function1;", "I", "flags", "rl", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/Anchor;", "t", "Landroidx/compose/runtime/Anchor;", "xMQ", "()Landroidx/compose/runtime/Anchor;", "fD", "(Landroidx/compose/runtime/Anchor;)V", "anchor", "nr", "Lkotlin/jvm/functions/Function2;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "getObserver$annotations", "observer", "currentToken", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "trackedInstances", "Landroidx/collection/MutableScatterMap;", "trackedDependencies", "ck", "()Z", "nHg", "(Z)V", "rereading", "o", "v", "skipped", "XQ", "valid", "mUb", "canRecompose", "Z", "rV9", "used", "r", "wTp", "reusing", "ty", RequestConfiguration.MAX_AD_CONTENT_RATING_T, SafeDKWebAppInterface.f62918d, "Ik", "s7N", "resuming", "gh", "E2", "defaultsInScope", "qie", "e", "defaultsInvalid", "HI", "N", "requiresRecompose", "az", "X", "forcedRecompose", "WPU", "isConditional", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,494:1\n33#2,2:495\n1#3:497\n256#4,2:498\n231#4,3:500\n200#4,7:503\n211#4,3:511\n214#4,9:515\n234#4:524\n258#4:525\n1399#5:510\n1270#5:514\n1399#5:536\n1270#5:540\n1399#5:562\n1270#5:566\n395#6,4:526\n367#6,6:530\n377#6,3:537\n380#6,9:541\n399#6:550\n423#6:551\n395#6,4:552\n367#6,6:556\n377#6,3:563\n380#6,9:567\n399#6:576\n424#6:577\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n240#1:495,2\n404#1:498,2\n404#1:500,3\n404#1:503,7\n404#1:511,3\n404#1:515,9\n404#1:524\n404#1:525\n404#1:510\n404#1:514\n426#1:536\n426#1:540\n446#1:562\n446#1:566\n426#1:526,4\n426#1:530,6\n426#1:537,3\n426#1:541,9\n426#1:550\n446#1:551\n446#1:552,4\n446#1:556,6\n446#1:563,3\n446#1:567,9\n446#1:576\n446#1:577\n*E\n"})
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int currentToken;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private MutableScatterMap trackedDependencies;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private RecomposeScopeObserver observer;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private MutableObjectIntMap trackedInstances;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Function2 block;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private RecomposeScopeOwner owner;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Anchor anchor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int mUb = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "slots", "", "Landroidx/compose/runtime/Anchor;", "anchors", "Landroidx/compose/runtime/RecomposeScopeOwner;", "newOwner", "", c.f62177j, "(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/SlotTable;", "", "rl", "(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,494:1\n33#2,6:495\n90#2,2:501\n33#2,6:503\n92#2:509\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n477#1:495,6\n488#1:501,2\n488#1:503,6\n488#1:509\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void n(SlotWriter slots, List anchors, RecomposeScopeOwner newOwner) {
            RecomposeScopeImpl recomposeScopeImpl;
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object objUf = slots.Uf((Anchor) anchors.get(i2), 0);
                    if (objUf instanceof RecomposeScopeImpl) {
                        recomposeScopeImpl = (RecomposeScopeImpl) objUf;
                    } else {
                        recomposeScopeImpl = null;
                    }
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.O(newOwner);
                    }
                }
            }
        }

        public final boolean rl(SlotTable slots, List anchors) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Anchor anchor = (Anchor) anchors.get(i2);
                    if (slots.te(anchor) && (slots.fD(slots.xMQ(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean J2(DerivedState derivedState, MutableScatterMap mutableScatterMap) {
        Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy snapshotMutationPolicyO = derivedState.O();
        if (snapshotMutationPolicyO == null) {
            snapshotMutationPolicyO = SnapshotStateKt.r();
        }
        return !snapshotMutationPolicyO.rl(derivedState.g().n(), mutableScatterMap.O(derivedState));
    }

    private final boolean ck() {
        return (this.flags & 32) != 0;
    }

    private final void nHg(boolean z2) {
        if (z2) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void v(boolean z2) {
        if (z2) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void E2(boolean z2) {
        if (z2) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final boolean HI() {
        return (this.flags & 8) != 0;
    }

    public final boolean Ik() {
        return (this.flags & 512) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Function1 KN(final int token) {
        final MutableObjectIntMap mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap != null && !o()) {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                int i7 = (i2 << 3) + i5;
                                Object obj = objArr[i7];
                                if (iArr[i7] != token) {
                                    return new Function1<Composition, Unit>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
                                            n(composition);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composition composition) {
                                            int i8;
                                            if (this.f30273n.currentToken != token || !Intrinsics.areEqual(mutableObjectIntMap, this.f30273n.trackedInstances) || !(composition instanceof CompositionImpl)) {
                                                return;
                                            }
                                            MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
                                            int i9 = token;
                                            RecomposeScopeImpl recomposeScopeImpl = this.f30273n;
                                            long[] jArr2 = mutableObjectIntMap2.metadata;
                                            int length2 = jArr2.length - 2;
                                            if (length2 < 0) {
                                                return;
                                            }
                                            int i10 = 0;
                                            while (true) {
                                                long j3 = jArr2[i10];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i11 = 8;
                                                    int i12 = 8 - ((~(i10 - length2)) >>> 31);
                                                    int i13 = 0;
                                                    while (i13 < i12) {
                                                        if ((255 & j3) < 128) {
                                                            int i14 = (i10 << 3) + i13;
                                                            Object obj2 = mutableObjectIntMap2.keys[i14];
                                                            boolean z2 = mutableObjectIntMap2.values[i14] != i9;
                                                            i8 = i11;
                                                            if (z2) {
                                                                CompositionImpl compositionImpl = (CompositionImpl) composition;
                                                                compositionImpl.bzg(obj2, recomposeScopeImpl);
                                                                if (obj2 instanceof DerivedState) {
                                                                    compositionImpl.rV9((DerivedState) obj2);
                                                                    MutableScatterMap mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                                                    if (mutableScatterMap != null) {
                                                                        mutableScatterMap.XQ(obj2);
                                                                    }
                                                                }
                                                            }
                                                            if (z2) {
                                                                mutableObjectIntMap2.o(i14);
                                                            }
                                                        } else {
                                                            i8 = i11;
                                                        }
                                                        j3 >>= i8;
                                                        i13++;
                                                        i11 = i8;
                                                    }
                                                    if (i12 != i11) {
                                                        return;
                                                    }
                                                }
                                                if (i10 == length2) {
                                                    return;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    };
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return null;
    }

    public final void N(boolean z2) {
        if (z2) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void O(RecomposeScopeOwner owner) {
        this.owner = owner;
    }

    public final InvalidationResult S(Object value) {
        InvalidationResult invalidationResultUo;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidationResultUo = recomposeScopeOwner.Uo(this, value)) == null) ? InvalidationResult.f30189n : invalidationResultUo;
    }

    public final void T(boolean z2) {
        this.flags = z2 ? this.flags | 256 : this.flags & (-257);
    }

    public final void Uo(Composer composer) {
        Unit unit;
        Function2 function2 = this.block;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && function2 != null) {
            recomposeScopeObserver.rl(this);
            try {
                function2.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.t(this);
            }
        }
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final void ViF(DerivedState instance, Object value) {
        MutableScatterMap mutableScatterMap = this.trackedDependencies;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap(0, 1, null);
            this.trackedDependencies = mutableScatterMap;
        }
        mutableScatterMap.aYN(instance, value);
    }

    public final boolean WPU() {
        return this.trackedDependencies != null;
    }

    public final void X(boolean z2) {
        if (z2) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final boolean XQ() {
        if (this.owner != null) {
            Anchor anchor = this.anchor;
            if (anchor != null ? anchor.rl() : false) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        return (this.flags & 1) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean aYN(Object instances) {
        MutableScatterMap mutableScatterMap;
        if (instances == null || (mutableScatterMap = this.trackedDependencies) == null) {
            return true;
        }
        if (instances instanceof DerivedState) {
            return J2((DerivedState) instances, mutableScatterMap);
        }
        if (!(instances instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) instances;
        if (scatterSet.J2()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                Object obj = objArr[(i2 << 3) + i5];
                                if (!(obj instanceof DerivedState) || J2((DerivedState) obj, mutableScatterMap)) {
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public final boolean az() {
        return (this.flags & 64) != 0;
    }

    public final void bzg(int token) {
        this.currentToken = token;
        v(false);
    }

    public final void e(boolean z2) {
        if (z2) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void fD(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void g() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.rl(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.n(this);
        }
    }

    public final boolean gh() {
        return (this.flags & 2) != 0;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.Uo(this, null);
        }
    }

    public final boolean mUb() {
        return this.block != null;
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void n(Function2 block) {
        this.block = block;
    }

    public final boolean o() {
        return (this.flags & 16) != 0;
    }

    public final boolean qie() {
        return (this.flags & 4) != 0;
    }

    public final boolean r() {
        return (this.flags & 128) != 0;
    }

    public final void rV9(boolean z2) {
        this.flags = z2 ? this.flags | 1 : this.flags & (-2);
    }

    public final void s7N(boolean z2) {
        this.flags = z2 ? this.flags | 512 : this.flags & (-513);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void te() {
        MutableObjectIntMap mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.trackedInstances) == null) {
            return;
        }
        nHg(true);
        try {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                int i7 = (i2 << 3) + i5;
                                Object obj = objArr[i7];
                                int i8 = iArr[i7];
                                recomposeScopeOwner.t(obj);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } finally {
            nHg(false);
        }
    }

    public final boolean ty() {
        return (this.flags & 256) != 0;
    }

    public final void wTp(boolean z2) {
        this.flags = z2 ? this.flags | 128 : this.flags & (-129);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void iF() {
        if (!r()) {
            v(true);
        }
    }

    public final boolean nY(Object instance) {
        int i2 = 0;
        if (ck()) {
            return false;
        }
        MutableObjectIntMap mutableObjectIntMap = this.trackedInstances;
        int i3 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap(i2, i3, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        if (mutableObjectIntMap.Ik(instance, this.currentToken, -1) != this.currentToken) {
            return false;
        }
        return true;
    }
}
