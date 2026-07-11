package com.alightcreative.app.motion.scene;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.alightcreative.app.motion.scene.OptionalVector3D;
import com.alightcreative.app.motion.scene.OptionalVector4D;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u000206\u001a\u0016\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0016\u001a\u0016\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u0001\u001a\u0016\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002\u001a\u0016\u0010:\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u0001\u001a\u001e\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u00162\u0006\u00108\u001a\u000206\u001a\u001e\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u00108\u001a\u000206\u001a\u001e\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u00108\u001a\u000206\u001a\u001e\u0010;\u001a\u00020>2\u0006\u0010<\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u00108\u001a\u000206\u001a\n\u0010?\u001a\u00020@*\u00020\u0002\u001a\n\u0010?\u001a\u00020@*\u00020\u0001\u001a\n\u0010?\u001a\u00020@*\u00020\u0016\u001a\u0015\u0010A\u001a\u00020\u0016*\u00020B2\u0006\u0010C\u001a\u00020\u0016H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0001*\u00020D2\u0006\u0010C\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0002*\u00020E2\u0006\u0010C\u001a\u00020\u0002H\u0086\u0004\u001a\f\u0010F\u001a\u0004\u0018\u00010\u0016*\u00020B\u001a\f\u0010F\u001a\u0004\u0018\u00010\u0001*\u00020D\u001a\f\u0010F\u001a\u0004\u0018\u00010\u0002*\u00020E\u001a\n\u0010T\u001a\u00020\u0016*\u00020\u0016\u001a\n\u0010U\u001a\u000206*\u00020\u0016\u001a\u001a\u0010V\u001a\u00020\u0016*\u00020\u00162\u0006\u0010N\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0016\u001a\u001a\u0010V\u001a\u00020\u0001*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u0001\u001a\u001a\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010N\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0002\u001a\u0012\u0010W\u001a\u00020\u0016*\u00020\u00162\u0006\u0010X\u001a\u000206\u001a\u0012\u0010Y\u001a\u00020\u0016*\u00020\u00162\u0006\u0010Z\u001a\u000206\u001a\u001a\u0010[\u001a\u00020\u0016*\u00020\u00162\u0006\u0010X\u001a\u0002062\u0006\u0010Z\u001a\u000206\u001a\u001a\u0010\\\u001a\u00020\u0016*\u00020\u00162\u0006\u0010X\u001a\u0002062\u0006\u0010Z\u001a\u000206\u001a\u001a\u0010]\u001a\u00020\u0016*\u00020\u00162\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u000206\u001a\u0015\u0010a\u001a\u000206*\u00020\u00162\u0006\u0010^\u001a\u00020_H\u0086\u0002\u001a\n\u0010b\u001a\u00020\u0016*\u00020B\u001a\n\u0010b\u001a\u00020\u0001*\u00020D\u001a\n\u0010b\u001a\u00020\u0002*\u00020E\u001a\n\u0010c\u001a\u00020d*\u00020e\u001a\n\u0010f\u001a\u00020g*\u00020e\u001a\u0012\u0010h\u001a\u00020e*\u00020e2\u0006\u0010i\u001a\u00020j\u001a\u0012\u0010h\u001a\u00020e*\u00020e2\u0006\u0010k\u001a\u00020l\u001a\u0012\u0010m\u001a\u00020\u0016*\u00020e2\u0006\u0010k\u001a\u00020l\u001a\u0015\u0010n\u001a\u00020e*\u00020e2\u0006\u0010o\u001a\u00020eH\u0086\u0004\u001a\u0015\u0010p\u001a\u00020e*\u00020e2\u0006\u0010o\u001a\u00020eH\u0086\u0004\u001a\u001a\u0010n\u001a\u00020e*\u00020e2\u0006\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000206\u001a\u0012\u0010n\u001a\u00020e*\u00020e2\u0006\u0010q\u001a\u00020\u0016\u001a*\u0010r\u001a\u00020@*\u00020e2\u0006\u0010s\u001a\u0002062\u0006\u0010t\u001a\u0002062\u0006\u0010u\u001a\u0002062\u0006\u0010v\u001a\u000206\u001a\u0012\u0010r\u001a\u00020@*\u00020e2\u0006\u0010o\u001a\u00020e\u001a*\u0010p\u001a\u00020e*\u00020e2\u0006\u0010s\u001a\u0002062\u0006\u0010t\u001a\u0002062\u0006\u0010u\u001a\u0002062\u0006\u0010v\u001a\u000206\u001a\u001a\u0010p\u001a\u00020e*\u00020e2\u0006\u0010o\u001a\u00020e2\u0006\u0010i\u001a\u00020l\u001a*\u0010n\u001a\u00020e*\u00020e2\u0006\u0010s\u001a\u0002062\u0006\u0010t\u001a\u0002062\u0006\u0010u\u001a\u0002062\u0006\u0010v\u001a\u000206\u001a\u0012\u0010w\u001a\u00020e*\u00020e2\u0006\u00104\u001a\u00020\u0016\u001a\u001a\u0010w\u001a\u00020e*\u00020e2\u0006\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000206\u001a\u001a\u0010x\u001a\u00020e*\u00020e2\u0006\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000206\u001a\u001a\u0010y\u001a\u00020e*\u00020e2\u0006\u0010z\u001a\u0002062\u0006\u0010{\u001a\u000206\u001a\u0012\u0010y\u001a\u00020e*\u00020e2\u0006\u0010|\u001a\u000206\u001a\u0012\u0010}\u001a\u00020e*\u00020e2\u0006\u0010|\u001a\u000206\u001a\u0012\u0010x\u001a\u00020e*\u00020e2\u0006\u0010|\u001a\u000206\u001a\u0015\u0010~\u001a\u00020e*\u00020e2\u0006\u00104\u001a\u00020\u0016H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020e*\u00020e2\u0006\u00104\u001a\u00020\u0016H\u0086\u0002\u001a\u000b\u0010\u0080\u0001\u001a\u00020@*\u00020e\u001a\u000b\u0010\u0081\u0001\u001a\u00020e*\u00020g\u001a\u000f\u0010\u0082\u0001\u001a\u00020\u00162\u0006\u00104\u001a\u000206\u001a\u0007\u0010\u0082\u0001\u001a\u00020\u0016\u001a\u0007\u0010\u0083\u0001\u001a\u00020\u0001\u001a\u0006\u00103\u001a\u00020\u0002\u001a\u000e\u0010\u0084\u0001\u001a\u00020\u0016*\u00020\u0016H\u0086\u0002\u001a\u000e\u0010\u0084\u0001\u001a\u00020\u0001*\u00020\u0001H\u0086\u0002\u001a\u0015\u0010~\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0016\u0010~\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0016\u0010\u007f\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0015\u0010~\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010o\u001a\u00030\u0089\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u000b\u0010\u008a\u0001\u001a\u00020\u0016*\u00020\u0016\u001a\u000b\u0010\u008b\u0001\u001a\u00020\u0016*\u00020\u0016\u001a\u000b\u0010\u0080\u0001\u001a\u00020@*\u00020\u0016\u001a\u0015\u0010~\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0016\u0010~\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0016\u0010\u007f\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0015\u0010~\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010~\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0001H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010o\u001a\u00030\u0089\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010o\u001a\u00020\u0001H\u0086\u0002\u001a\u000b\u0010\u008a\u0001\u001a\u00020\u0001*\u00020\u0001\u001a\u000b\u0010\u008b\u0001\u001a\u00020\u0001*\u00020\u0001\u001a\u000b\u0010\u0080\u0001\u001a\u00020@*\u00020\u0001\u001a\u0015\u0010~\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0016\u0010~\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0016\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0015\u0010~\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u00020\u0002H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u00020\u0002H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020\u0002*\u00020\u00022\u0007\u0010o\u001a\u00030\u0089\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010o\u001a\u00020\u0002H\u0086\u0002\u001a\u000b\u0010\u008a\u0001\u001a\u00020\u0002*\u00020\u0002\u001a\u000b\u0010\u008b\u0001\u001a\u00020\u0002*\u00020\u0002\u001a\u000b\u0010\u0080\u0001\u001a\u00020@*\u00020\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0016*\u00020\u00162\u0006\u0010o\u001a\u00020lH\u0086\u0002\u001a\u0017\u0010\u008c\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010\u008d\u0001\u001a\u000206H\u0086\u0004\u001a\u0017\u0010\u008e\u0001\u001a\u00020\u0016*\u00020\u00162\u0007\u0010\u008f\u0001\u001a\u000206H\u0086\u0004\u001a\u0017\u0010\u0090\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010\u008d\u0001\u001a\u000206H\u0086\u0004\u001a\u0015\u0010~\u001a\u00020B*\u00020B2\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0015\u0010\u007f\u001a\u00020B*\u00020B2\u0006\u0010o\u001a\u00020\u0016H\u0086\u0002\u001a\u0016\u0010\u0086\u0001\u001a\u00020B*\u00020B2\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020B*\u00020B2\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0086\u0001\u001a\u00020B*\u00020B2\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0016\u0010\u0088\u0001\u001a\u00020B*\u00020B2\u0006\u0010o\u001a\u000206H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020B*\u00020B2\u0007\u0010o\u001a\u00030\u0085\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020B*\u00020B2\u0007\u0010o\u001a\u00030\u0087\u0001H\u0086\u0002\u001a\u0017\u0010\u0088\u0001\u001a\u00020B*\u00020B2\u0007\u0010o\u001a\u00030\u0089\u0001H\u0086\u0002\u001a\u000b\u0010\u0091\u0001\u001a\u00020\u0016*\u00020\u0016\u001a\u000b\u0010\u0092\u0001\u001a\u00020\u0016*\u00020\u0016\u001a\u000b\u0010\u0093\u0001\u001a\u00020\u0001*\u00020\u0016\u001a\u0016\u0010\u0086\u0001\u001a\u00020l*\u00020l2\u0006\u0010o\u001a\u00020lH\u0086\u0002\u001a\f\u0010\u0094\u0001\u001a\u00030\u0095\u0001*\u00020l\u001a\u000b\u0010\u0096\u0001\u001a\u000206*\u00020l\u001a\f\u0010\u0097\u0001\u001a\u00030\u0098\u0001*\u00020l\u001a\u000e\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0016*\u00030\u0098\u0001\u001a\u000e\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0001*\u00030\u0098\u0001\u001a\u000e\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0002*\u00030\u0098\u0001\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004\"\u0016\u0010\u0011\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004\"\u0016\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\"\u0016\u0010\u001b\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018\"\u0016\u0010\u001d\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\"\u0016\u0010\u001f\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010\u0018\"\u0016\u0010!\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018\"\u0016\u0010#\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\u0018\"\u0016\u0010%\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u0018\"\u0016\u0010'\u001a\u00020\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\u0018\"\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010)\"\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010)\"\u0016\u0010\u001b\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010)\"\u0016\u0010\u001d\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010)\"\u0016\u0010*\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0016\u0010\u001f\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010)\"\u0016\u0010!\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010)\"\u0016\u0010#\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010)\"\u0016\u0010%\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010)\"\u0016\u0010'\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0016\u0010-\u001a\u00020\u0002*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0016\u00100\u001a\u00020\u0002*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b1\u0010/\"\u0016\u0010*\u001a\u00020\u0001*\u00020\u00168Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u00102\"\u0015\u0010G\u001a\u000206*\u00020\u00168F¢\u0006\u0006\u001a\u0004\bH\u0010I\"\u0015\u0010J\u001a\u000206*\u00020\u00168F¢\u0006\u0006\u001a\u0004\bK\u0010I\"\u0015\u0010L\u001a\u000206*\u00020\u00168F¢\u0006\u0006\u001a\u0004\bM\u0010I\"\u0015\u0010N\u001a\u000206*\u00020\u00168F¢\u0006\u0006\u001a\u0004\bO\u0010I\"\u0015\u0010P\u001a\u000206*\u00020\u00168F¢\u0006\u0006\u001a\u0004\bQ\u0010I\"\u0015\u0010J\u001a\u000206*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bK\u0010R\"\u0015\u0010J\u001a\u000206*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010S¨\u0006\u009c\u0001"}, d2 = {"xyz", "Lcom/alightcreative/app/motion/scene/Vector3D;", "Lcom/alightcreative/app/motion/scene/Vector4D;", "getXyz", "(Lcom/alightcreative/app/motion/scene/Vector4D;)Lcom/alightcreative/app/motion/scene/Vector3D;", "xzy", "getXzy", "yzx", "getYzx", "yxz", "getYxz", "zxy", "getZxy", "zyx", "getZyx", "xxx", "getXxx", "yyy", "getYyy", "zzz", "getZzz", "xx", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getXx", "(Lcom/alightcreative/app/motion/scene/Vector4D;)Lcom/alightcreative/app/motion/scene/Vector2D;", "yy", "getYy", "zz", "getZz", "xy", "getXy", "xz", "getXz", "yx", "getYx", "yz", "getYz", "zy", "getZy", "zx", "getZx", "(Lcom/alightcreative/app/motion/scene/Vector3D;)Lcom/alightcreative/app/motion/scene/Vector2D;", "xy0", "getXy0", "(Lcom/alightcreative/app/motion/scene/Vector3D;)Lcom/alightcreative/app/motion/scene/Vector3D;", "xyz1", "getXyz1", "(Lcom/alightcreative/app/motion/scene/Vector3D;)Lcom/alightcreative/app/motion/scene/Vector4D;", "xyz0", "getXyz0", "(Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/Vector3D;", "Vector4D", "v", "w", "", TtmlNode.TEXT_EMPHASIS_MARK_DOT, CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "cross", "mix", "x", "y", "Lcom/alightcreative/app/motion/scene/SolidColor;", "isNaN", "", "orElse", "Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "default", "Lcom/alightcreative/app/motion/scene/OptionalVector3D;", "Lcom/alightcreative/app/motion/scene/OptionalVector4D;", "orNull", "lengthSquared", "getLengthSquared", "(Lcom/alightcreative/app/motion/scene/Vector2D;)F", "length", "getLength", "max", "getMax", "min", "getMin", "avg", "getAvg", "(Lcom/alightcreative/app/motion/scene/Vector3D;)F", "(Lcom/alightcreative/app/motion/scene/Vector4D;)F", "invertY", "angleDegrees", "coerceIn", "coerceAtLeastX", "minx", "coerceAtLeastY", "miny", "coerceAtLeast", "coerceAtLeastAbs", "copyWithAxis", "axis", "Lcom/alightcreative/app/motion/scene/Axis2D;", "newValue", "get", "require", "asPath", "Landroid/graphics/Path;", "Lcom/alightcreative/app/motion/scene/Rectangle;", "toRectF", "Landroid/graphics/RectF;", "enclosingTransform", "transform", "Lcom/alightcreative/app/motion/scene/Transform;", "matrix", "Landroid/graphics/Matrix;", "getViewRect", "union", InneractiveMediationNameConsts.OTHER, "intersect", TtmlNode.TAG_P, "intersects", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "offset", "expand", "scale", "sx", "sy", CmcdData.STREAMING_FORMAT_SS, "scaleAroundCenter", "plus", "minus", "isFinite", "toRectangle", "Vector2D", "Vector3D", "unaryMinus", "", "times", "", TtmlNode.TAG_DIV, "", "recip", "normalize", "rot", "degrees", "rotRadians", "radians", "rot2D", "perpCw", "perpCCw", "toVector3D", "toGLMat4", "", "getScale", "dump", "", "toVector2DOrNull", "toVector3DOrNull", "toVector4DOrNull", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,572:1\n1#2:573\n*E\n"})
public final class GeometryKt {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Axis2D.values().length];
            try {
                iArr[Axis2D.f45912X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Axis2D.f45913Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Vector2D Vector2D(float f3) {
        return new Vector2D(f3, f3);
    }

    public static final Vector4D Vector4D(Vector3D v2, float f3) {
        Intrinsics.checkNotNullParameter(v2, "v");
        return new Vector4D(v2.getX(), v2.getY(), v2.getZ(), f3);
    }

    public static final Vector2D coerceIn(Vector2D vector2D, Vector2D min, Vector2D max) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        return new Vector2D(RangesKt.coerceIn(vector2D.getX(), min.getX(), max.getX()), RangesKt.coerceIn(vector2D.getY(), min.getY(), max.getY()));
    }

    public static final Vector2D div(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getX() / f3, vector2D.getY() / f3);
    }

    public static final float dot(Vector2D a2, Vector2D b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return (a2.getX() * b2.getX()) + (a2.getY() * b2.getY());
    }

    public static final Rectangle enclosingTransform(Rectangle rectangle, Transform transform) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return enclosingTransform(rectangle, transform.getMatrix());
    }

    public static final Rectangle expand(Rectangle rectangle, float f3, float f4) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return new Rectangle(rectangle.getLeft() - f3, rectangle.getTop() - f4, rectangle.getRight() + f3, rectangle.getBottom() + f4);
    }

    public static final float getLength(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return (float) Math.hypot(vector2D.getX(), vector2D.getY());
    }

    public static final Vector2D getXx(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getX(), vector4D.getX());
    }

    public static final Vector2D getXy(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getX(), vector4D.getY());
    }

    public static final Vector3D getXy0(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D(vector3D.getX(), vector3D.getY(), 0.0f);
    }

    public static final Vector2D getXz(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getX(), vector4D.getZ());
    }

    public static final Vector2D getYx(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getY(), vector4D.getX());
    }

    public static final Vector2D getYy(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getY(), vector4D.getY());
    }

    public static final Vector2D getYz(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getY(), vector4D.getZ());
    }

    public static final Vector2D getZx(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getZ(), vector4D.getX());
    }

    public static final Vector2D getZy(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getZ(), vector4D.getY());
    }

    public static final Vector2D getZz(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector2D(vector4D.getZ(), vector4D.getZ());
    }

    public static final Rectangle intersect(Rectangle rectangle, Rectangle other) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return intersect(rectangle, other.getLeft(), other.getTop(), other.getRight(), other.getBottom());
    }

    public static final boolean intersects(Rectangle rectangle, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return rectangle.getLeft() < f5 && f3 < rectangle.getRight() && rectangle.getTop() < f6 && f4 < rectangle.getBottom();
    }

    public static final boolean isFinite(Rectangle rectangle) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        float left = rectangle.getLeft();
        if (Float.isInfinite(left) || Float.isNaN(left)) {
            return false;
        }
        float top = rectangle.getTop();
        if (Float.isInfinite(top) || Float.isNaN(top)) {
            return false;
        }
        float right = rectangle.getRight();
        if (Float.isInfinite(right) || Float.isNaN(right)) {
            return false;
        }
        float bottom = rectangle.getBottom();
        return (Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true;
    }

    public static final boolean isNaN(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return Float.isNaN(vector4D.getX()) || Float.isNaN(vector4D.getY()) || Float.isNaN(vector4D.getZ()) || Float.isNaN(vector4D.getW());
    }

    public static final Rectangle minus(Rectangle rectangle, Vector2D v2) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(v2, "v");
        return offset(rectangle, -v2.getX(), -v2.getY());
    }

    public static final Vector2D mix(Vector2D x2, Vector2D y2, float f3) {
        Intrinsics.checkNotNullParameter(x2, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        return plus(times(x2, 1.0f - f3), times(y2, f3));
    }

    public static final Vector2D normalize(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return div(vector2D, getLength(vector2D));
    }

    public static final Rectangle offset(Rectangle rectangle, Vector2D v2) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(v2, "v");
        return new Rectangle(rectangle.getLeft() + v2.getX(), rectangle.getTop() + v2.getY(), rectangle.getRight() + v2.getX(), rectangle.getBottom() + v2.getY());
    }

    public static final Vector2D orElse(OptionalVector2D optionalVector2D, Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Intrinsics.checkNotNullParameter(vector2D, "default");
        if (optionalVector2D instanceof OptionalVector2D.NONE) {
            return vector2D;
        }
        if (optionalVector2D instanceof Vector2D) {
            return (Vector2D) optionalVector2D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Vector2D orNull(OptionalVector2D optionalVector2D) {
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        if (optionalVector2D instanceof OptionalVector2D.NONE) {
            return null;
        }
        if (optionalVector2D instanceof Vector2D) {
            return (Vector2D) optionalVector2D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Rectangle plus(Rectangle rectangle, Vector2D v2) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(v2, "v");
        return offset(rectangle, v2.getX(), v2.getY());
    }

    public static final Vector2D recip(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        float f3 = 1;
        return new Vector2D(f3 / vector2D.getX(), f3 / vector2D.getY());
    }

    public static final Vector2D require(OptionalVector2D optionalVector2D) {
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        if (optionalVector2D instanceof Vector2D) {
            return (Vector2D) optionalVector2D;
        }
        throw new MissingVectorException();
    }

    public static final Rectangle scale(Rectangle rectangle, float f3, float f4) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return new Rectangle(rectangle.getLeft() * f3, rectangle.getTop() * f4, rectangle.getRight() * f3, rectangle.getBottom() * f4);
    }

    public static final Vector2D times(Vector2D vector2D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector2D(vector2D.getX() * other.getX(), vector2D.getY() * other.getY());
    }

    public static final Vector2D unaryMinus(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(-vector2D.getX(), -vector2D.getY());
    }

    public static final Rectangle union(Rectangle rectangle, Rectangle other) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return union(rectangle, other.getLeft(), other.getTop(), other.getRight(), other.getBottom());
    }

    public static final Vector2D Vector2D() {
        return Vector2D.INSTANCE.getZERO();
    }

    public static final Vector3D Vector3D() {
        return Vector3D.INSTANCE.getZERO();
    }

    public static final Vector4D Vector4D() {
        return Vector4D.INSTANCE.getZERO();
    }

    public static final float angleDegrees(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return ((float) Math.atan2(vector2D.getX(), vector2D.getY())) * 57.2958f;
    }

    public static final Path asPath(Rectangle rectangle) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Path path = new Path();
        path.moveTo(rectangle.getLeft(), rectangle.getTop());
        path.lineTo(rectangle.getRight(), rectangle.getTop());
        path.lineTo(rectangle.getRight(), rectangle.getBottom());
        path.lineTo(rectangle.getLeft(), rectangle.getBottom());
        path.close();
        return path;
    }

    public static final Vector2D coerceAtLeast(Vector2D vector2D, float f3, float f4) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(Math.max(f3, vector2D.getX()), Math.max(f4, vector2D.getY()));
    }

    public static final Vector2D coerceAtLeastAbs(Vector2D vector2D, float f3, float f4) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        if (Math.abs(vector2D.getX()) > f3) {
            f3 = vector2D.getX();
        }
        if (Math.abs(vector2D.getY()) > f4) {
            f4 = vector2D.getY();
        }
        return new Vector2D(f3, f4);
    }

    public static final Vector2D coerceAtLeastX(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(Math.max(f3, vector2D.getX()), vector2D.getY());
    }

    public static final Vector2D coerceAtLeastY(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getX(), Math.max(f3, vector2D.getY()));
    }

    public static final Vector3D coerceIn(Vector3D vector3D, Vector3D min, Vector3D max) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        return new Vector3D(RangesKt.coerceIn(vector3D.getX(), min.getX(), max.getX()), RangesKt.coerceIn(vector3D.getY(), min.getY(), max.getY()), RangesKt.coerceIn(vector3D.getZ(), min.getZ(), max.getZ()));
    }

    public static final Vector2D copyWithAxis(Vector2D vector2D, Axis2D axis, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(axis, "axis");
        int i2 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
        if (i2 == 1) {
            return new Vector2D(f3, vector2D.getY());
        }
        if (i2 == 2) {
            return new Vector2D(vector2D.getX(), f3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Vector3D cross(Vector3D a2, Vector3D b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return new Vector3D((a2.getY() * b2.getZ()) - (a2.getZ() * b2.getY()), (a2.getZ() * b2.getX()) - (a2.getX() * b2.getZ()), (a2.getX() * b2.getY()) - (a2.getY() * b2.getX()));
    }

    public static final Vector2D div(Vector2D vector2D, double d2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D((float) (((double) vector2D.getX()) / d2), (float) (((double) vector2D.getY()) / d2));
    }

    public static final float dot(Vector3D a2, Vector3D b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return (a2.getX() * b2.getX()) + (a2.getY() * b2.getY()) + (a2.getZ() * b2.getZ());
    }

    public static final String dump(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        String str = String.format("\n%08.5f %5.2f %08.5f\n%08.5f %08.5f %5.2f\n%08.5f %08.5f %08.5f", Arrays.copyOf(new Object[]{Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(fArr[3]), Float.valueOf(fArr[4]), Float.valueOf(fArr[5]), Float.valueOf(fArr[6]), Float.valueOf(fArr[6]), Float.valueOf(fArr[8])}, 9));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final Rectangle enclosingTransform(Rectangle rectangle, Matrix matrix) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        final float[] fArr = {rectangle.getLeft(), rectangle.getTop(), rectangle.getRight(), rectangle.getTop(), rectangle.getRight(), rectangle.getBottom(), rectangle.getLeft(), rectangle.getBottom()};
        XoT.C.Uo(rectangle, new Function0() { // from class: com.alightcreative.app.motion.scene.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GeometryKt.enclosingTransform$lambda$1(fArr);
            }
        });
        matrix.mapPoints(fArr);
        XoT.C.Uo(rectangle, new Function0() { // from class: com.alightcreative.app.motion.scene.Xo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GeometryKt.enclosingTransform$lambda$2(fArr);
            }
        });
        return Rectangle.INSTANCE.enclosing(Arrays.copyOf(fArr, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enclosingTransform$lambda$1(float[] fArr) {
        return "Rectangle.enclosingTransform: before map: " + ArraysKt.joinToString$default(fArr, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enclosingTransform$lambda$2(float[] fArr) {
        return "Rectangle.enclosingTransform: after map: " + ArraysKt.joinToString$default(fArr, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public static final Rectangle expand(Rectangle rectangle, float f3) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return expand(rectangle, f3, f3);
    }

    public static final float get(Vector2D vector2D, Axis2D axis) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(axis, "axis");
        return axis == Axis2D.f45912X ? vector2D.getX() : vector2D.getY();
    }

    public static final float getAvg(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return (vector2D.getX() + vector2D.getY()) / 2.0f;
    }

    public static final float getLength(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return (float) Math.sqrt((vector3D.getX() * vector3D.getX()) + (vector3D.getY() * vector3D.getY()) + (vector3D.getZ() * vector3D.getZ()));
    }

    public static final float getLengthSquared(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return (vector2D.getX() * vector2D.getX()) + (vector2D.getY() * vector2D.getY());
    }

    public static final float getMax(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return Math.max(vector2D.getX(), vector2D.getY());
    }

    public static final float getMin(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return Math.min(vector2D.getX(), vector2D.getY());
    }

    public static final float getScale(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Vector2D.Companion companion = Vector2D.INSTANCE;
        return getLength(minus(times(companion.getUNIT(), matrix), times(companion.getZERO(), matrix)));
    }

    public static final Vector2D getViewRect(Rectangle rectangle, Matrix matrix) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = {rectangle.getLeft(), rectangle.getTop(), rectangle.getRight(), rectangle.getTop(), rectangle.getRight(), rectangle.getBottom()};
        matrix.mapPoints(fArr);
        return new Vector2D(getLength(minus(new Vector2D(fArr[2], fArr[3]), new Vector2D(fArr[0], fArr[1]))), getLength(minus(new Vector2D(fArr[4], fArr[5]), new Vector2D(fArr[2], fArr[3]))));
    }

    public static final Vector2D getXx(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getX(), vector3D.getX());
    }

    public static final Vector3D getXxx(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getX(), vector4D.getX(), vector4D.getX());
    }

    public static final Vector2D getXy(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getX(), vector3D.getY());
    }

    public static final Vector3D getXy0(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector3D(vector2D.getX(), vector2D.getY(), 0.0f);
    }

    public static final Vector3D getXyz(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getX(), vector4D.getY(), vector4D.getZ());
    }

    public static final Vector4D getXyz0(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector4D(vector3D.getX(), vector3D.getY(), vector3D.getZ(), 0.0f);
    }

    public static final Vector4D getXyz1(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector4D(vector3D.getX(), vector3D.getY(), vector3D.getZ(), 1.0f);
    }

    public static final Vector2D getXz(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getX(), vector3D.getZ());
    }

    public static final Vector3D getXzy(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getX(), vector4D.getZ(), vector4D.getY());
    }

    public static final Vector2D getYx(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getY(), vector3D.getX());
    }

    public static final Vector3D getYxz(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getY(), vector4D.getX(), vector4D.getZ());
    }

    public static final Vector2D getYy(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getY(), vector3D.getY());
    }

    public static final Vector3D getYyy(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getY(), vector4D.getY(), vector4D.getY());
    }

    public static final Vector2D getYz(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getY(), vector3D.getZ());
    }

    public static final Vector3D getYzx(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getY(), vector4D.getZ(), vector4D.getX());
    }

    public static final Vector2D getZx(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getZ(), vector3D.getX());
    }

    public static final Vector3D getZxy(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getZ(), vector4D.getX(), vector4D.getY());
    }

    public static final Vector2D getZy(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getZ(), vector3D.getY());
    }

    public static final Vector3D getZyx(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getZ(), vector4D.getY(), vector4D.getX());
    }

    public static final Vector2D getZz(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector2D(vector3D.getZ(), vector3D.getZ());
    }

    public static final Vector3D getZzz(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector3D(vector4D.getZ(), vector4D.getZ(), vector4D.getZ());
    }

    public static final Rectangle intersect(Rectangle rectangle, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return intersects(rectangle, f3, f4, f5, f6) ? new Rectangle(Math.max(f3, rectangle.getLeft()), Math.max(f4, rectangle.getTop()), Math.min(f5, rectangle.getRight()), Math.min(f6, rectangle.getBottom())) : Rectangle.INSTANCE.getEMPTY();
    }

    public static final boolean intersects(Rectangle rectangle, Rectangle other) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return rectangle.getLeft() < other.getRight() && other.getLeft() < rectangle.getRight() && rectangle.getTop() < other.getBottom() && other.getTop() < rectangle.getBottom();
    }

    public static final Vector2D invertY(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getX(), -vector2D.getY());
    }

    public static final boolean isFinite(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        float x2 = vector2D.getX();
        if (Float.isInfinite(x2) || Float.isNaN(x2)) {
            return false;
        }
        float y2 = vector2D.getY();
        return (Float.isInfinite(y2) || Float.isNaN(y2)) ? false : true;
    }

    public static final boolean isNaN(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return Float.isNaN(vector3D.getX()) || Float.isNaN(vector3D.getY()) || Float.isNaN(vector3D.getZ());
    }

    public static final Vector2D minus(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getX() - f3, vector2D.getY() - f3);
    }

    public static final Vector3D mix(Vector3D x2, Vector3D y2, float f3) {
        Intrinsics.checkNotNullParameter(x2, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        return plus(times(x2, 1.0f - f3), times(y2, f3));
    }

    public static final Vector3D normalize(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return div(vector3D, getLength(vector3D));
    }

    public static final Rectangle offset(Rectangle rectangle, float f3, float f4) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return new Rectangle(rectangle.getLeft() + f3, rectangle.getTop() + f4, rectangle.getRight() + f3, rectangle.getBottom() + f4);
    }

    public static final Vector2D perpCCw(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getY(), -vector2D.getX());
    }

    public static final Vector2D perpCw(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(-vector2D.getY(), vector2D.getX());
    }

    public static final Vector2D plus(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getX() + f3, vector2D.getY() + f3);
    }

    public static final Vector3D recip(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        float f3 = 1;
        return new Vector3D(f3 / vector3D.getX(), f3 / vector3D.getY(), f3 / vector3D.getZ());
    }

    public static final Vector3D require(OptionalVector3D optionalVector3D) {
        Intrinsics.checkNotNullParameter(optionalVector3D, "<this>");
        if (optionalVector3D instanceof Vector3D) {
            return (Vector3D) optionalVector3D;
        }
        throw new MissingVectorException();
    }

    public static final Vector2D rot(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        double d2 = ((double) f3) * 0.01745329252d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        return new Vector2D((vector2D.getX() * fCos) - (vector2D.getY() * fSin), (vector2D.getX() * fSin) + (vector2D.getY() * fCos));
    }

    public static final Vector3D rot2D(Vector3D vector3D, float f3) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        double d2 = ((double) f3) * 0.01745329252d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        return new Vector3D((vector3D.getX() * fCos) - (vector3D.getY() * fSin), (vector3D.getX() * fSin) + (vector3D.getY() * fCos), vector3D.getZ());
    }

    public static final Vector2D rotRadians(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        double d2 = f3;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        return new Vector2D((vector2D.getX() * fCos) - (vector2D.getY() * fSin), (vector2D.getX() * fSin) + (vector2D.getY() * fCos));
    }

    public static final Rectangle scale(Rectangle rectangle, float f3) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return scale(rectangle, f3, f3);
    }

    public static final Rectangle scaleAroundCenter(Rectangle rectangle, float f3) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        float width = (rectangle.getWidth() * f3) / 2.0f;
        float height = (rectangle.getHeight() * f3) / 2.0f;
        return new Rectangle(rectangle.getCx() - width, rectangle.getCy() - height, rectangle.getCx() + width, rectangle.getCy() + height);
    }

    public static final Vector2D times(Vector2D vector2D, float f3) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D(vector2D.getX() * f3, vector2D.getY() * f3);
    }

    public static final float[] toGLMat4(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[1], 0.0f, fArr[2], fArr[3], fArr[4], 0.0f, fArr[5], 0.0f, 0.0f, 1.0f, 0.0f, fArr[6], fArr[7], 0.0f, fArr[8]};
    }

    public static final RectF toRectF(Rectangle rectangle) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return new RectF(rectangle.getLeft(), rectangle.getTop(), rectangle.getRight(), rectangle.getBottom());
    }

    public static final Rectangle toRectangle(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return new Rectangle(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final Vector2D toVector2DOrNull(String str) {
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() < 2 || (iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ',', 0, false, 6, (Object) null)) < 0) {
            return null;
        }
        int i2 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ',', i2, false, 4, (Object) null);
        if (iIndexOf$default2 > iIndexOf$default) {
            String strSubstring = str.substring(0, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Float floatOrNull = StringsKt.toFloatOrNull(StringsKt.replace$default(strSubstring, ",", ".", false, 4, (Object) null));
            String strSubstring2 = str.substring(iIndexOf$default2 + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Float floatOrNull2 = StringsKt.toFloatOrNull(StringsKt.replace$default(strSubstring2, ",", ".", false, 4, (Object) null));
            if (floatOrNull == null || floatOrNull2 == null) {
                return null;
            }
            return new Vector2D(floatOrNull.floatValue(), floatOrNull2.floatValue());
        }
        String strSubstring3 = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        Float floatOrNull3 = StringsKt.toFloatOrNull(strSubstring3);
        String strSubstring4 = str.substring(i2, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        Float floatOrNull4 = StringsKt.toFloatOrNull(strSubstring4);
        if (floatOrNull3 == null || floatOrNull4 == null) {
            return null;
        }
        return new Vector2D(floatOrNull3.floatValue(), floatOrNull4.floatValue());
    }

    public static final Vector3D toVector3D(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector3D(vector2D.getX(), vector2D.getY(), 0.0f);
    }

    public static final Vector3D toVector3DOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ',', 0, false, 6, (Object) null);
        int i2 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ',', i2, false, 4, (Object) null);
        int i3 = iIndexOf$default2 + 1;
        int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) str, ',', i3, false, 4, (Object) null);
        if (iIndexOf$default < 0) {
            return null;
        }
        if (iIndexOf$default2 < 0) {
            Vector2D vector2DOrNull = toVector2DOrNull(str);
            if (vector2DOrNull != null) {
                return new Vector3D(vector2DOrNull.getX(), vector2DOrNull.getY(), 0.0f);
            }
            return null;
        }
        if (iIndexOf$default3 >= 0) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Float floatOrNull = StringsKt.toFloatOrNull(strSubstring);
        String strSubstring2 = str.substring(i2, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Float floatOrNull2 = StringsKt.toFloatOrNull(strSubstring2);
        String strSubstring3 = str.substring(i3, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        Float floatOrNull3 = StringsKt.toFloatOrNull(strSubstring3);
        if (floatOrNull == null || floatOrNull2 == null || floatOrNull3 == null) {
            return null;
        }
        return new Vector3D(floatOrNull.floatValue(), floatOrNull2.floatValue(), floatOrNull3.floatValue());
    }

    public static final Vector4D toVector4DOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ',', 0, false, 6, (Object) null);
        int i2 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ',', i2, false, 4, (Object) null);
        int i3 = iIndexOf$default2 + 1;
        int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) str, ',', i3, false, 4, (Object) null);
        int i5 = iIndexOf$default3 + 1;
        int iIndexOf$default4 = StringsKt.indexOf$default((CharSequence) str, ',', i5, false, 4, (Object) null);
        if (iIndexOf$default < 0 || iIndexOf$default2 < 0 || iIndexOf$default3 < 0 || iIndexOf$default4 >= 0) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Float floatOrNull = StringsKt.toFloatOrNull(strSubstring);
        String strSubstring2 = str.substring(i2, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Float floatOrNull2 = StringsKt.toFloatOrNull(strSubstring2);
        String strSubstring3 = str.substring(i3, iIndexOf$default3);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        Float floatOrNull3 = StringsKt.toFloatOrNull(strSubstring3);
        String strSubstring4 = str.substring(i5, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        Float floatOrNull4 = StringsKt.toFloatOrNull(strSubstring4);
        if (floatOrNull == null || floatOrNull2 == null || floatOrNull3 == null || floatOrNull4 == null) {
            return null;
        }
        return new Vector4D(floatOrNull.floatValue(), floatOrNull2.floatValue(), floatOrNull3.floatValue(), floatOrNull4.floatValue());
    }

    public static final Vector3D unaryMinus(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D(-vector3D.getX(), -vector3D.getY(), -vector3D.getZ());
    }

    public static final Rectangle union(Rectangle rectangle, float f3, float f4) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return rectangle.isEmpty() ? rectangle : new Rectangle(Math.min(rectangle.getLeft(), f3), Math.min(f4, rectangle.getTop()), Math.max(rectangle.getRight(), f3), Math.max(f4, rectangle.getBottom()));
    }

    public static final Vector4D coerceIn(Vector4D vector4D, Vector4D min, Vector4D max) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        return new Vector4D(RangesKt.coerceIn(vector4D.getX(), min.getX(), max.getX()), RangesKt.coerceIn(vector4D.getY(), min.getY(), max.getY()), RangesKt.coerceIn(vector4D.getZ(), min.getZ(), max.getZ()), RangesKt.coerceIn(vector4D.getW(), min.getW(), max.getW()));
    }

    public static final Vector2D div(Vector2D vector2D, int i2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        float f3 = i2;
        return new Vector2D(vector2D.getX() / f3, vector2D.getY() / f3);
    }

    public static final float dot(Vector4D a2, Vector4D b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return (a2.getX() * b2.getX()) + (a2.getY() * b2.getY()) + (a2.getZ() * b2.getZ()) + (a2.getW() * b2.getW());
    }

    public static final float getLength(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return (float) Math.sqrt((vector4D.getX() * vector4D.getX()) + (vector4D.getY() * vector4D.getY()) + (vector4D.getZ() * vector4D.getZ()) + (vector4D.getW() * vector4D.getW()));
    }

    public static final boolean isFinite(Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        float x2 = vector3D.getX();
        if (Float.isInfinite(x2) || Float.isNaN(x2)) {
            return false;
        }
        float y2 = vector3D.getY();
        if (Float.isInfinite(y2) || Float.isNaN(y2)) {
            return false;
        }
        float z2 = vector3D.getZ();
        return (Float.isInfinite(z2) || Float.isNaN(z2)) ? false : true;
    }

    public static final boolean isNaN(Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return Float.isNaN(vector2D.getX()) || Float.isNaN(vector2D.getY());
    }

    public static final Vector2D minus(Vector2D vector2D, double d2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D((float) (((double) vector2D.getX()) - d2), (float) (((double) vector2D.getY()) - d2));
    }

    public static final Vector4D mix(Vector4D x2, Vector4D y2, float f3) {
        Intrinsics.checkNotNullParameter(x2, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        return plus(times(x2, 1.0f - f3), times(y2, f3));
    }

    public static final Vector4D normalize(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return div(vector4D, getLength(vector4D));
    }

    public static final Vector2D plus(Vector2D vector2D, double d2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D((float) (((double) vector2D.getX()) + d2), (float) (((double) vector2D.getY()) + d2));
    }

    public static final Vector4D recip(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        float f3 = 1;
        return new Vector4D(f3 / vector4D.getX(), f3 / vector4D.getY(), f3 / vector4D.getZ(), f3 / vector4D.getW());
    }

    public static final Vector4D require(OptionalVector4D optionalVector4D) {
        Intrinsics.checkNotNullParameter(optionalVector4D, "<this>");
        if (optionalVector4D instanceof Vector4D) {
            return (Vector4D) optionalVector4D;
        }
        throw new MissingVectorException();
    }

    public static final Vector2D times(Vector2D vector2D, double d2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        return new Vector2D((float) (((double) vector2D.getX()) * d2), (float) (((double) vector2D.getY()) * d2));
    }

    public static final Rectangle union(Rectangle rectangle, Vector2D p2) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(p2, "p");
        return rectangle.isEmpty() ? rectangle : new Rectangle(Math.min(rectangle.getLeft(), p2.getX()), Math.min(p2.getY(), rectangle.getTop()), Math.max(rectangle.getRight(), p2.getX()), Math.max(p2.getY(), rectangle.getBottom()));
    }

    public static final Vector2D div(Vector2D vector2D, long j2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        float f3 = j2;
        return new Vector2D(vector2D.getX() / f3, vector2D.getY() / f3);
    }

    public static final boolean isFinite(Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        float x2 = vector4D.getX();
        if (Float.isInfinite(x2) || Float.isNaN(x2)) {
            return false;
        }
        float y2 = vector4D.getY();
        if (Float.isInfinite(y2) || Float.isNaN(y2)) {
            return false;
        }
        float z2 = vector4D.getZ();
        if (Float.isInfinite(z2) || Float.isNaN(z2)) {
            return false;
        }
        float w2 = vector4D.getW();
        return (Float.isInfinite(w2) || Float.isNaN(w2)) ? false : true;
    }

    public static final Vector2D minus(Vector2D vector2D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector2D(vector2D.getX() - other.getX(), vector2D.getY() - other.getY());
    }

    public static final SolidColor mix(SolidColor x2, SolidColor y2, float f3) {
        Intrinsics.checkNotNullParameter(x2, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        return ColorKt.plus(ColorKt.times(x2, 1.0f - f3), ColorKt.times(y2, f3));
    }

    public static final Vector3D orElse(OptionalVector3D optionalVector3D, Vector3D vector3D) {
        Intrinsics.checkNotNullParameter(optionalVector3D, "<this>");
        Intrinsics.checkNotNullParameter(vector3D, "default");
        if (optionalVector3D instanceof OptionalVector3D.NONE) {
            return vector3D;
        }
        if (optionalVector3D instanceof Vector3D) {
            return (Vector3D) optionalVector3D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Vector3D orNull(OptionalVector3D optionalVector3D) {
        Intrinsics.checkNotNullParameter(optionalVector3D, "<this>");
        if (optionalVector3D instanceof OptionalVector3D.NONE) {
            return null;
        }
        if (optionalVector3D instanceof Vector3D) {
            return (Vector3D) optionalVector3D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Vector2D plus(Vector2D vector2D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector2D(vector2D.getX() + other.getX(), vector2D.getY() + other.getY());
    }

    public static final Vector2D times(Vector2D vector2D, int i2) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        float f3 = i2;
        return new Vector2D(vector2D.getX() * f3, vector2D.getY() * f3);
    }

    public static final Rectangle union(Rectangle rectangle, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        if (f3 >= f5 || f4 >= f6) {
            return rectangle;
        }
        if (rectangle.getLeft() < rectangle.getRight() && rectangle.getTop() < rectangle.getBottom()) {
            return new Rectangle(Math.min(rectangle.getLeft(), f3), Math.min(rectangle.getTop(), f4), Math.max(rectangle.getRight(), f5), Math.max(rectangle.getBottom(), f6));
        }
        return new Rectangle(f3, f4, f5, f6);
    }

    public static final Vector2D div(Vector2D vector2D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector2D(vector2D.getX() / other.getX(), vector2D.getY() / other.getY());
    }

    public static final Rectangle intersect(Rectangle rectangle, Rectangle other, Matrix transform) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Rectangle rectangleEnclosingTransform = enclosingTransform(other, transform);
        Matrix matrix = new Matrix();
        transform.invert(matrix);
        return enclosingTransform(intersect(rectangle, rectangleEnclosingTransform), matrix);
    }

    public static final Vector3D minus(Vector3D vector3D, float f3) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D(vector3D.getX() - f3, vector3D.getY() - f3, vector3D.getZ() - f3);
    }

    public static final Vector3D plus(Vector3D vector3D, float f3) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D(vector3D.getX() + f3, vector3D.getY() + f3, vector3D.getZ() + f3);
    }

    public static final Vector3D times(Vector3D vector3D, Vector3D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() * other.getX(), vector3D.getY() * other.getY(), vector3D.getZ() * other.getZ());
    }

    public static final Vector3D div(Vector3D vector3D, float f3) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D(vector3D.getX() / f3, vector3D.getY() / f3, vector3D.getZ() / f3);
    }

    public static final Vector3D minus(Vector3D vector3D, double d2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D((float) (((double) vector3D.getX()) - d2), (float) (((double) vector3D.getY()) - d2), (float) (((double) vector3D.getZ()) - d2));
    }

    public static final Vector3D plus(Vector3D vector3D, double d2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D((float) (((double) vector3D.getX()) + d2), (float) (((double) vector3D.getY()) + d2), (float) (((double) vector3D.getZ()) + d2));
    }

    public static final Vector3D times(Vector3D vector3D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() * other.getX(), vector3D.getY() * other.getY(), vector3D.getZ());
    }

    public static final Vector3D div(Vector3D vector3D, double d2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D((float) (((double) vector3D.getX()) / d2), (float) (((double) vector3D.getY()) / d2), (float) (((double) vector3D.getZ()) / d2));
    }

    public static final Vector3D minus(Vector3D vector3D, Vector3D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() - other.getX(), vector3D.getY() - other.getY(), vector3D.getZ() - other.getZ());
    }

    public static final Vector4D orElse(OptionalVector4D optionalVector4D, Vector4D vector4D) {
        Intrinsics.checkNotNullParameter(optionalVector4D, "<this>");
        Intrinsics.checkNotNullParameter(vector4D, "default");
        if (optionalVector4D instanceof OptionalVector4D.NONE) {
            return vector4D;
        }
        if (optionalVector4D instanceof Vector4D) {
            return (Vector4D) optionalVector4D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Vector4D orNull(OptionalVector4D optionalVector4D) {
        Intrinsics.checkNotNullParameter(optionalVector4D, "<this>");
        if (optionalVector4D instanceof OptionalVector4D.NONE) {
            return null;
        }
        if (optionalVector4D instanceof Vector4D) {
            return (Vector4D) optionalVector4D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Vector3D plus(Vector3D vector3D, Vector3D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() + other.getX(), vector3D.getY() + other.getY(), vector3D.getZ() + other.getZ());
    }

    public static final Vector3D times(Vector3D vector3D, float f3) {
        Intrinsics.checkNotNullParameter(vector3D, QiDPjiOCZHDS.KejZWSg);
        return new Vector3D(vector3D.getX() * f3, vector3D.getY() * f3, vector3D.getZ() * f3);
    }

    public static final Vector3D div(Vector3D vector3D, int i2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        float f3 = i2;
        return new Vector3D(vector3D.getX() / f3, vector3D.getY() / f3, vector3D.getZ() / f3);
    }

    public static final Vector3D minus(Vector3D vector3D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() - other.getX(), vector3D.getY() - other.getY(), vector3D.getZ());
    }

    public static final Vector3D plus(Vector3D vector3D, Vector2D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() + other.getX(), vector3D.getY() + other.getY(), vector3D.getZ());
    }

    public static final Vector3D times(Vector3D vector3D, double d2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        return new Vector3D((float) (((double) vector3D.getX()) * d2), (float) (((double) vector3D.getY()) * d2), (float) (((double) vector3D.getZ()) * d2));
    }

    public static final Vector3D div(Vector3D vector3D, long j2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        float f3 = j2;
        return new Vector3D(vector3D.getX() / f3, vector3D.getY() / f3, vector3D.getZ() / f3);
    }

    public static final Vector4D minus(Vector4D vector4D, float f3) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D(vector4D.getX() - f3, vector4D.getY() - f3, vector4D.getZ() - f3, vector4D.getW() - f3);
    }

    public static final Vector4D plus(Vector4D vector4D, float f3) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D(vector4D.getX() + f3, vector4D.getY() + f3, vector4D.getZ() + f3, vector4D.getW() + f3);
    }

    public static final Vector3D times(Vector3D vector3D, int i2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        float f3 = i2;
        return new Vector3D(vector3D.getX() * f3, vector3D.getY() * f3, vector3D.getZ() * f3);
    }

    public static final Vector3D div(Vector3D vector3D, Vector3D other) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector3D(vector3D.getX() / other.getX(), vector3D.getY() / other.getY(), vector3D.getZ() / other.getZ());
    }

    public static final Vector4D minus(Vector4D vector4D, double d2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D((float) (((double) vector4D.getX()) - d2), (float) (((double) vector4D.getY()) - d2), (float) (((double) vector4D.getZ()) - d2), (float) (((double) vector4D.getW()) - d2));
    }

    public static final Vector4D plus(Vector4D vector4D, double d2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D((float) (((double) vector4D.getX()) + d2), (float) (((double) vector4D.getY()) + d2), (float) (((double) vector4D.getZ()) + d2), (float) (((double) vector4D.getW()) + d2));
    }

    public static final Vector4D times(Vector4D vector4D, Vector4D other) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector4D(vector4D.getX() * other.getX(), vector4D.getY() * other.getY(), vector4D.getZ() * other.getZ(), vector4D.getW() * other.getW());
    }

    public static final Vector4D div(Vector4D vector4D, float f3) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D(vector4D.getX() / f3, vector4D.getY() / f3, vector4D.getZ() / f3, vector4D.getW() / f3);
    }

    public static final Vector4D minus(Vector4D vector4D, Vector4D other) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector4D(vector4D.getX() - other.getX(), vector4D.getY() - other.getY(), vector4D.getZ() - other.getZ(), vector4D.getW() - other.getW());
    }

    public static final Vector4D plus(Vector4D vector4D, Vector4D other) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector4D(vector4D.getX() + other.getX(), vector4D.getY() + other.getY(), vector4D.getZ() + other.getZ(), vector4D.getW() + other.getW());
    }

    public static final Vector4D times(Vector4D vector4D, float f3) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D(vector4D.getX() * f3, vector4D.getY() * f3, vector4D.getZ() * f3, vector4D.getW() * f3);
    }

    public static final Vector4D div(Vector4D vector4D, double d2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D((float) (((double) vector4D.getX()) / d2), (float) (((double) vector4D.getY()) / d2), (float) (((double) vector4D.getZ()) / d2), (float) (((double) 2) / d2));
    }

    public static final OptionalVector2D minus(OptionalVector2D optionalVector2D, Vector2D other) {
        Vector2D vector2DMinus;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DMinus = minus(vector2D, other)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DMinus;
    }

    public static final OptionalVector2D plus(OptionalVector2D optionalVector2D, Vector2D other) {
        Vector2D vector2DPlus;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DPlus = plus(vector2D, other)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DPlus;
    }

    public static final Vector4D times(Vector4D vector4D, double d2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        return new Vector4D((float) (((double) vector4D.getX()) * d2), (float) (((double) vector4D.getY()) * d2), (float) (((double) vector4D.getZ()) * d2), (float) (((double) 2) * d2));
    }

    public static final Vector4D div(Vector4D vector4D, int i2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        float f3 = i2;
        return new Vector4D(vector4D.getX() / f3, vector4D.getY() / f3, vector4D.getZ() / f3, vector4D.getW() / f3);
    }

    public static final Vector4D times(Vector4D vector4D, int i2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        float f3 = i2;
        return new Vector4D(vector4D.getX() * f3, vector4D.getY() * f3, vector4D.getZ() * f3, i2 * 2);
    }

    public static final Vector4D div(Vector4D vector4D, long j2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        float f3 = j2;
        return new Vector4D(vector4D.getX() / f3, vector4D.getY() / f3, vector4D.getZ() / f3, vector4D.getW() / f3);
    }

    public static final Vector2D times(Vector2D vector2D, Matrix other) {
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        float[] fArr = {vector2D.getX(), vector2D.getY()};
        other.mapPoints(fArr);
        return new Vector2D(fArr[0], fArr[1]);
    }

    public static final Vector4D div(Vector4D vector4D, Vector4D other) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Vector4D(vector4D.getX() / other.getX(), vector4D.getY() / other.getY(), vector4D.getZ() / other.getZ(), vector4D.getW() / other.getW());
    }

    public static final OptionalVector2D div(OptionalVector2D optionalVector2D, float f3) {
        Vector2D vector2DDiv;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DDiv = div(vector2D, f3)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DDiv;
    }

    public static final OptionalVector2D div(OptionalVector2D optionalVector2D, double d2) {
        Vector2D vector2DDiv;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DDiv = div(vector2D, d2)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DDiv;
    }

    public static final OptionalVector2D times(OptionalVector2D optionalVector2D, float f3) {
        Vector2D vector2DTimes;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DTimes = times(vector2D, f3)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DTimes;
    }

    public static final OptionalVector2D div(OptionalVector2D optionalVector2D, int i2) {
        Vector2D vector2DDiv;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DDiv = div(vector2D, i2)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DDiv;
    }

    public static final OptionalVector2D times(OptionalVector2D optionalVector2D, double d2) {
        Vector2D vector2DTimes;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DTimes = times(vector2D, d2)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DTimes;
    }

    public static final OptionalVector2D div(OptionalVector2D optionalVector2D, long j2) {
        Vector2D vector2DDiv;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DDiv = div(vector2D, j2)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DDiv;
    }

    public static final OptionalVector2D times(OptionalVector2D optionalVector2D, int i2) {
        Vector2D vector2DTimes;
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        Vector2D vector2D = optionalVector2D instanceof Vector2D ? (Vector2D) optionalVector2D : null;
        return (vector2D == null || (vector2DTimes = times(vector2D, i2)) == null) ? OptionalVector2D.NONE.INSTANCE : vector2DTimes;
    }

    public static final Matrix times(Matrix matrix, Matrix other) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postConcat(other);
        return matrix2;
    }
}
