package androidx.compose.foundation.text;

import GJW.C;
import GJW.h;
import GJW.vd;
import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u000e2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\bH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "", "enabled", c.f62177j, "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/SelectionManager;", "rl", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "nr", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,216:1\n1247#2,6:217\n1247#2,3:230\n1250#2,3:234\n1247#2,6:237\n1247#2,6:243\n1247#2,6:249\n1247#2,6:255\n1247#2,3:268\n1250#2,3:272\n1247#2,6:275\n1247#2,6:281\n1247#2,6:287\n1247#2,6:293\n1247#2,6:299\n1247#2,6:305\n557#3:223\n554#3,6:224\n557#3:261\n554#3,6:262\n555#4:233\n555#4:271\n*S KotlinDebug\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n45#1:217,6\n46#1:230,3\n46#1:234,3\n47#1:237,6\n51#1:243,6\n54#1:249,6\n69#1:255,6\n70#1:268,3\n70#1:272,3\n71#1:275,6\n76#1:281,6\n91#1:287,6\n94#1:293,6\n105#1:299,6\n108#1:305,6\n46#1:223\n46#1:224,6\n70#1:261\n70#1:262,6\n46#1:233\n70#1:271\n*E\n"})
public final class ContextMenu_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[PHI: r2 r5 r7 r8
      0x0093: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r5v3 int) = (r5v1 int), (r5v11 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r7v3 androidx.compose.foundation.text.selection.TextFieldSelectionManager) = 
      (r7v0 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
      (r7v9 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
     binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v10 int) = (r8v6 int), (r8v12 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
        ContextMenu_androidKt$getContextMenuItemsAvailability$2 contextMenu_androidKt$getContextMenuItemsAvailability$2;
        ?? r2;
        int i2;
        int i3;
        TextFieldSelectionManager textFieldSelectionManager2;
        int i5;
        int i7;
        int i8;
        ?? r22;
        boolean z2;
        boolean z3;
        ?? r8;
        ?? r23;
        ?? r24;
        if (continuation instanceof ContextMenu_androidKt$getContextMenuItemsAvailability$2) {
            contextMenu_androidKt$getContextMenuItemsAvailability$2 = (ContextMenu_androidKt$getContextMenuItemsAvailability$2) continuation;
            int i9 = contextMenu_androidKt$getContextMenuItemsAvailability$2.f19542o;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                contextMenu_androidKt$getContextMenuItemsAvailability$2.f19542o = i9 - Integer.MIN_VALUE;
            } else {
                contextMenu_androidKt$getContextMenuItemsAvailability$2 = new ContextMenu_androidKt$getContextMenuItemsAvailability$2(continuation);
            }
        }
        Object obj = contextMenu_androidKt$getContextMenuItemsAvailability$2.f19543r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = contextMenu_androidKt$getContextMenuItemsAvailability$2.f19542o;
        boolean z4 = false;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            r2 = textFieldSelectionManager.getVisualTransformation() instanceof PasswordVisualTransformation;
            boolean zKN = TextRange.KN(textFieldSelectionManager.p5().getSelection());
            i2 = !zKN ? 1 : 0;
            i3 = (zKN || r2 != 0) ? 0 : 1;
            if (textFieldSelectionManager.X()) {
                Clipboard clipboard = textFieldSelectionManager.getClipboard();
                r22 = r2;
                i8 = i3;
                if (clipboard != null) {
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.f19541n = textFieldSelectionManager;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.f19544t = r2;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.f19540O = i2;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.J2 = i3 == true ? 1 : 0;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.f19542o = 1;
                    Object objN = clipboard.n(contextMenu_androidKt$getContextMenuItemsAvailability$2);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    textFieldSelectionManager2 = textFieldSelectionManager;
                    i5 = i3 == true ? 1 : 0;
                    obj = objN;
                    i7 = i2;
                    r24 = r2;
                }
                z2 = false;
                r2 = r22;
                i3 = i8;
                if (z2) {
                    z3 = true;
                    r23 = r2;
                    r8 = i3;
                }
                boolean z5 = i2 == 0 && textFieldSelectionManager.X() && r23 == 0;
                boolean z6 = TextRange.mUb(textFieldSelectionManager.p5().getSelection()) == textFieldSelectionManager.p5().xMQ().length();
                if (textFieldSelectionManager.X() && TextRange.KN(textFieldSelectionManager.p5().getSelection())) {
                    z4 = true;
                }
                return MenuItemsAvailability.rl(MenuItemsAvailability.nr(r8, z3, z5, z6, z4));
            }
            z3 = false;
            r23 = r2;
            r8 = i3;
            if (i2 == 0) {
            }
            if (TextRange.mUb(textFieldSelectionManager.p5().getSelection()) == textFieldSelectionManager.p5().xMQ().length()) {
            }
            if (textFieldSelectionManager.X()) {
                z4 = true;
            }
            return MenuItemsAvailability.rl(MenuItemsAvailability.nr(r8, z3, z5, z6, z4));
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i5 = contextMenu_androidKt$getContextMenuItemsAvailability$2.J2;
        i7 = contextMenu_androidKt$getContextMenuItemsAvailability$2.f19540O;
        int i11 = contextMenu_androidKt$getContextMenuItemsAvailability$2.f19544t;
        textFieldSelectionManager2 = (TextFieldSelectionManager) contextMenu_androidKt$getContextMenuItemsAvailability$2.f19541n;
        ResultKt.throwOnFailure(obj);
        r24 = i11;
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && ClipboardUtils_androidKt.t(clipEntry)) {
            i3 = i5;
            textFieldSelectionManager = textFieldSelectionManager2;
            i2 = i7;
            z2 = true;
            r2 = r24;
            if (z2) {
            }
            if (i2 == 0) {
            }
            if (TextRange.mUb(textFieldSelectionManager.p5().getSelection()) == textFieldSelectionManager.p5().xMQ().length()) {
            }
            if (textFieldSelectionManager.X()) {
            }
            return MenuItemsAvailability.rl(MenuItemsAvailability.nr(r8, z3, z5, z6, z4));
        }
        i8 = i5;
        textFieldSelectionManager = textFieldSelectionManager2;
        i2 = i7;
        r22 = r24;
        z2 = false;
        r2 = r22;
        i3 = i8;
        if (z2) {
            z3 = false;
            r23 = r2;
            r8 = i3;
        }
        if (i2 == 0) {
        }
        if (TextRange.mUb(textFieldSelectionManager.p5().getSelection()) == textFieldSelectionManager.p5().xMQ().length()) {
        }
        if (textFieldSelectionManager.X()) {
        }
        return MenuItemsAvailability.rl(MenuItemsAvailability.nr(r8, z3, z5, z6, z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        ContextMenu_androidKt$getContextMenuItemsAvailability$1 contextMenu_androidKt$getContextMenuItemsAvailability$1;
        TextFieldSelectionState textFieldSelectionState2;
        boolean z2;
        if (continuation instanceof ContextMenu_androidKt$getContextMenuItemsAvailability$1) {
            contextMenu_androidKt$getContextMenuItemsAvailability$1 = (ContextMenu_androidKt$getContextMenuItemsAvailability$1) continuation;
            int i2 = contextMenu_androidKt$getContextMenuItemsAvailability$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contextMenu_androidKt$getContextMenuItemsAvailability$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                contextMenu_androidKt$getContextMenuItemsAvailability$1 = new ContextMenu_androidKt$getContextMenuItemsAvailability$1(continuation);
            }
        }
        Object obj = contextMenu_androidKt$getContextMenuItemsAvailability$1.f19537O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = contextMenu_androidKt$getContextMenuItemsAvailability$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zIF = textFieldSelectionState.iF();
            contextMenu_androidKt$getContextMenuItemsAvailability$1.f19538n = textFieldSelectionState;
            contextMenu_androidKt$getContextMenuItemsAvailability$1.f19539t = zIF;
            contextMenu_androidKt$getContextMenuItemsAvailability$1.J2 = 1;
            Object objE2 = textFieldSelectionState.E2(contextMenu_androidKt$getContextMenuItemsAvailability$1);
            if (objE2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            textFieldSelectionState2 = textFieldSelectionState;
            z2 = zIF;
            obj = objE2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = contextMenu_androidKt$getContextMenuItemsAvailability$1.f19539t;
            textFieldSelectionState2 = (TextFieldSelectionState) contextMenu_androidKt$getContextMenuItemsAvailability$1.f19538n;
            ResultKt.throwOnFailure(obj);
        }
        return MenuItemsAvailability.rl(MenuItemsAvailability.nr(z2, ((Boolean) obj).booleanValue(), textFieldSelectionState2.fD(), textFieldSelectionState2.e(), textFieldSelectionState2.te()));
    }

    public static final void n(final TextFieldSelectionState textFieldSelectionState, boolean z2, Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z3;
        final boolean z4;
        final Function2 function22;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(2103477555);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(textFieldSelectionState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.n(z2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerKN.HI(z3, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(2103477555, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new ContextMenuState(null, 1, null);
                composerKN.o(objIF);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF2);
            }
            final vd vdVar = (vd) objIF2;
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(MenuItemsAvailability.rl(MenuItemsAvailability.INSTANCE.n()), null, 2, null);
                composerKN.o(objIF3);
            }
            final MutableState mutableState = (MutableState) objIF3;
            boolean zE2 = composerKN.E2(vdVar);
            Object objIF4 = composerKN.iF();
            if (zE2 || objIF4 == companion.n()) {
                objIF4 = new Function2<TextFieldSelectionState, TextContextMenuItems, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", f = "ContextMenu.android.kt", i = {}, l = {79, 80, 81}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ TextFieldSelectionState f19531O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f19532n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ TextContextMenuItems f19533t;

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1$WhenMappings */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[TextContextMenuItems.values().length];
                                try {
                                    iArr[TextContextMenuItems.f19814t.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[TextContextMenuItems.f19809O.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[TextContextMenuItems.J2.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[TextContextMenuItems.f19813r.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    iArr[TextContextMenuItems.f19812o.ordinal()] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
                            super(2, continuation);
                            this.f19533t = textContextMenuItems;
                            this.f19531O = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f19533t, this.f19531O, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
                        
                            if (r6.ofS(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
                        
                            if (r6.T(false, r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
                        
                            if (r6.s7N(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
                        
                            return r0;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f19532n;
                            if (i2 != 0) {
                                if (i2 == 1 || i2 == 2 || i2 == 3) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                int i3 = WhenMappings.$EnumSwitchMapping$0[this.f19533t.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 != 4) {
                                                if (i3 == 5) {
                                                    this.f19531O.g();
                                                }
                                            } else {
                                                this.f19531O.G7();
                                            }
                                        } else {
                                            TextFieldSelectionState textFieldSelectionState = this.f19531O;
                                            this.f19532n = 3;
                                        }
                                    } else {
                                        TextFieldSelectionState textFieldSelectionState2 = this.f19531O;
                                        this.f19532n = 2;
                                    }
                                } else {
                                    TextFieldSelectionState textFieldSelectionState3 = this.f19531O;
                                    this.f19532n = 1;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        n(textFieldSelectionState2, textContextMenuItems);
                        return Unit.INSTANCE;
                    }

                    public final void n(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        C.nr(vdVar, null, h.J2, new AnonymousClass1(textContextMenuItems, textFieldSelectionState2, null), 1, null);
                    }
                };
                composerKN.o(objIF4);
            }
            Function1 function1N = TextFieldSelectionState_androidKt.n(textFieldSelectionState, contextMenuState, mutableState, (Function2) objIF4);
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
                objIF5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ContextMenuState_androidKt.n(contextMenuState);
                    }
                };
                composerKN.o(objIF5);
            }
            Function0 function0 = (Function0) objIF5;
            boolean zE22 = composerKN.E2(vdVar) | composerKN.E2(textFieldSelectionState);
            Object objIF6 = composerKN.iF();
            if (zE22 || objIF6 == companion.n()) {
                objIF6 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", f = "ContextMenu.android.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TextFieldSelectionState J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ MutableState f19520O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        Object f19521n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f19522t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MutableState mutableState, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
                            super(2, continuation);
                            this.f19520O = mutableState;
                            this.J2 = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f19520O, this.J2, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f19522t;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    mutableState = (MutableState) this.f19521n;
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                MutableState mutableState2 = this.f19520O;
                                TextFieldSelectionState textFieldSelectionState = this.J2;
                                this.f19521n = mutableState2;
                                this.f19522t = 1;
                                Object objNr = ContextMenu_androidKt.nr(textFieldSelectionState, this);
                                if (objNr == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableState = mutableState2;
                                obj = objNr;
                            }
                            mutableState.setValue(obj);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C.nr(vdVar, null, h.J2, new AnonymousClass1(mutableState, textFieldSelectionState, null), 1, null);
                    }
                };
                composerKN.o(objIF6);
            }
            function22 = function2;
            z4 = z2;
            ContextMenuArea_androidKt.rl(contextMenuState, function0, function1N, null, z4, (Function0) objIF6, function22, composerKN, ((i3 << 9) & 57344) | 54 | ((i3 << 12) & 3670016), 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            z4 = z2;
            function22 = function2;
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    ContextMenu_androidKt.n(textFieldSelectionState, z4, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void rl(final SelectionManager selectionManager, Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        final Function2 function22;
        int i5;
        int i7;
        Composer composerKN = composer.KN(605522716);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(selectionManager)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(605522716, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new ContextMenuState(null, 1, null);
                composerKN.o(objIF);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$7$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ContextMenuState_androidKt.n(contextMenuState);
                    }
                };
                composerKN.o(objIF2);
            }
            function22 = function2;
            ContextMenuArea_androidKt.rl(contextMenuState, (Function0) objIF2, SelectionManager_androidKt.n(selectionManager, contextMenuState), null, false, null, function22, composerKN, ((i3 << 15) & 3670016) | 54, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            function22 = function2;
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    ContextMenu_androidKt.rl(selectionManager, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void t(final TextFieldSelectionManager textFieldSelectionManager, Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        final Function2 function22;
        int i5;
        int i7;
        Composer composerKN = composer.KN(-1985516685);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(textFieldSelectionManager)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1985516685, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new ContextMenuState(null, 1, null);
                composerKN.o(objIF);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF2);
            }
            final vd vdVar = (vd) objIF2;
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(MenuItemsAvailability.rl(MenuItemsAvailability.INSTANCE.n()), null, 2, null);
                composerKN.o(objIF3);
            }
            final MutableState mutableState = (MutableState) objIF3;
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ContextMenuState_androidKt.n(contextMenuState);
                    }
                };
                composerKN.o(objIF4);
            }
            Function0 function0 = (Function0) objIF4;
            Function1 function1N = TextFieldSelectionManager_androidKt.n(textFieldSelectionManager, contextMenuState, mutableState);
            boolean zT2 = textFieldSelectionManager.T();
            boolean zE2 = composerKN.E2(vdVar) | composerKN.E2(textFieldSelectionManager);
            Object objIF5 = composerKN.iF();
            if (zE2 || objIF5 == companion.n()) {
                objIF5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TextFieldSelectionManager J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ MutableState f19510O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        Object f19511n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f19512t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MutableState mutableState, TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                            super(2, continuation);
                            this.f19510O = mutableState;
                            this.J2 = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f19510O, this.J2, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f19512t;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    mutableState = (MutableState) this.f19511n;
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                MutableState mutableState2 = this.f19510O;
                                TextFieldSelectionManager textFieldSelectionManager = this.J2;
                                this.f19511n = mutableState2;
                                this.f19512t = 1;
                                Object objO = ContextMenu_androidKt.O(textFieldSelectionManager, this);
                                if (objO == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableState = mutableState2;
                                obj = objO;
                            }
                            mutableState.setValue(obj);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C.nr(vdVar, null, h.J2, new AnonymousClass1(mutableState, textFieldSelectionManager, null), 1, null);
                    }
                };
                composerKN.o(objIF5);
            }
            function22 = function2;
            ContextMenuArea_androidKt.rl(contextMenuState, function0, function1N, null, zT2, (Function0) objIF5, function22, composerKN, ((i3 << 15) & 3670016) | 54, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            function22 = function2;
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    ContextMenu_androidKt.t(textFieldSelectionManager, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
