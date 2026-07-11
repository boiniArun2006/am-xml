package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventParameters;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bU\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 ÿ\u00012\u00020\u0001:\u0002\u0080\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0019J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010&J!\u00107\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010*JG\u0010A\u001a\u00020\f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2&\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010&J\u0017\u0010F\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010K\u001a\u00020\t*\u00020J2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010GJ\u001b\u0010O\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010LJ\u001b\u0010P\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010LJ#\u0010Q\u001a\u00020\u000f*\u00020J2\u0006\u0010N\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010LJ\u001b\u0010T\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010LJ/\u0010W\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ'\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b^\u0010GJ\u0015\u0010_\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b_\u0010\u0014J\u0015\u0010`\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b`\u0010GJ\u0015\u0010a\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\ba\u0010GJ\u0017\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bd\u0010GJ\u0017\u0010e\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\be\u0010cJ\u0015\u0010f\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bf\u0010\u0014J\u0015\u0010g\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bg\u0010\u0014J\u001d\u0010h\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\bh\u00102J\u0017\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bi\u0010cJ\u0017\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bl\u0010GJ\u0015\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\f¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0017J\u0019\u0010q\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bq\u0010\bJ\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010sJ\u0015\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\t¢\u0006\u0004\bu\u0010\u0019J\u0017\u0010v\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u000f¢\u0006\u0004\bx\u0010\u0017J\u0017\u0010y\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\by\u0010wJ\u001f\u0010z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bz\u0010sJ\u0017\u0010{\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b{\u0010wJ\u001d\u0010|\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b|\u0010]J)\u0010}\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u007f\u001a\u00020\t¢\u0006\u0005\b\u0080\u0001\u0010cJ\u0012\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0085\u0001\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0088\u0001\u0010GJ\u001a\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0089\u0001\u0010GJ\u001a\u0010\u008a\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u008a\u0001\u0010GJ\u0018\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\t¢\u0006\u0005\b\u008c\u0001\u0010\u0019J\u000f\u0010\u008d\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008d\u0001\u0010\u0017J\u000f\u0010\u008e\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008e\u0001\u0010\u0017J\u000f\u0010\u008f\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008f\u0001\u0010\u0017J\u000f\u0010\u0090\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0090\u0001\u0010\u0017J\"\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0092\u0001\u00108J!\u0010\u0093\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0093\u0001\u00108J,\u0010\u0094\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0005\b\u0096\u0001\u0010!J\u0017\u0010\u0097\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0005\b\u0097\u0001\u0010\u0019J\u0018\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\t¢\u0006\u0005\b\u009a\u0001\u0010!J\u0010\u0010\u009b\u0001\u001a\u00020\f¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0018\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0005\b\u009e\u0001\u0010\u0019J1\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010Y\u001a\u00020>2\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J2\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t2\t\b\u0002\u0010£\u0001\u001a\u00020\f¢\u0006\u0006\b¤\u0001\u0010¥\u0001J0\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010¨\u0001\u001a\u00020>2\b\b\u0002\u0010'\u001a\u00020\t¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010ª\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0005\bª\u0001\u0010\u0019J\u0018\u0010«\u0001\u001a\u00020\t2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010°\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b°\u0001\u0010©\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\"\u0010»\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R+\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020>0¼\u0001j\t\u0012\u0004\u0012\u00020>`½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R8\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R#\u0010Ç\u0001\u001a\f\u0012\u0005\u0012\u00030Ä\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ê\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ì\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010É\u0001R\u0019\u0010Î\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010É\u0001R\u0019\u0010Ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010É\u0001R\u0019\u0010Ò\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010É\u0001R\u0019\u0010Ô\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010É\u0001R\u0019\u0010Ö\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010É\u0001R\u0019\u0010Ø\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010É\u0001R\u0019\u0010Ú\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010É\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010à\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010Ý\u0001R+\u0010å\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010ã\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010Æ\u0001R)\u0010é\u0001\u001a\u00020\t2\u0007\u0010æ\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bç\u0001\u0010É\u0001\u001a\u0005\bè\u0001\u0010!R)\u0010ë\u0001\u001a\u00020\t2\u0007\u0010æ\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bê\u0001\u0010É\u0001\u001a\u0005\bÉ\u0001\u0010!R(\u0010\"\u001a\u00020\t2\u0007\u0010æ\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bì\u0001\u0010É\u0001\u001a\u0005\bí\u0001\u0010!R*\u0010ð\u0001\u001a\u00020\f2\u0007\u0010æ\u0001\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bî\u0001\u0010ç\u0001\u001a\u0006\bï\u0001\u0010\u009c\u0001R!\u0010ó\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0015\u0010V\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010!R\u0014\u0010ö\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bõ\u0001\u0010\u009c\u0001R\u0013\u0010ø\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b÷\u0001\u0010!R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bù\u0001\u0010\u009c\u0001R\u0014\u0010û\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bú\u0001\u0010\u009c\u0001R\u0014\u0010ý\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bü\u0001\u0010\u009c\u0001R\u0015\u0010,\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0002"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "value", "tUK", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "key", "objectKey", "", "isNode", "aux", "", "EF", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "rV9", "(I)Z", "v", "ER", "()V", "v0j", "(I)V", "Landroidx/compose/runtime/PrioritySet;", "set", "o9", "(ILandroidx/collection/MutableIntList;)V", "N", "QZ6", "F", "()I", "parent", "endGroup", "firstChild", "M", "(III)V", "index", "qm", "Org", "(II)V", "s7N", "size", "ofS", "C", TtmlNode.START, "len", "W", "(II)Z", "Landroidx/compose/runtime/GroupSourceInformation;", "X4T", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "RQ", "Lp6", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "nO", "gapStart", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "lLA", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "n1", "z", "(I)I", "dataIndex", "U", "", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "([II)I", "Xw", SafeDKWebAppInterface.f62924j, "jB", InneractiveMediationDefs.GENDER_FEMALE, "n7b", "([III)V", "hRu", "X", "gapLen", "capacity", "P5", "(IIII)I", "anchor", "bzg", "(III)I", "How", "(II)I", "K", "fcU", "EWS", "piY", "ijL", "(I)Ljava/lang/Object;", "m", "dR0", "pJg", "eTf", "xg", "GD", "Po6", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "UhV", "normalClose", "wTp", "(Z)V", "a63", "Zn", "e", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", JavetError.PARAMETER_COUNT, "Vvq", "vl", "(Ljava/lang/Object;)V", "g6", CmcdData.STREAMING_FORMAT_SS, "Aum", "VwL", "ub", "tFV", "(IILjava/lang/Object;)Ljava/lang/Object;", "slotIndex", "nHg", "mI", "()Ljava/lang/Object;", "Uf", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "p0N", "(II)Ljava/lang/Object;", "UF", "HBN", "Qu", AppLovinEventParameters.REVENUE_AMOUNT, "iF", "Bu", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "p5", "JVN", "dataKey", "xVH", "uG", "Zmq", "(ILjava/lang/Object;Ljava/lang/Object;)V", "M7", "eF", "E", "(Landroidx/compose/runtime/Anchor;)V", "T3L", "kSg", "()Z", "offset", "Rl", "writer", "", "HV", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "Jk", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "mYa", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "fD", "(I)Landroidx/compose/runtime/Anchor;", "eWT", "E2", "(Landroidx/compose/runtime/Anchor;)I", "", "toString", "()Ljava/lang/String;", "y", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "k", "()Landroidx/compose/runtime/SlotTable;", "rl", "[I", "groups", "", "t", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "nr", "Ljava/util/ArrayList;", "anchors", "O", "Ljava/util/HashMap;", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "J2", "Landroidx/collection/MutableIntObjectMap;", "calledByMap", "Uo", "I", "groupGapStart", "KN", "groupGapLen", "xMQ", "currentSlot", "mUb", "currentSlotEnd", "gh", "slotsGapStart", "qie", "slotsGapLen", "az", "slotsGapOwner", "ty", "insertCount", "HI", "nodeCount", "Landroidx/compose/runtime/IntStack;", "ck", "Landroidx/compose/runtime/IntStack;", "startStack", "Ik", "endStack", "r", "nodeCountStack", "Landroidx/collection/MutableObjectList;", "o", "deferredSlotWrites", "<set-?>", "Z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "currentGroup", "XQ", "currentGroupEnd", "S", "GR", "WPU", "B", "closed", "aYN", "Landroidx/collection/MutableIntList;", "pendingRecalculateMarks", "FX", "Mx", "isGroupEnd", "Y", "slotsSize", "G7", "D", "collectingSourceInformation", "J", "collectingCalledInformation", "Nxk", "ViF", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n+ 10 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 11 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3666#2:3964\n3666#2:3965\n3732#2:3966\n3726#2:3967\n3672#2:3968\n3681#2:3969\n3666#2:3970\n3681#2:3997\n3681#2:4008\n3732#2:4067\n3666#2:4068\n3732#2:4080\n3732#2:4081\n3666#2:4082\n3666#2:4093\n3732#2:4094\n3666#2:4146\n3732#2:4147\n3825#2,6:4182\n3689#2:4188\n3698#2:4189\n3698#2:4190\n3708#2:4191\n3698#2:4192\n3708#2:4193\n3749#2,2:4194\n3746#2:4202\n3749#2,2:4203\n3777#2:4209\n3780#2,2:4215\n3777#2:4217\n3780#2,2:4223\n3780#2,2:4225\n3666#2:4231\n3746#2:4243\n3726#2:4244\n3732#2:4245\n3777#2:4246\n3746#2:4247\n3666#2:4248\n3777#2:4249\n3746#2:4265\n3746#2:4271\n3746#2:4282\n3777#2:4283\n3780#2,2:4284\n3663#2:4286\n3723#2:4287\n82#3:3971\n53#3:4056\n4643#4,5:3972\n4643#4,5:3980\n4665#4:3985\n4643#4,5:3986\n4665#4:3991\n4643#4,5:3992\n4643#4,5:3998\n4643#4,5:4003\n4643#4,5:4009\n4643#4,5:4026\n4643#4,5:4031\n4643#4,5:4036\n4643#4,5:4046\n4643#4,5:4057\n4643#4,5:4062\n4643#4,5:4075\n4643#4,5:4083\n4643#4,5:4088\n4643#4,5:4095\n4643#4,5:4100\n4643#4,5:4105\n4643#4,5:4110\n4643#4,5:4117\n4665#4:4122\n4643#4,5:4123\n4665#4:4128\n4643#4,5:4129\n4665#4:4134\n4643#4,5:4135\n4665#4:4140\n4643#4,5:4141\n4665#4:4148\n4643#4,5:4149\n4665#4:4154\n4643#4,5:4155\n4665#4:4168\n4643#4,5:4169\n4665#4:4196\n4643#4,5:4197\n4643#4,5:4210\n4643#4,5:4218\n4643#4,5:4232\n1#5:3977\n1#5:3979\n1#5:4164\n1#5:4178\n679#6:3978\n48#7,5:4014\n48#7,5:4041\n48#7,5:4051\n48#7,5:4250\n48#7,5:4255\n48#7,5:4260\n48#7,5:4266\n48#7,5:4272\n48#7,5:4277\n372#8,7:4019\n287#9,6:4069\n27#10,2:4115\n27#10,2:4205\n27#10,2:4207\n27#10,2:4227\n27#10,2:4229\n174#11,4:4160\n179#11,3:4165\n174#11,4:4174\n179#11,3:4179\n33#12,6:4237\n81#12,3:4288\n33#12,6:4291\n84#12:4297\n222#12,3:4298\n63#12,6:4301\n225#12:4307\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1328#1:3964\n1339#1:3965\n1342#1:3966\n1345#1:3967\n1350#1:3968\n1359#1:3969\n1390#1:3970\n1511#1:3997\n1527#1:4008\n1869#1:4067\n1887#1:4068\n1909#1:4080\n1944#1:4081\n1947#1:4082\n1996#1:4093\n1996#1:4094\n2405#1:4146\n2407#1:4147\n2519#1:4182,6\n2525#1:4188\n2527#1:4189\n2535#1:4190\n2538#1:4191\n2561#1:4192\n2573#1:4193\n2611#1:4194,2\n2656#1:4202\n2660#1:4203,2\n2706#1:4209\n2710#1:4215,2\n2718#1:4217\n2722#1:4223,2\n2800#1:4225,2\n2916#1:4231\n3056#1:4243\n3058#1:4244\n3060#1:4245\n3062#1:4246\n3064#1:4247\n3065#1:4248\n3097#1:4249\n3122#1:4265\n3128#1:4271\n3157#1:4282\n3163#1:4283\n3170#1:4284,2\n3179#1:4286\n3179#1:4287\n1418#1:3971\n1751#1:4056\n1443#1:3972,5\n1477#1:3980,5\n1495#1:3985\n1495#1:3986,5\n1500#1:3991\n1500#1:3992,5\n1511#1:3998,5\n1524#1:4003,5\n1527#1:4009,5\n1606#1:4026,5\n1620#1:4031,5\n1710#1:4036,5\n1715#1:4046,5\n1751#1:4057,5\n1760#1:4062,5\n1906#1:4075,5\n1968#1:4083,5\n1973#1:4088,5\n2001#1:4095,5\n2057#1:4100,5\n2058#1:4105,5\n2069#1:4110,5\n2159#1:4117,5\n2378#1:4122\n2378#1:4123,5\n2379#1:4128\n2379#1:4129,5\n2380#1:4134\n2380#1:4135,5\n2383#1:4140\n2383#1:4141,5\n2412#1:4148\n2412#1:4149,5\n2428#1:4154\n2428#1:4155,5\n2498#1:4168\n2498#1:4169,5\n2654#1:4196\n2654#1:4197,5\n2707#1:4210,5\n2719#1:4218,5\n2916#1:4232,5\n1462#1:3979\n2464#1:4164\n2506#1:4178\n1462#1:3978\n1537#1:4014,5\n1711#1:4041,5\n1749#1:4051,5\n3099#1:4250,5\n3103#1:4255,5\n3107#1:4260,5\n3123#1:4266,5\n3131#1:4272,5\n3135#1:4277,5\n1577#1:4019,7\n1892#1:4069,6\n2126#1:4115,2\n2680#1:4205,2\n2688#1:4207,2\n2834#1:4227,2\n2840#1:4229,2\n2464#1:4160,4\n2464#1:4165,3\n2506#1:4174,4\n2506#1:4179,3\n3012#1:4237,6\n3189#1:4288,3\n3189#1:4291,6\n3189#1:4297\n3193#1:4298,3\n3193#1:4301,6\n3193#1:4307\n*E\n"})
public final class SlotWriter {

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int nY = 8;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private int nodeCount;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private MutableIntObjectMap calledByMap;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private int groupGapLen;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private HashMap sourceInformationMap;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int groupGapStart;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private int currentGroupEnd;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private MutableIntList pendingRecalculateMarks;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int slotsGapOwner;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int slotsGapStart;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private ArrayList anchors;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private MutableIntObjectMap deferredSlotWrites;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int slotsGapLen;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int[] groups;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private int insertCount;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final IntStack startStack = new IntStack();

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final IntStack endStack = new IntStack();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final IntStack nodeCountStack = new IntStack();

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Landroidx/compose/runtime/Anchor;", "rl", "(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n27#2,2:3964\n3749#3,2:3966\n3746#3:3969\n3749#3,2:3970\n3780#3,2:3972\n3666#3:3985\n3732#3:3986\n1#4:3968\n33#5,6:3974\n4643#6,5:3980\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2210#1:3964,2\n2220#1:3966,2\n2230#1:3969\n2231#1:3970,2\n2250#1:3972,2\n2353#1:3985\n2353#1:3986\n2289#1:3974,6\n2349#1:3980,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List rl(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zW;
            List listEmptyList;
            int iM = fromWriter.m(fromIndex);
            int i2 = fromIndex + iM;
            int iXw = fromWriter.Xw(fromIndex);
            int iXw2 = fromWriter.Xw(i2);
            int i3 = iXw2 - iXw;
            boolean zV2 = fromWriter.v(fromIndex);
            toWriter.ofS(iM);
            toWriter.C(i3, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i2) {
                fromWriter.qm(i2);
            }
            if (fromWriter.slotsGapStart < iXw2) {
                fromWriter.Org(iXw2, i2);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i5 = currentGroup * 5;
            ArraysKt.copyInto(fromWriter.groups, iArr, i5, fromIndex * 5, i2 * 5);
            Object[] objArr = toWriter.slots;
            int i7 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iXw, objArr, i7, i3);
            int parent = toWriter.getParent();
            iArr[i5 + 2] = parent;
            int i8 = currentGroup - fromIndex;
            int i9 = currentGroup + iM;
            int iJB = i7 - toWriter.jB(iArr, currentGroup);
            int i10 = toWriter.slotsGapOwner;
            int i11 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i12 = i10;
            int i13 = currentGroup;
            while (true) {
                zW = false;
                if (i13 >= i9) {
                    break;
                }
                if (i13 != currentGroup) {
                    int i14 = (i13 * 5) + 2;
                    iArr[i14] = iArr[i14] + i8;
                }
                int[] iArr2 = iArr;
                int i15 = currentGroup;
                iArr2[(i13 * 5) + 4] = toWriter.P5(toWriter.jB(iArr, i13) + iJB, i12 >= i13 ? toWriter.slotsGapStart : 0, i11, length);
                if (i13 == i12) {
                    i12++;
                }
                i13++;
                currentGroup = i15;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i12;
            int iR = SlotTableKt.r(fromWriter.anchors, fromIndex, fromWriter.Nxk());
            int iR2 = SlotTableKt.r(fromWriter.anchors, i2, fromWriter.Nxk());
            if (iR < iR2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iR2 - iR);
                for (int i16 = iR; i16 < iR2; i16++) {
                    Anchor anchor = (Anchor) arrayList.get(i16);
                    anchor.t(anchor.getLocation() + i8);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.r(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.Nxk()), arrayList2);
                arrayList.subList(iR, iR2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!listEmptyList.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = listEmptyList.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        Anchor anchor2 = (Anchor) listEmptyList.get(i17);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            GroupSourceInformation groupSourceInformationX4T = toWriter.X4T(parent);
            if (groupSourceInformationX4T != null) {
                int iCk = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i18 = -1;
                while (iCk < currentGroup2) {
                    i18 = iCk;
                    iCk = SlotTableKt.ck(toWriter.groups, iCk) + iCk;
                }
                groupSourceInformationX4T.rl(toWriter, i18, currentGroup2);
            }
            int iUhV = fromWriter.UhV(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z2 = iUhV >= 0;
                    if (z2) {
                        fromWriter.JVN();
                        fromWriter.iF(iUhV - fromWriter.getCurrentGroup());
                        fromWriter.JVN();
                    }
                    fromWriter.iF(fromIndex - fromWriter.getCurrentGroup());
                    boolean zKSg = fromWriter.kSg();
                    if (z2) {
                        fromWriter.Bu();
                        fromWriter.M7();
                        fromWriter.Bu();
                        fromWriter.M7();
                    }
                    zW = zKSg;
                } else {
                    zW = fromWriter.W(fromIndex, iM);
                    fromWriter.RQ(iXw, i3, fromIndex - 1);
                }
            }
            if (zW) {
                ComposerKt.Z("Unexpectedly removed anchors");
            }
            int i19 = toWriter.nodeCount;
            int i20 = iArr3[i5 + 1];
            toWriter.nodeCount = i19 + ((1073741824 & i20) == 0 ? i20 & 67108863 : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i9;
                toWriter.currentSlot = i7 + i3;
            }
            if (zV2) {
                toWriter.v0j(parent);
            }
            return listEmptyList;
        }

        static /* synthetic */ List t(Companion companion, SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
            if ((i3 & 32) != 0) {
                z4 = true;
            }
            return companion.rl(slotWriter, i2, slotWriter2, z2, z3, z4);
        }
    }

    private final int K(int index) {
        return index > -2 ? index : (Nxk() + index) - (-2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P5(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W(int start, int len) {
        if (len > 0) {
            ArrayList arrayList = this.anchors;
            qm(start);
            zLLA = arrayList.isEmpty() ? false : lLA(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i2 = this.slotsGapOwner;
            if (i2 > start) {
                this.slotsGapOwner = Math.max(start, i2 - len);
            }
            int i3 = this.currentGroupEnd;
            if (i3 >= this.groupGapStart) {
                this.currentGroupEnd = i3 - len;
            }
            int i5 = this.parent;
            if (rV9(i5)) {
                v0j(i5);
            }
        }
        return zLLA;
    }

    private final int bzg(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    private final void n1(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int iE2;
        int i2 = size + originalLocation;
        int iNxk = Nxk();
        int iR = SlotTableKt.r(this.anchors, originalLocation, iNxk);
        ArrayList arrayList = new ArrayList();
        if (iR >= 0) {
            while (iR < this.anchors.size() && (iE2 = E2((anchor = (Anchor) this.anchors.get(iR)))) >= originalLocation && iE2 < i2) {
                arrayList.add(anchor);
                this.anchors.remove(iR);
            }
        }
        int i3 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Anchor anchor2 = (Anchor) arrayList.get(i5);
            int iE22 = E2(anchor2) + i3;
            if (iE22 >= this.groupGapStart) {
                anchor2.t(-(iNxk - iE22));
            } else {
                anchor2.t(iE22);
            }
            this.anchors.add(SlotTableKt.r(this.anchors, iE22, iNxk), anchor2);
        }
    }

    public final void Vvq(int count) {
        if (!(count > 0)) {
            ComposerKt.Z("Check failed");
        }
        int i2 = this.parent;
        int iF = f(this.groups, z(i2));
        int iJB = jB(this.groups, z(i2 + 1)) - count;
        if (!(iJB >= iF)) {
            ComposerKt.Z("Check failed");
        }
        RQ(iJB, count, i2);
        int i3 = this.currentSlot;
        if (i3 >= iF) {
            this.currentSlot = i3 - count;
        }
    }

    public final void Zmq(int key, Object objectKey, Object aux) {
        EF(key, objectKey, false, aux);
    }

    public final void iF(int amount) {
        boolean z2 = false;
        if (!(amount >= 0)) {
            ComposerKt.Z("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.rl("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i2 = this.currentGroup + amount;
        if (i2 >= this.parent && i2 <= this.currentGroupEnd) {
            z2 = true;
        }
        if (!z2) {
            ComposerKt.Z("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i2;
        int iJB = jB(this.groups, z(i2));
        this.currentSlot = iJB;
        this.currentSlotEnd = iJB;
    }

    public final void wTp(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            qm(Nxk());
            Org(this.slots.length - this.slotsGapLen, this.groupGapStart);
            s7N();
            ER();
        }
        this.table.gh(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int size, int group) {
        if (size > 0) {
            Org(this.currentSlot, group);
            int i2 = this.slotsGapStart;
            int i3 = this.slotsGapLen;
            if (i3 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i3;
                int iMax = Math.max(Math.max(length * 2, i5 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i7 = 0; i7 < iMax; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = iMax - i5;
                int i9 = i3 + i2;
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(objArr, i9, objArr2, i2 + i8, length - i9);
                this.slots = objArr2;
                i3 = i8;
            }
            int i10 = this.currentSlotEnd;
            if (i10 >= i2) {
                this.currentSlotEnd = i10 + size;
            }
            this.slotsGapStart = i2 + size;
            this.slotsGapLen = i3 - size;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void EF(int key, Object objectKey, boolean isNode, Object aux) {
        int iCk;
        GroupSourceInformation groupSourceInformationX4T;
        int i2 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.KN(this.nodeCount);
        if (objArr == true) {
            int i3 = this.currentGroup;
            int iJB = jB(this.groups, z(i3));
            ofS(1);
            this.currentSlot = iJB;
            this.currentSlotEnd = iJB;
            int iZ = z(i3);
            Composer.Companion companion = Composer.INSTANCE;
            ?? r12 = objectKey != companion.n() ? 1 : 0;
            ?? r13 = (isNode || aux == companion.n()) ? 0 : 1;
            int iP5 = P5(iJB, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iP5 >= 0 && this.slotsGapOwner < i3) {
                iP5 = -(((this.slots.length - this.slotsGapLen) - iP5) + 1);
            }
            SlotTableKt.Ik(this.groups, iZ, key, isNode, r12, r13, this.parent, iP5);
            int i5 = (isNode ? 1 : 0) + r12 + r13;
            if (i5 > 0) {
                C(i5, i3);
                Object[] objArr2 = this.slots;
                int i7 = this.currentSlot;
                if (isNode) {
                    objArr2[i7] = aux;
                    i7++;
                }
                if (r12 != 0) {
                    objArr2[i7] = objectKey;
                    i7++;
                }
                if (r13 != 0) {
                    objArr2[i7] = aux;
                    i7++;
                }
                this.currentSlot = i7;
            }
            this.nodeCount = 0;
            iCk = i3 + 1;
            this.parent = i3;
            this.currentGroup = iCk;
            if (i2 >= 0 && (groupSourceInformationX4T = X4T(i2)) != null) {
                groupSourceInformationX4T.qie(this, i3);
            }
        } else {
            this.startStack.KN(i2);
            QZ6();
            int i8 = this.currentGroup;
            int iZ2 = z(i8);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.n())) {
                if (isNode) {
                    s(aux);
                } else {
                    vl(aux);
                }
            }
            this.currentSlot = f(this.groups, iZ2);
            this.currentSlotEnd = jB(this.groups, z(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iZ2 * 5) + 1] & 67108863;
            this.parent = i8;
            this.currentGroup = i8 + 1;
            iCk = i8 + SlotTableKt.ck(iArr, iZ2);
        }
        this.currentGroupEnd = iCk;
    }

    private final void ER() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.J2(mutableIntList)) {
                o9(PrioritySet.KN(mutableIntList), mutableIntList);
            }
        }
    }

    private final int FX() {
        return this.groups.length / 5;
    }

    private final int How(int index, int gapStart) {
        return index < gapStart ? index : -((Nxk() - index) + 2);
    }

    private final void M(int parent, int endGroup, int firstChild) {
        int iHow = How(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(z(firstChild) * 5) + 2] = iHow;
            int iCk = SlotTableKt.ck(this.groups, z(firstChild)) + firstChild;
            M(firstChild, iCk, firstChild + 1);
            firstChild = iCk;
        }
    }

    private final boolean N(int group) {
        int iM = group + 1;
        int iM2 = group + m(group);
        while (iM < iM2) {
            if ((this.groups[(z(iM) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iM += m(iM);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Org(int index, int group) {
        int i2 = this.slotsGapLen;
        int i3 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i3 != index) {
            Object[] objArr = this.slots;
            if (index < i3) {
                System.arraycopy(objArr, index, objArr, index + i2, i3 - index);
            } else {
                int i7 = i3 + i2;
                System.arraycopy(objArr, i7, objArr, i3, (index + i2) - i7);
            }
        }
        int iMin = Math.min(group + 1, Nxk());
        if (i5 != iMin) {
            int length = this.slots.length - i2;
            if (iMin < i5) {
                int iZ = z(iMin);
                int iZ2 = z(i5);
                int i8 = this.groupGapStart;
                while (iZ < iZ2) {
                    int i9 = (iZ * 5) + 4;
                    int i10 = this.groups[i9];
                    if (!(i10 >= 0)) {
                        ComposerKt.Z("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i9] = -((length - i10) + 1);
                    iZ++;
                    if (iZ == i8) {
                        iZ += this.groupGapLen;
                    }
                }
            } else {
                int iZ3 = z(i5);
                int iZ4 = z(iMin);
                while (iZ3 < iZ4) {
                    int i11 = (iZ3 * 5) + 4;
                    int i12 = this.groups[i11];
                    if (!(i12 < 0)) {
                        ComposerKt.Z("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i11] = i12 + length + 1;
                    iZ3++;
                    if (iZ3 == this.groupGapStart) {
                        iZ3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final void QZ6() {
        this.endStack.KN((FX() - this.groupGapLen) - this.currentGroupEnd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RQ(int start, int len, int group) {
        if (len > 0) {
            int i2 = this.slotsGapLen;
            int i3 = start + len;
            Org(i3, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i2 + len;
            ArraysKt.fill(this.slots, (Object) null, start, i3);
            int i5 = this.currentSlotEnd;
            if (i5 >= start) {
                this.currentSlotEnd = i5 - len;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U(int dataIndex) {
        return dataIndex + (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation X4T(int group) {
        Anchor anchorY;
        HashMap map = this.sourceInformationMap;
        if (map == null || (anchorY = y(group)) == null) {
            return null;
        }
        return (GroupSourceInformation) map.get(anchorY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Xw(int index) {
        return jB(this.groups, z(index));
    }

    private final boolean lLA(int gapStart, int size, HashMap sourceInformationMap) {
        int i2 = size + gapStart;
        int iR = SlotTableKt.r(this.anchors, i2, FX() - this.groupGapLen);
        if (iR >= this.anchors.size()) {
            iR--;
        }
        int i3 = iR + 1;
        int i5 = 0;
        while (iR >= 0) {
            Anchor anchor = (Anchor) this.anchors.get(iR);
            int iE2 = E2(anchor);
            if (iE2 < gapStart) {
                break;
            }
            if (iE2 < i2) {
                anchor.t(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                }
                if (i5 == 0) {
                    i5 = iR + 1;
                }
                i3 = iR;
            }
            iR--;
        }
        boolean z2 = i3 < i5;
        if (z2) {
            this.anchors.subList(i3, i5).clear();
        }
        return z2;
    }

    private final void n7b(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = P5(i3, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    private final void nO(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int iN;
        Anchor anchor2;
        int iN2;
        int i2;
        int iFX = FX() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iR = SlotTableKt.r(this.anchors, newGapStart, iFX); iR < this.anchors.size() && (iN = (anchor = (Anchor) this.anchors.get(iR)).getLocation()) >= 0; iR++) {
                anchor.t(-(iFX - iN));
            }
            return;
        }
        for (int iR2 = SlotTableKt.r(this.anchors, previousGapStart, iFX); iR2 < this.anchors.size() && (iN2 = (anchor2 = (Anchor) this.anchors.get(iR2)).getLocation()) < 0 && (i2 = iN2 + iFX) < newGapStart; iR2++) {
            anchor2.t(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ofS(int size) {
        if (size > 0) {
            int i2 = this.currentGroup;
            qm(i2);
            int i3 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i7 = length - i5;
            if (i5 < size) {
                int iMax = Math.max(Math.max(length * 2, i7 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i8 = iMax - i7;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i3 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i3 + i8) * 5, (i5 + i3) * 5, length * 5);
                this.groups = iArr2;
                i5 = i8;
            }
            int i9 = this.currentGroupEnd;
            if (i9 >= i3) {
                this.currentGroupEnd = i9 + size;
            }
            int i10 = i3 + size;
            this.groupGapStart = i10;
            this.groupGapLen = i5 - size;
            int iP5 = P5(i7 > 0 ? Xw(i2 + size) : 0, this.slotsGapOwner >= i3 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i11 = i3; i11 < i10; i11++) {
                this.groups[(i11 * 5) + 4] = iP5;
            }
            int i12 = this.slotsGapOwner;
            if (i12 >= i3) {
                this.slotsGapOwner = i12 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void qm(int index) {
        int i2 = this.groupGapLen;
        int i3 = this.groupGapStart;
        if (i3 != index) {
            if (!this.anchors.isEmpty()) {
                nO(i3, index);
            }
            if (i2 > 0) {
                int[] iArr = this.groups;
                int i5 = index * 5;
                int i7 = i2 * 5;
                int i8 = i3 * 5;
                if (index < i3) {
                    ArraysKt.copyInto(iArr, iArr, i7 + i5, i5, i8);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i8, i8 + i7, i5 + i7);
                }
            }
            if (index < i3) {
                i3 = index + i2;
            }
            int iFX = FX();
            if (!(i3 < iFX)) {
                ComposerKt.Z("Check failed");
            }
            while (i3 < iFX) {
                int i9 = (i3 * 5) + 2;
                int i10 = this.groups[i9];
                int iHow = How(K(i10), index);
                if (iHow != i10) {
                    this.groups[i9] = iHow;
                }
                i3++;
                if (i3 == index) {
                    i3 += i2;
                }
            }
        }
        this.groupGapStart = index;
    }

    private final boolean rV9(int group) {
        return group >= 0 && (this.groups[(z(group) * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0;
    }

    private final void s7N() {
        int i2 = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i2, this.slotsGapLen + i2);
    }

    public static /* synthetic */ void ul(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.parent;
        }
        slotWriter.eWT(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(int group) {
        return group >= 0 && (this.groups[(z(group) * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0j(int group) {
        if (group >= 0) {
            MutableIntList mutableIntListT = this.pendingRecalculateMarks;
            if (mutableIntListT == null) {
                mutableIntListT = PrioritySet.t(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListT;
            }
            PrioritySet.n(mutableIntListT, group);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int index) {
        return index + (this.groupGapLen * (index < this.groupGapStart ? 0 : 1));
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void Bu() {
        int i2 = this.currentGroupEnd;
        this.currentGroup = i2;
        this.currentSlot = jB(this.groups, z(i2));
    }

    public final boolean D() {
        return this.sourceInformationMap != null;
    }

    public final int EWS(int index) {
        return this.groups[(z(index) * 5) + 1] & 67108863;
    }

    public final boolean G7() {
        int i2 = this.currentGroup;
        return i2 < this.currentGroupEnd && (this.groups[(z(i2) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: GR, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int HBN(int groupIndex) {
        return jB(this.groups, z(groupIndex + 1));
    }

    public final List HV(Anchor anchor, int offset, SlotWriter writer) {
        if (!(writer.insertCount > 0)) {
            ComposerKt.Z("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.Z("Check failed");
        }
        if (!anchor.rl()) {
            ComposerKt.Z("Check failed");
        }
        int iE2 = E2(anchor) + offset;
        int i2 = this.currentGroup;
        if (!(i2 <= iE2 && iE2 < this.currentGroupEnd)) {
            ComposerKt.Z("Check failed");
        }
        int iUhV = UhV(iE2);
        int iM = m(iE2);
        int iEWS = fcU(iE2) ? 1 : EWS(iE2);
        List listT = Companion.t(INSTANCE, this, iE2, writer, false, false, false, 32, null);
        v0j(iUhV);
        boolean z2 = iEWS > 0;
        while (iUhV >= i2) {
            int iZ = z(iUhV);
            int[] iArr = this.groups;
            SlotTableKt.aYN(iArr, iZ, SlotTableKt.ck(iArr, iZ) - iM);
            if (z2) {
                int[] iArr2 = this.groups;
                int i3 = iArr2[(iZ * 5) + 1];
                if ((1073741824 & i3) != 0) {
                    z2 = false;
                } else {
                    SlotTableKt.nY(iArr2, iZ, (i3 & 67108863) - iEWS);
                }
            }
            iUhV = UhV(iUhV);
        }
        if (z2) {
            if (!(this.nodeCount >= iEWS)) {
                ComposerKt.Z("Check failed");
            }
            this.nodeCount -= iEWS;
        }
        return listT;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean J() {
        return this.calledByMap != null;
    }

    public final void JVN() {
        if (!(this.insertCount == 0)) {
            ComposerKt.Z("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        EF(0, companion.n(), false, companion.n());
    }

    public final List Jk(SlotTable table, int index, boolean removeSourceGroup) {
        if (!(this.insertCount > 0)) {
            ComposerKt.Z("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.ck(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterG = table.g();
            try {
                List listRl = INSTANCE.rl(slotWriterG, index, this, true, true, removeSourceGroup);
                slotWriterG.wTp(true);
                return listRl;
            } catch (Throwable th) {
                slotWriterG.wTp(false);
                throw th;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList arrayList = this.anchors;
        HashMap map = this.sourceInformationMap;
        MutableIntObjectMap mutableIntObjectMap = this.calledByMap;
        int[] iArrIk = table.getGroups();
        int iR = table.getGroupsSize();
        Object[] objArrO = table.getSlots();
        int iXQ = table.getSlotsSize();
        HashMap mapS = table.getSourceInformationMap();
        MutableIntObjectMap mutableIntObjectMapCk = table.getCalledByMap();
        this.groups = iArrIk;
        this.slots = objArrO;
        this.anchors = table.getAnchors();
        this.groupGapStart = iR;
        this.groupGapLen = (iArrIk.length / 5) - iR;
        this.slotsGapStart = iXQ;
        this.slotsGapLen = objArrO.length - iXQ;
        this.slotsGapOwner = iR;
        this.sourceInformationMap = mapS;
        this.calledByMap = mutableIntObjectMapCk;
        table.iF(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
        return this.anchors;
    }

    public final int M7() {
        MutableObjectList mutableObjectList;
        boolean z2 = this.insertCount > 0;
        int i2 = this.currentGroup;
        int i3 = this.currentGroupEnd;
        int i5 = this.parent;
        int iZ = z(i5);
        int i7 = this.nodeCount;
        int i8 = i2 - i5;
        int i9 = (iZ * 5) + 1;
        boolean z3 = (this.groups[i9] & 1073741824) != 0;
        if (z2) {
            MutableIntObjectMap mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = (MutableObjectList) mutableIntObjectMap.rl(i5)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i10 = mutableObjectList._size;
                for (int i11 = 0; i11 < i10; i11++) {
                    tUK(objArr[i11]);
                }
            }
            SlotTableKt.aYN(this.groups, iZ, i8);
            SlotTableKt.nY(this.groups, iZ, i7);
            this.nodeCount = this.nodeCountStack.Uo() + (z3 ? 1 : i7);
            int i12 = i(this.groups, i5);
            this.parent = i12;
            int iNxk = i12 < 0 ? Nxk() : z(i12 + 1);
            int iJB = iNxk >= 0 ? jB(this.groups, iNxk) : 0;
            this.currentSlot = iJB;
            this.currentSlotEnd = iJB;
            return i7;
        }
        if (!(i2 == i3)) {
            ComposerKt.Z("Expected to be at the end of a group");
        }
        int iCk = SlotTableKt.ck(this.groups, iZ);
        int[] iArr = this.groups;
        int i13 = iArr[i9] & 67108863;
        SlotTableKt.aYN(iArr, iZ, i8);
        SlotTableKt.nY(this.groups, iZ, i7);
        int iUo = this.startStack.Uo();
        F();
        this.parent = iUo;
        int i14 = i(this.groups, i5);
        int iUo2 = this.nodeCountStack.Uo();
        this.nodeCount = iUo2;
        if (i14 == iUo) {
            this.nodeCount = iUo2 + (z3 ? 0 : i7 - i13);
            return i7;
        }
        int i15 = i8 - iCk;
        int i16 = z3 ? 0 : i7 - i13;
        if (i15 != 0 || i16 != 0) {
            while (i14 != 0 && i14 != iUo && (i16 != 0 || i15 != 0)) {
                int iZ2 = z(i14);
                if (i15 != 0) {
                    SlotTableKt.aYN(this.groups, iZ2, SlotTableKt.ck(this.groups, iZ2) + i15);
                }
                if (i16 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.nY(iArr2, iZ2, (iArr2[(iZ2 * 5) + 1] & 67108863) + i16);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iZ2 * 5) + 1] & 1073741824) != 0) {
                    i16 = 0;
                }
                i14 = i(iArr3, i14);
            }
        }
        this.nodeCount += i16;
        return i7;
    }

    public final boolean Mx() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final int Qu(int groupIndex) {
        return jB(this.groups, z(groupIndex + m(groupIndex)));
    }

    public final void Rl(int offset) {
        boolean z2 = true;
        if (!(this.insertCount == 0)) {
            ComposerKt.Z("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            ComposerKt.Z("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i2 = this.currentGroup;
        int i3 = this.parent;
        int i5 = this.currentGroupEnd;
        int iCk = i2;
        for (int i7 = offset; i7 > 0; i7--) {
            iCk += SlotTableKt.ck(this.groups, z(iCk));
            if (!(iCk <= i5)) {
                ComposerKt.Z("Parameter offset is out of bounds");
            }
        }
        int iCk2 = SlotTableKt.ck(this.groups, z(iCk));
        int iJB = jB(this.groups, z(this.currentGroup));
        int iJB2 = jB(this.groups, z(iCk));
        int i8 = iCk + iCk2;
        int iJB3 = jB(this.groups, z(i8));
        int i9 = iJB3 - iJB2;
        C(i9, Math.max(this.currentGroup - 1, 0));
        ofS(iCk2);
        int[] iArr = this.groups;
        int iZ = z(i8) * 5;
        ArraysKt.copyInto(iArr, iArr, z(i2) * 5, iZ, (iCk2 * 5) + iZ);
        if (i9 > 0) {
            Object[] objArr = this.slots;
            int iU = U(iJB2 + i9);
            System.arraycopy(objArr, iU, objArr, iJB, U(iJB3 + i9) - iU);
        }
        int i10 = iJB2 + i9;
        int i11 = i10 - iJB;
        int i12 = this.slotsGapStart;
        int i13 = this.slotsGapLen;
        int length = this.slots.length;
        int i14 = this.slotsGapOwner;
        int i15 = i2 + iCk2;
        int i16 = i2;
        while (i16 < i15) {
            boolean z3 = z2;
            int iZ2 = z(i16);
            int i17 = i16;
            int i18 = i11;
            n7b(iArr, iZ2, P5(jB(iArr, iZ2) - i11, i14 < iZ2 ? 0 : i12, i13, length));
            i16 = i17 + 1;
            z2 = z3;
            i11 = i18;
        }
        n1(i8, i2, iCk2);
        if (W(i8, iCk2)) {
            ComposerKt.Z("Unexpectedly removed anchors");
        }
        M(i3, this.currentGroupEnd, i2);
        if (i9 > 0) {
            RQ(i10, i9, i8 - 1);
        }
    }

    public final void T() {
        int i2 = this.insertCount;
        this.insertCount = i2 + 1;
        if (i2 == 0) {
            QZ6();
        }
    }

    public final int T3L() {
        int iZ = z(this.currentGroup);
        int iCk = this.currentGroup + SlotTableKt.ck(this.groups, iZ);
        this.currentGroup = iCk;
        this.currentSlot = jB(this.groups, z(iCk));
        int i2 = this.groups[(iZ * 5) + 1];
        if ((1073741824 & i2) != 0) {
            return 1;
        }
        return i2 & 67108863;
    }

    public final int UF(int groupIndex) {
        return f(this.groups, z(groupIndex));
    }

    public final int UhV(int index) {
        return i(this.groups, index);
    }

    public final void VwL(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.Z("Writing to an invalid slot");
        }
        this.slots[U(this.currentSlot - 1)] = value;
    }

    public final int Y() {
        return this.slots.length - this.slotsGapLen;
    }

    public final Object Zn(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return tUK(value);
        }
        MutableIntObjectMap mutableIntObjectMap = this.deferredSlotWrites;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 1;
        int i3 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap(i3, i2, defaultConstructorMarker);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i5 = this.parent;
        Object objRl = mutableIntObjectMap.rl(i5);
        if (objRl == null) {
            objRl = new MutableObjectList(i3, i2, defaultConstructorMarker);
            mutableIntObjectMap.r(i5, objRl);
        }
        ((MutableObjectList) objRl).ty(value);
        return Composer.INSTANCE.n();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final void a63() {
        if (!(this.insertCount == 0)) {
            ComposerKt.Z("Cannot reset when inserting");
        }
        ER();
        this.currentGroup = 0;
        this.currentGroupEnd = FX() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void e(Anchor anchor, Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.Z("Can only append a slot if not current inserting");
        }
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        int iE2 = E2(anchor);
        int iJB = jB(this.groups, z(iE2 + 1));
        this.currentSlot = iJB;
        this.currentSlotEnd = iJB;
        C(1, iE2);
        if (i2 >= iJB) {
            i2++;
            i3++;
        }
        this.slots[iJB] = value;
        this.currentSlot = i2;
        this.currentSlotEnd = i3;
    }

    public final void eF(int index) {
        boolean z2 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.Z("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.parent;
        if (i2 != index) {
            if (index >= i2 && index < this.currentGroupEnd) {
                z2 = true;
            }
            if (!z2) {
                ComposerKt.Z("Started group at " + index + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.currentGroup;
            int i5 = this.currentSlot;
            int i7 = this.currentSlotEnd;
            this.currentGroup = index;
            JVN();
            this.currentGroup = i3;
            this.currentSlot = i5;
            this.currentSlotEnd = i7;
        }
    }

    public final boolean eTf(int index) {
        return xg(index, this.currentGroup);
    }

    public final Anchor fD(int index) {
        ArrayList arrayList = this.anchors;
        int iZ = SlotTableKt.Z(arrayList, index, Nxk());
        if (iZ >= 0) {
            return (Anchor) arrayList.get(iZ);
        }
        if (index > this.groupGapStart) {
            index = -(Nxk() - index);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iZ + 1), anchor);
        return anchor;
    }

    public final boolean fcU(int index) {
        return (this.groups[(z(index) * 5) + 1] & 1073741824) != 0;
    }

    public final void g6() {
        this.sourceInformationMap = this.table.getSourceInformationMap();
        this.calledByMap = this.table.getCalledByMap();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final boolean kSg() {
        Anchor anchorY;
        if (!(this.insertCount == 0)) {
            ComposerKt.Z("Cannot remove group while inserting");
        }
        int i2 = this.currentGroup;
        int i3 = this.currentSlot;
        int iJB = jB(this.groups, z(i2));
        int iT3L = T3L();
        GroupSourceInformation groupSourceInformationX4T = X4T(this.parent);
        if (groupSourceInformationX4T != null && (anchorY = y(i2)) != null) {
            groupSourceInformationX4T.mUb(anchorY);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.J2(mutableIntList) && PrioritySet.Uo(mutableIntList) >= i2) {
                PrioritySet.KN(mutableIntList);
            }
        }
        boolean zW = W(i2, this.currentGroup - i2);
        RQ(iJB, this.currentSlot - iJB, i2 - 1);
        this.currentGroup = i2;
        this.currentSlot = i3;
        this.nodeCount -= iT3L;
        return zW;
    }

    public final int m(int index) {
        return SlotTableKt.ck(this.groups, z(index));
    }

    public final Object mI() {
        if (this.insertCount > 0) {
            C(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i2 = this.currentSlot;
        this.currentSlot = i2 + 1;
        return objArr[U(i2)];
    }

    public final List mYa(int offset, SlotTable table, int index) {
        if (!(this.insertCount <= 0 && m(this.currentGroup + offset) == 1)) {
            ComposerKt.Z("Check failed");
        }
        int i2 = this.currentGroup;
        int i3 = this.currentSlot;
        int i5 = this.currentSlotEnd;
        iF(offset);
        JVN();
        T();
        SlotWriter slotWriterG = table.g();
        try {
            List listT = Companion.t(INSTANCE, slotWriterG, index, this, false, true, false, 32, null);
            slotWriterG.wTp(true);
            p5();
            M7();
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.currentSlotEnd = i5;
            return listT;
        } catch (Throwable th) {
            slotWriterG.wTp(false);
            throw th;
        }
    }

    public final void p5() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.rl("Unbalanced begin/end insert");
        }
        int i2 = this.insertCount - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.Z("startGroup/endGroup mismatch while inserting");
            }
            F();
        }
    }

    public final boolean pJg(int index) {
        int i2 = this.parent;
        if (index <= i2 || index >= this.currentGroupEnd) {
            return i2 == 0 && index == 0;
        }
        return true;
    }

    public final int piY(int index) {
        return this.groups[z(index) * 5];
    }

    public final void s(Object value) {
        Lp6(this.currentGroup, value);
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + Nxk() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void uG(int key, Object objectKey) {
        EF(key, objectKey, true, Composer.INSTANCE.n());
    }

    public final void vl(Object value) {
        int iZ = z(this.currentGroup);
        if (!((this.groups[(iZ * 5) + 1] & 268435456) != 0)) {
            ComposerKt.Z("Updating the data of a group that was not created with a data slot");
        }
        this.slots[U(X(this.groups, iZ))] = value;
    }

    public final void xVH(int key, Object dataKey) {
        EF(key, dataKey, false, Composer.INSTANCE.n());
    }

    public final boolean xg(int index, int group) {
        int iRl;
        int iFX;
        if (group == this.parent) {
            iFX = this.currentGroupEnd;
        } else if (group <= this.startStack.J2(0) && (iRl = this.startStack.rl(group)) >= 0) {
            iFX = (FX() - this.groupGapLen) - this.endStack.nr(iRl);
        } else {
            int iM = m(group);
            iFX = iM + group;
        }
        return index > group && index < iFX;
    }

    public final Anchor y(int group) {
        if (group < 0 || group >= Nxk()) {
            return null;
        }
        return SlotTableKt.HI(this.anchors, group, Nxk());
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors();
        this.sourceInformationMap = slotTable.getSourceInformationMap();
        this.calledByMap = slotTable.getCalledByMap();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    private final int F() {
        int iFX = (FX() - this.groupGapLen) - this.endStack.Uo();
        this.currentGroupEnd = iFX;
        return iFX;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Lp6(int index, Object value) {
        boolean z2;
        int iZ = z(index);
        int[] iArr = this.groups;
        if (iZ < iArr.length) {
            z2 = true;
            if ((iArr[(iZ * 5) + 1] & 1073741824) == 0) {
                z2 = false;
            }
        }
        if (!z2) {
            ComposerKt.Z("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[U(hRu(this.groups, iZ))] = value;
    }

    private final int X(int[] iArr, int i2) {
        return jB(iArr, i2) + Integer.bitCount(iArr[(i2 * 5) + 1] >> 29);
    }

    private final int f(int[] iArr, int i2) {
        if (i2 >= FX()) {
            return this.slots.length - this.slotsGapLen;
        }
        return bzg(SlotTableKt.XQ(iArr, i2), this.slotsGapLen, this.slots.length);
    }

    private final int hRu(int[] iArr, int i2) {
        return jB(iArr, i2);
    }

    private final int i(int[] iArr, int i2) {
        return K(iArr[(z(i2) * 5) + 2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int jB(int[] iArr, int i2) {
        if (i2 >= FX()) {
            return this.slots.length - this.slotsGapLen;
        }
        return bzg(iArr[(i2 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    private final void o9(int group, MutableIntList set) {
        int iZ = z(group);
        boolean zN = N(group);
        int[] iArr = this.groups;
        boolean z2 = true;
        if ((iArr[(iZ * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) == 0) {
            z2 = false;
        }
        if (z2 != zN) {
            SlotTableKt.WPU(iArr, iZ, zN);
            int iUhV = UhV(group);
            if (iUhV >= 0) {
                PrioritySet.n(set, iUhV);
            }
        }
    }

    private final Object tUK(Object value) {
        Object objMI = mI();
        VwL(value);
        return objMI;
    }

    public final void Aum(Anchor anchor, Object value) {
        Lp6(anchor.O(this), value);
    }

    public final void E(Anchor anchor) {
        eF(anchor.O(this));
    }

    public final int E2(Anchor anchor) {
        int iN = anchor.getLocation();
        if (iN < 0) {
            return Nxk() + iN;
        }
        return iN;
    }

    public final Object GD(int index) {
        int iZ = z(index);
        int[] iArr = this.groups;
        if ((iArr[(iZ * 5) + 1] & 1073741824) != 0) {
            return this.slots[U(hRu(iArr, iZ))];
        }
        return null;
    }

    public final int Nxk() {
        return FX() - this.groupGapLen;
    }

    public final Object Po6(Anchor anchor) {
        return GD(anchor.O(this));
    }

    public final Object Uf(Anchor anchor, int index) {
        return p0N(E2(anchor), index);
    }

    public final Object dR0(int index) {
        int iZ = z(index);
        int[] iArr = this.groups;
        if ((iArr[(iZ * 5) + 1] & 268435456) != 0) {
            return this.slots[X(iArr, iZ)];
        }
        return Composer.INSTANCE.n();
    }

    public final void eWT(int group) {
        int iZ = z(group);
        int[] iArr = this.groups;
        int i2 = (iZ * 5) + 1;
        if ((iArr[i2] & 134217728) == 0) {
            SlotTableKt.ViF(iArr, iZ, true);
            if ((this.groups[i2] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0) {
                return;
            }
            v0j(UhV(group));
        }
    }

    public final Object ijL(int index) {
        int iZ = z(index);
        int[] iArr = this.groups;
        if ((iArr[(iZ * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.o(iArr, iZ)];
        }
        return null;
    }

    public final Object nHg(int slotIndex) {
        int iU = U(slotIndex);
        Object[] objArr = this.slots;
        Object obj = objArr[iU];
        objArr[iU] = Composer.INSTANCE.n();
        return obj;
    }

    public final Object p0N(int groupIndex, int index) {
        int iF = f(this.groups, z(groupIndex));
        int iJB = jB(this.groups, z(groupIndex + 1));
        int i2 = index + iF;
        if (iF <= i2 && i2 < iJB) {
            return this.slots[U(i2)];
        }
        return Composer.INSTANCE.n();
    }

    public final Object tFV(int group, int index, Object value) {
        int iU = U(ub(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iU];
        objArr[iU] = value;
        return obj;
    }

    public final int ub(int group, int index) {
        boolean z2;
        int iF = f(this.groups, z(group));
        int iJB = jB(this.groups, z(group + 1));
        int i2 = iF + index;
        if (i2 >= iF && i2 < iJB) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.Z("Write to an invalid slot index " + index + " for group " + group);
        }
        return i2;
    }
}
