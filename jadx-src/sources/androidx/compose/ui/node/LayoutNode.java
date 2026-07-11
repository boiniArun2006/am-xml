package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 ú\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b\u0087\u0003\u0088\u0003\u0089\u0003\u008a\u0003B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\u000fH\u0000¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000fH\u0000¢\u0006\u0004\b2\u0010\u0011J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u0010\u0011J'\u00109\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0000¢\u0006\u0004\b=\u0010\u0011J\u000f\u0010>\u001a\u00020\u000fH\u0000¢\u0006\u0004\b>\u0010\u0011J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u0011J\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010HJ\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bK\u0010HJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bM\u0010HJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bN\u0010HJ\u0015\u0010O\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bO\u0010HJ\u0015\u0010P\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bP\u0010HJ\u000f\u0010Q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u000fH\u0000¢\u0006\u0004\bR\u0010\u0011J\u001f\u0010T\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\bT\u00105J\u000f\u0010U\u001a\u00020\u000fH\u0000¢\u0006\u0004\bU\u0010\u0011J\u000f\u0010V\u001a\u00020\u000fH\u0000¢\u0006\u0004\bV\u0010\u0011J!\u0010[\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020W2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0000¢\u0006\u0004\b[\u0010\\J6\u0010d\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ6\u0010g\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020]2\u0006\u0010f\u001a\u00020_2\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\bg\u0010eJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u0000H\u0000¢\u0006\u0004\bi\u0010\u0019J-\u0010m\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\t2\b\b\u0002\u0010k\u001a\u00020\t2\b\b\u0002\u0010l\u001a\u00020\tH\u0000¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\t2\b\b\u0002\u0010k\u001a\u00020\t2\b\b\u0002\u0010l\u001a\u00020\tH\u0000¢\u0006\u0004\bo\u0010nJ\u000f\u0010p\u001a\u00020\u000fH\u0000¢\u0006\u0004\bp\u0010\u0011J\u000f\u0010q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bq\u0010\u0011J\u0019\u0010r\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\tH\u0000¢\u0006\u0004\br\u0010sJ\u0019\u0010t\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\tH\u0000¢\u0006\u0004\bt\u0010sJ\u000f\u0010u\u001a\u00020\u000fH\u0000¢\u0006\u0004\bu\u0010\u0011J\u0015\u0010x\u001a\b\u0012\u0004\u0012\u00020w0vH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u000fH\u0000¢\u0006\u0004\bz\u0010\u0011J\u001e\u0010}\u001a\u00020\t2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{H\u0000ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u001e\u0010\u007f\u001a\u00020\t2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{H\u0000ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010~J\u0011\u0010\u0080\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u0011J\u0011\u0010\u0081\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0081\u0001\u0010\u0011J\u0011\u0010\u0082\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0082\u0001\u0010\u0011J\u0011\u0010\u0083\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0083\u0001\u0010\u0011J\u0011\u0010\u0084\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u0011J\u0011\u0010\u0085\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u0011J\u0011\u0010\u0086\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0086\u0001\u0010\u0011J\u0011\u0010\u0087\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0087\u0001\u0010\u0011J\u0011\u0010\u0088\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\u0011\u0010\u0089\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0089\u0001\u0010\u0011J\u0011\u0010\u008a\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010;\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R0\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R0\u0010\u009d\u0001\u001a\u00030\u0099\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0093\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001\"\u0006\b\u009c\u0001\u0010\u0097\u0001R0\u0010¡\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0093\u0001\u001a\u0006\b\u009f\u0001\u0010\u0095\u0001\"\u0006\b \u0001\u0010\u0097\u0001R'\u0010¥\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¢\u0001\u0010\u008c\u0001\u001a\u0005\b£\u0001\u0010<\"\u0005\b¤\u0001\u0010sR'\u0010¨\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u008c\u0001\u0010\u008c\u0001\u001a\u0005\b¦\u0001\u0010<\"\u0005\b§\u0001\u0010sR(\u0010«\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b©\u0001\u0010;\u001a\u0006\bª\u0001\u0010\u008e\u0001\"\u0006\b\u009a\u0001\u0010\u0090\u0001R&\u0010®\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u001b\u0010\u008c\u0001\u001a\u0005\b¬\u0001\u0010<\"\u0005\b\u00ad\u0001\u0010sR5\u0010µ\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0005\b´\u0001\u0010\u0019R\u0017\u0010¶\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R\u001d\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bu\u0010¸\u0001R!\u0010¼\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010»\u0001R\u0018\u0010½\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u008c\u0001R\u001b\u0010¿\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010±\u0001R-\u0010@\u001a\u0004\u0018\u00010?2\t\u0010À\u0001\u001a\u0004\u0018\u00010?8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R3\u0010Ì\u0001\u001a\f\u0018\u00010Ä\u0001j\u0005\u0018\u0001`Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R'\u0010\u001d\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bÍ\u0001\u0010;\u001a\u0006\bÎ\u0001\u0010\u008e\u0001\"\u0006\bÏ\u0001\u0010\u0090\u0001R\u0019\u0010Ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u008c\u0001R'\u0010Ô\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010\u008c\u0001\u001a\u0005\bÒ\u0001\u0010<\"\u0005\bÓ\u0001\u0010sR\u001b\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010Õ\u0001R\u0019\u0010Ø\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010\u008c\u0001R\u001e\u0010Ú\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010»\u0001R\u0019\u0010Ü\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010\u008c\u0001R3\u0010ä\u0001\u001a\u00030Ý\u00012\b\u0010Þ\u0001\u001a\u00030Ý\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b-\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R\u001b\u0010æ\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010å\u0001R4\u0010ë\u0001\u001a\u00030ç\u00012\b\u0010Þ\u0001\u001a\u00030ç\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010è\u0001\u001a\u0006\bÍ\u0001\u0010é\u0001\"\u0006\b\u0092\u0001\u0010ê\u0001R4\u0010ó\u0001\u001a\u00030ì\u00012\b\u0010Þ\u0001\u001a\u00030ì\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R4\u0010û\u0001\u001a\u00030ô\u00012\b\u0010Þ\u0001\u001a\u00030ô\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R3\u0010\u0081\u0002\u001a\u00030ü\u00012\b\u0010Þ\u0001\u001a\u00030ü\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b;\u0010ý\u0001\u001a\u0006\bÆ\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R*\u0010\u0087\u0002\u001a\u00030\u0082\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0083\u0002\u001a\u0006\b\u0093\u0001\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001a\u0010\u0089\u0002\u001a\u00030\u0082\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0083\u0002R.\u0010\u008e\u0002\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\b\u008a\u0002\u0010\u008c\u0001\u0012\u0005\b\u008d\u0002\u0010\u0011\u001a\u0005\b\u008b\u0002\u0010<\"\u0005\b\u008c\u0002\u0010sR \u0010\u0094\u0002\u001a\u00030\u008f\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R \u0010\u0099\u0002\u001a\u00030\u0095\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a\u0006\b\u0088\u0002\u0010\u0098\u0002R,\u0010¡\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010\u009c\u0002\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002R\u001c\u0010¥\u0002\u001a\u0005\u0018\u00010¢\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R'\u0010¨\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b²\u0001\u0010\u008c\u0001\u001a\u0005\b¦\u0002\u0010<\"\u0005\b§\u0002\u0010sR\u0019\u0010«\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u001b\u0010\u00ad\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010ª\u0002R8\u0010µ\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010®\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R8\u0010¸\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010®\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010°\u0002\u001a\u0006\b¶\u0002\u0010²\u0002\"\u0006\b·\u0002\u0010´\u0002R'\u0010¼\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¹\u0002\u0010\u008c\u0001\u001a\u0005\bº\u0002\u0010<\"\u0005\b»\u0002\u0010sR)\u0010¾\u0002\u001a\u00020\t2\u0007\u0010À\u0001\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b½\u0002\u0010\u008c\u0001\u001a\u0005\b¢\u0001\u0010<R\u0018\u0010Â\u0002\u001a\u00030¿\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0002\u0010Á\u0002R\u0016\u0010Å\u0002\u001a\u0004\u0018\u00010\t8F¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ä\u0002R\u001c\u0010Æ\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000v8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010yR\u001d\u0010É\u0002\u001a\t\u0012\u0005\u0012\u00030Ç\u00020v8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0002\u0010yR\u001d\u0010Ê\u0002\u001a\t\u0012\u0005\u0012\u00030Ç\u00020v8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010yR\u001e\u0010Í\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R\u001c\u0010Ï\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000v8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0002\u0010yR\u0019\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010³\u0001R\u0016\u0010Ó\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0002\u0010<R\u0018\u0010Ö\u0002\u001a\u00030Ô\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010Õ\u0002R\u001a\u0010Ù\u0002\u001a\u0005\u0018\u00010×\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010Ø\u0002R\u0018\u0010Ü\u0002\u001a\u00030Ú\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010Û\u0002R\u0018\u0010Ý\u0002\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bí\u0001\u0010\u001cR%\u0010à\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bß\u0002\u0010\u0011\u001a\u0006\bÞ\u0002\u0010Ì\u0002R\u0016\u0010â\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bá\u0002\u0010<R\u0016\u0010ã\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010<R\u0016\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010\u008e\u0001R\u0016\u0010F\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010\u008e\u0001R\u0016\u0010ç\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bæ\u0002\u0010<R\u0018\u0010ê\u0002\u001a\u00030è\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010é\u0002R\u0016\u0010ì\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bë\u0002\u0010<R\u0013\u0010î\u0002\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bí\u0002\u0010<R\u0017\u0010ð\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bï\u0002\u0010\u008e\u0001R\u0018\u0010ñ\u0002\u001a\u00030\u0082\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010\u0084\u0002R\u0018\u0010ò\u0002\u001a\u00030\u0082\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010\u0084\u0002R\u0018\u0010ô\u0002\u001a\u00030¢\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010ó\u0002R\u0018\u0010ö\u0002\u001a\u00030¢\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bõ\u0002\u0010ó\u0002R\u001a\u0010÷\u0002\u001a\u0005\u0018\u00010¢\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010ó\u0002R\u0016\u0010ù\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bø\u0002\u0010<R(\u0010%\u001a\u00020$2\u0007\u0010Þ\u0001\u001a\u00020$8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bú\u0002\u0010û\u0002\"\u0005\bü\u0002\u0010'R\u0018\u0010ÿ\u0002\u001a\u00030ý\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010þ\u0002R\u0016\u0010\u0080\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¯\u0002\u0010<R\u0016\u0010\u0081\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0002\u0010<R\u0016\u0010\u0082\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0002\u0010<R\u0016\u0010\u0083\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0002\u0010<R\u0019\u0010\u0085\u0003\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0084\u0003R\u001c\u0010\u0086\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050v8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "v0j", "()V", "F", "instance", "", "N", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "child", "y", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "g", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "depth", "fD", "(I)Ljava/lang/String;", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "ul", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "Zn", "Landroidx/compose/ui/Modifier;", "modifier", "ViF", "(Landroidx/compose/ui/Modifier;)V", "D76", "iF", "wKY", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "FX", "()Landroid/view/View;", "index", "tUK", "(ILandroidx/compose/ui/node/LayoutNode;)V", "nO", JavetError.PARAMETER_COUNT, CmcdData.STREAMING_FORMAT_SS, "(II)V", "Aum", "from", "to", "uG", "(III)V", "I", "()Z", "g6", "a63", "Landroidx/compose/ui/node/Owner;", "owner", "nY", "(Landroidx/compose/ui/node/Owner;)V", "e", "toString", "()Ljava/lang/String;", "height", "EF", "(I)I", "width", "xVH", "X4T", "UF", "JVN", "Zmq", "HBN", "Qu", "ER", "RQ", "x", "vl", "Lp6", "Bu", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isInLayer", "UhV", "(JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitSemanticsEntities", "K", "it", "I9f", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "XNZ", "(ZZZ)V", "Toy", "kSg", "W", "Th", "(Z)V", "Mh", "X", "", "Landroidx/compose/ui/layout/ModifierInfo;", "Ik", "()Ljava/util/List;", "lLA", "Landroidx/compose/ui/unit/Constraints;", "constraints", "mI", "(Landroidx/compose/ui/unit/Constraints;)Z", "o9", "p0N", "ub", "Uf", InneractiveMediationDefs.GENDER_FEMALE, "KN", "mUb", "te", "NP", "qie", "Uo", "t", c.f62177j, "Z", "ck", "()I", CmcdData.STREAMING_FORMAT_HLS, "(I)V", "Landroidx/compose/ui/unit/IntOffset;", "O", "J", "eWT", "()J", "SR", "(J)V", "offsetFromRoot", "Landroidx/compose/ui/unit/IntSize;", "J2", "GR", "rxp", "lastSize", "r", "Jk", "tEO", "outerToInnerOffset", "o", "Rl", "yAc", "outerToInnerOffsetDirty", "p5", "j", "forceUseOldLayers", "S", "Xw", "compositeKeyHash", "VwL", "uQ", "isVirtualLookaheadRoot", "newRoot", "E2", "Landroidx/compose/ui/node/LayoutNode;", "ijL", "()Landroidx/compose/ui/node/LayoutNode;", "Fp", "lookaheadRoot", "virtualChildrenCount", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "v", "_foldedParent", "<set-?>", "Landroidx/compose/ui/node/Owner;", "qm", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "jB", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "B", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "waP", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "U", "P5", "setDepth$ui_release", "ignoreRemeasureRequests", "M7", "isSemanticsInvalidated$ui_release", CmcdData.STREAM_TYPE_LIVE, "isSemanticsInvalidated", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_semanticsConfiguration", "eF", "isCurrentlyCalculatingSemanticsConfiguration", "E", "_zSortedChildren", "M", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "Landroidx/compose/ui/layout/MeasurePolicy;", "pJg", "()Landroidx/compose/ui/layout/MeasurePolicy;", "gh", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "D", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "rl", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/ui/platform/ViewConfiguration;", "GD", "()Landroidx/compose/ui/platform/ViewConfiguration;", "xMQ", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Landroidx/compose/runtime/CompositionLocalMap;", "Landroidx/compose/runtime/CompositionLocalMap;", "()Landroidx/compose/runtime/CompositionLocalMap;", "ty", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "LPV", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "Nxk", "previousIntrinsicsUsageByParent", "Y", "wTp", "QgZ", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Landroidx/compose/ui/node/NodeChain;", "k", "Landroidx/compose/ui/node/NodeChain;", "fcU", "()Landroidx/compose/ui/node/NodeChain;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "dR0", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "z", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "HV", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "eo", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "subcompositionsState", "Landroidx/compose/ui/node/NodeCoordinator;", "piY", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "getInnerLayerCoordinatorIsDirty$ui_release", "H", "innerLayerCoordinatorIsDirty", "m", "Landroidx/compose/ui/Modifier;", "_modifier", "eTf", "pendingModifier", "Lkotlin/Function1;", "xg", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "EN", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "getOnDetach$ui_release", "pS", "onDetach", "ofS", "G7", "Ro", "needsOnPositionedDispatch", "C", "isDeactivated", "", "Po6", "()F", "zIndex", "tFV", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "foldedChildren", "Landroidx/compose/ui/layout/Measurable;", "rV9", "childMeasurables", "childLookaheadMeasurables", "hRu", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "bzg", "children", "mYa", "parent", "nr", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "semanticsConfiguration", "EWS", "getZSortedChildren$annotations", "zSortedChildren", "Vvq", "isValidOwnerScope", "hasFixedInnerContentConstraints", "getWidth", "getHeight", "nHg", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "HI", "isPlaced", "QZ6", "isPlacedByParent", "Org", "placeOrder", "measuredByParent", "measuredByParentInLookahead", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "n1", "outerCoordinator", "innerLayerCoordinator", "s7N", "applyingModifierOnAttach", "Mx", "()Landroidx/compose/ui/Modifier;", "az", "Landroidx/compose/ui/layout/LayoutCoordinates;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "measurePending", "layoutPending", "lookaheadMeasurePending", "lookaheadLayoutPending", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "parentInfo", "childrenInfo", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 11 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1533:1\n1296#1,7:1540\n1296#1,7:1629\n1149#1,2:1645\n1151#1,2:1657\n207#1:1661\n1286#1,7:1893\n207#1:2029\n207#1:2039\n207#1:2049\n1296#1,7:2065\n1101#2:1534\n1083#2,2:1535\n1101#2:1537\n1083#2,2:1538\n1101#2:1548\n1083#2,2:1549\n1101#2:1715\n1083#2,2:1716\n1101#2:1777\n1083#2,2:1778\n1101#2:1863\n1083#2,2:1864\n1101#2:1932\n1083#2,2:1933\n1101#2:1998\n1083#2,2:1999\n48#3:1547\n46#3:1552\n50#3:1591\n30#3:1593\n50#3:1594\n46#3:1596\n46#3:1619\n46#3:1647\n1#4:1551\n423#5,6:1553\n144#5:1559\n429#5,3:1560\n423#5,9:1563\n435#5,9:1572\n472#5:1592\n472#5:1595\n423#5,9:1597\n423#5,9:1620\n423#5,9:1648\n144#5:1660\n423#5,9:1662\n423#5,9:1962\n423#5,9:2030\n423#5,9:2040\n423#5,9:2050\n56#6,5:1581\n102#6,5:1586\n56#6,5:1607\n56#6,5:1612\n76#6,7:1637\n76#6,7:1807\n102#6,5:1814\n102#6,5:1819\n56#6,5:1825\n102#6,5:2059\n91#7:1606\n91#7:1617\n115#7:1618\n91#7:1636\n91#7:1644\n91#7:1659\n95#7:1683\n139#7:1745\n115#7:1824\n111#7:1830\n111#7:1847\n83#7:1900\n107#7:1971\n91#7:2064\n683#8,6:1671\n683#8,6:1677\n662#8,6:1684\n683#8,3:1690\n668#8,2:1693\n671#8,2:1738\n686#8,3:1740\n673#8:1743\n663#8:1744\n662#8,6:1746\n683#8,3:1752\n668#8,2:1755\n671#8,2:1800\n686#8,3:1802\n673#8:1805\n663#8:1806\n662#8,6:1831\n683#8,3:1837\n668#8,2:1840\n671#8,2:1886\n686#8,3:1888\n673#8:1891\n663#8:1892\n662#8,6:1901\n683#8,3:1907\n668#8,2:1910\n671#8,2:1955\n686#8,3:1957\n673#8:1960\n663#8:1961\n437#9,6:1695\n447#9,2:1702\n449#9,8:1707\n457#9,9:1718\n466#9,8:1730\n437#9,6:1757\n447#9,2:1764\n449#9,8:1769\n457#9,9:1780\n466#9,8:1792\n437#9,5:1842\n442#9:1848\n447#9,2:1850\n449#9,8:1855\n457#9,9:1866\n466#9,8:1878\n437#9,6:1912\n447#9,2:1919\n449#9,8:1924\n457#9,9:1935\n466#9,8:1947\n437#9,6:1978\n447#9,2:1985\n449#9,8:1990\n457#9,9:2001\n466#9,8:2013\n246#10:1701\n246#10:1763\n246#10:1849\n246#10:1918\n246#10:1984\n240#11,3:1704\n243#11,3:1727\n240#11,3:1766\n243#11,3:1789\n240#11,3:1852\n243#11,3:1875\n240#11,3:1921\n243#11,3:1944\n240#11,3:1987\n243#11,3:2010\n116#12:1972\n105#12,5:1973\n110#12,8:2021\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n120#1:1540,7\n553#1:1629,7\n592#1:1645,2\n592#1:1657,2\n670#1:1661\n1188#1:1893,7\n1318#1:2029\n1339#1:2039\n1351#1:2049\n1430#1:2065,7\n139#1:1534\n139#1:1535,2\n619#1:1537\n619#1:1538,2\n153#1:1548\n153#1:1549,2\n772#1:1715\n772#1:1716,2\n782#1:1777\n782#1:1778,2\n1175#1:1863\n1175#1:1864,2\n1257#1:1932\n1257#1:1933,2\n1281#1:1998\n1281#1:1999,2\n143#1:1547\n155#1:1552\n339#1:1591\n349#1:1593\n350#1:1594\n371#1:1596\n545#1:1619\n592#1:1647\n155#1:1553,6\n157#1:1559\n155#1:1560,3\n207#1:1563,9\n210#1:1572,9\n339#1:1592\n350#1:1595\n371#1:1597,9\n545#1:1620,9\n592#1:1648,9\n634#1:1660\n670#1:1662,9\n1259#1:1962,9\n1318#1:2030,9\n1339#1:2040,9\n1351#1:2050,9\n291#1:1581,5\n335#1:1586,5\n496#1:1607,5\n499#1:1612,5\n574#1:1637,7\n905#1:1807,7\n934#1:1814,5\n937#1:1819,5\n1111#1:1825,5\n1369#1:2059,5\n457#1:1606\n524#1:1617\n537#1:1618\n559#1:1636\n588#1:1644\n607#1:1659\n772#1:1683\n782#1:1745\n952#1:1824\n1175#1:1830\n1176#1:1847\n1257#1:1900\n1281#1:1971\n1395#1:2064\n752#1:1671,6\n763#1:1677,6\n772#1:1684,6\n772#1:1690,3\n772#1:1693,2\n772#1:1738,2\n772#1:1740,3\n772#1:1743\n772#1:1744\n782#1:1746,6\n782#1:1752,3\n782#1:1755,2\n782#1:1800,2\n782#1:1802,3\n782#1:1805\n782#1:1806\n1175#1:1831,6\n1175#1:1837,3\n1175#1:1840,2\n1175#1:1886,2\n1175#1:1888,3\n1175#1:1891\n1175#1:1892\n1257#1:1901,6\n1257#1:1907,3\n1257#1:1910,2\n1257#1:1955,2\n1257#1:1957,3\n1257#1:1960\n1257#1:1961\n772#1:1695,6\n772#1:1702,2\n772#1:1707,8\n772#1:1718,9\n772#1:1730,8\n782#1:1757,6\n782#1:1764,2\n782#1:1769,8\n782#1:1780,9\n782#1:1792,8\n1175#1:1842,5\n1175#1:1848\n1175#1:1850,2\n1175#1:1855,8\n1175#1:1866,9\n1175#1:1878,8\n1257#1:1912,6\n1257#1:1919,2\n1257#1:1924,8\n1257#1:1935,9\n1257#1:1947,8\n1281#1:1978,6\n1281#1:1985,2\n1281#1:1990,8\n1281#1:2001,9\n1281#1:2013,8\n772#1:1701\n782#1:1763\n1175#1:1849\n1257#1:1918\n1281#1:1984\n772#1:1704,3\n772#1:1727,3\n782#1:1766,3\n782#1:1789,3\n1175#1:1852,3\n1175#1:1875,3\n1257#1:1921,3\n1257#1:1944,3\n1281#1:1987,3\n1281#1:2010,3\n1281#1:1972\n1281#1:1973,5\n1281#1:2021,8\n*E\n"})
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private IntrinsicsPolicy intrinsicsPolicy;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isDeactivated;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final MutableVector _zSortedChildren;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private LayoutNode lookaheadRoot;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private MeasurePolicy measurePolicy;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private UsageByParent intrinsicsUsageByParent;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private CompositionLocalMap compositionLocalMap;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long lastSize;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean isSemanticsInvalidated;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private UsageByParent previousIntrinsicsUsageByParent;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long offsetFromRoot;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int compositeKeyHash;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private MutableVector _unfoldedChildren;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final MutableVectorWithMutationTracking _foldedChildren;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Owner owner;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private boolean canMultiMeasure;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean forceUseOldLayers;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ViewConfiguration viewConfiguration;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private final LayoutNodeLayoutDelegate layoutDelegate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean isCurrentlyCalculatingSemanticsConfiguration;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private Modifier pendingModifier;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private AndroidViewHolder interopViewFactoryHolder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final NodeChain nodes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Modifier _modifier;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean outerToInnerOffsetDirty;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    private boolean needsOnPositionedDispatch;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private SemanticsConfiguration _semanticsConfiguration;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private Function1 onDetach;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private NodeCoordinator _innerLayerCoordinator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long outerToInnerOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int semanticsId;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private LayoutNode _foldedParent;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private Function1 onAttach;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private LayoutNodeSubcompositionsState subcompositionsState;

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    public static final int f32428G7 = 8;
    private static final NoIntrinsicsMeasurePolicy fcU = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        public Void KN(MeasureScope measureScope, List list, long j2) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ MeasureResult rl(MeasureScope measureScope, List list, long j2) {
            return (MeasureResult) KN(measureScope, list, j2);
        }
    };
    private static final Function0 eWT = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final ViewConfiguration ul = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float Uo() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long n() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long rl() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long t() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long O() {
            return DpSize.INSTANCE.rl();
        }
    };
    private static final Comparator n1 = new Comparator() { // from class: androidx.compose.ui.node.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.XQ((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", c.f62177j, "()Lkotlin/jvm/functions/Function0;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "rl", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function0 n() {
            return LayoutNode.eWT;
        }

        public final Comparator rl() {
            return LayoutNode.n1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LayoutState {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f32459Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ LayoutState[] f32461o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final LayoutState f32460n = new LayoutState("Measuring", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final LayoutState f32463t = new LayoutState("LookaheadMeasuring", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final LayoutState f32458O = new LayoutState("LayingOut", 2);
        public static final LayoutState J2 = new LayoutState("LookaheadLayingOut", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final LayoutState f32462r = new LayoutState("Idle", 4);

        private static final /* synthetic */ LayoutState[] n() {
            return new LayoutState[]{f32460n, f32463t, f32458O, J2, f32462r};
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) f32461o.clone();
        }

        static {
            LayoutState[] layoutStateArrN = n();
            f32461o = layoutStateArrN;
            f32459Z = EnumEntriesKt.enumEntries(layoutStateArrN);
        }

        private LayoutState(String str, int i2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", MRAIDPresenter.ERROR, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "", "J2", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)Ljava/lang/Void;", "width", "nr", "t", c.f62177j, "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String error;

        public Void J2(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void n(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void nr(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void t(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) t(intrinsicMeasureScope, list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int Uo(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) nr(intrinsicMeasureScope, list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) n(intrinsicMeasureScope, list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) J2(intrinsicMeasureScope, list, i2)).intValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UsageByParent {
        private static final /* synthetic */ UsageByParent[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f32467r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final UsageByParent f32466n = new UsageByParent("InMeasureBlock", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final UsageByParent f32468t = new UsageByParent("InLayoutBlock", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final UsageByParent f32465O = new UsageByParent("NotUsed", 2);

        private static final /* synthetic */ UsageByParent[] n() {
            return new UsageByParent[]{f32466n, f32468t, f32465O};
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) J2.clone();
        }

        static {
            UsageByParent[] usageByParentArrN = n();
            J2 = usageByParentArrN;
            f32467r = EnumEntriesKt.enumEntries(usageByParentArrN);
        }

        private UsageByParent(String str, int i2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.f32462r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode(boolean z2, int i2) {
        this.isVirtual = z2;
        this.semanticsId = i2;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.offsetFromRoot = companion.n();
        this.lastSize = IntSize.INSTANCE.n();
        this.outerToInnerOffset = companion.n();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
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
                this.f32469n.getLayoutDelegate().fD();
            }
        });
        this._zSortedChildren = new MutableVector(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = fcU;
        this.density = LayoutNodeKt.f32477n;
        this.layoutDirection = LayoutDirection.f34160n;
        this.viewConfiguration = ul;
        this.compositionLocalMap = CompositionLocalMap.INSTANCE.n();
        UsageByParent usageByParent = UsageByParent.f32465O;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration g() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.rl(this).getSnapshotObserver().mUb(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11 */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeChain nodes = this.f32470n.getNodes();
                int iN = NodeKind.n(8);
                Ref.ObjectRef objectRef2 = objectRef;
                if ((nodes.xMQ() & iN) != 0) {
                    for (Modifier.Node tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                        if ((tail.getKindSet() & iN) != 0) {
                            ?? KN = tail;
                            ?? mutableVector = 0;
                            while (KN != 0) {
                                if (KN instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) KN;
                                    if (semanticsModifierNode.getIsClearingSemantics()) {
                                        ?? semanticsConfiguration = new SemanticsConfiguration();
                                        objectRef2.element = semanticsConfiguration;
                                        semanticsConfiguration.ck(true);
                                    }
                                    if (semanticsModifierNode.getMergeDescendants()) {
                                        ((SemanticsConfiguration) objectRef2.element).Ik(true);
                                    }
                                    semanticsModifierNode.FX((SemanticsPropertyReceiver) objectRef2.element);
                                } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                    int i2 = 0;
                                    KN = KN;
                                    mutableVector = mutableVector;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i2++;
                                            mutableVector = mutableVector;
                                            if (i2 == 1) {
                                                KN = delegate;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (KN != 0) {
                                                    mutableVector.rl(KN);
                                                    KN = 0;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        KN = KN;
                                        mutableVector = mutableVector;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                KN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                    }
                }
            }
        });
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) objectRef.element;
    }

    public final void Th(boolean forceRequest) {
        Owner owner;
        this.outerToInnerOffsetDirty = true;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.O(owner, this, false, forceRequest, 2, null);
    }

    public final void kSg() {
        this.outerToInnerOffsetDirty = true;
        if (this.lookaheadRoot != null) {
            wKp(this, false, false, false, 7, null);
        } else {
            lNy(this, false, false, false, 7, null);
        }
    }

    public final void s(int index, int count) {
        if (!(count >= 0)) {
            InlineClassHelperKt.n("count (" + count + ") must be greater than 0");
        }
        int i2 = (count + index) - 1;
        if (index > i2) {
            return;
        }
        while (true) {
            y((LayoutNode) this._foldedChildren.getVector().content[i2]);
            if (i2 == index) {
                return;
            } else {
                i2--;
            }
        }
    }

    private final void D76() {
        this.nodes.ViF();
    }

    static /* synthetic */ String E2(LayoutNode layoutNode, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return layoutNode.fD(i2);
    }

    private final void F() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.F();
    }

    private final void Fp(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.rl();
            NodeCoordinator wrapped = E().getWrapped();
            for (NodeCoordinator nodeCoordinatorN1 = n1(); !Intrinsics.areEqual(nodeCoordinatorN1, wrapped) && nodeCoordinatorN1 != null; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
                nodeCoordinatorN1.TVk();
            }
        } else {
            this.layoutDelegate.n();
        }
        kSg();
    }

    public static /* synthetic */ void How(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = PointerType.INSTANCE.nr();
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        layoutNode.K(j2, hitTestResult, i5, z2);
    }

    private final String N(LayoutNode instance) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(instance);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(E2(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode = instance._foldedParent;
        sb.append(layoutNode != null ? E2(layoutNode, 0, 1, null) : null);
        return sb.toString();
    }

    public static /* synthetic */ boolean T3L(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.qie();
        }
        return layoutNode.mI(constraints);
    }

    private final void ViF(Modifier modifier) {
        this._modifier = modifier;
        this.nodes.e(modifier);
        this.layoutDelegate.B();
        if (this.lookaheadRoot == null && this.nodes.Ik(NodeKind.n(512))) {
            Fp(this);
        }
    }

    private final String fD(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < depth; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector mutableVectorHRu = hRu();
        Object[] objArr = mutableVectorHRu.content;
        int iQie = mutableVectorHRu.getSize();
        for (int i3 = 0; i3 < iQie; i3++) {
            sb.append(((LayoutNode) objArr[i3]).fD(depth + 1));
        }
        String string = sb.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ void i(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = PointerType.INSTANCE.O();
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        layoutNode.UhV(j2, hitTestResult, i5, z2);
    }

    private final void iF() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.f32465O;
        MutableVector mutableVectorHRu = hRu();
        Object[] objArr = mutableVectorHRu.content;
        int iQie = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < iQie; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.f32468t) {
                layoutNode.iF();
            }
        }
    }

    public static /* synthetic */ void jO(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        layoutNode.Mh(z2);
    }

    public static /* synthetic */ void lNy(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        layoutNode.XNZ(z2, z3, z4);
    }

    public static /* synthetic */ boolean n7b(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.gh();
        }
        return layoutNode.o9(constraints);
    }

    private final IntrinsicsPolicy ul() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    private final void v0j() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.KN();
            MutableVector mutableVectorT = this._foldedChildren.getVector();
            Object[] objArr = mutableVectorT.content;
            int iQie = mutableVectorT.getSize();
            for (int i2 = 0; i2 < iQie; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.isVirtual) {
                    mutableVector.t(mutableVector.getSize(), layoutNode.hRu());
                } else {
                    mutableVector.rl(layoutNode);
                }
            }
            this.layoutDelegate.fD();
        }
    }

    public static /* synthetic */ void wKp(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        layoutNode.Toy(z2, z3, z4);
    }

    public static /* synthetic */ void xzo(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        layoutNode.Th(z2);
    }

    private final void y(LayoutNode child) {
        if (child.layoutDelegate.nr() > 0) {
            this.layoutDelegate.wTp(r0.nr() - 1);
        }
        if (this.owner != null) {
            child.e();
        }
        child._foldedParent = null;
        child.n1().Ai(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector mutableVectorT = child._foldedChildren.getVector();
            Object[] objArr = mutableVectorT.content;
            int iQie = mutableVectorT.getSize();
            for (int i2 = 0; i2 < iQie; i2++) {
                ((LayoutNode) objArr[i2]).n1().Ai(null);
            }
        }
        F();
        nO();
    }

    public final void Aum() {
        int iQie = this._foldedChildren.getVector().getSize();
        while (true) {
            iQie--;
            if (-1 >= iQie) {
                this._foldedChildren.rl();
                return;
            }
            y((LayoutNode) this._foldedChildren.getVector().content[iQie]);
        }
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void Bu() {
        if (this.intrinsicsUsageByParent == UsageByParent.f32465O) {
            iF();
        }
        LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
        Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
        lookaheadPassDelegatePiY.L();
    }

    public final NodeCoordinator E() {
        return this.nodes.getInnerCoordinator();
    }

    public final void EN(Function1 function1) {
        this.onAttach = function1;
    }

    public final MutableVector EWS() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.KN();
            MutableVector mutableVector = this._zSortedChildren;
            mutableVector.t(mutableVector.getSize(), hRu());
            this._zSortedChildren.aYN(n1);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public View FX() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    /* JADX INFO: renamed from: G7, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    /* JADX INFO: renamed from: GD, reason: from getter */
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX INFO: renamed from: GR, reason: from getter */
    public final long getLastSize() {
        return this.lastSize;
    }

    public final void H(boolean z2) {
        this.innerLayerCoordinatorIsDirty = z2;
    }

    /* JADX INFO: renamed from: HV, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public List Ik() {
        return this.nodes.ty();
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void J2(int i2) {
        this.compositeKeyHash = i2;
    }

    /* JADX INFO: renamed from: Jk, reason: from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void KN() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            wKp(layoutNode, false, false, false, 5, null);
        } else {
            lNy(this, false, false, false, 5, null);
            layoutNode = this;
        }
        Constraints constraintsGh = layoutNode.layoutDelegate.gh();
        if (constraintsGh != null) {
            Owner owner = layoutNode.owner;
            if (owner != null) {
                owner.nY(this, constraintsGh.getValue());
                return;
            }
            return;
        }
        Owner owner2 = layoutNode.owner;
        if (owner2 != null) {
            Owner.t(owner2, false, 1, null);
        }
    }

    public final void LPV(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    public final void Lp6() {
        if (this.intrinsicsUsageByParent == UsageByParent.f32465O) {
            iF();
        }
        eTf().HFS();
    }

    public final NodeCoordinator M() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator nodeCoordinatorE = E();
            NodeCoordinator wrappedBy = n1().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(nodeCoordinatorE, wrappedBy)) {
                    break;
                }
                if ((nodeCoordinatorE != null ? nodeCoordinatorE.getLayer() : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinatorE;
                    break;
                }
                nodeCoordinatorE = nodeCoordinatorE != null ? nodeCoordinatorE.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.nr("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final List M7() {
        return this._foldedChildren.getVector().Uo();
    }

    public final void Mh(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.nr(this, true, forceRequest);
    }

    /* JADX INFO: renamed from: Mx, reason: from getter */
    public Modifier get_modifier() {
        return this._modifier;
    }

    /* JADX INFO: renamed from: Nxk, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void O(Density density) {
        if (Intrinsics.areEqual(this.density, density)) {
            return;
        }
        this.density = density;
        Zn();
        for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.jB();
        }
    }

    /* JADX INFO: renamed from: P5, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void QgZ(boolean z2) {
        this.canMultiMeasure = z2;
    }

    public final void RQ() {
        this.layoutDelegate.iF();
    }

    /* JADX INFO: renamed from: Rl, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    public final void Ro(boolean z2) {
        this.needsOnPositionedDispatch = z2;
    }

    public final void SR(long j2) {
        this.offsetFromRoot = j2;
    }

    public final void Toy(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            InlineClassHelperKt.t("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.te(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
            Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
            lookaheadPassDelegatePiY.lNy(forceRequest);
        }
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public Density getDensity() {
        return this.density;
    }

    public final void Uf() {
        this.layoutDelegate.e();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void Uo() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.Uo();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.Uo();
            }
        }
        this.isDeactivated = true;
        D76();
        if (nr()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled) {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            } else {
                a63();
            }
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.nHg(this);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.Uo();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.Uo();
            }
        }
    }

    /* JADX INFO: renamed from: VwL, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void XNZ(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.wTp(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            eTf().NP(forceRequest);
        }
    }

    /* JADX INFO: renamed from: Xw, reason: from getter */
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    public final boolean Y() {
        return this.layoutDelegate.ty();
    }

    public final void a63() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            LayoutNodeKt.rl(this).N();
        } else {
            if (this.nodes.o() || s7N()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = g();
            this.isSemanticsInvalidated = false;
            Owner ownerRl = LayoutNodeKt.rl(this);
            ownerRl.getSemanticsOwner().O(this, semanticsConfiguration);
            ownerRl.N();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void az(Modifier modifier) {
        if (!(!this.isVirtual || get_modifier() == Modifier.INSTANCE)) {
            InlineClassHelperKt.n("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            InlineClassHelperKt.n("modifier is updated when deactivated");
        }
        if (!nr()) {
            this.pendingModifier = modifier;
            return;
        }
        ViF(modifier);
        if (this.isSemanticsInvalidated) {
            a63();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* JADX INFO: renamed from: ck, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final boolean dR0() {
        return this.layoutDelegate.o();
    }

    public final void e() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeMYa = mYa();
            sb.append(layoutNodeMYa != null ? E2(layoutNodeMYa, 0, 1, null) : null);
            InlineClassHelperKt.nr(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNodeMYa2 = mYa();
        if (layoutNodeMYa2 != null) {
            layoutNodeMYa2.ER();
            layoutNodeMYa2.kSg();
            MeasurePassDelegate measurePassDelegateETf = eTf();
            UsageByParent usageByParent = UsageByParent.f32465O;
            measurePassDelegateETf.fq(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
            if (lookaheadPassDelegatePiY != null) {
                lookaheadPassDelegatePiY.eb(usageByParent);
            }
        }
        this.layoutDelegate.s7N();
        Function1 function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.Ik(NodeKind.n(8))) {
            a63();
        }
        this.nodes.g();
        this.ignoreRemeasureRequests = true;
        MutableVector mutableVectorT = this._foldedChildren.getVector();
        Object[] objArr = mutableVectorT.content;
        int iQie = mutableVectorT.getSize();
        for (int i2 = 0; i2 < iQie; i2++) {
            ((LayoutNode) objArr[i2]).e();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.XQ();
        owner.fD(this);
        this.owner = null;
        Fp(null);
        this.depth = 0;
        eTf().rT();
        LookaheadPassDelegate lookaheadPassDelegatePiY2 = piY();
        if (lookaheadPassDelegatePiY2 != null) {
            lookaheadPassDelegatePiY2.wKY();
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.Ik(NodeKind.n(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().O(this, semanticsConfiguration);
            owner.N();
        }
    }

    public final MeasurePassDelegate eTf() {
        return this.layoutDelegate.WPU();
    }

    /* JADX INFO: renamed from: eWT, reason: from getter */
    public final long getOffsetFromRoot() {
        return this.offsetFromRoot;
    }

    public final void eo(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public final void f() {
        this.layoutDelegate.X();
    }

    /* JADX INFO: renamed from: fcU, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    public final void g6() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.rl(this).o(this);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.mUb();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.te();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void gh(MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.gh(getMeasurePolicy());
        }
        kSg();
    }

    public void h(int i2) {
        this.semanticsId = i2;
    }

    /* JADX INFO: renamed from: ijL, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final void j(boolean z2) {
        this.forceUseOldLayers = z2;
    }

    /* JADX INFO: renamed from: jB, reason: from getter */
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final LayoutState k() {
        return this.layoutDelegate.HI();
    }

    public final void l(boolean z2) {
        this.isSemanticsInvalidated = z2;
    }

    public final boolean mI(Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
        Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
        return lookaheadPassDelegatePiY.rT(constraints.getValue());
    }

    public final LayoutNode mYa() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public SemanticsInfo n() {
        return mYa();
    }

    public final NodeCoordinator n1() {
        return this.nodes.getOuterCoordinator();
    }

    public final boolean nHg() {
        AlignmentLinesOwner alignmentLinesOwnerCk;
        AlignmentLines alignmentLinesO;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.t().getAlignmentLines().gh() || !((alignmentLinesOwnerCk = layoutNodeLayoutDelegate.ck()) == null || (alignmentLinesO = alignmentLinesOwnerCk.getAlignmentLines()) == null || !alignmentLinesO.gh());
    }

    public final void nO() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode layoutNodeMYa = mYa();
        if (layoutNodeMYa != null) {
            layoutNodeMYa.nO();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void nY(Owner owner) {
        boolean z2;
        LayoutNode layoutNode;
        if (!(this.owner == null)) {
            InlineClassHelperKt.t("Cannot attach " + this + " as it already is attached.  Tree: " + E2(this, 0, 1, null));
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 == null) {
            z2 = true;
        } else if (!Intrinsics.areEqual(layoutNode2 != null ? layoutNode2.owner : null, owner)) {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode layoutNodeMYa = mYa();
            sb.append(layoutNodeMYa != null ? layoutNodeMYa.owner : null);
            sb.append("). This tree: ");
            sb.append(E2(this, 0, 1, null));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this._foldedParent;
            sb.append(layoutNode3 != null ? E2(layoutNode3, 0, 1, null) : null);
            InlineClassHelperKt.t(sb.toString());
        }
        LayoutNode layoutNodeMYa2 = mYa();
        if (layoutNodeMYa2 == null) {
            eTf().C7B(true);
            LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
            if (lookaheadPassDelegatePiY != null) {
                lookaheadPassDelegatePiY.LPV();
            }
        }
        n1().Ai(layoutNodeMYa2 != null ? layoutNodeMYa2.E() : null);
        this.owner = owner;
        this.depth = (layoutNodeMYa2 != null ? layoutNodeMYa2.depth : -1) + 1;
        Modifier modifier = this.pendingModifier;
        if (modifier != null) {
            ViF(modifier);
        }
        this.pendingModifier = null;
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.Ik(NodeKind.n(8))) {
            a63();
        }
        owner.WPU(this);
        if (this.isVirtualLookaheadRoot) {
            Fp(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            Fp(layoutNode);
            if (this.lookaheadRoot == null && this.nodes.Ik(NodeKind.n(512))) {
                Fp(this);
            }
        }
        if (!getIsDeactivated()) {
            this.nodes.Z();
        }
        MutableVector mutableVectorT = this._foldedChildren.getVector();
        Object[] objArr = mutableVectorT.content;
        int iQie = mutableVectorT.getSize();
        for (int i2 = 0; i2 < iQie; i2++) {
            ((LayoutNode) objArr[i2]).nY(owner);
        }
        if (!getIsDeactivated()) {
            this.nodes.nY();
        }
        kSg();
        if (layoutNodeMYa2 != null) {
            layoutNodeMYa2.kSg();
        }
        NodeCoordinator wrapped = E().getWrapped();
        for (NodeCoordinator nodeCoordinatorN1 = n1(); !Intrinsics.areEqual(nodeCoordinatorN1, wrapped) && nodeCoordinatorN1 != null; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
            nodeCoordinatorN1.ZwA();
        }
        Function1 function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.B();
        if (ComposeUiFlags.isSemanticAutofillEnabled && !getIsDeactivated() && this.nodes.Ik(NodeKind.n(8))) {
            a63();
        }
        owner.ck(this);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean nr() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    public final boolean o9(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.f32465O) {
            te();
        }
        return eTf().w(constraints.getValue());
    }

    public final void p0N() {
        this.layoutDelegate.E2();
    }

    /* JADX INFO: renamed from: p5, reason: from getter */
    public final boolean getForceUseOldLayers() {
        return this.forceUseOldLayers;
    }

    /* JADX INFO: renamed from: pJg, reason: from getter */
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final void pS(Function1 function1) {
        this.onDetach = function1;
    }

    public final LookaheadPassDelegate piY() {
        return this.layoutDelegate.S();
    }

    /* JADX INFO: renamed from: qm, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void rl(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            Zn();
            for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.n1();
            }
        }
    }

    public final void rxp(long j2) {
        this.lastSize = j2;
    }

    public final boolean s7N() {
        return this.pendingModifier != null;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void t() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.t();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.t();
            }
        }
        NodeCoordinator wrapped = E().getWrapped();
        for (NodeCoordinator nodeCoordinatorN1 = n1(); !Intrinsics.areEqual(nodeCoordinatorN1, wrapped) && nodeCoordinatorN1 != null; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
            nodeCoordinatorN1.i7();
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.t();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.t();
            }
        }
    }

    public final void tEO(long j2) {
        this.outerToInnerOffset = j2;
    }

    public final void tUK(int index, LayoutNode instance) {
        if (!(instance._foldedParent == null || instance.owner == null)) {
            InlineClassHelperKt.t(N(instance));
        }
        instance._foldedParent = this;
        this._foldedChildren.n(index, instance);
        nO();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        F();
        Owner owner = this.owner;
        if (owner != null) {
            instance.nY(owner);
        }
        if (instance.layoutDelegate.nr() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.wTp(layoutNodeLayoutDelegate.nr() + 1);
        }
    }

    public final void te() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.f32465O;
        MutableVector mutableVectorHRu = hRu();
        Object[] objArr = mutableVectorHRu.content;
        int iQie = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < iQie; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.f32465O) {
                layoutNode.te();
            }
        }
    }

    public String toString() {
        return JvmActuals_jvmKt.n(this, null) + " children: " + bzg().size() + " measurePolicy: " + getMeasurePolicy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void ty(CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        O((Density) compositionLocalMap.t(CompositionLocalsKt.J2()));
        rl((LayoutDirection) compositionLocalMap.t(CompositionLocalsKt.az()));
        xMQ((ViewConfiguration) compositionLocalMap.t(CompositionLocalsKt.XQ()));
        NodeChain nodeChain = this.nodes;
        int iN = NodeKind.n(32768);
        if ((nodeChain.xMQ() & iN) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iN) != 0) {
                    ?? KN = head;
                    ?? mutableVector = 0;
                    while (KN != 0) {
                        if (KN instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) KN).getNode();
                            if (node.getIsAttached()) {
                                NodeKindKt.O(node);
                            } else {
                                node.tdZ(true);
                            }
                        } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                            Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                            int i2 = 0;
                            KN = KN;
                            mutableVector = mutableVector;
                            while (nodeW5k != null) {
                                if ((nodeW5k.getKindSet() & iN) != 0) {
                                    i2++;
                                    mutableVector = mutableVector;
                                    if (i2 == 1) {
                                        KN = nodeW5k;
                                    } else {
                                        if (mutableVector == 0) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (KN != 0) {
                                            mutableVector.rl(KN);
                                            KN = 0;
                                        }
                                        mutableVector.rl(nodeW5k);
                                    }
                                }
                                nodeW5k = nodeW5k.getChild();
                                KN = KN;
                                mutableVector = mutableVector;
                            }
                            if (i2 == 1) {
                            }
                        }
                        KN = DelegatableNodeKt.KN(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iN) == 0) {
                    return;
                }
            }
        }
    }

    public final void uG(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i2 = 0; i2 < count; i2++) {
            this._foldedChildren.n(from > to ? to + i2 : (to + count) - 2, (LayoutNode) this._foldedChildren.nr(from > to ? from + i2 : from));
        }
        nO();
        F();
        kSg();
    }

    public final void uQ(boolean z2) {
        this.isVirtualLookaheadRoot = z2;
    }

    public final void ub() {
        this.layoutDelegate.T();
    }

    public final void vl(int x2, int y2) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator nodeCoordinatorE;
        if (this.intrinsicsUsageByParent == UsageByParent.f32465O) {
            iF();
        }
        LayoutNode layoutNodeMYa = mYa();
        if (layoutNodeMYa == null || (nodeCoordinatorE = layoutNodeMYa.E()) == null || (placementScope = nodeCoordinatorE.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.rl(this).getPlacementScope();
        }
        Placeable.PlacementScope.az(placementScope, eTf(), x2, y2, 0.0f, 4, null);
    }

    public final void wKY() {
        if (this.virtualChildrenCount > 0) {
            v0j();
        }
    }

    /* JADX INFO: renamed from: wTp, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void waP(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void xMQ(ViewConfiguration viewConfiguration) {
        if (Intrinsics.areEqual(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iN = NodeKind.n(16);
        if ((nodeChain.xMQ() & iN) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iN) != 0) {
                    ?? KN = head;
                    ?? mutableVector = 0;
                    while (KN != 0) {
                        if (KN instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) KN).d();
                        } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                            Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                            int i2 = 0;
                            KN = KN;
                            mutableVector = mutableVector;
                            while (nodeW5k != null) {
                                if ((nodeW5k.getKindSet() & iN) != 0) {
                                    i2++;
                                    mutableVector = mutableVector;
                                    if (i2 == 1) {
                                        KN = nodeW5k;
                                    } else {
                                        if (mutableVector == 0) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (KN != 0) {
                                            mutableVector.rl(KN);
                                            KN = 0;
                                        }
                                        mutableVector.rl(nodeW5k);
                                    }
                                }
                                nodeW5k = nodeW5k.getChild();
                                KN = KN;
                                mutableVector = mutableVector;
                            }
                            if (i2 == 1) {
                            }
                        }
                        KN = DelegatableNodeKt.KN(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iN) == 0) {
                    return;
                }
            }
        }
    }

    public final boolean xg() {
        return this.layoutDelegate.aYN();
    }

    public final void yAc(boolean z2) {
        this.outerToInnerOffsetDirty = z2;
    }

    public final boolean z() {
        return this.layoutDelegate.XQ();
    }

    private final float Po6() {
        return eTf().getZIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int XQ(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode.Po6() == layoutNode2.Po6()) {
            return Intrinsics.compare(layoutNode.Org(), layoutNode2.Org());
        }
        return Float.compare(layoutNode.Po6(), layoutNode2.Po6());
    }

    private final void Zn() {
        kSg();
        LayoutNode layoutNodeMYa = mYa();
        if (layoutNodeMYa != null) {
            layoutNodeMYa.ER();
        }
        lLA();
    }

    public final UsageByParent C() {
        UsageByParent usageByParentWKp;
        LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
        if (lookaheadPassDelegatePiY != null && (usageByParentWKp = lookaheadPassDelegatePiY.getMeasuredByParent()) != null) {
            return usageByParentWKp;
        }
        return UsageByParent.f32465O;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public SemanticsConfiguration D() {
        if (nr() && !getIsDeactivated() && this.nodes.Ik(NodeKind.n(8))) {
            if (!ComposeUiFlags.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
                this._semanticsConfiguration = g();
            }
            return this._semanticsConfiguration;
        }
        return null;
    }

    public final int EF(int height) {
        return ul().xMQ(height);
    }

    public final void ER() {
        NodeCoordinator nodeCoordinatorM = M();
        if (nodeCoordinatorM != null) {
            nodeCoordinatorM.ex();
            return;
        }
        LayoutNode layoutNodeMYa = mYa();
        if (layoutNodeMYa != null) {
            layoutNodeMYa.ER();
        }
    }

    public final int HBN(int height) {
        return ul().t(height);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean HI() {
        return eTf().getIsPlaced();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public boolean I() {
        return n1().pr();
    }

    public final void I9f(LayoutNode it) {
        if (WhenMappings.$EnumSwitchMapping$0[it.k().ordinal()] == 1) {
            if (it.z()) {
                wKp(it, true, false, false, 6, null);
                return;
            }
            if (it.dR0()) {
                it.Mh(true);
            }
            if (it.xg()) {
                lNy(it, true, false, false, 6, null);
                return;
            } else {
                if (it.Y()) {
                    it.Th(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(jhotmBbwMbr.dZZdkeZvXb + it.k());
    }

    public final int JVN(int height) {
        return ul().Uo(height);
    }

    public final void K(long pointerPosition, HitTestResult hitSemanticsEntities, int pointerType, boolean isInLayer) {
        n1().W5k(NodeCoordinator.INSTANCE.rl(), NodeCoordinator.yA(n1(), pointerPosition, false, 2, null), hitSemanticsEntities, PointerType.INSTANCE.nr(), isInLayer);
    }

    public final void NP() {
        MutableVector mutableVectorHRu = hRu();
        Object[] objArr = mutableVectorHRu.content;
        int iQie = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < iQie; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.f32465O) {
                layoutNode.NP();
            }
        }
    }

    public final int Org() {
        return eTf().getPlaceOrder();
    }

    public final boolean QZ6() {
        return eTf().getIsPlacedByParent();
    }

    public final int Qu(int width) {
        return ul().rl(width);
    }

    public final void T(Canvas canvas, GraphicsLayer graphicsLayer) {
        n1().fq(canvas, graphicsLayer);
    }

    public final int UF(int width) {
        return ul().nr(width);
    }

    public final void UhV(long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        n1().W5k(NodeCoordinator.INSTANCE.n(), NodeCoordinator.yA(n1(), pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean Vvq() {
        return nr();
    }

    public final void W() {
        if (!Y() && !xg() && !this.needsOnPositionedDispatch) {
            LayoutNodeKt.rl(this).KN(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void X() {
        if (k() == LayoutState.f32462r && !Y() && !xg() && !getIsDeactivated() && HI()) {
            NodeChain nodeChain = this.nodes;
            int iN = NodeKind.n(256);
            if ((nodeChain.xMQ() & iN) != 0) {
                for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & iN) != 0) {
                        ?? KN = head;
                        ?? mutableVector = 0;
                        while (KN != 0) {
                            if (KN instanceof GlobalPositionAwareModifierNode) {
                                GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) KN;
                                globalPositionAwareModifierNode.P5(DelegatableNodeKt.mUb(globalPositionAwareModifierNode, NodeKind.n(256)));
                            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                                int i2 = 0;
                                KN = KN;
                                mutableVector = mutableVector;
                                while (nodeW5k != null) {
                                    if ((nodeW5k.getKindSet() & iN) != 0) {
                                        i2++;
                                        mutableVector = mutableVector;
                                        if (i2 == 1) {
                                            KN = nodeW5k;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (KN != 0) {
                                                mutableVector.rl(KN);
                                                KN = 0;
                                            }
                                            mutableVector.rl(nodeW5k);
                                        }
                                    }
                                    nodeW5k = nodeW5k.getChild();
                                    KN = KN;
                                    mutableVector = mutableVector;
                                }
                                if (i2 == 1) {
                                }
                            }
                            KN = DelegatableNodeKt.KN(mutableVector);
                        }
                    }
                    if ((head.getAggregateChildKindSet() & iN) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final int X4T(int height) {
        return ul().O(height);
    }

    public final int Zmq(int width) {
        return ul().J2(width);
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public List a() {
        return bzg();
    }

    public final List bzg() {
        return hRu().Uo();
    }

    public final boolean eF() {
        long jX = E().x();
        if (Constraints.mUb(jX) && Constraints.xMQ(jX)) {
            return true;
        }
        return false;
    }

    public final MutableVector hRu() {
        wKY();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final void lLA() {
        NodeCoordinator nodeCoordinatorE = E();
        for (NodeCoordinator nodeCoordinatorN1 = n1(); nodeCoordinatorN1 != nodeCoordinatorE; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
            Intrinsics.checkNotNull(nodeCoordinatorN1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer layer = ((LayoutModifierNodeCoordinator) nodeCoordinatorN1).getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
        OwnedLayer layer2 = E().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final LayoutNodeDrawScope m() {
        return LayoutNodeKt.rl(this).getSharedDrawScope();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void mUb() {
        NodeCoordinator nodeCoordinatorE = E();
        int iN = NodeKind.n(128);
        boolean zXMQ = NodeKindKt.xMQ(iN);
        Modifier.Node nodeJI = nodeCoordinatorE.JI();
        if (zXMQ || (nodeJI = nodeJI.getParent()) != null) {
            for (Modifier.Node nodeGRh = nodeCoordinatorE.GRh(zXMQ); nodeGRh != null && (nodeGRh.getAggregateChildKindSet() & iN) != 0; nodeGRh = nodeGRh.getChild()) {
                if ((nodeGRh.getKindSet() & iN) != 0) {
                    ?? KN = nodeGRh;
                    ?? mutableVector = 0;
                    while (KN != 0) {
                        if (KN instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) KN).o(E());
                        } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                            Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                            int i2 = 0;
                            KN = KN;
                            mutableVector = mutableVector;
                            while (nodeW5k != null) {
                                if ((nodeW5k.getKindSet() & iN) != 0) {
                                    i2++;
                                    mutableVector = mutableVector;
                                    if (i2 == 1) {
                                        KN = nodeW5k;
                                    } else {
                                        if (mutableVector == 0) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (KN != 0) {
                                            mutableVector.rl(KN);
                                            KN = 0;
                                        }
                                        mutableVector.rl(nodeW5k);
                                    }
                                }
                                nodeW5k = nodeW5k.getChild();
                                KN = KN;
                                mutableVector = mutableVector;
                            }
                            if (i2 == 1) {
                            }
                        }
                        KN = DelegatableNodeKt.KN(mutableVector);
                    }
                }
                if (nodeGRh == nodeJI) {
                    return;
                }
            }
        }
    }

    public final UsageByParent ofS() {
        return eTf().getMeasuredByParent();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void qie() {
        if (!nr()) {
            InlineClassHelperKt.n("onReuse is only expected on attached node");
        }
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.qie();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.qie();
            }
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            if (!ComposeUiFlags.isSemanticAutofillEnabled) {
                a63();
            }
        } else {
            D76();
        }
        int semanticsId = getSemanticsId();
        h(SemanticsModifierKt.rl());
        Owner owner = this.owner;
        if (owner != null) {
            owner.mUb(this, semanticsId);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.qie();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.qie();
            }
        }
        this.nodes.Z();
        this.nodes.nY();
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.Ik(NodeKind.n(8))) {
            a63();
        }
        I9f(this);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.xMQ(this, semanticsId);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates r() {
        return E();
    }

    public final List rV9() {
        return eTf().v0j();
    }

    public final Boolean tFV() {
        LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
        if (lookaheadPassDelegatePiY != null) {
            return Boolean.valueOf(lookaheadPassDelegatePiY.getIsPlaced());
        }
        return null;
    }

    public final List v() {
        LookaheadPassDelegate lookaheadPassDelegatePiY = piY();
        Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
        return lookaheadPassDelegatePiY.xVH();
    }

    public final int xVH(int width) {
        return ul().KN(width);
    }

    public /* synthetic */ LayoutNode(boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? SemanticsModifierKt.rl() : i2);
    }
}
