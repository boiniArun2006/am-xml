package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b-\u0010/R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010/R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010/R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\b,\u0010/R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bI\u0010/R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\bK\u0010/R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010-\u001a\u0004\bM\u0010/R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010-\u001a\u0004\bO\u0010/R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010-\u001a\u0004\bQ\u0010/R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010-\u001a\u0004\bS\u0010/R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u0010-\u001a\u0004\bU\u0010/R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bV\u0010-\u001a\u0004\bW\u0010/R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u0010-\u001a\u0004\bY\u0010/R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bZ\u0010-\u001a\u0004\b[\u0010/R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u0010-\u001a\u0004\b]\u0010/R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b^\u0010-\u001a\u0004\b_\u0010/R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b`\u0010-\u001a\u0004\ba\u0010/R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010-\u001a\u0004\bc\u0010/R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u0010-\u001a\u0004\be\u0010/R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bf\u0010-\u001a\u0004\bg\u0010/R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010-\u001a\u0004\bi\u0010/R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010-\u001a\u0004\bk\u0010/R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u0010-\u001a\u0004\bm\u0010/R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bn\u0010-\u001a\u0004\bo\u0010/R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010-\u001a\u0004\bq\u0010/R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\br\u0010-\u001a\u0004\bs\u0010/R$\u0010z\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\b2\u0010w\"\u0004\bx\u0010yR$\u0010}\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010v\u001a\u0004\b>\u0010w\"\u0004\b|\u0010yR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b~\u0010v\u001a\u0004\bJ\u0010w\"\u0004\b\u007f\u0010yR'\u0010\u0083\u0001\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b\u0081\u0001\u0010v\u001a\u0004\bb\u0010w\"\u0005\b\u0082\u0001\u0010yR'\u0010\u0086\u0001\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b\u0084\u0001\u0010v\u001a\u0004\b{\u0010w\"\u0005\b\u0085\u0001\u0010yR*\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bY\u0010\u0088\u0001\u001a\u0005\b4\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b]\u0010\u0088\u0001\u001a\u0005\b?\u0010\u0089\u0001\"\u0006\b\u008d\u0001\u0010\u008b\u0001R*\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bW\u0010\u0088\u0001\u001a\u0005\bd\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R*\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b7\u0010\u0092\u0001\u001a\u0005\b0\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bU\u0010\u0092\u0001\u001a\u0005\b<\u0010\u0093\u0001\"\u0006\b\u0097\u0001\u0010\u0095\u0001R*\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bI\u0010\u0092\u0001\u001a\u0005\br\u0010\u0093\u0001\"\u0006\b\u0099\u0001\u0010\u0095\u0001R*\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b[\u0010\u0092\u0001\u001a\u0005\bC\u0010\u0093\u0001\"\u0006\b\u009b\u0001\u0010\u0095\u0001R*\u0010¢\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b_\u0010\u009e\u0001\u001a\u0005\bP\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010¤\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b1\u0010\u009e\u0001\u001a\u0005\bA\u0010\u009f\u0001\"\u0006\b£\u0001\u0010¡\u0001R*\u0010¦\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b5\u0010\u009e\u0001\u001a\u0005\bV\u0010\u009f\u0001\"\u0006\b¥\u0001\u0010¡\u0001R3\u0010®\u0001\u001a\u0005\u0018\u00010§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0005\b;\u0010¨\u0001\u0012\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b\u0084\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R2\u0010±\u0001\u001a\u0005\u0018\u00010§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\b-\u0010¨\u0001\u0012\u0006\b°\u0001\u0010\u00ad\u0001\u001a\u0005\b6\u0010©\u0001\"\u0006\b¯\u0001\u0010«\u0001R2\u0010´\u0001\u001a\u0005\u0018\u00010§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bM\u0010¨\u0001\u0012\u0006\b³\u0001\u0010\u00ad\u0001\u001a\u0005\bZ\u0010©\u0001\"\u0006\b²\u0001\u0010«\u0001R2\u0010·\u0001\u001a\u0005\u0018\u00010§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bQ\u0010¨\u0001\u0012\u0006\b¶\u0001\u0010\u00ad\u0001\u001a\u0005\bX\u0010©\u0001\"\u0006\bµ\u0001\u0010«\u0001R*\u0010½\u0001\u001a\u0005\u0018\u00010¸\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bB\u0010¹\u0001\u001a\u0005\b8\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R2\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bF\u0010¿\u0001\u0012\u0006\bÃ\u0001\u0010\u00ad\u0001\u001a\u0005\b:\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ê\u0001\u001a\u0005\u0018\u00010Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\ba\u0010Æ\u0001\u001a\u0005\bR\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ð\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bc\u0010Ì\u0001\u001a\u0005\bT\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ò\u0001\u001a\u0005\u0018\u00010Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b.\u0010Æ\u0001\u001a\u0005\bG\u0010Ç\u0001\"\u0006\bÑ\u0001\u0010É\u0001R*\u0010Ô\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b3\u0010Ì\u0001\u001a\u0005\bH\u0010Í\u0001\"\u0006\bÓ\u0001\u0010Ï\u0001R*\u0010Ö\u0001\u001a\u0005\u0018\u00010Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\be\u0010Æ\u0001\u001a\u0005\bL\u0010Ç\u0001\"\u0006\bÕ\u0001\u0010É\u0001R*\u0010Ø\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b9\u0010Ì\u0001\u001a\u0005\bN\u0010Í\u0001\"\u0006\b×\u0001\u0010Ï\u0001R*\u0010Ú\u0001\u001a\u0005\u0018\u00010Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b=\u0010Æ\u0001\u001a\u0005\bf\u0010Ç\u0001\"\u0006\bÙ\u0001\u0010É\u0001R+\u0010Ý\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bK\u0010Ì\u0001\u001a\u0006\bÛ\u0001\u0010Í\u0001\"\u0006\bÜ\u0001\u0010Ï\u0001R*\u0010ã\u0001\u001a\u0005\u0018\u00010Þ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bg\u0010ß\u0001\u001a\u0005\b\\\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010é\u0001\u001a\u0005\u0018\u00010ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bk\u0010å\u0001\u001a\u0005\b^\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R*\u0010ï\u0001\u001a\u0005\u0018\u00010ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bm\u0010ë\u0001\u001a\u0005\b`\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R*\u0010õ\u0001\u001a\u0005\u0018\u00010ð\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bo\u0010ñ\u0001\u001a\u0005\bE\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R*\u0010û\u0001\u001a\u0005\u0018\u00010ö\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bq\u0010÷\u0001\u001a\u0005\bj\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R2\u0010\u0082\u0002\u001a\u0005\u0018\u00010ü\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bs\u0010ý\u0001\u0012\u0006\b\u0081\u0002\u0010\u00ad\u0001\u001a\u0005\bn\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R*\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bi\u0010\u0084\u0002\u001a\u0005\bp\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R*\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u0089\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bS\u0010\u008a\u0002\u001a\u0005\bu\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R*\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u008f\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bO\u0010\u0090\u0002\u001a\u0005\bh\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R*\u0010\u0096\u0002\u001a\u0005\u0018\u00010\u008f\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b@\u0010\u0090\u0002\u001a\u0005\b~\u0010\u0091\u0002\"\u0006\b\u0095\u0002\u0010\u0093\u0002R3\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u0097\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0005\bD\u0010\u0098\u0002\u0012\u0006\b\u009c\u0002\u0010\u00ad\u0001\u001a\u0006\b\u0081\u0001\u0010\u0099\u0002\"\u0006\b\u009a\u0002\u0010\u009b\u0002R3\u0010¤\u0002\u001a\u0005\u0018\u00010\u009e\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0006\b\u0094\u0001\u0010\u009f\u0002\u0012\u0006\b£\u0002\u0010\u00ad\u0001\u001a\u0005\bl\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¥\u0002"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", MRAIDPresenter.ERROR, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", c.f62177j, "J", "k", "()J", "rl", "M", "t", "dR0", "nr", "FX", "O", "P5", "J2", "piY", "Uo", "B", "KN", "ijL", "xMQ", "mUb", "ul", "gh", "I", "qie", "n1", "az", "GR", "ty", "HI", "p5", "ck", "m", "Ik", "D", "r", "eWT", "o", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Z", "fcU", "XQ", "M7", "S", "U", "WPU", "Xw", "aYN", "eF", "ViF", "jB", "nY", "E", "g", "Nxk", "te", "Y", "iF", "z", "fD", "eTf", "E2", "G7", "e", "xg", "X", "pJg", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "ofS", "N", "C", "nHg", "Mx", "Landroidx/compose/material3/ButtonColors;", "s7N", "Landroidx/compose/material3/ButtonColors;", "()Landroidx/compose/material3/ButtonColors;", "Rl", "(Landroidx/compose/material3/ButtonColors;)V", "defaultButtonColorsCached", "wTp", "Po6", "defaultElevatedButtonColorsCached", "v", "tUK", "defaultFilledTonalButtonColorsCached", "rV9", "T3L", "defaultOutlinedButtonColorsCached", "bzg", "JVN", "defaultTextButtonColorsCached", "Landroidx/compose/material3/CardColors;", "Landroidx/compose/material3/CardColors;", "()Landroidx/compose/material3/CardColors;", "qm", "(Landroidx/compose/material3/CardColors;)V", "defaultCardColorsCached", "EWS", "defaultElevatedCardColorsCached", "Bu", "defaultOutlinedCardColorsCached", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ChipColors;", "()Landroidx/compose/material3/ChipColors;", "Jk", "(Landroidx/compose/material3/ChipColors;)V", "defaultAssistChipColorsCached", "GD", "defaultElevatedAssistChipColorsCached", "X4T", "defaultSuggestionChipColorsCached", "UhV", "defaultElevatedSuggestionChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipColors;", "()Landroidx/compose/material3/SelectableChipColors;", "kSg", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultFilterChipColorsCached", "hRu", "defaultElevatedFilterChipColorsCached", "a63", "defaultInputChipColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarColors;", "()Landroidx/compose/material3/TopAppBarColors;", "uG", "(Landroidx/compose/material3/TopAppBarColors;)V", "getDefaultTopAppBarColorsCached$material3_release$annotations", "()V", "defaultTopAppBarColorsCached", "mYa", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "defaultCenterAlignedTopAppBarColorsCached", "QZ6", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "defaultMediumTopAppBarColorsCached", "F", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "defaultLargeTopAppBarColorsCached", "Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/material3/CheckboxColors;", "()Landroidx/compose/material3/CheckboxColors;", "Org", "(Landroidx/compose/material3/CheckboxColors;)V", "defaultCheckboxColorsCached", "Landroidx/compose/material3/DatePickerColors;", "Landroidx/compose/material3/DatePickerColors;", "()Landroidx/compose/material3/DatePickerColors;", "HV", "(Landroidx/compose/material3/DatePickerColors;)V", "getDefaultDatePickerColorsCached$material3_release$annotations", "defaultDatePickerColorsCached", "Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/IconButtonColors;", "()Landroidx/compose/material3/IconButtonColors;", "W", "(Landroidx/compose/material3/IconButtonColors;)V", "defaultIconButtonColorsCached", "Landroidx/compose/material3/IconToggleButtonColors;", "Landroidx/compose/material3/IconToggleButtonColors;", "()Landroidx/compose/material3/IconToggleButtonColors;", "RQ", "(Landroidx/compose/material3/IconToggleButtonColors;)V", "defaultIconToggleButtonColorsCached", "K", "defaultFilledIconButtonColorsCached", "How", "defaultFilledIconToggleButtonColorsCached", "ER", "defaultFilledTonalIconButtonColorsCached", "lLA", "defaultFilledTonalIconToggleButtonColorsCached", "p0N", "defaultOutlinedIconButtonColorsCached", "getDefaultOutlinedIconToggleButtonColorsCached$material3_release", "Uf", "defaultOutlinedIconToggleButtonColorsCached", "Landroidx/compose/material3/MenuItemColors;", "Landroidx/compose/material3/MenuItemColors;", "()Landroidx/compose/material3/MenuItemColors;", "tFV", "(Landroidx/compose/material3/MenuItemColors;)V", "defaultMenuItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/NavigationBarItemColors;", "()Landroidx/compose/material3/NavigationBarItemColors;", "VwL", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/material3/NavigationRailItemColors;", "()Landroidx/compose/material3/NavigationRailItemColors;", "mI", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationItemColors;", "Landroidx/compose/material3/NavigationItemColors;", "()Landroidx/compose/material3/NavigationItemColors;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "(Landroidx/compose/material3/NavigationItemColors;)V", "defaultExpressiveNavigationBarItemColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "Landroidx/compose/material3/RadioButtonColors;", "()Landroidx/compose/material3/RadioButtonColors;", "ub", "(Landroidx/compose/material3/RadioButtonColors;)V", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "Landroidx/compose/material3/SegmentedButtonColors;", "()Landroidx/compose/material3/SegmentedButtonColors;", "HBN", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/SliderColors;", "()Landroidx/compose/material3/SliderColors;", "UF", "(Landroidx/compose/material3/SliderColors;)V", "defaultSliderColorsCached", "Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/material3/SwitchColors;", "()Landroidx/compose/material3/SwitchColors;", "Zmq", "(Landroidx/compose/material3/SwitchColors;)V", "defaultSwitchColorsCached", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/TextFieldColors;", "()Landroidx/compose/material3/TextFieldColors;", InneractiveMediationDefs.GENDER_FEMALE, "(Landroidx/compose/material3/TextFieldColors;)V", "defaultOutlinedTextFieldColorsCached", "xVH", "defaultTextFieldColorsCached", "Landroidx/compose/material3/TimePickerColors;", "Landroidx/compose/material3/TimePickerColors;", "()Landroidx/compose/material3/TimePickerColors;", "EF", "(Landroidx/compose/material3/TimePickerColors;)V", "getDefaultTimePickerColorsCached$material3_release$annotations", "defaultTimePickerColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/material3/RichTooltipColors;", "()Landroidx/compose/material3/RichTooltipColors;", "Qu", "(Landroidx/compose/material3/RichTooltipColors;)V", "getDefaultRichTooltipColorsCached$material3_release$annotations", "defaultRichTooltipColorsCached", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorScheme {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private TopAppBarColors defaultTopAppBarColorsCached;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private RadioButtonColors defaultRadioButtonColorsCached;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private TopAppBarColors defaultMediumTopAppBarColorsCached;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private SelectableChipColors defaultFilterChipColorsCached;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata and from toString */
    private final long surfaceDim;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private SelectableChipColors defaultInputChipColorsCached;

    /* JADX INFO: renamed from: G7, reason: collision with root package name and from kotlin metadata */
    private SliderColors defaultSliderColorsCached;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private DatePickerColors defaultDatePickerColorsCached;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata and from toString */
    private final long onBackground;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private CheckboxColors defaultCheckboxColorsCached;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata and from toString */
    private final long onSurface;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final long secondary;

    /* JADX INFO: renamed from: Jk, reason: from kotlin metadata */
    private RichTooltipColors defaultRichTooltipColorsCached;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final long secondaryContainer;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private SelectableChipColors defaultElevatedFilterChipColorsCached;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private ChipColors defaultElevatedAssistChipColorsCached;

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerLow;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private IconButtonColors defaultIconButtonColorsCached;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inversePrimary;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private ChipColors defaultAssistChipColorsCached;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseOnSurface;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerHighest;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private CardColors defaultOutlinedCardColorsCached;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final long onSecondary;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata and from toString */
    private final long errorContainer;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata and from toString */
    private final long error;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerHigh;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata and from toString */
    private final long inverseSurface;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private CardColors defaultCardColorsCached;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceTint;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TopAppBarColors defaultLargeTopAppBarColorsCached;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata and from toString */
    private final long onError;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata and from toString */
    private final long onTertiaryContainer;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private ButtonColors defaultTextButtonColorsCached;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata and from toString */
    private final long surface;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainer;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private ChipColors defaultElevatedSuggestionChipColorsCached;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private MenuItemColors defaultMenuItemColorsCached;

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    private TextFieldColors defaultOutlinedTextFieldColorsCached;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata and from toString */
    private final long surfaceBright;

    /* JADX INFO: renamed from: fcU, reason: from kotlin metadata */
    private SwitchColors defaultSwitchColorsCached;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long outline;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata and from toString */
    private final long onTertiary;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata and from toString */
    private final long scrim;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private IconButtonColors defaultOutlinedIconButtonColorsCached;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private CardColors defaultElevatedCardColorsCached;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private IconButtonColors defaultFilledIconButtonColorsCached;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
    private final long tertiary;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primary;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    private TimePickerColors defaultTimePickerColorsCached;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata and from toString */
    private final long surfaceContainerLowest;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata and from toString */
    private final long onErrorContainer;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final long onPrimaryContainer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurfaceVariant;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    private NavigationItemColors defaultExpressiveNavigationBarItemColorsCached;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private ChipColors defaultSuggestionChipColorsCached;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata and from toString */
    private final long tertiaryContainer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceVariant;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private ButtonColors defaultOutlinedButtonColorsCached;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long onPrimary;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private ButtonColors defaultButtonColorsCached;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primaryContainer;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata and from toString */
    private final long outlineVariant;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: ul, reason: from kotlin metadata */
    private TextFieldColors defaultTextFieldColorsCached;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private ButtonColors defaultFilledTonalButtonColorsCached;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private ButtonColors defaultElevatedButtonColorsCached;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final long onSecondaryContainer;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;

    public /* synthetic */ ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38);
    }

    private ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        this.primary = j2;
        this.onPrimary = j3;
        this.primaryContainer = j4;
        this.onPrimaryContainer = j5;
        this.inversePrimary = j6;
        this.secondary = j7;
        this.onSecondary = j9;
        this.secondaryContainer = j10;
        this.onSecondaryContainer = j11;
        this.tertiary = j12;
        this.onTertiary = j13;
        this.tertiaryContainer = j14;
        this.onTertiaryContainer = j15;
        this.background = j16;
        this.onBackground = j17;
        this.surface = j18;
        this.onSurface = j19;
        this.surfaceVariant = j20;
        this.onSurfaceVariant = j21;
        this.surfaceTint = j22;
        this.inverseSurface = j23;
        this.inverseOnSurface = j24;
        this.error = j25;
        this.onError = j26;
        this.errorContainer = j27;
        this.onErrorContainer = j28;
        this.outline = j29;
        this.outlineVariant = j30;
        this.scrim = j31;
        this.surfaceBright = j32;
        this.surfaceDim = j33;
        this.surfaceContainer = j34;
        this.surfaceContainerHigh = j35;
        this.surfaceContainerHighest = j36;
        this.surfaceContainerLow = j37;
        this.surfaceContainerLowest = j38;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    public final void Bu(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final void EF(TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void ER(IconButtonColors iconButtonColors) {
        this.defaultFilledTonalIconButtonColorsCached = iconButtonColors;
    }

    public final void EWS(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void F(TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    /* JADX INFO: renamed from: FX, reason: from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* JADX INFO: renamed from: G7, reason: from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    public final void GD(ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: GR, reason: from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public final void HBN(SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    public final void HV(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void How(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final CheckboxColors getDefaultCheckboxColorsCached() {
        return this.defaultCheckboxColorsCached;
    }

    public final void JVN(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void Jk(ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void K(IconButtonColors iconButtonColors) {
        this.defaultFilledIconButtonColorsCached = iconButtonColors;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final ChipColors getDefaultElevatedAssistChipColorsCached() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: M7, reason: from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* JADX INFO: renamed from: Mx, reason: from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final SliderColors getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    /* JADX INFO: renamed from: Nxk, reason: from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    public final void Org(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    /* JADX INFO: renamed from: P5, reason: from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    public final void Po6(ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void QZ6(TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    public final void Qu(RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void RQ(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void Rl(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final SelectableChipColors getDefaultInputChipColorsCached() {
        return this.defaultInputChipColorsCached;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final void T3L(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public final void UF(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void Uf(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void UhV(ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final DatePickerColors getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final MenuItemColors getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    public final void VwL(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void W(IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final RichTooltipColors getDefaultRichTooltipColorsCached() {
        return this.defaultRichTooltipColorsCached;
    }

    public final void X4T(ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached() {
        return this.defaultIconToggleButtonColorsCached;
    }

    /* JADX INFO: renamed from: Xw, reason: from getter */
    public final long getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final IconButtonColors getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    public final void Zmq(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public final void a63(SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColorsCached() {
        return this.defaultExpressiveNavigationBarItemColorsCached;
    }

    /* JADX INFO: renamed from: bzg, reason: from getter */
    public final TopAppBarColors getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final ButtonColors getDefaultFilledTonalButtonColorsCached() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    /* JADX INFO: renamed from: dR0, reason: from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RadioButtonColors getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    /* JADX INFO: renamed from: eF, reason: from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* JADX INFO: renamed from: eTf, reason: from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* JADX INFO: renamed from: eWT, reason: from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public final void f(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    /* JADX INFO: renamed from: fcU, reason: from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached() {
        return this.defaultNavigationRailItemColorsCached;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    public final void hRu(SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void i(NavigationItemColors navigationItemColors) {
        this.defaultExpressiveNavigationBarItemColorsCached = navigationItemColors;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final CardColors getDefaultOutlinedCardColorsCached() {
        return this.defaultOutlinedCardColorsCached;
    }

    /* JADX INFO: renamed from: ijL, reason: from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* JADX INFO: renamed from: jB, reason: from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getPrimary() {
        return this.primary;
    }

    public final void kSg(SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void lLA(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledTonalIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getSurface() {
        return this.surface;
    }

    public final void mI(NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final CardColors getDefaultElevatedCardColorsCached() {
        return this.defaultElevatedCardColorsCached;
    }

    public final void mYa(TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: n1, reason: from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final ChipColors getDefaultSuggestionChipColorsCached() {
        return this.defaultSuggestionChipColorsCached;
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached() {
        return this.defaultNavigationBarItemColorsCached;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final CardColors getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final SelectableChipColors getDefaultFilterChipColorsCached() {
        return this.defaultFilterChipColorsCached;
    }

    /* JADX INFO: renamed from: ofS, reason: from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    public final void p0N(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonColorsCached = iconButtonColors;
    }

    /* JADX INFO: renamed from: p5, reason: from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: pJg, reason: from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* JADX INFO: renamed from: piY, reason: from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final ChipColors getDefaultElevatedSuggestionChipColorsCached() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    public final void qm(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    /* JADX INFO: renamed from: rV9, reason: from getter */
    public final TimePickerColors getDefaultTimePickerColorsCached() {
        return this.defaultTimePickerColorsCached;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final ChipColors getDefaultAssistChipColorsCached() {
        return this.defaultAssistChipColorsCached;
    }

    /* JADX INFO: renamed from: s7N, reason: from getter */
    public final SwitchColors getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ButtonColors getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    public final void tFV(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void tUK(ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final ButtonColors getDefaultOutlinedButtonColorsCached() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.S(this.primary)) + "onPrimary=" + ((Object) Color.S(this.onPrimary)) + "primaryContainer=" + ((Object) Color.S(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) Color.S(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) Color.S(this.inversePrimary)) + "secondary=" + ((Object) Color.S(this.secondary)) + "onSecondary=" + ((Object) Color.S(this.onSecondary)) + "secondaryContainer=" + ((Object) Color.S(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) Color.S(this.onSecondaryContainer)) + "tertiary=" + ((Object) Color.S(this.tertiary)) + "onTertiary=" + ((Object) Color.S(this.onTertiary)) + "tertiaryContainer=" + ((Object) Color.S(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) Color.S(this.onTertiaryContainer)) + "background=" + ((Object) Color.S(this.background)) + "onBackground=" + ((Object) Color.S(this.onBackground)) + "surface=" + ((Object) Color.S(this.surface)) + "onSurface=" + ((Object) Color.S(this.onSurface)) + "surfaceVariant=" + ((Object) Color.S(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) Color.S(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) Color.S(this.surfaceTint)) + "inverseSurface=" + ((Object) Color.S(this.inverseSurface)) + "inverseOnSurface=" + ((Object) Color.S(this.inverseOnSurface)) + "error=" + ((Object) Color.S(this.error)) + "onError=" + ((Object) Color.S(this.onError)) + "errorContainer=" + ((Object) Color.S(this.errorContainer)) + "onErrorContainer=" + ((Object) Color.S(this.onErrorContainer)) + "outline=" + ((Object) Color.S(this.outline)) + "outlineVariant=" + ((Object) Color.S(this.outlineVariant)) + "scrim=" + ((Object) Color.S(this.scrim)) + "surfaceBright=" + ((Object) Color.S(this.surfaceBright)) + "surfaceDim=" + ((Object) Color.S(this.surfaceDim)) + "surfaceContainer=" + ((Object) Color.S(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) Color.S(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) Color.S(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) Color.S(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) Color.S(this.surfaceContainerLowest)) + ')';
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final IconButtonColors getDefaultFilledIconButtonColorsCached() {
        return this.defaultFilledIconButtonColorsCached;
    }

    public final void uG(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    public final void ub(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    /* JADX INFO: renamed from: ul, reason: from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final TextFieldColors getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    /* JADX INFO: renamed from: wTp, reason: from getter */
    public final ButtonColors getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final ButtonColors getDefaultElevatedButtonColorsCached() {
        return this.defaultElevatedButtonColorsCached;
    }

    public final void xVH(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    /* JADX INFO: renamed from: xg, reason: from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getScrim() {
        return this.scrim;
    }
}
