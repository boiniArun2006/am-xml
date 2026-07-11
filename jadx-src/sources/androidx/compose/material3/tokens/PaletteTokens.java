package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bÁ\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u001a\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010 \u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u001d\u0010,\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010.\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u001d\u00102\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u00104\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b!\u0010\bR\u001d\u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b#\u0010\bR\u001d\u00108\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b%\u0010\bR\u001d\u0010:\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b+\u0010\bR\u001d\u0010>\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b-\u0010\bR\u001d\u0010@\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b/\u0010\bR\u001d\u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\b1\u0010\bR\u001d\u0010D\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\b3\u0010\bR\u001d\u0010F\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\b5\u0010\bR\u001d\u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\b7\u0010\bR\u001d\u0010J\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\b9\u0010\bR\u001d\u0010L\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\b;\u0010\bR\u001d\u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\b=\u0010\bR\u001d\u0010P\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\b?\u0010\bR\u001d\u0010R\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bA\u0010\bR\u001d\u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bC\u0010\bR\u001d\u0010V\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bE\u0010\bR\u001d\u0010X\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bG\u0010\bR\u001d\u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bI\u0010\bR\u001d\u0010\\\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\bK\u0010\bR\u001d\u0010^\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\bM\u0010\bR\u001d\u0010`\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\bO\u0010\bR\u001d\u0010b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bQ\u0010\bR\u001d\u0010d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bS\u0010\bR\u001d\u0010f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bU\u0010\bR\u001d\u0010h\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bW\u0010\bR\u001d\u0010j\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bY\u0010\bR\u001d\u0010l\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\b[\u0010\bR\u001d\u0010n\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\b]\u0010\bR\u001d\u0010p\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\b_\u0010\bR\u001d\u0010r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\ba\u0010\bR\u001d\u0010t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bc\u0010\bR\u001d\u0010u\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\be\u0010\bR\u001d\u0010w\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\bg\u0010\bR\u001d\u0010y\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\bi\u0010\bR\u001d\u0010{\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bz\u0010\u0006\u001a\u0004\bk\u0010\bR\u001d\u0010}\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b|\u0010\u0006\u001a\u0004\bm\u0010\bR\u001d\u0010\u007f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b~\u0010\u0006\u001a\u0004\bo\u0010\bR\u001f\u0010\u0081\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0004\bq\u0010\bR\u001f\u0010\u0083\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0082\u0001\u0010\u0006\u001a\u0004\bs\u0010\bR\u001f\u0010\u0085\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0004\b\u0006\u0010\bR\u001f\u0010\u0087\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0086\u0001\u0010\u0006\u001a\u0004\bv\u0010\bR\u001f\u0010\u0089\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0088\u0001\u0010\u0006\u001a\u0004\bx\u0010\bR\u001f\u0010\u008b\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0004\bz\u0010\bR\u001f\u0010\u008d\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0004\b|\u0010\bR\u001f\u0010\u008f\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0004\b~\u0010\bR \u0010\u0091\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR \u0010\u0093\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR \u0010\u0095\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR \u0010\u0097\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR \u0010\u0099\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR \u0010\u009b\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR \u0010\u009d\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR \u0010\u009f\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR \u0010¡\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b \u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR \u0010£\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR \u0010¥\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR \u0010§\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR \u0010©\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR \u0010«\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR \u0010\u00ad\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR \u0010¯\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b®\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR \u0010±\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b°\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR \u0010³\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR \u0010µ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b´\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR \u0010·\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¶\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR \u0010¹\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\bR \u0010»\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bº\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\bR \u0010½\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR \u0010¿\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR \u0010Á\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÀ\u0001\u0010\u0006\u001a\u0005\b°\u0001\u0010\bR \u0010Ä\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0006\u001a\u0005\bÃ\u0001\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Å\u0001"}, d2 = {"Landroidx/compose/material3/tokens/PaletteTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "rl", "J", "getBlack-0d7_KjU", "()J", "Black", "t", "getError0-0d7_KjU", "Error0", "nr", c.f62177j, "Error10", "O", "Error100", "J2", "Error20", "Uo", "Error30", "KN", "Error40", "xMQ", "getError50-0d7_KjU", "Error50", "mUb", "getError60-0d7_KjU", "Error60", "gh", "getError70-0d7_KjU", "Error70", "qie", "Error80", "az", "Error90", "ty", "getError95-0d7_KjU", "Error95", "HI", "getError99-0d7_KjU", "Error99", "ck", "Neutral0", "Ik", "Neutral10", "r", "Neutral100", "o", "Neutral12", "Z", "Neutral17", "XQ", "Neutral20", "S", "Neutral22", "WPU", "Neutral24", "aYN", "Neutral30", "ViF", "Neutral4", "nY", "Neutral40", "g", "Neutral50", "te", "Neutral6", "iF", "Neutral60", "fD", "Neutral70", "E2", "Neutral80", "e", "Neutral87", "X", "Neutral90", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Neutral92", "N", "Neutral94", "nHg", "Neutral95", "s7N", "Neutral96", "wTp", "Neutral98", "v", "Neutral99", "rV9", "NeutralVariant0", "bzg", "NeutralVariant10", "Xw", "NeutralVariant100", "jB", "NeutralVariant20", "U", "NeutralVariant30", "P5", "NeutralVariant40", "M7", "NeutralVariant50", "p5", "NeutralVariant60", "eF", "NeutralVariant70", "E", "NeutralVariant80", "M", "NeutralVariant90", "FX", "NeutralVariant95", "B", "NeutralVariant99", "Primary0", "D", "Primary10", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Primary100", "I", "Primary20", "GR", "Primary30", "Nxk", "Primary40", "Y", "Primary50", "k", "Primary60", "dR0", "Primary70", "z", "Primary80", "piY", "Primary90", "ijL", "Primary95", "m", "Primary99", "eTf", "Secondary0", "xg", "Secondary10", "pJg", "Secondary100", "ofS", "Secondary20", "C", "Secondary30", "Mx", "Secondary40", "G7", "Secondary50", "fcU", "Secondary60", "eWT", "Secondary70", "ul", "Secondary80", "n1", "Secondary90", "Jk", "Secondary95", "Rl", "Secondary99", "qm", "Tertiary0", "mYa", "Tertiary10", "Org", "Tertiary100", "HV", "Tertiary20", "GD", "Tertiary30", "Po6", "Tertiary40", "EWS", "Tertiary50", "hRu", "Tertiary60", "UhV", "Tertiary70", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "Tertiary80", "K", "Tertiary90", "How", "Tertiary95", "tUK", "Tertiary99", "ER", "getWhite-0d7_KjU", "White", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaletteTokens {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PaletteTokens f29825n = new PaletteTokens();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final long Black = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long Error0 = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final long Error10 = ColorKt.O(65, 14, 11, 0, 8, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final long Error100 = ColorKt.O(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final long Error20 = ColorKt.O(96, 20, 16, 0, 8, null);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final long Error30 = ColorKt.O(140, 29, 24, 0, 8, null);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final long Error40 = ColorKt.O(179, 38, 30, 0, 8, null);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final long Error50 = ColorKt.O(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 54, 46, 0, 8, null);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final long Error60 = ColorKt.O(228, 105, 98, 0, 8, null);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final long Error70 = ColorKt.O(236, 146, 142, 0, 8, null);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final long Error80 = ColorKt.O(242, 184, 181, 0, 8, null);

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final long Error90 = ColorKt.O(249, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final long Error95 = ColorKt.O(252, 238, 238, 0, 8, null);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final long Error99 = ColorKt.O(255, 251, 249, 0, 8, null);

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final long Neutral0 = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final long Neutral10 = ColorKt.O(29, 27, 32, 0, 8, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral100 = ColorKt.O(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral12 = ColorKt.O(33, 31, 38, 0, 8, null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral17 = ColorKt.O(43, 41, 48, 0, 8, null);

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final long Neutral20 = ColorKt.O(50, 47, 53, 0, 8, null);

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral22 = ColorKt.O(54, 52, 59, 0, 8, null);

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final long Neutral24 = ColorKt.O(59, 56, 62, 0, 8, null);

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final long Neutral30 = ColorKt.O(72, 70, 76, 0, 8, null);

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final long Neutral4 = ColorKt.O(15, 13, 19, 0, 8, null);

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final long Neutral40 = ColorKt.O(96, 93, 100, 0, 8, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral50 = ColorKt.O(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private static final long Neutral6 = ColorKt.O(20, 18, 24, 0, 8, null);

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private static final long Neutral60 = ColorKt.O(147, 143, 150, 0, 8, null);

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private static final long Neutral70 = ColorKt.O(174, 169, 177, 0, 8, null);

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private static final long Neutral80 = ColorKt.O(Sdk.SDKError.Reason.AD_CONSUMED_VALUE, 197, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral87 = ColorKt.O(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral90 = ColorKt.O(230, 224, 233, 0, 8, null);

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral92 = ColorKt.O(236, 230, 240, 0, 8, null);

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral94 = ColorKt.O(243, 237, 247, 0, 8, null);

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private static final long Neutral95 = ColorKt.O(245, 239, 247, 0, 8, null);

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private static final long Neutral96 = ColorKt.O(247, 242, 250, 0, 8, null);

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private static final long Neutral98 = ColorKt.O(254, 247, 255, 0, 8, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral99 = ColorKt.O(255, 251, 255, 0, 8, null);

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private static final long NeutralVariant0 = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private static final long NeutralVariant10 = ColorKt.O(29, 26, 34, 0, 8, null);

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private static final long NeutralVariant100 = ColorKt.O(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private static final long NeutralVariant20 = ColorKt.O(50, 47, 55, 0, 8, null);

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant30 = ColorKt.O(73, 69, 79, 0, 8, null);

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private static final long NeutralVariant40 = ColorKt.O(96, 93, 102, 0, 8, null);

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private static final long NeutralVariant50 = ColorKt.O(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 116, 126, 0, 8, null);

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private static final long NeutralVariant60 = ColorKt.O(147, 143, 153, 0, 8, null);

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private static final long NeutralVariant70 = ColorKt.O(174, 169, 180, 0, 8, null);

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant80 = ColorKt.O(Sdk.SDKError.Reason.AD_CONSUMED_VALUE, 196, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant90 = ColorKt.O(231, 224, 236, 0, 8, null);

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant95 = ColorKt.O(245, 238, 250, 0, 8, null);

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant99 = ColorKt.O(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final long Primary0 = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final long Primary10 = ColorKt.O(33, 0, 93, 0, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final long Primary100 = ColorKt.O(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final long Primary20 = ColorKt.O(56, 30, 114, 0, 8, null);

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private static final long Primary30 = ColorKt.O(79, 55, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 0, 8, null);

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private static final long Primary40 = ColorKt.O(103, 80, 164, 0, 8, null);

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private static final long Primary50 = ColorKt.O(127, 103, 190, 0, 8, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long Primary60 = ColorKt.O(154, 130, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private static final long Primary70 = ColorKt.O(182, 157, 248, 0, 8, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final long Primary80 = ColorKt.O(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 188, 255, 0, 8, null);

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private static final long Primary90 = ColorKt.O(234, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 255, 0, 8, null);

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private static final long Primary95 = ColorKt.O(246, 237, 255, 0, 8, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long Primary99 = ColorKt.O(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private static final long Secondary0 = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private static final long Secondary10 = ColorKt.O(29, 25, 43, 0, 8, null);

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private static final long Secondary100 = ColorKt.O(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    private static final long Secondary20 = ColorKt.O(51, 45, 65, 0, 8, null);

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary30 = ColorKt.O(74, 68, 88, 0, 8, null);

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    private static final long Secondary40 = ColorKt.O(98, 91, 113, 0, 8, null);

    /* JADX INFO: renamed from: G7, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary50 = ColorKt.O(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 114, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: fcU, reason: from kotlin metadata */
    private static final long Secondary60 = ColorKt.O(149, 141, 165, 0, 8, null);

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    private static final long Secondary70 = ColorKt.O(176, 167, 192, 0, 8, null);

    /* JADX INFO: renamed from: ul, reason: from kotlin metadata */
    private static final long Secondary80 = ColorKt.O(204, 194, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    private static final long Secondary90 = ColorKt.O(232, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 248, 0, 8, null);

    /* JADX INFO: renamed from: Jk, reason: from kotlin metadata */
    private static final long Secondary95 = ColorKt.O(246, 237, 255, 0, 8, null);

    /* JADX INFO: renamed from: Rl, reason: from kotlin metadata */
    private static final long Secondary99 = ColorKt.O(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: qm, reason: from kotlin metadata */
    private static final long Tertiary0 = ColorKt.O(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: mYa, reason: from kotlin metadata */
    private static final long Tertiary10 = ColorKt.O(49, 17, 29, 0, 8, null);

    /* JADX INFO: renamed from: Org, reason: from kotlin metadata */
    private static final long Tertiary100 = ColorKt.O(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: HV, reason: from kotlin metadata */
    private static final long Tertiary20 = ColorKt.O(73, 37, 50, 0, 8, null);

    /* JADX INFO: renamed from: GD, reason: from kotlin metadata */
    private static final long Tertiary30 = ColorKt.O(99, 59, 72, 0, 8, null);

    /* JADX INFO: renamed from: Po6, reason: from kotlin metadata */
    private static final long Tertiary40 = ColorKt.O(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 82, 96, 0, 8, null);

    /* JADX INFO: renamed from: EWS, reason: from kotlin metadata */
    private static final long Tertiary50 = ColorKt.O(ModuleDescriptor.MODULE_VERSION, 105, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 0, 8, null);

    /* JADX INFO: renamed from: hRu, reason: from kotlin metadata */
    private static final long Tertiary60 = ColorKt.O(181, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 146, 0, 8, null);

    /* JADX INFO: renamed from: UhV, reason: from kotlin metadata */
    private static final long Tertiary70 = ColorKt.O(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 157, 172, 0, 8, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary80 = ColorKt.O(239, 184, 200, 0, 8, null);

    /* JADX INFO: renamed from: K, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary90 = ColorKt.O(255, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 228, 0, 8, null);

    /* JADX INFO: renamed from: How, reason: from kotlin metadata */
    private static final long Tertiary95 = ColorKt.O(255, 236, 241, 0, 8, null);

    /* JADX INFO: renamed from: tUK, reason: from kotlin metadata */
    private static final long Tertiary99 = ColorKt.O(255, 251, 250, 0, 8, null);

    /* JADX INFO: renamed from: ER, reason: from kotlin metadata */
    private static final long White = ColorKt.O(255, 255, 255, 0, 8, null);

    public final long B() {
        return Primary60;
    }

    public final long C() {
        return Secondary99;
    }

    public final long D() {
        return Primary80;
    }

    public final long E() {
        return Primary30;
    }

    public final long E2() {
        return Neutral99;
    }

    public final long FX() {
        return Primary50;
    }

    public final long G7() {
        return Tertiary10;
    }

    public final long GD() {
        return Tertiary99;
    }

    public final long GR() {
        return Primary99;
    }

    public final long HI() {
        return Neutral24;
    }

    public final long HV() {
        return Tertiary95;
    }

    public final long I() {
        return Primary95;
    }

    public final long Ik() {
        return Neutral4;
    }

    public final long J() {
        return Primary70;
    }

    public final long J2() {
        return Error80;
    }

    public final long Jk() {
        return Tertiary50;
    }

    public final long KN() {
        return Neutral0;
    }

    public final long M() {
        return Primary40;
    }

    public final long M7() {
        return Primary10;
    }

    public final long Mx() {
        return Tertiary0;
    }

    public final long N() {
        return NeutralVariant20;
    }

    public final long Nxk() {
        return Secondary0;
    }

    public final long O() {
        return Error40;
    }

    public final long Org() {
        return Tertiary90;
    }

    public final long P5() {
        return Primary0;
    }

    public final long Rl() {
        return Tertiary60;
    }

    public final long S() {
        return Neutral70;
    }

    public final long T() {
        return NeutralVariant100;
    }

    public final long U() {
        return NeutralVariant99;
    }

    public final long Uo() {
        return Error90;
    }

    public final long ViF() {
        return Neutral90;
    }

    public final long WPU() {
        return Neutral80;
    }

    public final long X() {
        return NeutralVariant10;
    }

    public final long XQ() {
        return Neutral60;
    }

    public final long Xw() {
        return NeutralVariant90;
    }

    public final long Y() {
        return Secondary10;
    }

    public final long Z() {
        return Neutral6;
    }

    public final long a() {
        return Primary90;
    }

    public final long aYN() {
        return Neutral87;
    }

    public final long az() {
        return Neutral20;
    }

    public final long bzg() {
        return NeutralVariant80;
    }

    public final long ck() {
        return Neutral30;
    }

    public final long dR0() {
        return Secondary20;
    }

    public final long e() {
        return NeutralVariant0;
    }

    public final long eF() {
        return Primary20;
    }

    public final long eTf() {
        return Secondary70;
    }

    public final long eWT() {
        return Tertiary20;
    }

    public final long fD() {
        return Neutral98;
    }

    public final long fcU() {
        return Tertiary100;
    }

    public final long g() {
        return Neutral94;
    }

    public final long gh() {
        return Neutral12;
    }

    public final long iF() {
        return Neutral96;
    }

    public final long ijL() {
        return Secondary50;
    }

    public final long jB() {
        return NeutralVariant95;
    }

    public final long k() {
        return Secondary100;
    }

    public final long m() {
        return Secondary60;
    }

    public final long mUb() {
        return Neutral100;
    }

    public final long mYa() {
        return Tertiary80;
    }

    public final long n() {
        return Error10;
    }

    public final long n1() {
        return Tertiary40;
    }

    public final long nHg() {
        return NeutralVariant30;
    }

    public final long nY() {
        return Neutral92;
    }

    public final long nr() {
        return Error30;
    }

    public final long o() {
        return Neutral50;
    }

    public final long ofS() {
        return Secondary95;
    }

    public final long p5() {
        return Primary100;
    }

    public final long pJg() {
        return Secondary90;
    }

    public final long piY() {
        return Secondary40;
    }

    public final long qie() {
        return Neutral17;
    }

    public final long qm() {
        return Tertiary70;
    }

    public final long r() {
        return Neutral40;
    }

    public final long rV9() {
        return NeutralVariant70;
    }

    public final long rl() {
        return Error100;
    }

    public final long s7N() {
        return NeutralVariant40;
    }

    public final long t() {
        return Error20;
    }

    public final long te() {
        return Neutral95;
    }

    public final long ty() {
        return Neutral22;
    }

    public final long ul() {
        return Tertiary30;
    }

    public final long v() {
        return NeutralVariant60;
    }

    public final long wTp() {
        return NeutralVariant50;
    }

    public final long xMQ() {
        return Neutral10;
    }

    public final long xg() {
        return Secondary80;
    }

    public final long z() {
        return Secondary30;
    }

    private PaletteTokens() {
    }
}
