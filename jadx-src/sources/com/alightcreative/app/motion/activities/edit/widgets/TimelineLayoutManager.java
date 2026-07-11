package com.alightcreative.app.motion.activities.edit.widgets;

import HI0.o7q;
import IvA.eO;
import XoT.C;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.activities.edit.widgets.n;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.SceneBookmark;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.widget.RecyclerViewEx;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import yU.O;
import yU.u;
import yU.vd;
import yc.J;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Å\u0002B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013R\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013R\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0015\u001a\u00060\u0013R\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u001b2\f\u0010\u0015\u001a\b\u0018\u00010\u0013R\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b/\u0010\u001fJ\u0017\u00100\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001bH\u0016¢\u0006\u0004\b4\u00103J/\u00105\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0018\u00010\u0013R\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b5\u00106J/\u00107\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0018\u00010\u0013R\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\n¢\u0006\u0004\b@\u00101J\u0015\u0010B\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bB\u00101J\r\u0010C\u001a\u00020\u001b¢\u0006\u0004\bC\u00103J\u001f\u0010G\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020#H\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010L\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u00142\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u00142\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bN\u0010MJ\u0017\u0010Q\u001a\u00020#2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020#2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bU\u0010RR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R+\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u00101R\u0016\u0010g\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0017\u0010j\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bh\u0010f\u001a\u0004\bi\u0010bR\u0014\u0010l\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010fR\u0014\u0010m\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010fR\u0014\u0010n\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010fR\u0014\u0010p\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010fR\u0014\u0010r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010fR\u0014\u0010t\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010fR\u0016\u0010v\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010ZR\u0016\u0010y\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010xR\u0016\u0010|\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010xR#\u0010\u0080\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010f\u001a\u0004\b~\u0010b\"\u0004\b\u007f\u00101R&\u0010\u0084\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010f\u001a\u0005\b\u0082\u0001\u0010b\"\u0005\b\u0083\u0001\u00101RI\u0010\u008e\u0001\u001a\"\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u0086\u0001\u0012\t\b\u0087\u0001\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R©\u0001\u0010\u0099\u0001\u001a\u0081\u0001\u0012\u0016\u0012\u00140D¢\u0006\u000f\b\u0086\u0001\u0012\n\b\u0087\u0001\u0012\u0005\b\b(\u0090\u0001\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u0086\u0001\u0012\t\b\u0087\u0001\u0012\u0004\b\b(A\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u0086\u0001\u0012\t\b\u0087\u0001\u0012\u0004\b\b(?\u0012\u0016\u0012\u00140;¢\u0006\u000f\b\u0086\u0001\u0012\n\b\u0087\u0001\u0012\u0005\b\b(\u0091\u0001\u0012\u0016\u0012\u00140;¢\u0006\u000f\b\u0086\u0001\u0012\n\b\u0087\u0001\u0012\u0005\b\b(\u0092\u0001\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010fR\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010fR\u0018\u0010£\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010ZR\u0018\u0010¥\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010ZR7\u0010®\u0001\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R+\u0010µ\u0001\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R+\u0010¹\u0001\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010°\u0001\u001a\u0006\b·\u0001\u0010²\u0001\"\u0006\b¸\u0001\u0010´\u0001R+\u0010½\u0001\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010°\u0001\u001a\u0006\b»\u0001\u0010²\u0001\"\u0006\b¼\u0001\u0010´\u0001R0\u0010Â\u0001\u001a\u00020#2\u0006\u0010^\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b¾\u0001\u0010`\u001a\u0005\b¿\u0001\u0010%\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010Ì\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bË\u0001\u0010xR\u0016\u0010Î\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÍ\u0001\u0010xR\u0016\u0010Ð\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÏ\u0001\u0010xR\u0016\u0010Ò\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÑ\u0001\u0010xR\u0016\u0010Ô\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÓ\u0001\u0010xR\u0016\u0010Ö\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÕ\u0001\u0010xR\u0016\u0010Ø\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b×\u0001\u0010xR\u0015\u0010Ù\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010xR\u0016\u0010Û\u0001\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÚ\u0001\u0010fR\u001c\u0010ß\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0016\u0010á\u0001\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bà\u0001\u0010fR\u0018\u0010ã\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bâ\u0001\u0010fR\u0016\u0010å\u0001\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bä\u0001\u0010fR0\u0010í\u0001\u001a\t\u0012\u0004\u0012\u00020\n0æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R(\u0010ó\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bî\u0001\u0010x\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R+\u0010÷\u0001\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bô\u0001\u0010°\u0001\u001a\u0006\bõ\u0001\u0010²\u0001\"\u0006\bö\u0001\u0010´\u0001R\u0017\u0010ú\u0001\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0018\u0010þ\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R!\u0010\u0084\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010\u0087\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u0081\u0002\u001a\u0006\b\u0086\u0002\u0010\u0083\u0002R!\u0010\u008a\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0081\u0002\u001a\u0006\b\u0089\u0002\u0010\u0083\u0002R\u0018\u0010\u008e\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R!\u0010\u0091\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010\u0081\u0002\u001a\u0006\b\u0090\u0002\u0010\u0083\u0002R\u001b\u0010\u0093\u0002\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010ù\u0001R!\u0010\u0096\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0002\u0010\u0081\u0002\u001a\u0006\b\u0095\u0002\u0010\u0083\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u0097\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0018\u0010 \u0002\u001a\u00030\u0097\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010\u0099\u0002R\u0018\u0010¢\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010\u008d\u0002R\u001f\u0010¥\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b£\u0002\u0010\u0081\u0002\u001a\u0005\b¤\u0002\u0010bR\u001f\u0010¨\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¦\u0002\u0010\u0081\u0002\u001a\u0005\b§\u0002\u0010bR!\u0010«\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0002\u0010\u0081\u0002\u001a\u0006\bª\u0002\u0010\u0083\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u0018\u0010±\u0002\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0002\u0010xR\u0018\u0010³\u0002\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0002\u0010xR\u0018\u0010·\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R(\u0010»\u0002\u001a\u00020\n2\u0007\u0010¸\u0002\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¹\u0002\u0010b\"\u0005\bº\u0002\u00101R(\u0010¾\u0002\u001a\u00020\n2\u0007\u0010¸\u0002\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¼\u0002\u0010b\"\u0005\b½\u0002\u00101R\u0013\u0010À\u0002\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b¿\u0002\u0010bR\u0013\u0010Â\u0002\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bÁ\u0002\u0010bR\u0013\u0010Ä\u0002\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bÃ\u0002\u0010b¨\u0006Æ\u0002"}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lcom/alightcreative/widget/RecyclerViewEx$j;", "Lcom/alightcreative/widget/RecyclerViewEx$w6;", "Lcom/alightcreative/widget/RecyclerViewEx$Ml;", "Lcom/alightcreative/widget/RecyclerViewEx$n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "state", "", "poH", "(I)Ljava/lang/String;", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$State;", "HFS", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I", "dx", "dy", "", "NC9", "(IILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "wYi", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "", "x", "()[I", "", "ViF", "()Z", "nY", "Lcom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager$j;", "c", "()Lcom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager$j;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "oldAdapter", "newAdapter", "QZ6", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "Vvq", "n7b", "(I)V", "qie", "()V", "HI", "waP", "(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I", "rxp", "recyclerView", "Zmq", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "y", "Of6", "(F)I", "frame", "W1c", "time", CmcdConfiguration.KEY_PLAYBACK_RATE, "ni", "Landroid/view/MotionEvent;", "e", "intercepted", "xMQ", "(Landroid/view/MotionEvent;Z)V", "view", "Landroid/graphics/Canvas;", "canvas", "ty", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/Canvas;)V", "az", "LGK/j;", "detector", "O", "(LGK/j;)Z", "nr", "(LGK/j;)V", "rl", "o", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Z", "Landroid/util/AttributeSet;", "getAttributeSet", "()Landroid/util/AttributeSet;", "<set-?>", "XQ", "Lkotlin/properties/ReadWriteProperty;", "JI", "()I", "ZwA", "internalScrollX", "S", "I", "internalScrollY", "WPU", "tdZ", "rowHeight", "aYN", "rowHeaderWidth", "gripWidth", "playheadWidth", "g", "timelineTopSpace", "te", "addButtonHeight", "iF", "timelineTickMinSpace", "fD", "scaleInProgress", "E2", "F", "scaleFactor", "scaleGesturePrevFocusX", "X", "scaleGestureScrollX", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getTotalTime", "cAB", "totalTime", "N", "getFramesPerHundredSeconds", "WKb", "framesPerHundredSeconds", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "nHg", "Lkotlin/jvm/functions/Function1;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function1;", "eOa", "(Lkotlin/jvm/functions/Function1;)V", "onScrollListener", "Lkotlin/Function5;", a.f62811a, "px", "py", "s7N", "Lkotlin/jvm/functions/Function5;", "getOnClickListener", "()Lkotlin/jvm/functions/Function5;", "kC", "(Lkotlin/jvm/functions/Function5;)V", "onClickListener", "wTp", "notifiedScrollFrame", "Landroid/os/Handler;", "v", "Landroid/os/Handler;", "handler", "rV9", "scrollState", "bzg", "inHorizontalScroll", "Xw", "inVerticalScroll", "", "Lcom/alightcreative/app/motion/scene/SceneBookmark;", "jB", "Ljava/util/Map;", "getBookmarks", "()Ljava/util/Map;", "GT", "(Ljava/util/Map;)V", "bookmarks", "U", "Ljava/lang/Integer;", "getRetimeIn", "()Ljava/lang/Integer;", "R3E", "(Ljava/lang/Integer;)V", "retimeIn", "P5", "getRetimeOut", "Yq", "retimeOut", "M7", "getThumbnailTime", "f11", "thumbnailTime", "p5", "Qg8", "VK2", "(Z)V", SafeDKWebAppInterface.f62917c, "Lcom/alightcreative/app/motion/activities/edit/widgets/n;", "eF", "Lcom/alightcreative/app/motion/activities/edit/widgets/n;", "getOverlay", "()Lcom/alightcreative/app/motion/activities/edit/widgets/n;", "i7", "(Lcom/alightcreative/app/motion/activities/edit/widgets/n;)V", "overlay", "E", "halfTickWidth", "M", "tickHeightSec", "FX", "tickHeightHalfSec", "B", "tickHeightFrame", "J", "ctsTextSize", "D", "ctsTextTopMargin", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "ctsTextOffset", "ctsTextBGOffset", "GR", "ctsBgWidth", "Lyc/J;", "Nxk", "Lyc/J;", "_adapter", "Y", "trimGripSize", "k", "cachedRowCount", "dR0", "basePixelsPerSecond", "", "z", "Ljava/util/List;", "getDraggingLayers", "()Ljava/util/List;", "b", "(Ljava/util/List;)V", "draggingLayers", "piY", "getDraggingLayerOffset", "()F", "Vd", "(F)V", "draggingLayerOffset", "ijL", "getMainCameraLayer", "jE", "mainCameraLayer", "m", "[I", "attrList", "Landroid/content/res/TypedArray;", "eTf", "Landroid/content/res/TypedArray;", "typedAttrs", "Landroid/graphics/Paint;", "xg", "Lkotlin/Lazy;", "W5k", "()Landroid/graphics/Paint;", "timescalePaint", "pJg", "sFO", "dragLayerPaint", "ofS", "V5F", "currentTimePaint", "Landroid/graphics/RectF;", "C", "Landroid/graphics/RectF;", "scratchRect", "Mx", "iu", "playheadPaint", "G7", "_bookmarkColors", "fcU", "XUb", "bookmarkPaint", "Landroid/graphics/Path;", "eWT", "Landroid/graphics/Path;", "bookmarkPath", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "ul", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "keyframeCBSpline", "n1", "keyframePath", "Jk", "keyframeBounds", "Rl", "Sax", "backgroundGradientBottom", "qm", "kQ", "backgroundGradientTop", "mYa", "UR", "timelineHeaderBgPaint", "Landroid/graphics/LinearGradient;", "Org", "Landroid/graphics/LinearGradient;", "timelineBgGradient", "HV", "bgGradTop", "GD", "bgGradBot", "Ljava/lang/Runnable;", "Po6", "Ljava/lang/Runnable;", "dispatchScrollEvents", "value", "GRh", "setScrollX", "scrollX", "Rc", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "scrollY", "jX", "pixelsPerSecond", "MPw", "currentTime", "rR", "currentFrame", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimelineLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineLayoutManager.kt\ncom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,801:1\n33#2,3:802\n33#2,3:805\n1#3:808\n1317#4,2:809\n1863#5,2:811\n1863#5,2:813\n126#6:815\n153#6,3:816\n*S KotlinDebug\n*F\n+ 1 TimelineLayoutManager.kt\ncom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager\n*L\n70#1:802,3\n100#1:805,3\n325#1:809,2\n384#1:811,2\n465#1:813,2\n477#1:815\n477#1:816,3\n*E\n"})
public final class TimelineLayoutManager extends RecyclerView.LayoutManager implements RecyclerViewEx.j, RecyclerViewEx.w6, RecyclerViewEx.Ml, RecyclerViewEx.n {
    static final /* synthetic */ KProperty[] EWS = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TimelineLayoutManager.class, "internalScrollX", "getInternalScrollX()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TimelineLayoutManager.class, SafeDKWebAppInterface.f62917c, "getPlaying()Z", 0))};
    public static final int hRu = 8;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final float tickHeightFrame;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final RectF scratchRect;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final float ctsTextTopMargin;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final float halfTickWidth;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private float scaleFactor;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final float tickHeightHalfSec;

    /* JADX INFO: renamed from: G7, reason: collision with root package name and from kotlin metadata */
    private int[] _bookmarkColors;

    /* JADX INFO: renamed from: GD, reason: from kotlin metadata */
    private float bgGradBot;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final int ctsBgWidth;

    /* JADX INFO: renamed from: HV, reason: from kotlin metadata */
    private float bgGradTop;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final float ctsTextBGOffset;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final float ctsTextSize;

    /* JADX INFO: renamed from: Jk, reason: from kotlin metadata */
    private final RectF keyframeBounds;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final float tickHeightSec;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private Integer thumbnailTime;

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    private final Lazy playheadPaint;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int framesPerHundredSeconds;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private J _adapter;

    /* JADX INFO: renamed from: Org, reason: from kotlin metadata */
    private LinearGradient timelineBgGradient;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Integer retimeOut;

    /* JADX INFO: renamed from: Po6, reason: from kotlin metadata */
    private final Runnable dispatchScrollEvents;

    /* JADX INFO: renamed from: Rl, reason: from kotlin metadata */
    private final Lazy backgroundGradientBottom;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int internalScrollY;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int totalTime;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Integer retimeIn;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final int gripWidth;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final int rowHeight;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private float scaleGestureScrollX;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final ReadWriteProperty internalScrollX;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean inVerticalScroll;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final int trimGripSize;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final AttributeSet attributeSet;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float ctsTextOffset;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final int rowHeaderWidth;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private boolean inHorizontalScroll;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private final int basePixelsPerSecond;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float scaleGesturePrevFocusX;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private com.alightcreative.app.motion.activities.edit.widgets.n overlay;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private final TypedArray typedAttrs;

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    private final Path bookmarkPath;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private boolean scaleInProgress;

    /* JADX INFO: renamed from: fcU, reason: from kotlin metadata */
    private final Lazy bookmarkPaint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int timelineTopSpace;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private final int timelineTickMinSpace;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private Integer mainCameraLayer;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Map bookmarks;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int cachedRowCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int[] attrList;

    /* JADX INFO: renamed from: mYa, reason: from kotlin metadata */
    private final Lazy timelineHeaderBgPaint;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    private final Path keyframePath;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private Function1 onScrollListener;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final int playheadWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    private final Lazy currentTimePaint;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final ReadWriteProperty playing;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private final Lazy dragLayerPaint;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private float draggingLayerOffset;

    /* JADX INFO: renamed from: qm, reason: from kotlin metadata */
    private final Lazy backgroundGradientTop;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private int scrollState;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private Function5 onClickListener;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private final int addButtonHeight;

    /* JADX INFO: renamed from: ul, reason: from kotlin metadata */
    private final CubicBSpline keyframeCBSpline;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private int notifiedScrollFrame;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private final Lazy timescalePaint;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private List draggingLayers;

    public static final class I28 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TimelineLayoutManager f45178n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Object obj, TimelineLayoutManager timelineLayoutManager) {
            super(obj);
            this.f45178n = timelineLayoutManager;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != zBooleanValue) {
                o7q.nr(this.f45178n, new w6(zBooleanValue));
            }
        }
    }

    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TimelineLayoutManager f45179n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, TimelineLayoutManager timelineLayoutManager) {
            super(obj);
            this.f45179n = timelineLayoutManager;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f45179n.handler.removeCallbacks(this.f45179n.dispatchScrollEvents);
            this.f45179n.handler.post(this.f45179n.dispatchScrollEvents);
        }
    }

    public static final class j extends RecyclerView.LayoutParams {
        private int J2;
        private EnumC0632j KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f45180O;
        private int Uo;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$j$j, reason: collision with other inner class name */
        public static final class EnumC0632j {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f45183o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final /* synthetic */ EnumC0632j[] f45184r;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final EnumC0632j f45182n = new EnumC0632j("HEADER", 0);

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final EnumC0632j f45185t = new EnumC0632j("TIMELINE", 1);

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final EnumC0632j f45181O = new EnumC0632j("BACKGROUND", 2);
            public static final EnumC0632j J2 = new EnumC0632j("GRIP", 3);

            private static final /* synthetic */ EnumC0632j[] n() {
                return new EnumC0632j[]{f45182n, f45185t, f45181O, J2};
            }

            static {
                EnumC0632j[] enumC0632jArrN = n();
                f45184r = enumC0632jArrN;
                f45183o = EnumEntriesKt.enumEntries(enumC0632jArrN);
            }

            public static EnumC0632j valueOf(String str) {
                return (EnumC0632j) Enum.valueOf(EnumC0632j.class, str);
            }

            public static EnumC0632j[] values() {
                return (EnumC0632j[]) f45184r.clone();
            }

            private EnumC0632j(String str, int i2) {
            }
        }

        public /* synthetic */ j(int i2, int i3, int i5, EnumC0632j enumC0632j, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, i3, (i9 & 4) != 0 ? -1 : i5, (i9 & 8) != 0 ? EnumC0632j.f45185t : enumC0632j, (i9 & 16) != 0 ? -2 : i7, (i9 & 32) != 0 ? -1 : i8);
        }

        public final int J2() {
            return this.Uo;
        }

        public final int KN() {
            return this.f45180O;
        }

        public final int O() {
            return this.J2;
        }

        public final EnumC0632j Uo() {
            return this.KN;
        }

        public final void gh(EnumC0632j enumC0632j) {
            Intrinsics.checkNotNullParameter(enumC0632j, "<set-?>");
            this.KN = enumC0632j;
        }

        public final void mUb(int i2) {
            this.Uo = i2;
        }

        public final void qie(int i2) {
            this.f45180O = i2;
        }

        public final void xMQ(int i2) {
            this.J2 = i2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i2, int i3, int i5, EnumC0632j placement, int i7, int i8) {
            super(i7, i8);
            Intrinsics.checkNotNullParameter(placement, "placement");
            this.f45180O = i2;
            this.J2 = i3;
            this.Uo = i5;
            this.KN = placement;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.EnumC0632j.values().length];
            try {
                iArr[j.EnumC0632j.f45185t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.EnumC0632j.f45182n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.EnumC0632j.f45181O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.EnumC0632j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class w6 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f45186n;

        w6(boolean z2) {
            this.f45186n = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((View) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void n(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            u uVar = it instanceof u ? (u) it : null;
            if (uVar != null) {
                uVar.n(this.f45186n);
            }
        }
    }

    public final void ni() {
        this.internalScrollY = 0;
        this.handler.removeCallbacks(this.dispatchScrollEvents);
        QgZ();
    }

    public TimelineLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.context = context;
        this.attributeSet = attributeSet;
        Delegates delegates = Delegates.INSTANCE;
        this.internalScrollX = new Ml(0, this);
        this.playheadWidth = context.getResources().getDimensionPixelSize(2131166269);
        this.timelineTopSpace = context.getResources().getDimensionPixelOffset(2131166396);
        this.addButtonHeight = context.getResources().getDimensionPixelOffset(2131165269);
        this.timelineTickMinSpace = context.getResources().getDimensionPixelOffset(2131166393);
        this.scaleFactor = 1.0f;
        this.notifiedScrollFrame = -1;
        this.handler = new Handler();
        this.bookmarks = MapsKt.emptyMap();
        this.playing = new I28(Boolean.FALSE, this);
        this.overlay = n.w6.f45191n;
        this.halfTickWidth = context.getResources().getDimension(2131166395) / 2.0f;
        this.tickHeightSec = context.getResources().getDimension(2131166394);
        this.tickHeightHalfSec = context.getResources().getDimension(2131166392);
        this.tickHeightFrame = context.getResources().getDimension(2131166391);
        this.ctsTextSize = context.getResources().getDimension(2131166382);
        this.ctsTextTopMargin = context.getResources().getDimension(2131166383);
        this.ctsTextOffset = context.getResources().getDimension(2131166381);
        this.ctsTextBGOffset = context.getResources().getDimension(2131165283);
        this.ctsBgWidth = context.getResources().getDimensionPixelOffset(2131166380);
        this.trimGripSize = context.getResources().getDimensionPixelSize(2131166384);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, eO.f4320t, i2, i3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 40);
        this.rowHeight = dimensionPixelSize;
        this.rowHeaderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 80);
        this.gripWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 80);
        Log.d(TimelineLayoutManager.class.getSimpleName(), "rowHeight:" + dimensionPixelSize);
        this.cachedRowCount = -1;
        this.basePixelsPerSecond = context.getResources().getDimensionPixelSize(2131166378);
        this.draggingLayers = CollectionsKt.emptyList();
        int[] intArray = CollectionsKt.toIntArray(CollectionsKt.sorted(CollectionsKt.listOf((Object[]) new Integer[]{2130968784, 2130968777, 2130968743, 2130968789, 2130968739, 2130968740, 2130968785, 2130968786, 2130968787, 2130968788})));
        this.attrList = intArray;
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, intArray, i2, i3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        this.typedAttrs = typedArrayObtainStyledAttributes2;
        this.timescalePaint = LazyKt.lazy(new Function0() { // from class: yU.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.yUZ(this.f75652n);
            }
        });
        this.dragLayerPaint = LazyKt.lazy(new Function0() { // from class: yU.iF
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.fq(this.f75643n);
            }
        });
        this.currentTimePaint = LazyKt.lazy(new Function0() { // from class: yU.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.eb(this.f75668n);
            }
        });
        this.scratchRect = new RectF();
        this.playheadPaint = LazyKt.lazy(new Function0() { // from class: yU.pO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.ex(this.f75657n);
            }
        });
        this.bookmarkPaint = LazyKt.lazy(new Function0() { // from class: yU.Sis
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.w(this.f75627n);
            }
        });
        this.bookmarkPath = new Path();
        CubicBSpline cubicBSplineN = Y3a.j.n();
        this.keyframeCBSpline = cubicBSplineN;
        Path pathT = CubicBSplineKt.toPath(cubicBSplineN).t();
        this.keyframePath = pathT;
        RectF rectF = new RectF();
        pathT.computeBounds(rectF, true);
        this.keyframeBounds = rectF;
        this.backgroundGradientBottom = LazyKt.lazy(new Function0() { // from class: yU.l4Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(TimelineLayoutManager.t1J(this.f75650n));
            }
        });
        this.backgroundGradientTop = LazyKt.lazy(new Function0() { // from class: yU.mz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(TimelineLayoutManager.GH3(this.f75653n));
            }
        });
        this.timelineHeaderBgPaint = LazyKt.lazy(new Function0() { // from class: yU.OU
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.kR();
            }
        });
        this.dispatchScrollEvents = O.rl(new Function2() { // from class: yU.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TimelineLayoutManager.Xli(this.f75656n, (Runnable) obj, (Runnable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C7B(int i2, SceneBookmark sceneBookmark, int i3) {
        return "drawBackground bookmarks    bm: (" + i2 + "," + sceneBookmark + ") frame=" + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GH3(TimelineLayoutManager timelineLayoutManager) {
        return timelineLayoutManager.context.getResources().getColor(2131099649, timelineLayoutManager.context.getTheme());
    }

    private final int HFS(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2 = this.cachedRowCount;
        if (i2 >= 0) {
            return i2;
        }
        int iRl = state.rl();
        int iMax = -1;
        for (int i3 = 0; i3 < iRl; i3++) {
            View viewHI = recycler.HI(i3);
            Intrinsics.checkNotNullExpressionValue(viewHI, "getViewForPosition(...)");
            ViewGroup.LayoutParams layoutParams = viewHI.getLayoutParams();
            j jVar = layoutParams instanceof j ? (j) layoutParams : null;
            int iJ2 = jVar != null ? jVar.J2() : -1;
            if (iJ2 < 0) {
                iJ2 = i3;
            }
            iMax = Math.max(iMax, iJ2);
        }
        int i5 = iMax + 1;
        this.cachedRowCount = i5;
        return i5;
    }

    private final int JI() {
        return ((Number) this.internalScrollX.getValue(this, EWS[0])).intValue();
    }

    private final int Sax() {
        return ((Number) this.backgroundGradientBottom.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TVk(Ref.IntRef intRef, j jVar) {
        return "fillVisibleChildren layer " + intRef.element + " -> " + jVar.J2();
    }

    private final Paint UR() {
        return (Paint) this.timelineHeaderBgPaint.getValue();
    }

    private final Paint V5F() {
        return (Paint) this.currentTimePaint.getValue();
    }

    private final Paint W5k() {
        return (Paint) this.timescalePaint.getValue();
    }

    private final Paint XUb() {
        return (Paint) this.bookmarkPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xli(TimelineLayoutManager timelineLayoutManager, Runnable runnable, Runnable it) {
        Intrinsics.checkNotNullParameter(runnable, "$this$runnable");
        Intrinsics.checkNotNullParameter(it, "it");
        timelineLayoutManager.handler.removeCallbacks(runnable);
        int iRR = timelineLayoutManager.rR();
        if (timelineLayoutManager.notifiedScrollFrame != iRR) {
            timelineLayoutManager.notifiedScrollFrame = iRR;
            Function1 function1 = timelineLayoutManager.onScrollListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iRR));
            }
        }
        return Unit.INSTANCE;
    }

    private final void ZwA(int i2) {
        this.internalScrollX.setValue(this, EWS[0], Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint eb(TimelineLayoutManager timelineLayoutManager) {
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(timelineLayoutManager.context.getResources().getDimension(2131166382));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint ex(TimelineLayoutManager timelineLayoutManager) {
        Paint paint = new Paint();
        paint.setColor(timelineLayoutManager.typedAttrs.getColor(ArraysKt.indexOf(timelineLayoutManager.attrList, 2130968777), -1));
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint fq(TimelineLayoutManager timelineLayoutManager) {
        Paint paint = new Paint();
        paint.setColor(timelineLayoutManager.typedAttrs.getColor(ArraysKt.indexOf(timelineLayoutManager.attrList, 2130968743), -7829368));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gxH() {
        return "fillVisibleChildren IN";
    }

    private final Paint iu() {
        return (Paint) this.playheadPaint.getValue();
    }

    private final int kQ() {
        return ((Number) this.backgroundGradientTop.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint kR() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lRt(Ref.IntRef intRef, boolean z2) {
        return "fillVisibleChildren layer=" + intRef.element + " isDragging=" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit n7u(TimelineLayoutManager timelineLayoutManager, int i2, int i3, View v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        vd vdVar = v2 instanceof vd ? (vd) v2 : null;
        if (vdVar != null) {
            vdVar.rl(timelineLayoutManager.MPw(), i2, i3, timelineLayoutManager.framesPerHundredSeconds, timelineLayoutManager.jX());
        }
        return Unit.INSTANCE;
    }

    private final String poH(int state) {
        return state != 0 ? state != 1 ? state != 2 ? String.valueOf(state) : "SETTLING" : "DRAGGING" : "IDLE";
    }

    private final Paint sFO() {
        return (Paint) this.dragLayerPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t1J(TimelineLayoutManager timelineLayoutManager) {
        return timelineLayoutManager.context.getResources().getColor(2131099649, timelineLayoutManager.context.getTheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint w(TimelineLayoutManager timelineLayoutManager) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(timelineLayoutManager.halfTickWidth * 2.0f);
        return paint;
    }

    private final void wYi(RecyclerView.Recycler recycler, RecyclerView.State state) {
        j.EnumC0632j enumC0632jUo;
        int iO;
        C.Uo(this, new Function0() { // from class: yU.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineLayoutManager.gxH();
            }
        });
        final J j2 = this._adapter;
        if (j2 == null) {
            return;
        }
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, state.rl())), new Function1() { // from class: yU.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TimelineLayoutManager.YiW(j2, this, ((Integer) obj).intValue()));
            }
        });
        s7N(recycler);
        Iterator it = sequenceFilter.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = iIntValue;
            View viewHI = recycler.HI(iIntValue);
            Intrinsics.checkNotNullExpressionValue(viewHI, "getViewForPosition(...)");
            ViewGroup.LayoutParams layoutParams = viewHI.getLayoutParams();
            final j jVar = layoutParams instanceof j ? (j) layoutParams : null;
            if (jVar != null) {
                ((ViewGroup.MarginLayoutParams) jVar).height = this.rowHeight;
                int i2 = n.$EnumSwitchMapping$0[jVar.Uo().ordinal()];
                if (i2 == 1) {
                    iO = (((jVar.O() - jVar.KN()) * jX()) / 1000) + ((ViewGroup.MarginLayoutParams) jVar).leftMargin + ((ViewGroup.MarginLayoutParams) jVar).rightMargin;
                } else if (i2 == 2) {
                    iO = this.rowHeaderWidth;
                } else if (i2 == 3) {
                    iO = mYa();
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iO = this.gripWidth;
                }
                ((ViewGroup.MarginLayoutParams) jVar).width = iO;
                if (jVar.J2() >= 0) {
                    C.Uo(this, new Function0() { // from class: yU.psW
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TimelineLayoutManager.TVk(intRef, jVar);
                        }
                    });
                    intRef.element = jVar.J2();
                }
            } else {
                jVar = null;
            }
            viewHI.setLayoutParams(jVar);
            final boolean zContains = this.draggingLayers.contains(Integer.valueOf(intRef.element));
            C.Uo(this, new Function0() { // from class: yU.Md
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimelineLayoutManager.lRt(intRef, zContains);
                }
            });
            int i3 = intRef.element;
            int i5 = this.rowHeight;
            int i7 = ((i3 * i5) - this.internalScrollY) + this.timelineTopSpace;
            int i8 = i5 + i7;
            ViewGroup.LayoutParams layoutParams2 = viewHI.getLayoutParams();
            boolean z2 = layoutParams2 instanceof j;
            j jVar2 = z2 ? (j) layoutParams2 : null;
            final int iKN = jVar2 != null ? jVar2.KN() : 0;
            j jVar3 = z2 ? (j) layoutParams2 : null;
            final int iO2 = jVar3 != null ? jVar3.O() : 0;
            j jVar4 = z2 ? (j) layoutParams2 : null;
            if (jVar4 == null || (enumC0632jUo = jVar4.Uo()) == null) {
                enumC0632jUo = j.EnumC0632j.f45185t;
            }
            int i9 = n.$EnumSwitchMapping$0[enumC0632jUo.ordinal()];
            if (i9 == 1) {
                int iJX = (((jX() * iKN) / 1000) - JI()) + (mYa() / 2);
                j jVar5 = z2 ? (j) layoutParams2 : null;
                int i10 = iJX - (jVar5 != null ? ((ViewGroup.MarginLayoutParams) jVar5).leftMargin : 0);
                int iJX2 = (((jX() * iO2) / 1000) - JI()) + (mYa() / 2);
                j jVar6 = z2 ? (j) layoutParams2 : null;
                int i11 = jVar6 != null ? ((ViewGroup.MarginLayoutParams) jVar6).rightMargin : 0;
                r(viewHI);
                kSg(viewHI, 0, 0);
                ER(viewHI, i10, i7, iJX2 + i11, i8);
                o7q.O(viewHI, new Function1() { // from class: yU.Zs
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TimelineLayoutManager.n7u(this.f75635n, iKN, iO2, (View) obj);
                    }
                });
                o7q.O(viewHI, new Function1() { // from class: yU.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TimelineLayoutManager.yA(this.f75619n, (View) obj);
                    }
                });
            } else if (i9 == 2) {
                r(viewHI);
                kSg(viewHI, 0, 0);
                ER(viewHI, 0, i7, this.rowHeaderWidth, i8);
            } else if (i9 == 3) {
                r(viewHI);
                kSg(viewHI, 0, 0);
                ER(viewHI, 0, i7, mYa(), i8);
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                r(viewHI);
                kSg(viewHI, 0, 0);
                ER(viewHI, mYa() - this.rowHeaderWidth, i7, mYa(), i8);
            }
        }
        List listGh = recycler.gh();
        Intrinsics.checkNotNullExpressionValue(listGh, "getScrapList(...)");
        for (RecyclerView.ViewHolder viewHolder : CollectionsKt.toList(listGh)) {
            XNZ(viewHolder.itemView);
            recycler.X(viewHolder.itemView);
        }
    }

    private final int[] x() {
        if (this._bookmarkColors == null) {
            this._bookmarkColors = new int[]{this.typedAttrs.getColor(ArraysKt.indexOf(this.attrList, 2130968785), -1), this.typedAttrs.getColor(ArraysKt.indexOf(this.attrList, 2130968786), -1), this.typedAttrs.getColor(ArraysKt.indexOf(this.attrList, 2130968787), -1), this.typedAttrs.getColor(ArraysKt.indexOf(this.attrList, 2130968788), -1)};
        }
        int[] iArr = this._bookmarkColors;
        Intrinsics.checkNotNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit yA(TimelineLayoutManager timelineLayoutManager, View v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        u uVar = v2 instanceof u ? (u) v2 : null;
        if (uVar != null) {
            uVar.n(timelineLayoutManager.Qg8());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint yUZ(TimelineLayoutManager timelineLayoutManager) {
        Paint paint = new Paint();
        paint.setColor(timelineLayoutManager.typedAttrs.getColor(ArraysKt.indexOf(timelineLayoutManager.attrList, 2130968784), -1));
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public final void G(int i2) {
        this.internalScrollY = i2;
        QgZ();
    }

    public final void GT(Map map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.bookmarks = map;
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.Ml
    public void HI() {
        Log.d(TimelineLayoutManager.class.getSimpleName(), "onBeginVerticalScroll : " + poH(this.scrollState));
        this.inHorizontalScroll = false;
        this.inVerticalScroll = true;
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.w6
    public boolean O(GK.j detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.scaleInProgress = true;
        this.scaleGestureScrollX = JI();
        this.scaleGesturePrevFocusX = detector.nr();
        return true;
    }

    public final int Of6(float y2) {
        return (int) (((y2 + this.internalScrollY) - this.timelineTopSpace) / this.rowHeight);
    }

    public final boolean Qg8() {
        return ((Boolean) this.playing.getValue(this, EWS[1])).booleanValue();
    }

    public final void R3E(Integer num) {
        this.retimeIn = num;
    }

    /* JADX INFO: renamed from: Rc, reason: from getter */
    public final int getInternalScrollY() {
        return this.internalScrollY;
    }

    public final void VK2(boolean z2) {
        this.playing.setValue(this, EWS[1], Boolean.valueOf(z2));
    }

    public final void Vd(float f3) {
        this.draggingLayerOffset = f3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean ViF() {
        return (this.scaleInProgress || this.inVerticalScroll) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Vvq(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (recycler == null || state == null) {
            super.Vvq(recycler, state);
        } else {
            wYi(recycler, state);
        }
    }

    public final void W1c(int frame) {
        pr(TimeKt.timeFromFrameNumber(frame, this.framesPerHundredSeconds));
    }

    public final void WKb(int i2) {
        this.framesPerHundredSeconds = i2;
    }

    public final void Yq(Integer num) {
        this.retimeOut = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Zmq(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.Zmq(recyclerView);
        this.cachedRowCount = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0355  */
    @Override // com.alightcreative.widget.RecyclerViewEx.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void az(RecyclerView view, Canvas canvas) {
        Set setEmptySet;
        Set setEmptySet2;
        com.alightcreative.app.motion.activities.edit.widgets.n nVar;
        boolean z2;
        Canvas canvas2;
        Set set;
        Set set2;
        Iterator it;
        LinkedHashSet linkedHashSet;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f3 = -view.getTop();
        float height = view.getHeight();
        if (this.timelineBgGradient == null || height != this.bgGradBot || f3 != this.bgGradTop) {
            this.bgGradBot = height;
            this.bgGradTop = f3;
            this.timelineBgGradient = new LinearGradient(0.0f, this.bgGradTop, 0.0f, this.bgGradBot, kQ(), Sax(), Shader.TileMode.CLAMP);
        }
        UR().setShader(this.timelineBgGradient);
        canvas.drawRect(0.0f, 0.0f, mYa(), this.timelineTopSpace, UR());
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(Math.min(((JI() + (mYa() / 2)) * 1000) / jX(), this.totalTime + 1), this.framesPerHundredSeconds);
        int iN = O.n(Math.max(1, TimeKt.frameNumberFromTime((this.timelineTickMinSpace * 1000) / jX(), this.framesPerHundredSeconds)));
        int iMax = Math.max(0, TimeKt.frameNumberFromTime(((JI() - (mYa() / 2)) * 1000) / jX(), this.framesPerHundredSeconds));
        int i2 = iMax - (iMax % iN);
        int iDifferenceFromFrameTime = (TimeKt.differenceFromFrameTime((JI() * 1000) / jX(), this.framesPerHundredSeconds) * jX()) / 1000;
        com.alightcreative.app.motion.activities.edit.widgets.n nVar2 = this.overlay;
        boolean z3 = nVar2 instanceof n.j;
        n.j jVar = z3 ? (n.j) nVar2 : null;
        if (jVar == null || (setEmptySet = jVar.rl()) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        n.j jVar2 = z3 ? (n.j) nVar2 : null;
        if (jVar2 == null || (setEmptySet2 = jVar2.n()) == null) {
            setEmptySet2 = SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (iN <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + iN + ".");
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(i2, iFrameNumberFromTime, iN);
        int i3 = 2;
        if (i2 <= progressionLastElement) {
            int i5 = i2;
            while (true) {
                int iTimeFromFrameNumber = TimeKt.timeFromFrameNumber(i5, this.framesPerHundredSeconds);
                float fJX = ((((iTimeFromFrameNumber * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
                int i7 = i5 * 100;
                int i8 = this.framesPerHundredSeconds;
                float f4 = i7 % i8 == 0 ? this.tickHeightSec : i7 % (i8 / 2) == 0 ? this.tickHeightHalfSec : this.tickHeightFrame;
                RectF rectF = this.scratchRect;
                z2 = z3;
                float f5 = this.halfTickWidth;
                int i9 = iN;
                nVar = nVar2;
                rectF.set(fJX - f5, 0.0f, fJX + f5, f4);
                if (setEmptySet2.contains(Integer.valueOf(i5))) {
                    int color = W5k().getColor();
                    W5k().setColor(-16711768);
                    canvas.drawRect(this.scratchRect, W5k());
                    W5k().setColor(color);
                    linkedHashSet2.add(Integer.valueOf(i5));
                } else if (setEmptySet.contains(Integer.valueOf(i5))) {
                    int color2 = W5k().getColor();
                    W5k().setColor(-1);
                    canvas.drawRect(this.scratchRect, W5k());
                    W5k().setColor(color2);
                    linkedHashSet2.add(Integer.valueOf(i5));
                } else {
                    Integer num = this.retimeIn;
                    if (num == null || this.retimeOut == null) {
                        canvas.drawRect(this.scratchRect, W5k());
                    } else {
                        if (iTimeFromFrameNumber >= (num != null ? num.intValue() : 0)) {
                            Integer num2 = this.retimeOut;
                            if (iTimeFromFrameNumber <= (num2 != null ? num2.intValue() : 0)) {
                                canvas.drawRect(this.scratchRect, W5k());
                                RectF rectF2 = this.scratchRect;
                                float f6 = this.halfTickWidth;
                                rectF2.set(fJX - f6, 0.0f, fJX + f6, f6 * 2.0f);
                                int color3 = W5k().getColor();
                                W5k().setColor(1442503009);
                                canvas.drawRect(this.scratchRect, W5k());
                                W5k().setColor(color3);
                            }
                        }
                    }
                }
                if (i5 == progressionLastElement) {
                    break;
                }
                i5 += i9;
                z3 = z2;
                nVar2 = nVar;
                iN = i9;
            }
        } else {
            nVar = nVar2;
            z2 = z3;
        }
        int[] iArrX = x();
        Iterator it2 = this.bookmarks.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            final int iIntValue = ((Number) entry.getKey()).intValue();
            final SceneBookmark sceneBookmark = (SceneBookmark) entry.getValue();
            final int iFrameNumberFromTime2 = TimeKt.frameNumberFromTime(iIntValue, this.framesPerHundredSeconds);
            C.Uo(this, new Function0() { // from class: yU.Lu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimelineLayoutManager.C7B(iIntValue, sceneBookmark, iFrameNumberFromTime2);
                }
            });
            if (i2 > iFrameNumberFromTime2 || iFrameNumberFromTime2 > iFrameNumberFromTime) {
                set = setEmptySet;
                set2 = setEmptySet2;
                it = it2;
                linkedHashSet = linkedHashSet2;
            } else {
                int iTimeFromFrameNumber2 = ((((TimeKt.timeFromFrameNumber(iFrameNumberFromTime2, this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
                XUb().setColor(iArrX[sceneBookmark.getAppearance() % iArrX.length]);
                XUb().setAlpha(150);
                float f7 = iTimeFromFrameNumber2;
                float f8 = f7 + 0.0f;
                set = setEmptySet;
                it = it2;
                linkedHashSet = linkedHashSet2;
                set2 = setEmptySet2;
                canvas.drawLine(f8, 0.0f, f8, this.timelineTopSpace, XUb());
                XUb().setAntiAlias(true);
                float f9 = TimeKt.roundToFrame(MPw(), this.framesPerHundredSeconds) == TimeKt.roundToFrame(iIntValue, this.framesPerHundredSeconds) ? this.ctsTextBGOffset * 4 : this.ctsTextBGOffset * i3;
                this.bookmarkPath.reset();
                this.bookmarkPath.moveTo(f8, 0.0f);
                float f10 = 5;
                this.bookmarkPath.lineTo(f8, this.ctsTextBGOffset * f10);
                this.bookmarkPath.lineTo(f7 - f9, this.ctsTextBGOffset * f10);
                this.bookmarkPath.lineTo(f8, this.ctsTextBGOffset);
                this.bookmarkPath.close();
                XUb().setAlpha(255);
                XUb().setStyle(Paint.Style.FILL);
                canvas.drawPath(this.bookmarkPath, XUb());
            }
            linkedHashSet2 = linkedHashSet;
            setEmptySet2 = set2;
            setEmptySet = set;
            it2 = it;
            i3 = 2;
        }
        Set set3 = setEmptySet;
        Set set4 = setEmptySet2;
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        Integer num3 = this.retimeIn;
        if ((num3 != null ? num3.intValue() : 0) > 0) {
            XUb().setColor(-1426400927);
            float fTimeFromFrameNumber = ((((TimeKt.timeFromFrameNumber(TimeKt.frameNumberFromTime(this.retimeIn != null ? r2.intValue() : 0, this.framesPerHundredSeconds), this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
            canvas.drawLine((this.tickHeightFrame / 2) + fTimeFromFrameNumber, 0.0f, fTimeFromFrameNumber, 0.0f, XUb());
            canvas.drawLine(fTimeFromFrameNumber, 0.0f, fTimeFromFrameNumber, this.tickHeightFrame * 2.0f, XUb());
        } else {
            Integer num4 = this.retimeOut;
            if ((num4 != null ? num4.intValue() : 0) > 0) {
            }
        }
        Integer num5 = this.retimeOut;
        if ((num5 != null ? num5.intValue() : 0) > 0) {
            XUb().setColor(-1426400927);
            float fTimeFromFrameNumber2 = iDifferenceFromFrameTime + ((((TimeKt.timeFromFrameNumber(TimeKt.frameNumberFromTime(this.retimeOut != null ? r1.intValue() : 0, this.framesPerHundredSeconds), this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI());
            canvas.drawLine(fTimeFromFrameNumber2 - (this.tickHeightFrame / 2), 0.0f, fTimeFromFrameNumber2, 0.0f, XUb());
            canvas.drawLine(fTimeFromFrameNumber2, 0.0f, fTimeFromFrameNumber2, this.tickHeightFrame * 2.0f, XUb());
        }
        Integer num6 = this.thumbnailTime;
        if ((num6 != null ? num6.intValue() : -1) > -1) {
            Integer num7 = this.thumbnailTime;
            int iFrameNumberFromTime3 = TimeKt.frameNumberFromTime(num7 != null ? num7.intValue() : 0, this.framesPerHundredSeconds);
            XUb().setColor(-957050);
            float fTimeFromFrameNumber3 = ((((TimeKt.timeFromFrameNumber(iFrameNumberFromTime3, this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
            float f11 = this.tickHeightFrame;
            float f12 = 2;
            canvas2 = canvas;
            canvas2.drawLine(fTimeFromFrameNumber3 - (f11 / f12), 0.0f, fTimeFromFrameNumber3 + (f11 / f12), 0.0f, XUb());
            canvas2.drawLine(fTimeFromFrameNumber3, 0.0f, fTimeFromFrameNumber3, this.tickHeightFrame, XUb());
        } else {
            canvas2 = canvas;
        }
        n.w6 w6Var = n.w6.f45191n;
        com.alightcreative.app.motion.activities.edit.widgets.n nVar3 = nVar;
        if (nVar3 == w6Var || z2) {
            Drawable drawable = this.context.getResources().getDrawable(this.bookmarks.containsKey(Integer.valueOf(TimeKt.roundToFrame(MPw(), this.framesPerHundredSeconds))) ? 2131231637 : 2131231636, null);
            String frameNumber = TimeKt.formatFrameNumber(rR(), this.framesPerHundredSeconds, "mm:ss:ff");
            V5F().getTextBounds(frameNumber, 0, frameNumber.length() - 1, new Rect());
            drawable.setBounds((mYa() / 2) - (this.ctsBgWidth / 2), (int) (this.ctsTextTopMargin - this.ctsTextBGOffset), (mYa() / 2) + (this.ctsBgWidth / 2), (int) (((this.ctsTextTopMargin + r6.height()) - (this.ctsTextOffset * 2)) + this.ctsTextBGOffset));
            drawable.draw(canvas2);
            canvas2.drawText(frameNumber, mYa() / 2.0f, this.ctsTextTopMargin + this.ctsTextSize + this.ctsTextOffset, V5F());
        }
        if (Intrinsics.areEqual(nVar3, w6Var)) {
            float fMYa = (mYa() / 2.0f) - (this.playheadWidth / 2);
            int color4 = iu().getColor();
            int iRoundToFrame = TimeKt.roundToFrame(MPw(), this.framesPerHundredSeconds);
            if (this.bookmarks.containsKey(Integer.valueOf(iRoundToFrame))) {
                Paint paintIu = iu();
                SceneBookmark sceneBookmark2 = (SceneBookmark) this.bookmarks.get(Integer.valueOf(iRoundToFrame));
                paintIu.setColor(iArrX[(sceneBookmark2 != null ? sceneBookmark2.getAppearance() : 0) % iArrX.length]);
            }
            canvas2.drawRect(fMYa, 0.0f, fMYa + this.playheadWidth, this.ctsTextTopMargin, iu());
            canvas.drawRect(fMYa, (this.ctsTextTopMargin + this.ctsTextSize) - this.ctsTextOffset, fMYa + this.playheadWidth, piY(), iu());
            iu().setColor(color4);
            return;
        }
        if (!z2) {
            if (!(nVar3 instanceof n.C0633n)) {
                throw new NoWhenBranchMatchedException();
            }
            float fTimeFromFrameNumber4 = ((((TimeKt.timeFromFrameNumber(((n.C0633n) nVar3).n(), this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
            float f13 = this.ctsTextTopMargin + this.ctsTextSize;
            canvas2.save();
            float fHeight = f13 / this.keyframeBounds.height();
            float f14 = f13 / 2.0f;
            canvas2.scale(fHeight, fHeight, fTimeFromFrameNumber4, f14);
            RectF rectF3 = this.keyframeBounds;
            float fWidth = (fTimeFromFrameNumber4 - rectF3.left) - (rectF3.width() / 2.0f);
            RectF rectF4 = this.keyframeBounds;
            canvas2.translate(fWidth, (f14 - rectF4.top) - (rectF4.height() / 2.0f));
            canvas2.drawPath(this.keyframePath, iu());
            canvas2.restore();
            return;
        }
        Set setMinus = SetsKt.minus(set4, (Iterable) linkedHashSet3);
        Set setMinus2 = SetsKt.minus(SetsKt.minus(set3, (Iterable) set4), (Iterable) linkedHashSet3);
        int color5 = W5k().getColor();
        W5k().setColor(-1);
        Iterator it3 = setMinus2.iterator();
        while (it3.hasNext()) {
            float fTimeFromFrameNumber5 = ((((TimeKt.timeFromFrameNumber(r5, this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
            int iIntValue2 = ((Number) it3.next()).intValue() * 100;
            int i10 = this.framesPerHundredSeconds;
            float f15 = iIntValue2 % i10 == 0 ? this.tickHeightSec : iIntValue2 % (i10 / 2) == 0 ? this.tickHeightHalfSec : this.tickHeightFrame;
            RectF rectF5 = this.scratchRect;
            float f16 = this.halfTickWidth;
            rectF5.set(fTimeFromFrameNumber5 - f16, 0.0f, fTimeFromFrameNumber5 + f16, f15);
            canvas2.drawRect(this.scratchRect, W5k());
        }
        W5k().setColor(-16711768);
        Iterator it4 = setMinus.iterator();
        while (it4.hasNext()) {
            float fTimeFromFrameNumber6 = ((((TimeKt.timeFromFrameNumber(r3, this.framesPerHundredSeconds) * jX()) / 1000) + (mYa() / 2)) - JI()) + iDifferenceFromFrameTime;
            int iIntValue3 = ((Number) it4.next()).intValue() * 100;
            int i11 = this.framesPerHundredSeconds;
            float f17 = iIntValue3 % i11 == 0 ? this.tickHeightSec : iIntValue3 % (i11 / 2) == 0 ? this.tickHeightHalfSec : this.tickHeightFrame;
            RectF rectF6 = this.scratchRect;
            float f18 = this.halfTickWidth;
            rectF6.set(fTimeFromFrameNumber6 - f18, 0.0f, fTimeFromFrameNumber6 + f18, f17);
            canvas2.drawRect(this.scratchRect, W5k());
        }
        W5k().setColor(color5);
        float fMYa2 = (mYa() / 2.0f) - (this.playheadWidth / 2);
        int color6 = iu().getColor();
        Paint paintIu2 = iu();
        paintIu2.setAlpha(paintIu2.getAlpha() / 2);
        canvas2.drawRect(fMYa2, 0.0f, fMYa2 + this.playheadWidth, this.ctsTextTopMargin, iu());
        canvas.drawRect(fMYa2, this.ctsTextSize + this.ctsTextTopMargin, fMYa2 + this.playheadWidth, piY(), iu());
        iu().setColor(color6);
    }

    public final void b(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.draggingLayers = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j U() {
        return new j(0, 0, 0, null, 0, 0, 60, null);
    }

    public final void cAB(int i2) {
        this.totalTime = i2;
    }

    public final void eOa(Function1 function1) {
        this.onScrollListener = function1;
    }

    public final void f11(Integer num) {
        this.thumbnailTime = num;
    }

    public final void i7(com.alightcreative.app.motion.activities.edit.widgets.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.overlay = nVar;
    }

    public final void jE(Integer num) {
        this.mainCameraLayer = num;
    }

    public final int jX() {
        return (int) (this.basePixelsPerSecond * this.scaleFactor);
    }

    public final void kC(Function5 function5) {
        this.onClickListener = function5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void n7b(int state) {
        Log.d(TimelineLayoutManager.class.getSimpleName(), "onScrollStateChanged : " + poH(state));
        this.scrollState = state;
        if (state != 1) {
            this.inHorizontalScroll = false;
            this.inVerticalScroll = false;
        }
        super.n7b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean nY() {
        return (this.scaleInProgress || this.inHorizontalScroll || (n() * this.rowHeight) - (piY() - this.timelineTopSpace) <= 0) ? false : true;
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.w6
    public void nr(GK.j detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.scaleInProgress = false;
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.Ml
    public void qie() {
        Log.d(TimelineLayoutManager.class.getSimpleName(), "onBeginHorizontalScroll : " + poH(this.scrollState));
        this.inHorizontalScroll = true;
        this.inVerticalScroll = false;
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.w6
    public boolean rl(GK.j detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (this.scaleInProgress) {
            if (((int) (this.basePixelsPerSecond * this.scaleFactor * detector.J2())) < 1) {
                return false;
            }
            this.scaleFactor *= detector.J2();
            float fNr = this.scaleGestureScrollX + (((detector.nr() - (mYa() / 2)) + this.scaleGestureScrollX) * (detector.J2() - 1));
            this.scaleGestureScrollX = fNr;
            float fNr2 = fNr + (detector.nr() - this.scaleGesturePrevFocusX);
            this.scaleGestureScrollX = fNr2;
            ZwA((int) fNr2);
            this.scaleGesturePrevFocusX = detector.nr();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int rxp(int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2 = this.internalScrollY;
        if (recycler == null || state == null) {
            return super.rxp(dy, recycler, state);
        }
        NC9(0, dy, recycler, state);
        return this.internalScrollY - i2;
    }

    /* JADX INFO: renamed from: tdZ, reason: from getter */
    public final int getRowHeight() {
        return this.rowHeight;
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.j
    public void ty(RecyclerView view, Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Integer num = this.mainCameraLayer;
        if (num != null) {
            int iIntValue = ((num.intValue() * this.rowHeight) - this.internalScrollY) + this.timelineTopSpace;
            Paint paint = new Paint();
            paint.setColor(view.getResources().getColor(2131099722, null));
            Unit unit = Unit.INSTANCE;
            canvas.drawRect(0.0f, iIntValue + 0.0f, mYa() + 0.0f, r3 + iIntValue + 0.0f, paint);
        }
        Iterator it = this.draggingLayers.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            int i2 = this.rowHeight;
            float f3 = ((iIntValue2 * i2) - this.internalScrollY) + this.timelineTopSpace + this.draggingLayerOffset;
            canvas.drawRect(0.0f, f3 + 0.0f, mYa() + 0.0f, i2 + f3 + 0.0f, sFO());
        }
    }

    @Override // com.alightcreative.widget.RecyclerViewEx.n
    public void xMQ(MotionEvent e2, boolean intercepted) {
        Intrinsics.checkNotNullParameter(e2, "e");
        int iRoundToInt = MathKt.roundToInt((((e2.getX() - (mYa() / 2)) + JI()) * 1000) / jX());
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(iRoundToInt, this.framesPerHundredSeconds);
        Function5 function5 = this.onClickListener;
        if (function5 != null) {
            function5.invoke(e2, Integer.valueOf(iRoundToInt), Integer.valueOf(iFrameNumberFromTime), Float.valueOf(e2.getX() / mYa()), Float.valueOf(e2.getY() / piY()));
        }
    }

    private final void NC9(int dx, int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iHFS = ((HFS(recycler, state) * this.rowHeight) - (piY() - this.timelineTopSpace)) + this.addButtonHeight;
        int iJX = (this.totalTime * jX()) / 1000;
        ZwA(JI() + dx);
        this.internalScrollY += dy;
        if (JI() > iJX) {
            ZwA(iJX);
        }
        if (JI() < 0) {
            ZwA(0);
        }
        if (this.internalScrollY > iHFS) {
            this.internalScrollY = iHFS;
        }
        if (this.internalScrollY < 0) {
            this.internalScrollY = 0;
        }
        wYi(recycler, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean YiW(J j2, TimelineLayoutManager timelineLayoutManager, int i2) {
        int iJ2 = j2.J2(i2);
        int i3 = timelineLayoutManager.rowHeight;
        int i5 = ((iJ2 * i3) - timelineLayoutManager.internalScrollY) + timelineLayoutManager.timelineTopSpace;
        int i7 = i3 + i5;
        boolean zContains = timelineLayoutManager.draggingLayers.contains(Integer.valueOf(iJ2));
        SceneElement sceneElementRl = j2.rl(i2);
        int startTime = sceneElementRl.getStartTime();
        int endTime = sceneElementRl.getEndTime();
        if (n.$EnumSwitchMapping$0[j2.Uo(i2).ordinal()] == 1) {
            int iJX = ((((startTime * timelineLayoutManager.jX()) / 1000) - timelineLayoutManager.JI()) + (timelineLayoutManager.mYa() / 2)) - timelineLayoutManager.trimGripSize;
            int iJX2 = (((endTime * timelineLayoutManager.jX()) / 1000) - timelineLayoutManager.JI()) + (timelineLayoutManager.mYa() / 2) + timelineLayoutManager.trimGripSize;
            if (!zContains && (iJX2 < 0 || iJX > timelineLayoutManager.mYa() || i7 < 0 || i5 > timelineLayoutManager.piY())) {
                return false;
            }
            return true;
        }
        if (!zContains && (i7 < 0 || i5 > timelineLayoutManager.piY())) {
            return false;
        }
        return true;
    }

    public final int GRh() {
        return JI();
    }

    public final int MPw() {
        return TimeKt.roundToFrame((JI() * 1000) / jX(), this.framesPerHundredSeconds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void QZ6(RecyclerView.Adapter oldAdapter, RecyclerView.Adapter newAdapter) {
        J j2;
        super.QZ6(oldAdapter, newAdapter);
        if (newAdapter instanceof J) {
            j2 = (J) newAdapter;
        } else {
            j2 = null;
        }
        this._adapter = j2;
    }

    public final void pr(int time) {
        ZwA((time * jX()) / 1000);
        this.handler.removeCallbacks(this.dispatchScrollEvents);
        QgZ();
    }

    public final int rR() {
        return TimeKt.frameNumberFromTime((JI() * 1000) / jX(), this.framesPerHundredSeconds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int waP(int dx, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iJI = JI();
        if (recycler != null && state != null) {
            NC9(dx, 0, recycler, state);
            return JI() - iJI;
        }
        return super.waP(dx, recycler, state);
    }
}
