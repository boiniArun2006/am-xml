package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aA\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0010\u0010\r\u001a\u0019\u0010\u0012\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0018\u001a\u00020\u000b*\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u001a\u0010\r\u001a9\u0010 \u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b \u0010!\u001a-\u0010#\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\b%\u0010$\u001aW\u0010*\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000128\u0010\u001f\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b\u0002\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+\u001aD\u0010/\u001a\u00020\u000b*\u00020\n21\u0010\u001f\u001a-\b\u0001\u0012\u0013\u0012\u00110,¢\u0006\f\b'\u0012\b\b\u0002\u0012\u0004\b\b(-\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0.\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0006¢\u0006\u0004\b/\u00100\u001a1\u00101\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u0014¢\u0006\u0004\b1\u0010!\u001a3\u00103\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b3\u0010!\u001a3\u00104\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b4\u0010!\u001a3\u00105\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b5\u0010!\u001a3\u00106\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b6\u0010!\u001a3\u00107\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b7\u0010!\u001a-\u00108\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\b8\u0010$\u001a3\u00109\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014¢\u0006\u0004\b9\u0010!\u001a8\u0010<\u001a\u00020\u000b*\u00020\n2\u0006\u0010;\u001a\u00020:2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001al\u0010B\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012M\u0010\u001f\u001aI\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b'\u0012\b\b\u0002\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b'\u0012\b\b\u0002\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b'\u0012\b\b\u0002\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u001e\u0018\u00010>¢\u0006\u0004\bB\u0010C\u001a-\u0010D\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bD\u0010$\u001a-\u0010E\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bE\u0010$\u001a-\u0010F\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bF\u0010$\u001a-\u0010G\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bG\u0010$\u001a-\u0010H\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bH\u0010$\u001a-\u0010I\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bI\u0010$\u001a-\u0010J\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bJ\u0010$\u001a-\u0010K\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bK\u0010$\u001a-\u0010L\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bL\u0010$\u001a-\u0010M\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bM\u0010$\u001a-\u0010N\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"¢\u0006\u0004\bN\u0010$\u001a-\u0010O\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\"¢\u0006\u0004\bO\u0010$\"(\u0010T\u001a\u00020\u0001*\u00020\n2\u0006\u0010P\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u0013\"/\u0010Z\u001a\u00020\u0001*\u00020\n2\u0006\u0010U\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bV\u0010R\"\u0004\bW\u0010\u0013*\u0004\bX\u0010Y\"/\u0010a\u001a\u00020[*\u00020\n2\u0006\u0010U\u001a\u00020[8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_*\u0004\b`\u0010Y\"/\u0010e\u001a\u00020\u0001*\u00020\n2\u0006\u0010U\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bb\u0010R\"\u0004\bc\u0010\u0013*\u0004\bd\u0010Y\"/\u0010l\u001a\u00020f*\u00020\n2\u0006\u0010U\u001a\u00020f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j*\u0004\bk\u0010Y\"/\u0010r\u001a\u00020\u001e*\u00020\n2\u0006\u0010U\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p*\u0004\bq\u0010Y\"5\u0010s\u001a\u00020\u001e*\u00020\n2\u0006\u0010U\u001a\u00020\u001e8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bu\u0010\r\u001a\u0004\bs\u0010n\"\u0004\bt\u0010p*\u0004\bv\u0010Y\"/\u0010w\u001a\u00020\u001e*\u00020\n2\u0006\u0010U\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bw\u0010n\"\u0004\bx\u0010p*\u0004\by\u0010Y\"0\u0010\u0080\u0001\u001a\u00020z*\u00020\n2\u0006\u0010U\u001a\u00020z8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~*\u0004\b\u007f\u0010Y\"7\u0010\u0087\u0001\u001a\u00030\u0081\u0001*\u00020\n2\u0007\u0010U\u001a\u00030\u0081\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001*\u0005\b\u0086\u0001\u0010Y\"5\u0010\u008d\u0001\u001a\u00020&*\u00020\n2\u0006\u0010U\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001*\u0005\b\u008c\u0001\u0010Y\"7\u0010\u0094\u0001\u001a\u00030\u008e\u0001*\u00020\n2\u0007\u0010U\u001a\u00030\u008e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001*\u0005\b\u0093\u0001\u0010Y\"7\u0010\u0098\u0001\u001a\u00030\u008e\u0001*\u00020\n2\u0007\u0010U\u001a\u00030\u008e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0095\u0001\u0010\u0090\u0001\"\u0006\b\u0096\u0001\u0010\u0092\u0001*\u0005\b\u0097\u0001\u0010Y\"5\u0010\u009d\u0001\u001a\u00030\u0099\u0001*\u00020\n2\u0007\u0010U\u001a\u00030\u0099\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u009a\u0001\u0010h\"\u0005\b\u009b\u0001\u0010j*\u0005\b\u009c\u0001\u0010Y\"3\u0010¡\u0001\u001a\u00020\u0001*\u00020\n2\u0006\u0010U\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u009e\u0001\u0010R\"\u0005\b\u009f\u0001\u0010\u0013*\u0005\b \u0001\u0010Y\"-\u0010¦\u0001\u001a\u000202*\u00020\n2\u0006\u0010P\u001a\u0002028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001\"5\u0010ª\u0001\u001a\u000202*\u00020\n2\u0006\u0010U\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b§\u0001\u0010£\u0001\"\u0006\b¨\u0001\u0010¥\u0001*\u0005\b©\u0001\u0010Y\"3\u0010«\u0001\u001a\u00020\u001e*\u00020\n2\u0006\u0010U\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b«\u0001\u0010n\"\u0005\b¬\u0001\u0010p*\u0005\b\u00ad\u0001\u0010Y\"5\u0010±\u0001\u001a\u000202*\u00020\n2\u0006\u0010U\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b®\u0001\u0010£\u0001\"\u0006\b¯\u0001\u0010¥\u0001*\u0005\b°\u0001\u0010Y\"5\u0010µ\u0001\u001a\u000202*\u00020\n2\u0006\u0010U\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b²\u0001\u0010£\u0001\"\u0006\b³\u0001\u0010¥\u0001*\u0005\b´\u0001\u0010Y\"7\u0010¼\u0001\u001a\u00030¶\u0001*\u00020\n2\u0007\u0010U\u001a\u00030¶\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001*\u0005\b»\u0001\u0010Y\"3\u0010À\u0001\u001a\u00020\u001e*\u00020\n2\u0006\u0010U\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b½\u0001\u0010n\"\u0005\b¾\u0001\u0010p*\u0005\b¿\u0001\u0010Y\"7\u0010Ç\u0001\u001a\u00030Á\u0001*\u00020\n2\u0007\u0010U\u001a\u00030Á\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001*\u0005\bÆ\u0001\u0010Y\"7\u0010Î\u0001\u001a\u00030È\u0001*\u00020\n2\u0007\u0010U\u001a\u00030È\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001*\u0005\bÍ\u0001\u0010Y\"3\u0010Ï\u0001\u001a\u00020\u001e*\u00020\n2\u0006\u0010U\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÏ\u0001\u0010n\"\u0005\bÐ\u0001\u0010p*\u0005\bÑ\u0001\u0010Y\"3\u0010Õ\u0001\u001a\u00020\u0016*\u00020\n2\u0006\u0010U\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÒ\u0001\u0010h\"\u0005\bÓ\u0001\u0010j*\u0005\bÔ\u0001\u0010Y\"E\u0010Ý\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Ö\u0001*\u00020\n2\u000e\u0010U\u001a\n\u0012\u0005\u0012\u00030×\u00010Ö\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001*\u0005\bÜ\u0001\u0010Y\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Þ\u0001"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", c.f62177j, "(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function2;", "mergePolicy", "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "qie", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "U", "gh", "bzg", "description", "HI", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "S", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function1;)V", "B", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", FileUploadManager.f61572j, "Z", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "g", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "E2", "", "Lkotlin/ParameterName;", "x", "y", "p5", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/coroutines/Continuation;", "E", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function2;)V", "M", "Landroidx/compose/ui/text/AnnotatedString;", "ViF", "xg", "Rl", "HV", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "t", "WPU", "Landroidx/compose/ui/text/input/ImeAction;", "imeActionType", "iF", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "G7", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "Uo", "xMQ", "Xw", "ck", "O", "az", "P5", "v", "X", "N", "s7N", "r", "value", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "I", "contentDescription", "<set-?>", "getStateDescription", "ul", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ofS", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "eTf", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "ijL", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "dR0", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getFocused$delegate", "focused", "isContainer", "D", "isContainer$annotations", "isContainer$delegate", "isTraversalGroup", "EWS", "isTraversalGroup$delegate", "Landroidx/compose/ui/autofill/ContentType;", "getContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", "GR", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentType;)V", "getContentType$delegate", "contentType", "Landroidx/compose/ui/autofill/ContentDataType;", "getContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentDataType;)V", "getContentDataType$delegate", "contentDataType", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "hRu", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "getTraversalIndex$delegate", "traversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "z", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "UhV", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "C", "getRole$delegate", "role", "getTestTag", "n1", "getTestTag$delegate", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "Jk", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getTextSubstitution", "Org", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "eWT", "isShowingTextSubstitution$delegate", "getInputText", "piY", "getInputText$delegate", "inputText", "getEditableText", "k", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "mYa", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "getSelected", "Mx", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "J", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "Po6", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "isEditable", "Y", "isEditable$delegate", "getMaxTextLength", "m", "getMaxTextLength$delegate", "maxTextLength", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "Nxk", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsPropertiesKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f33297n = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        semanticsProperties.e();
        semanticsProperties.te();
        semanticsProperties.nY();
        semanticsProperties.aYN();
        semanticsProperties.xMQ();
        semanticsProperties.Ik();
        semanticsProperties.S();
        semanticsProperties.O();
        semanticsProperties.t();
        semanticsProperties.wTp();
        semanticsProperties.qie();
        semanticsProperties.v();
        semanticsProperties.iF();
        semanticsProperties.X();
        semanticsProperties.nHg();
        semanticsProperties.XQ();
        semanticsProperties.HI();
        semanticsProperties.Uo();
        semanticsProperties.N();
        semanticsProperties.az();
        semanticsProperties.E2();
        semanticsProperties.n();
        semanticsProperties.rl();
        semanticsProperties.s7N();
        semanticsProperties.o();
        semanticsProperties.ViF();
        SemanticsActions.f33251n.nr();
    }

    public static final void B(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.fD(), Unit.INSTANCE);
    }

    public static final void C(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.f33276n.iF().nr(semanticsPropertyReceiver, f33297n[12], Role.mUb(i2));
    }

    public static final void D(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f33276n.Ik().nr(semanticsPropertyReceiver, f33297n[5], Boolean.valueOf(z2));
    }

    public static final void E(SemanticsPropertyReceiver semanticsPropertyReceiver, Function2 function2) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.S(), function2);
    }

    public static final void E2(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.ty(), new AccessibilityAction(str, function0));
    }

    public static final void EWS(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f33276n.S().nr(semanticsPropertyReceiver, f33297n[6], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void FX(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        M(semanticsPropertyReceiver, str, function1);
    }

    public static final void G7(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.ViF(), new AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void GD(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        HV(semanticsPropertyReceiver, str, function1);
    }

    public static final void GR(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentType contentType) {
        SemanticsProperties.f33276n.O().nr(semanticsPropertyReceiver, f33297n[7], contentType);
    }

    public static final void HI(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.KN(), str);
    }

    public static final void HV(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.g(), new AccessibilityAction(str, function1));
    }

    public static final void I(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.nr(), CollectionsKt.listOf(str));
    }

    public static /* synthetic */ void Ik(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        ck(semanticsPropertyReceiver, str, function0);
    }

    public static final void J(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionInfo collectionInfo) {
        SemanticsProperties.f33276n.n().nr(semanticsPropertyReceiver, f33297n[21], collectionInfo);
    }

    public static /* synthetic */ void J2(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        O(semanticsPropertyReceiver, str, function0);
    }

    public static final void Jk(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.T(), CollectionsKt.listOf(annotatedString));
    }

    public static /* synthetic */ void K(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        i(semanticsPropertyReceiver, str, function1);
    }

    public static /* synthetic */ void KN(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        Uo(semanticsPropertyReceiver, str, function0);
    }

    public static final void M(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.WPU(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void M7(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        P5(semanticsPropertyReceiver, str, function0);
    }

    public static final void Mx(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f33276n.E2().nr(semanticsPropertyReceiver, f33297n[20], Boolean.valueOf(z2));
    }

    public static final void N(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.ck(), new AccessibilityAction(str, function0));
    }

    public static final void Nxk(SemanticsPropertyReceiver semanticsPropertyReceiver, List list) {
        SemanticsActions.f33251n.nr().nr(semanticsPropertyReceiver, f33297n[26], list);
    }

    public static final void O(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.rl(), new AccessibilityAction(str, function0));
    }

    public static final void Org(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.f33276n.nHg().nr(semanticsPropertyReceiver, f33297n[14], annotatedString);
    }

    public static final void P5(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.Z(), new AccessibilityAction(str, function0));
    }

    public static final void Po6(SemanticsPropertyReceiver semanticsPropertyReceiver, ToggleableState toggleableState) {
        SemanticsProperties.f33276n.s7N().nr(semanticsPropertyReceiver, f33297n[23], toggleableState);
    }

    public static final void Rl(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.nY(), new AccessibilityAction(str, function1));
    }

    public static final void S(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.ty(), function1);
    }

    public static /* synthetic */ void T(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        X(semanticsPropertyReceiver, str, function0);
    }

    public static final void U(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.Z(), Unit.INSTANCE);
    }

    public static final void UhV(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.f33276n.v().nr(semanticsPropertyReceiver, f33297n[11], scrollAxisRange);
    }

    public static final void Uo(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.t(), new AccessibilityAction(str, function0));
    }

    public static final void ViF(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.gh(), new AccessibilityAction(str, function1));
    }

    public static final void WPU(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.mUb(), new AccessibilityAction(str, function1));
    }

    public static final void X(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.HI(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void XQ(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        Z(semanticsPropertyReceiver, str, function1);
    }

    public static final void Xw(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.o(), new AccessibilityAction(str, function0));
    }

    public static final void Y(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f33276n.o().nr(semanticsPropertyReceiver, f33297n[24], Boolean.valueOf(z2));
    }

    public static final void Z(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.xMQ(), new AccessibilityAction(str, function1));
    }

    public static final void a(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentDataType contentDataType) {
        SemanticsProperties.f33276n.t().nr(semanticsPropertyReceiver, f33297n[8], contentDataType);
    }

    public static /* synthetic */ void aYN(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        WPU(semanticsPropertyReceiver, str, function1);
    }

    public static final void az(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.J2(), new AccessibilityAction(str, function0));
    }

    public static final void bzg(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.g(), Unit.INSTANCE);
    }

    public static final void ck(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.Uo(), new AccessibilityAction(str, function0));
    }

    public static final void dR0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f33276n.xMQ().nr(semanticsPropertyReceiver, f33297n[4], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void e(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        E2(semanticsPropertyReceiver, str, function0);
    }

    public static /* synthetic */ void eF(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        p5(semanticsPropertyReceiver, str, function2);
    }

    public static final void eTf(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.f33276n.nY().nr(semanticsPropertyReceiver, f33297n[2], str);
    }

    public static final void eWT(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f33276n.XQ().nr(semanticsPropertyReceiver, f33297n[15], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void fD(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, String str, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        iF(semanticsPropertyReceiver, i2, str, function0);
    }

    public static /* synthetic */ void fcU(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        G7(semanticsPropertyReceiver, str, function3);
    }

    public static final void g(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.qie(), new AccessibilityAction(str, function0));
    }

    public static final void gh(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.r(), Unit.INSTANCE);
    }

    public static final void hRu(SemanticsPropertyReceiver semanticsPropertyReceiver, float f3) {
        SemanticsProperties.f33276n.wTp().nr(semanticsPropertyReceiver, f33297n[9], Float.valueOf(f3));
    }

    public static final void i(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.te(), new AccessibilityAction(str, function1));
    }

    public static final void iF(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.az(), ImeAction.mUb(i2));
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.az(), new AccessibilityAction(str, function0));
    }

    public static final void ijL(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.f33276n.aYN().nr(semanticsPropertyReceiver, f33297n[3], LiveRegionMode.t(i2));
    }

    public static /* synthetic */ void jB(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        Xw(semanticsPropertyReceiver, str, function0);
    }

    public static final void k(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.f33276n.Uo().nr(semanticsPropertyReceiver, f33297n[17], annotatedString);
    }

    public static final void m(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.f33276n.ViF().nr(semanticsPropertyReceiver, f33297n[25], Integer.valueOf(i2));
    }

    public static /* synthetic */ void mUb(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        xMQ(semanticsPropertyReceiver, str, function0);
    }

    public static final void mYa(SemanticsPropertyReceiver semanticsPropertyReceiver, long j2) {
        SemanticsProperties.f33276n.N().nr(semanticsPropertyReceiver, f33297n[18], TextRange.rl(j2));
    }

    public static final SemanticsPropertyKey n(String str) {
        return new SemanticsPropertyKey(str, true);
    }

    public static final void n1(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.f33276n.X().nr(semanticsPropertyReceiver, f33297n[13], str);
    }

    public static /* synthetic */ void nHg(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        N(semanticsPropertyReceiver, str, function0);
    }

    public static /* synthetic */ void nY(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        ViF(semanticsPropertyReceiver, str, function1);
    }

    public static /* synthetic */ void nr(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        t(semanticsPropertyReceiver, str, function0);
    }

    public static /* synthetic */ void o(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        r(semanticsPropertyReceiver, str, function0);
    }

    public static final void ofS(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.f33276n.te().nr(semanticsPropertyReceiver, f33297n[1], progressBarRangeInfo);
    }

    public static final void p5(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.XQ(), new AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void pJg(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        xg(semanticsPropertyReceiver, str, function1);
    }

    public static final void piY(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.f33276n.HI().nr(semanticsPropertyReceiver, f33297n[16], annotatedString);
    }

    public static final void qie(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.t(SemanticsProperties.f33276n.J2(), Unit.INSTANCE);
    }

    public static /* synthetic */ void qm(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        Rl(semanticsPropertyReceiver, str, function1);
    }

    public static final void r(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, final Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.KN(), new AccessibilityAction(str, new Function1<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                boolean z2;
                Float f3 = (Float) function0.invoke();
                if (f3 == null) {
                    z2 = false;
                } else {
                    list.add(f3);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }));
    }

    public static /* synthetic */ void rV9(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        v(semanticsPropertyReceiver, str, function0);
    }

    public static final SemanticsPropertyKey rl(String str, Function2 function2) {
        return new SemanticsPropertyKey(str, true, function2);
    }

    public static final void s7N(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.Ik(), new AccessibilityAction(str, function0));
    }

    public static final void t(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.n(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void te(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        g(semanticsPropertyReceiver, str, function0);
    }

    public static /* synthetic */ void ty(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        az(semanticsPropertyReceiver, str, function0);
    }

    public static final void ul(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.f33276n.e().nr(semanticsPropertyReceiver, f33297n[0], str);
    }

    public static final void v(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.r(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void wTp(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        s7N(semanticsPropertyReceiver, str, function0);
    }

    public static final void xMQ(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.O(), new AccessibilityAction(str, function0));
    }

    public static final void xg(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.t(SemanticsActions.f33251n.aYN(), new AccessibilityAction(str, function1));
    }

    public static final void z(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.f33276n.qie().nr(semanticsPropertyReceiver, f33297n[10], scrollAxisRange);
    }
}
