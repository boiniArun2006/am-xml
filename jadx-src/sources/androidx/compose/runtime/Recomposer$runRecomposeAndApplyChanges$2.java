package androidx.compose.runtime;

import GJW.vd;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGJW/vd;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>", "(LGJW/vd;Landroidx/compose/runtime/MonotonicFrameClock;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {580, 591}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1875\n33#3,6:1794\n33#3,6:1877\n231#4,3:1800\n200#4,7:1803\n211#4,3:1811\n214#4,9:1815\n234#4:1824\n231#4,3:1825\n200#4,7:1828\n211#4,3:1836\n214#4,9:1840\n234#4:1849\n231#4,3:1850\n200#4,7:1853\n211#4,3:1861\n214#4,9:1865\n234#4:1874\n1399#5:1810\n1270#5:1814\n1399#5:1835\n1270#5:1839\n1399#5:1860\n1270#5:1864\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n542#1:1792,2\n573#1:1875,2\n546#1:1794,6\n574#1:1877,6\n552#1:1800,3\n552#1:1803,7\n552#1:1811,3\n552#1:1815,9\n552#1:1824\n558#1:1825,3\n558#1:1828,7\n558#1:1836,3\n558#1:1840,9\n558#1:1849\n563#1:1850,3\n563#1:1853,7\n563#1:1861,3\n563#1:1865,9\n563#1:1874\n552#1:1810\n552#1:1814\n558#1:1835\n558#1:1839\n563#1:1860\n563#1:1864\n*E\n"})
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<vd, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f30324O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    Object f30325S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    Object f30326Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Recomposer f30327e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f30328g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f30330o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f30331r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f30332t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.f30327e = recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
        char c2;
        long j2;
        long j3;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ControlledComposition controlledComposition = (ControlledComposition) list3.get(i2);
                    controlledComposition.S();
                    recomposer.UhV(controlledComposition);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    j2 = 255;
                    while (true) {
                        long j4 = jArr[i3];
                        c2 = 7;
                        j3 = -9187201950435737472L;
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i7 = 0; i7 < i5; i7++) {
                                if ((j4 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i3 << 3) + i7];
                                    controlledComposition2.S();
                                    recomposer.UhV(controlledComposition2);
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            } else if (i3 == length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    c2 = 7;
                    j2 = 255;
                    j3 = -9187201950435737472L;
                }
                mutableScatterSet.ty();
                Object[] objArr2 = mutableScatterSet2.elements;
                long[] jArr2 = mutableScatterSet2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr2[i8];
                        if ((((~j5) << c2) & j5 & j3) != j3) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j2) < 128) {
                                    ((ControlledComposition) objArr2[(i8 << 3) + i10]).WPU();
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length2) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                mutableScatterSet2.ty();
                mutableScatterSet3.ty();
                Object[] objArr3 = mutableScatterSet4.elements;
                long[] jArr3 = mutableScatterSet4.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j6 = jArr3[i11];
                        if ((((~j6) << c2) & j6 & j3) != j3) {
                            int i12 = 8 - ((~(i11 - length3)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j6 & j2) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i11 << 3) + i13];
                                    controlledComposition3.S();
                                    recomposer.UhV(controlledComposition3);
                                }
                                j6 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 == length3) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                mutableScatterSet4.ty();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        MutableScatterSet mutableScatterSetN;
        MutableScatterSet mutableScatterSetN2;
        List list;
        Set set;
        final List list2;
        MutableScatterSet mutableScatterSet;
        List list3;
        MutableScatterSet mutableScatterSet2;
        final List list4;
        final MutableScatterSet mutableScatterSet3;
        final List list5;
        final MutableScatterSet mutableScatterSet4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f30328g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.E2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            mutableScatterSetN = ScatterSetKt.n();
            MutableScatterSet mutableScatterSetN3 = ScatterSetKt.n();
            MutableScatterSet mutableScatterSet5 = new MutableScatterSet(0, 1, null);
            Set setN = ScatterSetWrapperKt.n(mutableScatterSet5);
            mutableScatterSetN2 = ScatterSetKt.n();
            list = arrayList;
            set = setN;
            list2 = arrayList2;
            mutableScatterSet = mutableScatterSet5;
            list3 = arrayList3;
            mutableScatterSet2 = mutableScatterSetN3;
            if (!this.f30327e.ul()) {
            }
        } else if (i2 == 1) {
            MutableScatterSet mutableScatterSet6 = (MutableScatterSet) this.f30325S;
            set = (Set) this.f30326Z;
            mutableScatterSet = (MutableScatterSet) this.f30330o;
            mutableScatterSet2 = (MutableScatterSet) this.f30331r;
            MutableScatterSet mutableScatterSet7 = (MutableScatterSet) this.J2;
            List list6 = (List) this.f30324O;
            list2 = (List) this.f30332t;
            List list7 = (List) this.f30329n;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.E2;
            ResultKt.throwOnFailure(obj);
            mutableScatterSet4 = mutableScatterSet6;
            monotonicFrameClock = monotonicFrameClock2;
            list4 = list6;
            list5 = list7;
            mutableScatterSet3 = mutableScatterSet7;
            final Set set2 = set;
            final MutableScatterSet mutableScatterSet8 = mutableScatterSet2;
            final MutableScatterSet mutableScatterSet9 = mutableScatterSet;
            if (this.f30327e.hRu()) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableScatterSet mutableScatterSet10 = (MutableScatterSet) this.f30325S;
            set = (Set) this.f30326Z;
            mutableScatterSet = (MutableScatterSet) this.f30330o;
            mutableScatterSet2 = (MutableScatterSet) this.f30331r;
            mutableScatterSetN = (MutableScatterSet) this.J2;
            list3 = (List) this.f30324O;
            list2 = (List) this.f30332t;
            list = (List) this.f30329n;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.E2;
            ResultKt.throwOnFailure(obj);
            mutableScatterSetN2 = mutableScatterSet10;
            monotonicFrameClock = monotonicFrameClock3;
            this.f30327e.eTf();
            if (!this.f30327e.ul()) {
                Recomposer recomposer = this.f30327e;
                this.E2 = monotonicFrameClock;
                this.f30329n = list;
                this.f30332t = list2;
                this.f30324O = list3;
                this.J2 = mutableScatterSetN;
                this.f30331r = mutableScatterSet2;
                this.f30330o = mutableScatterSet;
                this.f30326Z = set;
                this.f30325S = mutableScatterSetN2;
                this.f30328g = 1;
                if (recomposer.k(this) != coroutine_suspended) {
                    List list8 = list;
                    mutableScatterSet3 = mutableScatterSetN;
                    mutableScatterSet4 = mutableScatterSetN2;
                    list4 = list3;
                    list5 = list8;
                    final Set set22 = set;
                    final MutableScatterSet mutableScatterSet82 = mutableScatterSet2;
                    final MutableScatterSet mutableScatterSet92 = mutableScatterSet;
                    if (this.f30327e.hRu()) {
                        List list9 = list4;
                        mutableScatterSetN2 = mutableScatterSet4;
                        mutableScatterSetN = mutableScatterSet3;
                        list = list5;
                        list3 = list9;
                        mutableScatterSet = mutableScatterSet92;
                        mutableScatterSet2 = mutableScatterSet82;
                        set = set22;
                        if (!this.f30327e.ul()) {
                        }
                    } else {
                        final Recomposer recomposer2 = this.f30327e;
                        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                n(l2.longValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:132:0x01f8 A[Catch: all -> 0x00c9, TryCatch #5 {all -> 0x00c9, blocks: (B:11:0x0049, B:12:0x0050, B:19:0x0076, B:20:0x0077, B:21:0x007d, B:23:0x0083, B:26:0x008b, B:28:0x0091, B:38:0x00c5, B:47:0x00dc, B:54:0x00ea, B:55:0x00ed, B:56:0x00ee, B:90:0x016d, B:94:0x0176, B:95:0x0179, B:83:0x0155, B:97:0x017e, B:119:0x01d7, B:132:0x01f8, B:133:0x01fc, B:135:0x0200, B:136:0x0201, B:138:0x0215, B:139:0x0216, B:126:0x01eb, B:130:0x01f4, B:131:0x01f7, B:149:0x023a, B:151:0x0243, B:177:0x02b8, B:188:0x02dd, B:153:0x024d, B:154:0x0251, B:176:0x02b7, B:189:0x02ea, B:190:0x02eb, B:195:0x02fb, B:200:0x0304, B:201:0x0307, B:202:0x0308, B:203:0x0309, B:13:0x0051, B:15:0x005e, B:18:0x006d, B:29:0x009c, B:31:0x00a3, B:34:0x00b2, B:36:0x00b9, B:140:0x0217, B:142:0x021e, B:144:0x022a, B:147:0x0234, B:179:0x02be, B:180:0x02c1, B:182:0x02c7, B:155:0x0252, B:157:0x025d, B:159:0x0269, B:161:0x026f, B:164:0x0276, B:165:0x0279, B:167:0x0285, B:169:0x0291, B:171:0x0297, B:174:0x02a7, B:173:0x029f, B:175:0x02aa, B:134:0x01fd, B:99:0x0184, B:102:0x018e, B:104:0x019c, B:106:0x01a8, B:108:0x01ae), top: B:216:0x0049, inners: #6, #8, #9, #11, #13, #15, #18 }] */
                            /* JADX WARN: Removed duplicated region for block: B:219:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:235:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:241:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
                            /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void n(long j2) {
                                Object objN;
                                List list10;
                                MutableScatterSet mutableScatterSet11;
                                char c2;
                                long j3;
                                List list11;
                                if (recomposer2.ofS()) {
                                    Recomposer recomposer3 = recomposer2;
                                    Trace trace = Trace.f30884n;
                                    objN = trace.n("Recomposer:animation");
                                    try {
                                        recomposer3.broadcastFrameClock.gh(j2);
                                        Snapshot.INSTANCE.ty();
                                        Unit unit = Unit.INSTANCE;
                                        trace.rl(objN);
                                    } finally {
                                    }
                                }
                                Recomposer recomposer4 = recomposer2;
                                MutableScatterSet mutableScatterSet12 = mutableScatterSet92;
                                MutableScatterSet mutableScatterSet13 = mutableScatterSet4;
                                List list12 = list5;
                                List list13 = list2;
                                MutableScatterSet mutableScatterSet14 = mutableScatterSet3;
                                List list14 = list4;
                                MutableScatterSet mutableScatterSet15 = mutableScatterSet82;
                                Set set3 = set22;
                                objN = Trace.f30884n.n("Recomposer:recompose");
                                try {
                                    recomposer4.hRu();
                                    synchronized (recomposer4.stateLock) {
                                        try {
                                            MutableVector mutableVector = recomposer4.compositionInvalidations;
                                            Object[] objArr = mutableVector.content;
                                            int size = mutableVector.getSize();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                list12.add((ControlledComposition) objArr[i3]);
                                            }
                                            recomposer4.compositionInvalidations.KN();
                                            Unit unit2 = Unit.INSTANCE;
                                        } finally {
                                        }
                                    }
                                    mutableScatterSet12.ty();
                                    mutableScatterSet13.ty();
                                    while (true) {
                                        if (list12.isEmpty() && list13.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size2 = list12.size();
                                            for (int i5 = 0; i5 < size2; i5++) {
                                                ControlledComposition controlledComposition = (ControlledComposition) list12.get(i5);
                                                ControlledComposition controlledCompositionOrg = recomposer4.Org(controlledComposition, mutableScatterSet12);
                                                if (controlledCompositionOrg != null) {
                                                    list14.add(controlledCompositionOrg);
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                                mutableScatterSet13.xMQ(controlledComposition);
                                            }
                                            list12.clear();
                                            if (mutableScatterSet12.J2() || recomposer4.compositionInvalidations.getSize() != 0) {
                                                synchronized (recomposer4.stateLock) {
                                                    try {
                                                        List listEWT = recomposer4.eWT();
                                                        int size3 = listEWT.size();
                                                        for (int i7 = 0; i7 < size3; i7++) {
                                                            ControlledComposition controlledComposition2 = (ControlledComposition) listEWT.get(i7);
                                                            if (!mutableScatterSet13.rl(controlledComposition2) && controlledComposition2.az(set3)) {
                                                                list12.add(controlledComposition2);
                                                            }
                                                        }
                                                        MutableVector mutableVector2 = recomposer4.compositionInvalidations;
                                                        int size4 = mutableVector2.getSize();
                                                        int i8 = 0;
                                                        for (int i9 = 0; i9 < size4; i9++) {
                                                            ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.content[i9];
                                                            if (!mutableScatterSet13.rl(controlledComposition3) && !list12.contains(controlledComposition3)) {
                                                                list12.add(controlledComposition3);
                                                                i8++;
                                                            } else if (i8 > 0) {
                                                                Object[] objArr2 = mutableVector2.content;
                                                                objArr2[i9 - i8] = objArr2[i9];
                                                            }
                                                        }
                                                        int i10 = size4 - i8;
                                                        ArraysKt.fill(mutableVector2.content, (Object) null, i10, size4);
                                                        mutableVector2.WPU(i10);
                                                        Unit unit4 = Unit.INSTANCE;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list12.isEmpty()) {
                                                try {
                                                    Recomposer$runRecomposeAndApplyChanges$2.gh(list13, recomposer4);
                                                    while (!list13.isEmpty()) {
                                                        mutableScatterSet14.aYN(recomposer4.mYa(list13, mutableScatterSet12));
                                                        Recomposer$runRecomposeAndApplyChanges$2.gh(list13, recomposer4);
                                                    }
                                                } catch (Throwable th) {
                                                    Recomposer.GD(recomposer4, th, null, true, 2, null);
                                                    Recomposer$runRecomposeAndApplyChanges$2.mUb(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                Recomposer.GD(recomposer4, th2, null, true, 2, null);
                                                list10 = list12;
                                                try {
                                                    Recomposer$runRecomposeAndApplyChanges$2.mUb(recomposer4, list10, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                    list10.clear();
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    list10.clear();
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                list10 = list12;
                                            }
                                        }
                                    }
                                    if (list14.isEmpty()) {
                                        if (mutableScatterSet14.J2()) {
                                        }
                                        if (mutableScatterSet15.J2()) {
                                        }
                                    } else {
                                        recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                        try {
                                            int size5 = list14.size();
                                            for (int i11 = 0; i11 < size5; i11++) {
                                                mutableScatterSet15.xMQ((ControlledComposition) list14.get(i11));
                                            }
                                            int size6 = list14.size();
                                            for (int i12 = 0; i12 < size6; i12++) {
                                                ((ControlledComposition) list14.get(i12)).ck();
                                            }
                                            list14.clear();
                                            if (mutableScatterSet14.J2()) {
                                                c2 = 7;
                                                j3 = 128;
                                            } else {
                                                try {
                                                    mutableScatterSet15.WPU(mutableScatterSet14);
                                                    Object[] objArr3 = mutableScatterSet14.elements;
                                                    c2 = 7;
                                                    long[] jArr = mutableScatterSet14.metadata;
                                                    j3 = 128;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i13 = 0;
                                                        while (true) {
                                                            int i14 = length;
                                                            long j4 = jArr[i13];
                                                            mutableScatterSet11 = mutableScatterSet12;
                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i15 = 8 - ((~(i13 - i14)) >>> 31);
                                                                for (int i16 = 0; i16 < i15; i16++) {
                                                                    if ((j4 & 255) < 128) {
                                                                        try {
                                                                            ((ControlledComposition) objArr3[(i13 << 3) + i16]).O();
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            try {
                                                                                Recomposer.GD(recomposer4, th, null, false, 6, null);
                                                                                try {
                                                                                    Recomposer$runRecomposeAndApplyChanges$2.mUb(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet11, mutableScatterSet13);
                                                                                    mutableScatterSet14.ty();
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    mutableScatterSet14 = mutableScatterSet14;
                                                                                    mutableScatterSet14.ty();
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        }
                                                                    }
                                                                    j4 >>= 8;
                                                                }
                                                                if (i15 != 8) {
                                                                    break;
                                                                }
                                                                length = i14;
                                                                if (i13 == length) {
                                                                    break;
                                                                }
                                                                i13++;
                                                                mutableScatterSet12 = mutableScatterSet11;
                                                            }
                                                        }
                                                    } else {
                                                        mutableScatterSet11 = mutableScatterSet12;
                                                    }
                                                    mutableScatterSet14.ty();
                                                    mutableScatterSet12 = mutableScatterSet11;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    mutableScatterSet11 = mutableScatterSet12;
                                                }
                                            }
                                            if (mutableScatterSet15.J2()) {
                                                synchronized (recomposer4.stateLock) {
                                                }
                                            } else {
                                                try {
                                                    Object[] objArr4 = mutableScatterSet15.elements;
                                                    long[] jArr2 = mutableScatterSet15.metadata;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i17 = 0;
                                                        while (true) {
                                                            long j5 = jArr2[i17];
                                                            Object[] objArr5 = objArr4;
                                                            if ((((~j5) << c2) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                                for (int i19 = 0; i19 < i18; i19++) {
                                                                    if ((j5 & 255) < j3) {
                                                                        ((ControlledComposition) objArr5[(i17 << 3) + i19]).WPU();
                                                                    }
                                                                    j5 >>= 8;
                                                                }
                                                                if (i18 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i17 == length2) {
                                                                break;
                                                            }
                                                            i17++;
                                                            objArr4 = objArr5;
                                                        }
                                                    }
                                                    mutableScatterSet15.ty();
                                                    synchronized (recomposer4.stateLock) {
                                                        recomposer4.m();
                                                    }
                                                    Snapshot.INSTANCE.J2();
                                                    mutableScatterSet13.ty();
                                                    mutableScatterSet12.ty();
                                                    recomposer4.compositionsRemoved = null;
                                                    Unit unit5 = Unit.INSTANCE;
                                                } catch (Throwable th9) {
                                                    try {
                                                        Recomposer.GD(recomposer4, th9, null, false, 6, null);
                                                        try {
                                                            Recomposer$runRecomposeAndApplyChanges$2.mUb(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                            mutableScatterSet15.ty();
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            mutableScatterSet15 = mutableScatterSet15;
                                                            mutableScatterSet15.ty();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            try {
                                                Recomposer.GD(recomposer4, th12, null, false, 6, null);
                                                try {
                                                    Recomposer$runRecomposeAndApplyChanges$2.mUb(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                    list14.clear();
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    list11 = list14;
                                                    list11.clear();
                                                    throw th;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                list11 = list14;
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        };
                        this.E2 = monotonicFrameClock;
                        this.f30329n = list5;
                        this.f30332t = list2;
                        this.f30324O = list4;
                        this.J2 = mutableScatterSet3;
                        this.f30331r = mutableScatterSet82;
                        this.f30330o = mutableScatterSet92;
                        this.f30326Z = set22;
                        this.f30325S = mutableScatterSet4;
                        this.f30328g = 2;
                        if (monotonicFrameClock.jB(function1, this) != coroutine_suspended) {
                            List list10 = list4;
                            mutableScatterSetN2 = mutableScatterSet4;
                            mutableScatterSetN = mutableScatterSet3;
                            list = list5;
                            list3 = list10;
                            mutableScatterSet = mutableScatterSet92;
                            mutableScatterSet2 = mutableScatterSet82;
                            set = set22;
                            this.f30327e.eTf();
                            if (!this.f30327e.ul()) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public final Object invoke(vd vdVar, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f30327e, continuation);
        recomposer$runRecomposeAndApplyChanges$2.E2 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                List list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((MovableContentStateReference) list2.get(i2));
                }
                recomposer.movableContentAwaitingInsert.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
