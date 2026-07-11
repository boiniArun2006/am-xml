package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.view.DefaultLifecycleObserver;
import androidx.view.LifecycleOwner;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0093\u0001\u0094\u0001\u0095\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\rJ\u001d\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J-\u0010'\u001a\u00020\u000b*\u00020\u000e2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010\rJ\u001f\u00101\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u0010\rJ\u000f\u00107\u001a\u00020\u000bH\u0002¢\u0006\u0004\b7\u0010\rJ\u000f\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u0010\rJ\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u0010\u0010C\u001a\u00020\u000bH\u0080@¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000bH\u0000¢\u0006\u0004\bE\u0010\rJ\u000f\u0010F\u001a\u00020\u000bH\u0000¢\u0006\u0004\bF\u0010\rJ\u000f\u0010G\u001a\u00020\u000bH\u0000¢\u0006\u0004\bG\u0010\rJ\u000f\u0010H\u001a\u00020\u000bH\u0000¢\u0006\u0004\bH\u0010\rJ\u000f\u0010I\u001a\u00020\u000bH\u0000¢\u0006\u0004\bI\u0010\rJ/\u0010Q\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0NH\u0001¢\u0006\u0004\bQ\u0010RJ'\u0010W\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u00002\u000e\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0TH\u0001¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010i\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bC\u0010c\u0012\u0004\bh\u0010\r\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010lR\u0016\u0010p\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010oR\u0016\u0010s\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010uR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u000b0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010xR\u001a\u0010~\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010{\u001a\u0004\b|\u0010}R,\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148@@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b#\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0005\b\u0082\u0001\u0010\u0018R\u0017\u0010\u0084\u0001\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010oR\u001f\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008b\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010uR\u0017\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010\u008d\u0001R\u0017\u0010\u0091\u0001\u001a\u00020t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0096\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "", "te", "()V", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "g", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "newSemanticsNodes", "xMQ", "(Landroidx/collection/IntObjectMap;)V", "", "id", "", "newText", "iF", "(ILjava/lang/String;)V", "N", "r", "index", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "E2", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "Lkotlin/Function2;", FileUploadManager.f61572j, "qie", "(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function2;)V", "virtualId", "viewStructure", "J2", "(ILandroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "KN", "(I)V", "Ik", "node", "e", "(ILandroidx/compose/ui/semantics/SemanticsNode;)V", "X", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "nHg", "fD", "HI", "mUb", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/LifecycleOwner;", "owner", "M", "(Landroidx/lifecycle/LifecycleOwner;)V", "p5", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aYN", "WPU", "ViF", "S", "o", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "XQ", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "nY", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", c.f62177j, "Landroidx/compose/ui/platform/AndroidComposeView;", "ty", "()Landroidx/compose/ui/platform/AndroidComposeView;", "t", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "getContentCaptureSession$ui_release$annotations", "contentCaptureSession", "", "Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "Ljava/util/List;", "bufferedEvents", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "", "Z", "currentSemanticsNodesInvalidated", "LILs/CN3;", "LILs/CN3;", "boundsUpdateChannel", "Landroid/os/Handler;", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "handler", "Landroidx/collection/IntObjectMap;", "az", "()Landroidx/collection/IntObjectMap;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodes", "currentSemanticsNodesSnapshotTimestampMillis", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsNodes", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "ck", "()Z", "isEnabled", "Xw", "Companion", "TranslateStatus", "ViewTranslationHelperMethods", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,655:1\n395#1,4:810\n399#1,5:815\n390#2,3:656\n354#2,6:659\n364#2,3:666\n367#2,2:670\n425#2:672\n370#2,6:673\n393#2:679\n425#2:684\n425#2:685\n390#2,3:694\n354#2,6:697\n364#2,3:704\n367#2,2:708\n370#2,6:765\n393#2:771\n382#2,4:779\n354#2,6:783\n364#2,3:790\n367#2,9:794\n386#2:803\n425#2:814\n397#2,3:832\n354#2,6:835\n364#2,3:842\n367#2,9:846\n400#2:855\n397#2,3:856\n354#2,6:859\n364#2,3:866\n367#2,9:870\n400#2:879\n397#2,3:880\n354#2,6:883\n364#2,3:890\n367#2,9:894\n400#2:903\n1399#3:665\n1270#3:669\n1399#3:703\n1270#3:707\n1399#3:726\n1270#3:730\n1399#3:750\n1270#3:754\n1399#3:789\n1270#3:793\n1399#3:841\n1270#3:845\n1399#3:865\n1270#3:869\n1399#3:889\n1270#3:893\n34#4,4:680\n39#4:693\n34#4,6:820\n34#4,6:826\n76#5,7:686\n76#5,7:710\n76#5,7:772\n365#6,3:717\n329#6,6:720\n339#6,3:727\n342#6,9:731\n368#6:740\n365#6,3:741\n329#6,6:744\n339#6,3:751\n342#6,9:755\n368#6:764\n56#7,6:804\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n*L\n387#1:810,4\n387#1:815,5\n215#1:656,3\n215#1:659,6\n215#1:666,3\n215#1:670,2\n216#1:672\n215#1:673,6\n215#1:679\n234#1:684\n235#1:685\n250#1:694,3\n250#1:697,6\n250#1:704,3\n250#1:708,2\n250#1:765,6\n250#1:771\n305#1:779,4\n305#1:783,6\n305#1:790,3\n305#1:794,9\n305#1:803\n388#1:814\n512#1:832,3\n512#1:835,6\n512#1:842,3\n512#1:846,9\n512#1:855\n521#1:856,3\n521#1:859,6\n521#1:866,3\n521#1:870,9\n521#1:879\n530#1:880,3\n530#1:883,6\n530#1:890,3\n530#1:894,9\n530#1:903\n215#1:665\n215#1:669\n250#1:703\n250#1:707\n261#1:726\n261#1:730\n271#1:750\n271#1:754\n305#1:789\n305#1:793\n512#1:841\n512#1:845\n521#1:865\n521#1:869\n530#1:889\n530#1:893\n232#1:680,4\n232#1:693\n441#1:820,6\n476#1:826,6\n238#1:686,7\n255#1:710,7\n298#1:772,7\n261#1:717,3\n261#1:720,6\n261#1:727,3\n261#1:731,9\n261#1:740\n271#1:741,3\n271#1:744,6\n271#1:751,3\n271#1:755,9\n271#1:764\n379#1:804,6\n*E\n"})
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final int jB = 8;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private ContentCaptureSessionCompat contentCaptureSession;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private SemanticsNodeCopy previousSemanticsRoot;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long currentSemanticsNodesSnapshotTimestampMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function0 onContentCaptureSession;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final List bufferedEvents = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private TranslateStatus translateStatus = TranslateStatus.f31190n;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated = true;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final ILs.CN3 boundsUpdateChannel = ILs.aC.rl(1, null, null, 6, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private IntObjectMap currentSemanticsNodes = IntObjectMapKt.rl();

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private MutableIntObjectMap previousSemanticsNodes = IntObjectMapKt.t();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.j
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.gh(this.f31208n);
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class TranslateStatus {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ TranslateStatus[] f31189O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final TranslateStatus f31190n = new TranslateStatus("SHOW_ORIGINAL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final TranslateStatus f31191t = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] n() {
            return new TranslateStatus[]{f31190n, f31191t};
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) f31189O.clone();
        }

        static {
            TranslateStatus[] translateStatusArrN = n();
            f31189O = translateStatusArrN;
            J2 = EnumEntriesKt.enumEntries(translateStatusArrN);
        }

        private TranslateStatus(String str, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "<init>", "()V", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "", "rl", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "t", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;[J[ILjava/util/function/Consumer;)V", "nr", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,655:1\n13337#2,2:656\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n*L\n549#1:656,2\n*E\n"})
    static final class ViewTranslationHelperMethods {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final ViewTranslationHelperMethods f31192n = new ViewTranslationHelperMethods();

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            f31192n.rl(androidContentCaptureManager, longSparseArray);
        }

        public final void nr(final AndroidContentCaptureManager contentCaptureManager, final LongSparseArray response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                rl(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.O(contentCaptureManager, response);
                    }
                });
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void t(AndroidContentCaptureManager contentCaptureManager, long[] virtualIds, int[] supportedFormats, Consumer requestsCollector) {
            SemanticsNode semanticsNodeRl;
            String strO;
            for (long j2 : virtualIds) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) contentCaptureManager.az().rl((int) j2);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNodeRl = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    CN3.n();
                    ViewTranslationRequest.Builder builderN = Wre.n(contentCaptureManager.getView().getAutofillId(), semanticsNodeRl.getId());
                    List list = (List) SemanticsConfigurationKt.n(semanticsNodeRl.getUnmergedConfig(), SemanticsProperties.f33276n.T());
                    if (list != null && (strO = ListUtilsKt.O(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderN.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(strO, null, 2, null)));
                        requestsCollector.accept(builderN.build());
                    }
                }
            }
        }

        private ViewTranslationHelperMethods() {
        }

        private final void rl(AndroidContentCaptureManager contentCaptureManager, LongSparseArray response) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNodeRl;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            int size = response.size();
            for (int i2 = 0; i2 < size; i2++) {
                long jKeyAt = response.keyAt(i2);
                ViewTranslationResponse viewTranslationResponseN = fuX.n(response.get(jKeyAt));
                if (viewTranslationResponseN != null && (value = viewTranslationResponseN.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) contentCaptureManager.az().rl((int) jKeyAt)) != null && (semanticsNodeRl = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNodeRl.getUnmergedConfig(), SemanticsActions.f33251n.g())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.f31205n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.f31206t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void WPU() {
        this.currentSemanticsNodesInvalidated = true;
        if (ck()) {
            r();
        }
    }

    public final void aYN() {
        this.currentSemanticsNodesInvalidated = true;
        if (!ck() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
    }

    private final ViewStructureCompat E2(SemanticsNode semanticsNode, int i2) {
        AutofillIdCompat autofillIdCompatN;
        AutofillId autofillIdN;
        String strXMQ;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillIdCompatN = ViewCompatShims.n(this.view)) == null) {
            return null;
        }
        if (semanticsNode.r() != null) {
            autofillIdN = contentCaptureSessionCompat.rl(r4.getId());
            if (autofillIdN == null) {
                return null;
            }
        } else {
            autofillIdN = autofillIdCompatN.n();
        }
        ViewStructureCompat viewStructureCompatT = contentCaptureSessionCompat.t(autofillIdN, semanticsNode.getId());
        if (viewStructureCompatT == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (unmergedConfig.J2(semanticsProperties.g())) {
            return null;
        }
        Bundle bundleN = viewStructureCompatT.n();
        if (bundleN != null) {
            bundleN.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
            bundleN.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i2);
        }
        String str = (String) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.X());
        if (str != null) {
            viewStructureCompatT.O(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.S())) != null) {
            viewStructureCompatT.rl("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.T());
        if (list != null) {
            viewStructureCompatT.rl("android.widget.TextView");
            viewStructureCompatT.J2(ListUtilsKt.O(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.Uo());
        if (annotatedString != null) {
            viewStructureCompatT.rl("android.widget.EditText");
            viewStructureCompatT.J2(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.nr());
        if (list2 != null) {
            viewStructureCompatT.t(ListUtilsKt.O(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.n(unmergedConfig, semanticsProperties.iF());
        if (role != null && (strXMQ = SemanticsUtils_androidKt.xMQ(role.getValue())) != null) {
            viewStructureCompatT.rl(strXMQ);
        }
        TextLayoutResult textLayoutResultO = SemanticsUtils_androidKt.O(unmergedConfig);
        if (textLayoutResultO != null) {
            TextLayoutInput layoutInput = textLayoutResultO.getLayoutInput();
            viewStructureCompatT.Uo(TextUnit.KN(layoutInput.getStyle().qie()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        Rect rectKN = semanticsNode.KN();
        viewStructureCompatT.nr((int) rectKN.getLeft(), (int) rectKN.getTop(), 0, 0, (int) (rectKN.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rectKN.getLeft()), (int) (rectKN.xMQ() - rectKN.getTop()));
        return viewStructureCompatT;
    }

    private final void Ik() {
        AutofillId autofillIdRl;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List list = this.bufferedEvents;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) list.get(i2);
            int i3 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i3 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionCompat.nr(structureCompat.KN());
                }
            } else if (i3 == 2 && (autofillIdRl = contentCaptureSessionCompat.rl(contentCaptureEvent.getId())) != null) {
                contentCaptureSessionCompat.O(autofillIdRl);
            }
        }
        contentCaptureSessionCompat.n();
        this.bufferedEvents.clear();
    }

    private final void J2(int virtualId, ViewStructureCompat viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.f31205n, viewStructure));
    }

    private final void KN(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.f31206t, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void N() {
        this.previousSemanticsNodes.Uo();
        IntObjectMap intObjectMapAz = az();
        int[] iArr = intObjectMapAz.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr = intObjectMapAz.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = intObjectMapAz.metadata;
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
                            this.previousSemanticsNodes.r(iArr[i7], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i7]).getSemanticsNode(), az()));
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
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().nr(), az());
    }

    private final void g(SemanticsNode newNode, final SemanticsNodeCopy oldNode) {
        qie(newNode, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, SemanticsNode semanticsNode) {
                n(num.intValue(), semanticsNode);
                return Unit.INSTANCE;
            }

            public final void n(int i2, SemanticsNode semanticsNode) {
                if (oldNode.getChildren().n(semanticsNode.getId())) {
                    return;
                }
                this.e(i2, semanticsNode);
                this.r();
            }
        });
        List listZ = newNode.Z();
        int size = listZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = (SemanticsNode) listZ.get(i2);
            if (az().n(semanticsNode.getId()) && this.previousSemanticsNodes.n(semanticsNode.getId())) {
                Object objRl = this.previousSemanticsNodes.rl(semanticsNode.getId());
                if (objRl == null) {
                    InlineClassHelperKt.nr("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                g(semanticsNode, (SemanticsNodeCopy) objRl);
            }
        }
    }

    private final void iF(int id, String newText) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId autofillIdRl = contentCaptureSessionCompat.rl(id);
            if (autofillIdRl != null) {
                contentCaptureSessionCompat.J2(autofillIdRl, newText);
            } else {
                InlineClassHelperKt.nr("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.boundsUpdateChannel.nr(Unit.INSTANCE);
    }

    private final void te() {
        MutableIntObjectMap mutableIntObjectMap = this.previousSemanticsNodes;
        int[] iArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        int i7 = iArr[(i2 << 3) + i5];
                        if (!az().n(i7)) {
                            KN(i7);
                            r();
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final void xMQ(IntObjectMap newSemanticsNodes) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j2;
        char c2;
        long j3;
        int i2;
        SemanticsNode semanticsNode;
        int i3;
        SemanticsNode semanticsNode2;
        long j4;
        int i5;
        long[] jArr3;
        IntObjectMap intObjectMap = newSemanticsNodes;
        int[] iArr3 = intObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        long[] jArr4 = intObjectMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr4[i7];
            char c4 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j5 & 255) < 128) {
                        int i11 = iArr3[(i7 << 3) + i10];
                        c2 = c4;
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.rl(i11);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) intObjectMap.rl(i11);
                        SemanticsNode semanticsNodeRl = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNodeRl == null) {
                            InlineClassHelperKt.nr("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (semanticsNodeCopy == null) {
                            MutableScatterMap props = semanticsNodeRl.getUnmergedConfig().getProps();
                            j3 = j6;
                            Object[] objArr = props.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                            long[] jArr5 = props.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i12 = 0;
                                int i13 = i8;
                                while (true) {
                                    long j7 = jArr5[i12];
                                    iArr2 = iArr3;
                                    if ((((~j7) << c2) & j7 & j3) != j3) {
                                        int i14 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j7 & 255) < 128) {
                                                i5 = i15;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i12 << 3) + i15];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
                                                jArr3 = jArr4;
                                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.T())) {
                                                    List list = (List) SemanticsConfigurationKt.n(semanticsNodeRl.getUnmergedConfig(), semanticsProperties.T());
                                                    iF(semanticsNodeRl.getId(), String.valueOf(list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                i5 = i15;
                                                jArr3 = jArr4;
                                            }
                                            j7 >>= i13;
                                            i15 = i5 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i14 != i13) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i13 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j3 = j6;
                            MutableScatterMap props2 = semanticsNodeRl.getUnmergedConfig().getProps();
                            Object[] objArr2 = props2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                            long[] jArr6 = props2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j9 = jArr6[i16];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j9) << c2) & j9 & j3) != j3) {
                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j9 & 255) < 128) {
                                                i3 = i18;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i16 << 3) + i18];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.f33276n;
                                                semanticsNode2 = semanticsNodeRl;
                                                if (Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties2.T())) {
                                                    List list2 = (List) SemanticsConfigurationKt.n(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.T());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list2) : null;
                                                    j4 = j5;
                                                    List list3 = (List) SemanticsConfigurationKt.n(semanticsNode2.getUnmergedConfig(), semanticsProperties2.T());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                                        iF(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j9 >>= 8;
                                                i18 = i3 + 1;
                                                semanticsNodeRl = semanticsNode2;
                                                j5 = j4;
                                            } else {
                                                i3 = i18;
                                                semanticsNode2 = semanticsNodeRl;
                                            }
                                            j4 = j5;
                                            j9 >>= 8;
                                            i18 = i3 + 1;
                                            semanticsNodeRl = semanticsNode2;
                                            j5 = j4;
                                        }
                                        semanticsNode = semanticsNodeRl;
                                        j2 = j5;
                                        if (i17 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNodeRl;
                                        j2 = j5;
                                    }
                                    if (i16 == length3) {
                                        break;
                                    }
                                    i16++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNodeRl = semanticsNode;
                                    j5 = j2;
                                }
                            }
                            i2 = 8;
                        }
                        j2 = j5;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j2 = j5;
                        c2 = c4;
                        j3 = j6;
                        i2 = i8;
                    }
                    j5 = j2 >> i2;
                    i10++;
                    intObjectMap = newSemanticsNodes;
                    i8 = i2;
                    c4 = c2;
                    j6 = j3;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i9 != i8) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i7 == length) {
                return;
            }
            i7++;
            intObjectMap = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void M(LifecycleOwner owner) {
        this.contentCaptureSession = (ContentCaptureSessionCompat) this.onContentCaptureSession.invoke();
        e(-1, this.view.getSemanticsOwner().nr());
        Ik();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (GJW.yg.rl(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(Continuation continuation) {
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 androidContentCaptureManager$boundsUpdatesEventLoop$1;
        ILs.Dsr it;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        ILs.Dsr dsr;
        Object objRl;
        if (continuation instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) {
            androidContentCaptureManager$boundsUpdatesEventLoop$1 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) continuation;
            int i2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.f31195r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidContentCaptureManager$boundsUpdatesEventLoop$1.f31195r = i2 - Integer.MIN_VALUE;
            } else {
                androidContentCaptureManager$boundsUpdatesEventLoop$1 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, continuation);
            }
        }
        Object obj = androidContentCaptureManager$boundsUpdatesEventLoop$1.f31193O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidContentCaptureManager$boundsUpdatesEventLoop$1.f31195r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.boundsUpdateChannel.iterator();
            androidContentCaptureManager = this;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.f31194n = androidContentCaptureManager;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.f31196t = it;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.f31195r = 1;
            objRl = it.rl(androidContentCaptureManager$boundsUpdatesEventLoop$1);
            if (objRl != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsr = (ILs.Dsr) androidContentCaptureManager$boundsUpdatesEventLoop$1.f31196t;
            androidContentCaptureManager2 = (AndroidContentCaptureManager) androidContentCaptureManager$boundsUpdatesEventLoop$1.f31194n;
            ResultKt.throwOnFailure(obj);
            it = dsr;
            androidContentCaptureManager = androidContentCaptureManager2;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.f31194n = androidContentCaptureManager;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.f31196t = it;
            androidContentCaptureManager$boundsUpdatesEventLoop$1.f31195r = 1;
            objRl = it.rl(androidContentCaptureManager$boundsUpdatesEventLoop$1);
            if (objRl != coroutine_suspended) {
                AndroidContentCaptureManager androidContentCaptureManager3 = androidContentCaptureManager;
                dsr = it;
                obj = objRl;
                androidContentCaptureManager2 = androidContentCaptureManager3;
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                dsr.next();
                if (androidContentCaptureManager2.ck()) {
                    androidContentCaptureManager2.Ik();
                }
                if (!androidContentCaptureManager2.checkingForSemanticsChanges) {
                    androidContentCaptureManager2.checkingForSemanticsChanges = true;
                    androidContentCaptureManager2.handler.post(androidContentCaptureManager2.contentCaptureChangeChecker);
                }
                long j2 = androidContentCaptureManager2.SendRecurringContentCaptureEventsIntervalMillis;
                androidContentCaptureManager$boundsUpdatesEventLoop$1.f31194n = androidContentCaptureManager2;
                androidContentCaptureManager$boundsUpdatesEventLoop$1.f31196t = dsr;
                androidContentCaptureManager$boundsUpdatesEventLoop$1.f31195r = 2;
            }
            return coroutine_suspended;
        }
        dsr = (ILs.Dsr) androidContentCaptureManager$boundsUpdatesEventLoop$1.f31196t;
        androidContentCaptureManager2 = (AndroidContentCaptureManager) androidContentCaptureManager$boundsUpdatesEventLoop$1.f31194n;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void S() {
        this.translateStatus = TranslateStatus.f31190n;
        HI();
    }

    public final void ViF() {
        this.translateStatus = TranslateStatus.f31191t;
        fD();
    }

    public final void XQ(long[] virtualIds, int[] supportedFormats, Consumer requestsCollector) {
        ViewTranslationHelperMethods.f31192n.t(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final IntObjectMap az() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.rl(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final boolean ck() {
        return ContentCaptureManager.INSTANCE.n() && this.contentCaptureSession != null;
    }

    public final void nY(AndroidContentCaptureManager contentCaptureManager, LongSparseArray response) {
        ViewTranslationHelperMethods.f31192n.nr(contentCaptureManager, response);
    }

    public final void o() {
        this.translateStatus = TranslateStatus.f31190n;
        mUb();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void p5(LifecycleOwner owner) {
        X(this.view.getSemanticsOwner().nr());
        Ik();
        this.contentCaptureSession = null;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0 function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().nr(), IntObjectMapKt.rl());
    }

    private final void HI() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap intObjectMapAz = az();
        Object[] objArr = intObjectMapAz.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = intObjectMapAz.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            SemanticsConfiguration unmergedConfig = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i5]).getSemanticsNode().getUnmergedConfig();
                            if (Intrinsics.areEqual(SemanticsConfigurationKt.n(unmergedConfig, SemanticsProperties.f33276n.XQ()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig, SemanticsActions.f33251n.te())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void X(SemanticsNode node) {
        if (ck()) {
            KN(node.getId());
            List listZ = node.Z();
            int size = listZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                X((SemanticsNode) listZ.get(i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int index, SemanticsNode node) {
        if (!ck()) {
            return;
        }
        nHg(node);
        J2(node.getId(), E2(node, index));
        qie(node, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, SemanticsNode semanticsNode) {
                n(num.intValue(), semanticsNode);
                return Unit.INSTANCE;
            }

            public final void n(int i2, SemanticsNode semanticsNode) {
                this.f31199n.e(i2, semanticsNode);
            }
        });
    }

    private final void fD() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap intObjectMapAz = az();
        Object[] objArr = intObjectMapAz.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = intObjectMapAz.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            SemanticsConfiguration unmergedConfig = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i5]).getSemanticsNode().getUnmergedConfig();
                            if (Intrinsics.areEqual(SemanticsConfigurationKt.n(unmergedConfig, SemanticsProperties.f33276n.XQ()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig, SemanticsActions.f33251n.te())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(AndroidContentCaptureManager androidContentCaptureManager) {
        if (!androidContentCaptureManager.ck()) {
            return;
        }
        Owner.t(androidContentCaptureManager.view, false, 1, null);
        androidContentCaptureManager.te();
        androidContentCaptureManager.g(androidContentCaptureManager.view.getSemanticsOwner().nr(), androidContentCaptureManager.previousSemanticsRoot);
        androidContentCaptureManager.xMQ(androidContentCaptureManager.az());
        androidContentCaptureManager.N();
        androidContentCaptureManager.checkingForSemanticsChanges = false;
    }

    private final void mUb() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        IntObjectMap intObjectMapAz = az();
        Object[] objArr = intObjectMapAz.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = intObjectMapAz.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            SemanticsConfiguration unmergedConfig = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i5]).getSemanticsNode().getUnmergedConfig();
                            if (SemanticsConfigurationKt.n(unmergedConfig, SemanticsProperties.f33276n.XQ()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig, SemanticsActions.f33251n.n())) != null && (function0 = (Function0) accessibilityAction.getAction()) != null) {
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void nHg(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.n(unmergedConfig, SemanticsProperties.f33276n.XQ());
        if (this.translateStatus == TranslateStatus.f31190n && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig, SemanticsActions.f33251n.te());
            if (accessibilityAction2 != null && (function12 = (Function1) accessibilityAction2.getAction()) != null) {
                return;
            }
            return;
        }
        if (this.translateStatus == TranslateStatus.f31191t && Intrinsics.areEqual(bool, Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig, SemanticsActions.f33251n.te())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
        }
    }

    private final void qie(SemanticsNode semanticsNode, Function2 function2) {
        List listZ = semanticsNode.Z();
        int size = listZ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listZ.get(i3);
            if (az().n(((SemanticsNode) obj).getId())) {
                function2.invoke(Integer.valueOf(i2), obj);
                i2++;
            }
        }
    }
}
