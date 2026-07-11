package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a%\u0010\u0017\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\"\b\b\u0000\u0010\u0019*\u00020\u0015\"\b\b\u0001\u0010\u001a*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\"\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a3\u0010(\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010,\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-\u001a#\u0010.\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00100\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101\u001a/\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00106\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107\u001a#\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150;*\u0002082\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=\u001a#\u0010@\u001a\u00020\u0003*\u00020>2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010A\u001a+\u0010E\u001a\u00020\u0003*\u00020>2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020\u0007H\u0000¢\u0006\u0004\bI\u0010J\u001a\u0017\u0010K\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0007H\u0000¢\u0006\u0004\bK\u0010L\u001a5\u0010U\u001a\u00020T2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u000e2\f\u0010S\u001a\b\u0012\u0002\b\u0003\u0018\u00010RH\u0000¢\u0006\u0004\bU\u0010V\"\u001e\u0010[\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bX\u0010Y\u0012\u0004\bZ\u0010\r\" \u0010a\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010\r\u001a\u0004\b^\u0010_\" \u0010e\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bb\u0010]\u0012\u0004\bd\u0010\r\u001a\u0004\bc\u0010_\" \u0010i\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010]\u0012\u0004\bh\u0010\r\u001a\u0004\bg\u0010_\" \u0010m\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bj\u0010]\u0012\u0004\bl\u0010\r\u001a\u0004\bk\u0010_\" \u0010q\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bn\u0010]\u0012\u0004\bp\u0010\r\u001a\u0004\bo\u0010_\" \u0010P\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\br\u0010]\u0012\u0004\bt\u0010\r\u001a\u0004\bs\u0010_\"\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020 0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w\"\u0018\u0010{\u001a\u00020\u0003*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010z\"\u0018\u0010~\u001a\u00020\u0000*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}\"\u0019\u0010~\u001a\u00020\u0000*\u00020>8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u001c\u0010\u0084\u0001\u001a\u00020\u0015*\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, d2 = {"", "v", "()Z", "", "key", "dirty1", "dirty2", "", "info", "", "p5", "(IIILjava/lang/String;)V", "M7", "()V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Xw", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "S", "index", "", "data", "jB", "(Landroidx/compose/runtime/SlotWriter;ILjava/lang/Object;)V", "K", "V", "initialCapacity", "Landroidx/compose/runtime/collection/MultiValueMap;", "rV9", "(I)Landroidx/collection/MutableScatterMap;", "", "Landroidx/compose/runtime/Invalidation;", "location", "g", "(Ljava/util/List;I)I", "nY", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "nHg", "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", TtmlNode.START, TtmlNode.END, "te", "(Ljava/util/List;II)Landroidx/compose/runtime/Invalidation;", "U", "(Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;", "P5", "(Ljava/util/List;II)V", "ViF", "(Ljava/util/List;II)Ljava/util/List;", "Ik", "(Z)I", "ck", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "", "r", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "root", "WPU", "(Landroidx/compose/runtime/SlotReader;II)I", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "common", "bzg", "(Landroidx/compose/runtime/SlotReader;III)I", "message", "", "XQ", "(Ljava/lang/String;)Ljava/lang/Void;", "Z", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "slots", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/MovableContentState;", "aYN", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/CompositionTracer;", c.f62177j, "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "compositionTracer", "rl", "Ljava/lang/Object;", "fD", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "t", "X", "getProvider$annotations", "provider", "nr", "iF", "getCompositionLocalMap$annotations", "compositionLocalMap", "O", "getProviderValues", "getProviderValues$annotations", "providerValues", "J2", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getProviderMaps$annotations", "providerMaps", "Uo", "N", "getReference$annotations", "Ljava/util/Comparator;", "KN", "Ljava/util/Comparator;", "InvalidationLocationAscending", "e", "(Landroidx/compose/runtime/SlotWriter;)I", "nextGroup", "wTp", "(Landroidx/compose/runtime/SlotWriter;)Z", "isAfterFirstChild", "s7N", "(Landroidx/compose/runtime/SlotReader;)Z", "Landroidx/compose/runtime/KeyInfo;", "E2", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4891:1\n4341#1,8:4898\n4341#1,8:4912\n4643#1,5:4921\n4658#1,4:4933\n4643#1,5:4937\n1#2:4892\n1#2:4946\n1#2:4954\n2043#3,5:4893\n2049#3:4906\n2043#3,5:4907\n2049#3:4920\n158#4,7:4926\n174#4,4:4942\n179#4,3:4947\n174#4,4:4950\n179#4,3:4955\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4328#1:4898,8\n4375#1:4912,8\n4395#1:4921,5\n4663#1:4933,4\n4665#1:4937,5\n4755#1:4946\n4815#1:4954\n4319#1:4893,5\n4319#1:4906\n4362#1:4907,5\n4362#1:4920\n4508#1:4926,7\n4755#1:4942,4\n4755#1:4947,3\n4815#1:4950,4\n4815#1:4955,3\n*E\n"})
public final class ComposerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static CompositionTracer f30106n;
    private static final Object rl = new OpaqueKey("provider");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f30107t = new OpaqueKey("provider");
    private static final Object nr = new OpaqueKey("compositionLocalMap");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Object f30105O = new OpaqueKey("providerValues");
    private static final Object J2 = new OpaqueKey("providers");
    private static final Object Uo = new OpaqueKey("reference");
    private static final Comparator KN = new Comparator() { // from class: androidx.compose.runtime.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposerKt.rl((Invalidation) obj, (Invalidation) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Ik(boolean z2) {
        return z2 ? 1 : 0;
    }

    private static final int WPU(SlotReader slotReader, int i2, int i3) {
        int i5 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = slotReader.Xw(i2);
            i5++;
        }
        return i5;
    }

    public static final MovableContentState aYN(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier applier) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.D()) {
            slotTable.az();
        }
        if (slotWriter.J()) {
            slotTable.qie();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.EWS(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.fcU(parent)) {
                parent = slotWriter.UhV(parent);
            }
            if (parent >= 0 && slotWriter.fcU(parent)) {
                Object objGD = slotWriter.GD(parent);
                int i2 = parent + 1;
                int iM = parent + slotWriter.m(parent);
                int iEWS = 0;
                while (i2 < iM) {
                    int iM2 = slotWriter.m(i2) + i2;
                    if (iM2 > currentGroup) {
                        break;
                    }
                    iEWS += slotWriter.fcU(i2) ? 1 : slotWriter.EWS(i2);
                    i2 = iM2;
                }
                int iEWS2 = slotWriter.fcU(currentGroup) ? 1 : slotWriter.EWS(currentGroup);
                applier.KN(objGD);
                applier.n(iEWS, iEWS2);
                applier.gh();
            }
        }
        SlotWriter slotWriterG = slotTable.g();
        try {
            slotWriterG.T();
            slotWriterG.xVH(126665345, movableContentStateReference.getContent());
            SlotWriter.ul(slotWriterG, 0, 1, null);
            slotWriterG.Zn(movableContentStateReference.getCom.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD java.lang.String());
            List listHV = slotWriter.HV(movableContentStateReference.getAnchor(), 1, slotWriterG);
            slotWriterG.T3L();
            slotWriterG.M7();
            slotWriterG.p5();
            slotWriterG.wTp(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            if (!companion.rl(slotTable, listHV)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void rl(RecomposeScopeImpl scope) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void t(Object value) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult Uo(RecomposeScopeImpl scope, Object instance) {
                    InvalidationResult invalidationResultUo;
                    ControlledComposition controlledComposition2 = controlledComposition;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResultUo = recomposeScopeOwner2.Uo(scope, instance)) == null) {
                        invalidationResultUo = InvalidationResult.f30189n;
                    }
                    if (invalidationResultUo != InvalidationResult.f30189n) {
                        return invalidationResultUo;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    movableContentStateReference2.xMQ(CollectionsKt.plus((Collection<? extends Pair>) movableContentStateReference2.getInvalidations(), TuplesKt.to(scope, instance)));
                    return InvalidationResult.f30192t;
                }
            };
            slotWriterG = slotTable.g();
            try {
                companion.n(slotWriterG, listHV, recomposeScopeOwner);
                Unit unit = Unit.INSTANCE;
                slotWriterG.wTp(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ck(int i2) {
        return i2 != 0;
    }

    public static final void M7() {
        CompositionTracer compositionTracer = f30106n;
        if (compositionTracer != null) {
            compositionTracer.t();
        }
    }

    public static final Object N() {
        return Uo;
    }

    public static final Object T() {
        return J2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ViF(List list, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int iNY = nY(list, i2); iNY < list.size(); iNY++) {
            Invalidation invalidation = (Invalidation) list.get(iNY);
            if (invalidation.getLocation() >= i3) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    public static final Object X() {
        return f30107t;
    }

    public static final Void XQ(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void Z(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int bzg(SlotReader slotReader, int i2, int i3, int i5) {
        if (i2 != i3) {
            if (i2 == i5 || i3 == i5) {
                return i5;
            }
            if (slotReader.Xw(i2) == i3) {
                return i3;
            }
            if (slotReader.Xw(i3) != i2) {
                if (slotReader.Xw(i2) == slotReader.Xw(i3)) {
                    return slotReader.Xw(i2);
                }
                int iWPU = WPU(slotReader, i2, i5);
                int iWPU2 = WPU(slotReader, i3, i5);
                int i7 = iWPU - iWPU2;
                for (int i8 = 0; i8 < i7; i8++) {
                    i2 = slotReader.Xw(i2);
                }
                int i9 = iWPU2 - iWPU;
                for (int i10 = 0; i10 < i9; i10++) {
                    i3 = slotReader.Xw(i3);
                }
                while (i2 != i3) {
                    i2 = slotReader.Xw(i2);
                    i3 = slotReader.Xw(i3);
                }
                return i2;
            }
        }
        return i2;
    }

    public static final Object fD() {
        return rl;
    }

    public static final Object iF() {
        return nr;
    }

    public static final void p5(int i2, int i3, int i5, String str) {
        CompositionTracer compositionTracer = f30106n;
        if (compositionTracer != null) {
            compositionTracer.rl(i2, i3, i5, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderNY = slotTable.nY();
        try {
            o(slotReaderNY, arrayList, slotTable.xMQ(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            slotReaderNY.nr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableScatterMap rV9(int i2) {
        return MultiValueMap.nr(new MutableScatterMap(i2));
    }

    public static final boolean v() {
        CompositionTracer compositionTracer = f30106n;
        return compositionTracer != null && compositionTracer.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E2(KeyInfo keyInfo) {
        if (keyInfo.getObjectKey() != null) {
            return new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey());
        }
        return Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(List list, int i2, int i3) {
        int iNY = nY(list, i2);
        while (iNY < list.size() && ((Invalidation) list.get(iNY)).getLocation() < i3) {
            list.remove(iNY);
        }
    }

    public static final void S(SlotWriter slotWriter, RememberManager rememberManager) {
        int iY;
        int iJB = slotWriter.jB(slotWriter.groups, slotWriter.z(slotWriter.getCurrentGroup() + slotWriter.m(slotWriter.getCurrentGroup())));
        for (int iJB2 = slotWriter.jB(slotWriter.groups, slotWriter.z(slotWriter.getCurrentGroup())); iJB2 < iJB; iJB2++) {
            Object obj = slotWriter.slots[slotWriter.U(iJB2)];
            int iE2 = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.KN((ComposeNodeLifecycleCallback) obj, slotWriter.Y() - iJB2, -1, -1);
            } else if (obj instanceof RememberObserverHolder) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                if (!(rememberObserverHolder.getWrapped() instanceof ReusableRememberObserver)) {
                    jB(slotWriter, iJB2, obj);
                    int iY2 = slotWriter.Y() - iJB2;
                    Anchor anchorN = rememberObserverHolder.getAndroidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER java.lang.String();
                    if (anchorN != null && anchorN.rl()) {
                        iE2 = slotWriter.E2(anchorN);
                        iY = slotWriter.Y() - slotWriter.Qu(iE2);
                    } else {
                        iY = -1;
                    }
                    rememberManager.O(rememberObserverHolder, iY2, iE2, iY);
                }
            } else if (obj instanceof RecomposeScopeImpl) {
                jB(slotWriter, iJB2, obj);
                ((RecomposeScopeImpl) obj).g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation U(List list, int i2) {
        int iG = g(list, i2);
        if (iG >= 0) {
            return (Invalidation) list.remove(iG);
        }
        return null;
    }

    public static final void Xw(SlotWriter slotWriter, RememberManager rememberManager) {
        int iY;
        int iJB = slotWriter.jB(slotWriter.groups, slotWriter.z(slotWriter.getCurrentGroup() + slotWriter.m(slotWriter.getCurrentGroup())));
        for (int iJB2 = slotWriter.jB(slotWriter.groups, slotWriter.z(slotWriter.getCurrentGroup())); iJB2 < iJB; iJB2++) {
            Object obj = slotWriter.slots[slotWriter.U(iJB2)];
            int iE2 = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.rl((ComposeNodeLifecycleCallback) obj, slotWriter.Y() - iJB2, -1, -1);
            }
            if (obj instanceof RememberObserverHolder) {
                int iY2 = slotWriter.Y() - iJB2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor anchorN = rememberObserverHolder.getAndroidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER java.lang.String();
                if (anchorN != null && anchorN.rl()) {
                    iE2 = slotWriter.E2(anchorN);
                    iY = slotWriter.Y() - slotWriter.Qu(iE2);
                } else {
                    iY = -1;
                }
                rememberManager.O(rememberObserverHolder, iY2, iE2, iY);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).g();
            }
        }
        slotWriter.kSg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.m(slotWriter.getCurrentGroup());
    }

    private static final int g(List list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i5 = (i3 + size) >>> 1;
            int iCompare = Intrinsics.compare(((Invalidation) list.get(i5)).getLocation(), i2);
            if (iCompare < 0) {
                i3 = i5 + 1;
            } else if (iCompare > 0) {
                size = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i3 + 1);
    }

    private static final void jB(SlotWriter slotWriter, int i2, Object obj) {
        boolean z2;
        Object objNHg = slotWriter.nHg(i2);
        if (obj == objNHg) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Z("Slot table is out of sync (expected " + obj + ", got " + objNHg + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nHg(List list, int i2, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iG = g(list, i2);
        if (iG < 0) {
            int i3 = -(iG + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i3, new Invalidation(recomposeScopeImpl, i2, obj));
            return;
        }
        Invalidation invalidation = (Invalidation) list.get(iG);
        if (obj instanceof DerivedState) {
            Object objN = invalidation.getInstances();
            if (objN == null) {
                invalidation.O(obj);
                return;
            } else if (objN instanceof MutableScatterSet) {
                ((MutableScatterSet) objN).xMQ(obj);
                return;
            } else {
                invalidation.O(ScatterSetKt.rl(objN, obj));
                return;
            }
        }
        invalidation.O(null);
    }

    private static final int nY(List list, int i2) {
        int iG = g(list, i2);
        if (iG < 0) {
            return -(iG + 1);
        }
        return iG;
    }

    private static final void o(SlotReader slotReader, List list, int i2) {
        if (slotReader.nHg(i2)) {
            list.add(slotReader.wTp(i2));
            return;
        }
        int iE2 = i2 + 1;
        int iE22 = i2 + slotReader.E2(i2);
        while (iE2 < iE22) {
            o(slotReader, list, iE2);
            iE2 += slotReader.E2(iE2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rl(Invalidation invalidation, Invalidation invalidation2) {
        return Intrinsics.compare(invalidation.getLocation(), invalidation2.getLocation());
    }

    public static final boolean s7N(SlotReader slotReader) {
        if (slotReader.getCurrent() > slotReader.getParent() + 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation te(List list, int i2, int i3) {
        int iNY = nY(list, i2);
        if (iNY < list.size()) {
            Invalidation invalidation = (Invalidation) list.get(iNY);
            if (invalidation.getLocation() < i3) {
                return invalidation;
            }
            return null;
        }
        return null;
    }

    public static final boolean wTp(SlotWriter slotWriter) {
        if (slotWriter.getCurrentGroup() > slotWriter.getParent() + 1) {
            return true;
        }
        return false;
    }
}
