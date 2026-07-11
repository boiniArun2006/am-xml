package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u0003J\u0015\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\u0003J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\u0003J\u001d\u00107\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J%\u0010;\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u00106\u001a\u0002052\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u001d¢\u0006\u0004\b>\u0010)J)\u0010C\u001a\u00020\b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0?2\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\b\u0010E\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bF\u0010.J@\u0010K\u001a\u00020\b\"\u0004\b\u0000\u0010(\"\u0004\b\u0001\u0010G2\u0006\u0010\u0013\u001a\u00028\u00012\u001d\u0010J\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0H¢\u0006\u0002\bI¢\u0006\u0004\bK\u0010LJ\u001d\u0010O\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001d¢\u0006\u0004\bU\u0010)J\u0015\u0010V\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\bV\u0010)J\u001d\u0010Y\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0W¢\u0006\u0004\bY\u0010ZJ\u001b\u0010]\u001a\u00020\b2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0[¢\u0006\u0004\b]\u0010^J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\ba\u0010bJ%\u0010e\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0c2\u0006\u0010d\u001a\u00020_¢\u0006\u0004\be\u0010fJ/\u0010l\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020i2\u0006\u00106\u001a\u00020k2\u0006\u0010Q\u001a\u00020k¢\u0006\u0004\bl\u0010mJ%\u0010p\u001a\u00020\b2\u0006\u0010B\u001a\u00020n2\u0006\u0010j\u001a\u00020i2\u0006\u0010o\u001a\u00020k¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\b¢\u0006\u0004\br\u0010\u0003J!\u0010t\u001a\u00020\b2\u0006\u0010s\u001a\u00020\u00002\n\b\u0002\u0010d\u001a\u0004\u0018\u00010_¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u00020v2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010{R\u0011\u0010\u007f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "O", "()Z", "J2", "", "rl", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "t", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/RememberObserverHolder;", "value", "nY", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "g", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "X", "Ik", "", "", "groupSlotIndex", "wTp", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "N", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "KN", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", JavetError.PARAMETER_COUNT, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(I)V", "fD", "gh", "data", "nHg", "(Ljava/lang/Object;)V", "o", "r", "(Landroidx/compose/runtime/Anchor;)V", "HI", "e", "te", "Landroidx/compose/runtime/SlotTable;", "from", "XQ", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "S", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "WPU", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", FileUploadManager.f61572j, "composition", "ty", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "rV9", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "s7N", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "iF", "(II)V", "to", "aYN", "(III)V", "distance", "Uo", "v", "", "nodes", "az", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "E2", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "qie", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "xMQ", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "mUb", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "reference", "ViF", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "ck", "changeList", "Z", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "", "linePrefix", c.f62177j, "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/Operations;", "operations", "nr", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 8 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 27 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 28 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 29 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,331:1\n202#2,4:332\n207#2,2:337\n202#2,4:339\n207#2,2:344\n202#2,4:346\n207#2,2:351\n202#2,4:353\n207#2,2:358\n202#2,4:360\n359#2:375\n356#2:376\n207#2,2:378\n202#2,4:380\n359#2:398\n356#2:399\n207#2,2:401\n202#2,4:403\n207#2,2:411\n202#2,4:413\n359#2:427\n356#2:428\n207#2,2:430\n202#2,4:432\n207#2,2:437\n202#2,4:439\n207#2,2:444\n202#2,4:446\n207#2,2:454\n202#2,4:456\n207#2,2:463\n202#2,4:465\n359#2:479\n356#2:480\n207#2,2:482\n202#2,4:484\n207#2,2:490\n202#2,4:492\n207#2,2:500\n202#2,4:502\n356#2:520\n207#2,2:525\n202#2,4:527\n356#2:550\n207#2,2:556\n202#2,4:558\n359#2:572\n356#2:573\n207#2,2:575\n202#2,4:577\n359#2:591\n356#2:592\n207#2,2:594\n202#2,4:596\n207#2,2:601\n202#2,4:603\n207#2,2:608\n202#2,4:610\n207#2,2:616\n202#2,4:618\n207#2,2:624\n202#2,4:626\n207#2,2:634\n202#2,4:636\n207#2,2:643\n202#2,4:645\n207#2,2:651\n153#3:336\n172#4:343\n192#5:350\n212#6:357\n299#7:364\n302#7:365\n370#8,9:366\n379#8:377\n370#8,9:389\n379#8:400\n370#8,9:418\n379#8:429\n370#8,9:470\n379#8:481\n387#8,10:510\n397#8,4:521\n410#8,11:539\n421#8,5:551\n370#8,9:563\n379#8:574\n370#8,9:582\n379#8:593\n342#9,4:384\n348#9:388\n232#10,4:407\n260#11:417\n399#12:436\n428#13:443\n607#14,4:450\n639#15:460\n642#15:461\n645#15:462\n457#16:469\n496#17:488\n499#17:489\n532#18,4:496\n557#19,4:506\n583#20:531\n580#20,7:532\n112#21:562\n70#22:581\n89#23:600\n134#24:607\n775#25:614\n778#25:615\n810#26:622\n807#26:623\n838#27:630\n841#27:631\n847#27:632\n844#27:633\n907#28:640\n910#28:641\n913#28:642\n944#29:649\n947#29:650\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n91#1:332,4\n91#1:337,2\n95#1:339,4\n95#1:344,2\n99#1:346,4\n99#1:351,2\n103#1:353,4\n103#1:358,2\n107#1:360,4\n109#1:375\n109#1:376\n107#1:378,2\n114#1:380,4\n116#1:398\n116#1:399\n114#1:401,2\n121#1:403,4\n121#1:411,2\n127#1:413,4\n127#1:427\n127#1:428\n127#1:430,2\n139#1:432,4\n139#1:437,2\n147#1:439,4\n147#1:444,2\n163#1:446,4\n163#1:454,2\n169#1:456,4\n169#1:463,2\n182#1:465,4\n182#1:479\n182#1:480\n182#1:482,2\n186#1:484,4\n186#1:490,2\n203#1:492,4\n203#1:500,2\n210#1:502,4\n211#1:520\n210#1:525,2\n216#1:527,4\n217#1:550\n216#1:556,2\n222#1:558,4\n222#1:572\n222#1:573\n222#1:575,2\n226#1:577,4\n226#1:591\n226#1:592\n226#1:594,2\n231#1:596,4\n231#1:601,2\n236#1:603,4\n236#1:608,2\n240#1:610,4\n240#1:616,2\n252#1:618,4\n252#1:624,2\n270#1:626,4\n270#1:634,2\n290#1:636,4\n290#1:643,2\n308#1:645,4\n308#1:651,2\n91#1:336\n95#1:343\n99#1:350\n103#1:357\n108#1:364\n109#1:365\n109#1:366,9\n109#1:377\n116#1:389,9\n116#1:400\n127#1:418,9\n127#1:429\n182#1:470,9\n182#1:481\n211#1:510,10\n211#1:521,4\n217#1:539,11\n217#1:551,5\n222#1:563,9\n222#1:574\n226#1:582,9\n226#1:593\n115#1:384,4\n116#1:388\n122#1:407,4\n127#1:417\n139#1:436\n147#1:443\n164#1:450,4\n171#1:460\n173#1:461\n175#1:462\n182#1:469\n188#1:488\n190#1:489\n205#1:496,4\n211#1:506,4\n217#1:531\n217#1:532,7\n222#1:562\n226#1:581\n231#1:600\n236#1:607\n242#1:614\n244#1:615\n254#1:622\n256#1:623\n272#1:630\n274#1:631\n276#1:632\n278#1:633\n292#1:640\n294#1:641\n296#1:642\n310#1:649\n312#1:650\n*E\n"})
public final class ChangeList extends OperationsDebugStringFormattable {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Operations operations = new Operations();

    public final void az(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.f30489t;
        operations.HI(downs);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), nodes);
        operations.J2(downs);
    }

    public final void E2(Function0 effect) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.f30509t;
        operations.HI(sideEffect);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), effect);
        operations.J2(sideEffect);
    }

    public final void HI() {
        this.operations.ty(Operation.EndCurrentGroup.f30491t);
    }

    public final void Ik(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.f30493t;
        operations.HI(endResumingScope);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), scope);
        operations.J2(endResumingScope);
    }

    public final boolean J2() {
        return this.operations.qie();
    }

    public final void KN(Anchor anchor, Object value) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.f30483t;
        operations.HI(appendValue);
        Operations.WriteScope.O(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), anchor, Operation.ObjectParameter.n(1), value);
        operations.J2(appendValue);
    }

    public final void N(Object value, Anchor anchor, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.f30515t;
        operations.HI(updateAnchoredValue);
        Operations operationsN = Operations.WriteScope.n(operations);
        Operations.WriteScope.O(operationsN, Operation.ObjectParameter.n(0), value, Operation.ObjectParameter.n(1), anchor);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.J2(updateAnchoredValue);
    }

    public final boolean O() {
        return this.operations.gh();
    }

    public final void S(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.f30498t;
        operations.HI(insertSlotsWithFixups);
        Operations.WriteScope.Uo(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), anchor, Operation.ObjectParameter.n(1), from, Operation.ObjectParameter.n(2), fixups);
        operations.J2(insertSlotsWithFixups);
    }

    public final void T(int count) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.f30514t;
        operations.HI(trimParentValues);
        Operations operationsN = Operations.WriteScope.n(operations);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = count;
        operations.J2(trimParentValues);
    }

    public final void Uo(int distance) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.f30482t;
        operations.HI(advanceSlotsBy);
        Operations operationsN = Operations.WriteScope.n(operations);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = distance;
        operations.J2(advanceSlotsBy);
    }

    public final void ViF(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.f30503t;
        operations.HI(releaseMovableGroupAtCurrent);
        Operations.WriteScope.Uo(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), composition, Operation.ObjectParameter.n(1), parentContext, Operation.ObjectParameter.n(2), reference);
        operations.J2(releaseMovableGroupAtCurrent);
    }

    public final void WPU(int offset) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.f30499t;
        operations.HI(moveCurrentGroup);
        Operations operationsN = Operations.WriteScope.n(operations);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = offset;
        operations.J2(moveCurrentGroup);
    }

    public final void X(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.f30511t;
        operations.HI(startResumingScope);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), scope);
        operations.J2(startResumingScope);
    }

    public final void XQ(Anchor anchor, SlotTable from) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.f30497t;
        operations.HI(insertSlots);
        Operations.WriteScope.O(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), anchor, Operation.ObjectParameter.n(1), from);
        operations.J2(insertSlots);
    }

    public final void aYN(int to, int from, int count) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.f30500t;
        operations.HI(moveNode);
        Operations operationsN = Operations.WriteScope.n(operations);
        int iRl = operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts();
        int[] iArr = operationsN.intArgs;
        iArr[iRl + 1] = to;
        iArr[iRl] = from;
        iArr[iRl + 2] = count;
        operations.J2(moveNode);
    }

    public final void ck() {
        this.operations.ty(Operation.EndMovableContentPlacement.f30492t);
    }

    public final void e() {
        this.operations.ty(Operation.SkipToEndOfCurrentGroup.f30510t);
    }

    public final void fD() {
        this.operations.ty(Operation.ResetSlots.f30508t);
    }

    public final void g(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.f30505t;
        operations.HI(rememberPausingScope);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), scope);
        operations.J2(rememberPausingScope);
    }

    public final void gh() {
        this.operations.ty(Operation.DeactivateCurrentGroup.f30487t);
    }

    public final void iF(int removeFrom, int moveCount) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.f30507t;
        operations.HI(removeNode);
        Operations operationsN = Operations.WriteScope.n(operations);
        int iRl = operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts();
        int[] iArr = operationsN.intArgs;
        iArr[iRl] = removeFrom;
        iArr[iRl + 1] = moveCount;
        operations.J2(removeNode);
    }

    public final void mUb(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.f30486t;
        operations.HI(copySlotTableToAnchorLocation);
        Operations.WriteScope.J2(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), resolvedState, Operation.ObjectParameter.n(1), parentContext, Operation.ObjectParameter.n(3), to, Operation.ObjectParameter.n(2), from);
        operations.J2(copySlotTableToAnchorLocation);
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String n(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(nr());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.n(linePrefix));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void nHg(Object data) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.f30516t;
        operations.HI(updateAuxData);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), data);
        operations.J2(updateAuxData);
    }

    public final void nY(RememberObserverHolder value) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.f30504t;
        operations.HI(remember);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), value);
        operations.J2(remember);
    }

    public final int nr() {
        return this.operations.getOpCodesSize();
    }

    public final void o() {
        this.operations.ty(Operation.EnsureRootGroupStarted.f30495t);
    }

    public final void qie(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.f30488t;
        operations.HI(determineMovableContentNodeIndex);
        Operations.WriteScope.O(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), effectiveNodeIndexOut, Operation.ObjectParameter.n(1), anchor);
        operations.J2(determineMovableContentNodeIndex);
    }

    public final void r(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.f30494t;
        operations.HI(ensureGroupStarted);
        Operations.WriteScope.nr(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), anchor);
        operations.J2(ensureGroupStarted);
    }

    public final void rV9(Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.ty(Operation.UseCurrentNode.f30520t);
        }
    }

    public final void rl() {
        this.operations.t();
    }

    public final void s7N(Object value, Function2 block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.f30517t;
        operations.HI(updateNode);
        Operations operationsN = Operations.WriteScope.n(operations);
        int iN = Operation.ObjectParameter.n(0);
        int iN2 = Operation.ObjectParameter.n(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.O(operationsN, iN, value, iN2, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.J2(updateNode);
    }

    public final void t(Applier applier, SlotWriter slots, RememberManager rememberManager) {
        this.operations.Uo(applier, slots, rememberManager);
    }

    public final void te() {
        this.operations.ty(Operation.RemoveCurrentGroup.f30506t);
    }

    public final void ty(Function1 action, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.f30490t;
        operations.HI(endCompositionScope);
        Operations.WriteScope.O(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), action, Operation.ObjectParameter.n(1), composition);
        operations.J2(endCompositionScope);
    }

    public final void v(int count) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.f30519t;
        operations.HI(ups);
        Operations operationsN = Operations.WriteScope.n(operations);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = count;
        operations.J2(ups);
    }

    public final void wTp(Object value, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.f30518t;
        operations.HI(updateValue);
        Operations operationsN = Operations.WriteScope.n(operations);
        Operations.WriteScope.nr(operationsN, Operation.ObjectParameter.n(0), value);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.J2(updateValue);
    }

    public final void Z(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.J2()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.f30484t;
            operations.HI(applyChangeList);
            Operations.WriteScope.O(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(0), changeList, Operation.ObjectParameter.n(1), effectiveNodeIndex);
            operations.J2(applyChangeList);
        }
    }

    public final void xMQ(List nodes, IntRef effectiveNodeIndex) {
        if (!nodes.isEmpty()) {
            Operations operations = this.operations;
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.f30485t;
            operations.HI(copyNodesToNewAnchorLocation);
            Operations.WriteScope.O(Operations.WriteScope.n(operations), Operation.ObjectParameter.n(1), nodes, Operation.ObjectParameter.n(0), effectiveNodeIndex);
            operations.J2(copyNodesToNewAnchorLocation);
        }
    }
}
