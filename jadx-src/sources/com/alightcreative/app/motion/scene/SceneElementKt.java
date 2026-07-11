package com.alightcreative.app.motion.scene;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.ShaderGroup;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import d2n.Ml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001ad\u0010\u0012\u001a\u00020\u0010*\u00020\u00002K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aO\u0010\u0015\u001a\u00020\u0010*\u00020\u000026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001aS\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u000126\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00000\u0014¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010!\u001a\u00020\u0001*\u00020\u00002\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a!\u0010%\u001a\u00020\u0001*\u00020\u00002\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&\u001a)\u0010(\u001a\u00020\u0001*\u00020\u00002\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0001¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010+\u001a\u00020\r*\u00020\u00002\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u00020\r*\u00020\u00002\u0006\u0010-\u001a\u00020\r¢\u0006\u0004\b.\u0010,\u001a\u0019\u00101\u001a\u000200*\u00020\u00002\u0006\u0010/\u001a\u00020\u0001¢\u0006\u0004\b1\u00102\u001a\u0019\u00103\u001a\u00020\u0001*\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b3\u00104\u001a\u0019\u00106\u001a\u000205*\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b6\u00107\u001a-\u0010;\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020:09080\u0006*\u00020\u0000¢\u0006\u0004\b;\u0010\t\u001a-\u0010<\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020:09080\u0006*\u00020\u0000¢\u0006\u0004\b<\u0010\t\u001a%\u0010>\u001a\u00020\u0000*\u00020\u00002\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000\u0017¢\u0006\u0004\b>\u0010\u001a\u001a\u001f\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020:090\u0006*\u00020\u0000¢\u0006\u0004\b?\u0010\t\u001a\u0011\u0010@\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b@\u0010A\u001a\u0019\u0010D\u001a\u00020C*\b\u0012\u0004\u0012\u00020\u00030BH\u0002¢\u0006\u0004\bD\u0010E\u001a\u0019\u0010F\u001a\u00020C*\b\u0012\u0004\u0012\u00020\u00030BH\u0002¢\u0006\u0004\bF\u0010E\u001a\u001d\u0010D\u001a\u00020C*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030GH\u0002¢\u0006\u0004\bD\u0010H\u001a\u001d\u0010F\u001a\u00020C*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030GH\u0002¢\u0006\u0004\bF\u0010H\u001a\u001f\u0010M\u001a\u00020L*\u00020I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000J¢\u0006\u0004\bM\u0010N\u001aI\u0010W\u001a\u00020C*\u00020\u00002\u0006\u0010O\u001a\u00020I2\u0006\u0010P\u001a\u0002002\u0006\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u0002002\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u0001¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010Y\u001a\u00020C*\u00020\u0000¢\u0006\u0004\bY\u0010Z\u001a\u0011\u0010[\u001a\u00020C*\u00020\u0000¢\u0006\u0004\b[\u0010Z\u001a\u0019\u0010\\\u001a\u00020L*\u00020\u00002\u0006\u0010O\u001a\u00020I¢\u0006\u0004\b\\\u0010]\u001a\u0019\u0010^\u001a\u00020L*\u00020\u00002\u0006\u0010O\u001a\u00020I¢\u0006\u0004\b^\u0010]\u001a!\u0010_\u001a\u00020L*\u00020\u00002\u0006\u0010O\u001a\u00020I2\u0006\u0010/\u001a\u000200¢\u0006\u0004\b_\u0010`\u001a1\u0010_\u001a\u00020L*\u00020\u00002\u0006\u0010O\u001a\u00020I2\u0006\u0010/\u001a\u0002002\u0006\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u0001¢\u0006\u0004\b_\u0010a\u001a#\u0010f\u001a\u00020\u0010*\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010g\u001a#\u0010h\u001a\u00020\u0010*\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bh\u0010g\u001a#\u0010i\u001a\u00020\u0010*\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bi\u0010g\u001a'\u0010o\u001a\u00020\u00002\u0006\u0010k\u001a\u00020j2\b\u0010l\u001a\u0004\u0018\u00010b2\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010p\u001a3\u0010s\u001a\u00020\u0000*\u00020\u00002\u0006\u0010q\u001a\u00020b2\b\u0010l\u001a\u0004\u0018\u00010b2\u0006\u0010n\u001a\u00020m2\u0006\u0010r\u001a\u00020C¢\u0006\u0004\bs\u0010t\u001a#\u0010f\u001a\u00020\u0010*\u00020u2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010v\u001a\u001f\u0010w\u001a\u00020u2\b\u0010l\u001a\u0004\u0018\u00010b2\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bw\u0010x\u001a\u0019\u0010z\u001a\u00020y*\u00020\u00002\u0006\u0010O\u001a\u00020I¢\u0006\u0004\bz\u0010{\u001a4\u0010\u007f\u001a\u00020\u0000*\u00020\u00002\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000}¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u001f\u0010\u0082\u0001\u001a\u00020C*\u00020\u00002\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\r¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a%\u0010\u0085\u0001\u001a\u00020C*\u00020\u00002\u0006\u0010O\u001a\u00020I2\u0007\u0010\u0084\u0001\u001a\u00020\r¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0017\u0010\u0087\u0001\u001a\u0002008\u0006X\u0086T¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001\"$\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020L0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001\"%\u0010\u008d\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020L0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001\"v\u0010\u008f\u0001\u001a\\\u0012\u0006\u0012\u0004\u0018\u00010b\u0012P\u0012N\u0012\u0015\u0012\u0013\u0018\u00010b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(c\u0012\u0013\u0012\u00110m¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110C¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(r\u0012\u0004\u0012\u00020\u00000\nj\u0003`\u008e\u00010G8\u0006¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"$\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020L0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001\"\u0017\u0010\u0094\u0001\u001a\u00020\u00018\u0002X\u0082T¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001\"1\u0010\u009a\u0001\u001a\u001c\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00000\u0099\u0001\u0012\u0004\u0012\u00020L0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u008b\u0001\"$\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020b0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008b\u0001\"1\u0010\u009c\u0001\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020y0\u0089\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008b\u0001\"\u0018\u0010\u009f\u0001\u001a\u00020C*\u00020j8F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0017\u0010 \u0001\u001a\u00020C*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b \u0001\u0010Z\"\u0017\u0010¡\u0001\u001a\u00020C*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010Z\"\u001d\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\t\"\u0018\u0010¦\u0001\u001a\u000200*\u00020\u00008F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0018\u0010©\u0001\u001a\u00020b*\u00020\u00008F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0017\u0010«\u0001\u001a\u00020C*\u00020\u00008F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010Z\"\u0017\u0010¬\u0001\u001a\u00020C*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010Z\"\u0018\u0010¬\u0001\u001a\u00020C*\u00020I8F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u001e\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030®\u00010\u0006*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010\t\"\u0018\u0010±\u0001\u001a\u00020C*\u00020b8F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001\"\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010b*\u00020b8F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001\"\u001a\u0010·\u0001\u001a\u0004\u0018\u00010b*\u00020b8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010´\u0001\"\u001a\u0010¹\u0001\u001a\u0004\u0018\u00010b*\u00020b8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010´\u0001\"\u001b\u0010¼\u0001\u001a\u0005\u0018\u00010®\u0001*\u00020b8F¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001\"\u0018\u0010¿\u0001\u001a\u00020L*\u00020u8F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0019\u0010¿\u0001\u001a\u00020L*\u00030\u008c\u00018F¢\u0006\b\u001a\u0006\b½\u0001\u0010À\u0001\"\u0018\u0010Ã\u0001\u001a\u00020L*\u00020I8F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0017\u0010U\u001a\u00020L*\u00020I8F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Â\u0001\"\u0019\u0010È\u0001\u001a\u00030Å\u0001*\u00020I8F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0018\u0010¿\u0001\u001a\u00020L*\u00020I8F¢\u0006\b\u001a\u0006\b½\u0001\u0010Â\u0001\"\u0019\u0010Ê\u0001\u001a\u000200*\u00020\u00008Æ\u0002¢\u0006\b\u001a\u0006\bÉ\u0001\u0010¥\u0001*\u0099\u0001\u0010Ë\u0001\"I\u0012\u0015\u0012\u0013\u0018\u00010b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(c\u0012\u0013\u0012\u00110m¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110C¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(r\u0012\u0004\u0012\u00020\u00000\n2I\u0012\u0015\u0012\u0013\u0018\u00010b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(c\u0012\u0013\u0012\u00110m¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110C¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(r\u0012\u0004\u0012\u00020\u00000\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ì\u0001"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElement;", "", "index", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "visualEffectAtPosition", "(Lcom/alightcreative/app/motion/scene/SceneElement;I)Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "", "Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "getEdgeDecorations", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Ljava/util/List;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "iid", "effectRef", "", FileUploadManager.f61572j, "forEachVisualEffectIndexed", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function2;", "forEachVisualEffect", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "transform", "mapChildren", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lkotlin/jvm/functions/Function1;)Lcom/alightcreative/app/motion/scene/SceneElement;", "initialDepth", "depth", "el", "mapChildrenWithDepth", "(Lcom/alightcreative/app/motion/scene/SceneElement;ILkotlin/jvm/functions/Function2;)Lcom/alightcreative/app/motion/scene/SceneElement;", "sceneTimeMillis", "sceneTimeToMediaTimeMillis", "(Lcom/alightcreative/app/motion/scene/SceneElement;I)I", "sceneFrame", "framesPerHundredSeconds", "sceneFrameToMediaFrameMillis", "(Lcom/alightcreative/app/motion/scene/SceneElement;II)I", "absStartTime", "sceneFrameToMediaTimeMillis", "(Lcom/alightcreative/app/motion/scene/SceneElement;III)I", "sceneTimeMicros", "sceneTimeToMediaTimeMicros", "(Lcom/alightcreative/app/motion/scene/SceneElement;J)J", "sceneTimeNanos", "sceneTimeToMediaTimeNanos", "time", "", "fractionalTime", "(Lcom/alightcreative/app/motion/scene/SceneElement;I)F", "sceneTime", "(Lcom/alightcreative/app/motion/scene/SceneElement;F)I", "", "sceneTimeSeconds", "(Lcom/alightcreative/app/motion/scene/SceneElement;F)D", "LoA/j;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "getKeyablePropertyLenses", "getAdjustablePropertyLenses", "adjuster", "copyAdjustingKeyframeTiming", "getKeyableProperties", "recreateEngineState", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Lcom/alightcreative/app/motion/scene/SceneElement;", "", "", "includesShaderEffects", "(Ljava/util/Collection;)Z", "includesScriptEffects", "", "(Ljava/util/Map;)Z", "Lcom/alightcreative/app/motion/scene/Scene;", "", "elements", "Lcom/alightcreative/app/motion/scene/Rectangle;", "actualBoundsFor", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/lang/Iterable;)Lcom/alightcreative/app/motion/scene/Rectangle;", "scene", "x", "y", "t", "Lyc/nKE;", "userPreviewMode", "frame", "fphs", "hitTestAtTime", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;FFFLyc/nKE;II)Z", "hasAnyAudio", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Z", "hasAnyVideo", "boundsInScene", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/Rectangle;", "boundsOverLifetime", "boundsAtTime", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;F)Lcom/alightcreative/app/motion/scene/Rectangle;", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;FII)Lcom/alightcreative/app/motion/scene/Rectangle;", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "serializeCommonAttributes", "serializeCommonChildTags", "Lcom/alightcreative/app/motion/scene/SceneElementType;", "type", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "unserializeBaseSceneElement", "(Lcom/alightcreative/app/motion/scene/SceneElementType;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lcom/alightcreative/app/motion/scene/SceneElement;", "tag", "isPackage", "unserializeCommonChildTag", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Stroke;", "(Lcom/alightcreative/app/motion/scene/Stroke;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "unserializeStroke", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lcom/alightcreative/app/motion/scene/Stroke;", "Lcom/alightcreative/app/motion/scene/ElementTiming;", "absoluteTimingInScene", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/ElementTiming;", "elementPath", "", "withClippingCache", "withAbsoluteTimingAndSpeedInScene", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/util/List;Ljava/util/Map;)Lcom/alightcreative/app/motion/scene/SceneElement;", "parentIdOfLayer", "directParent", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/Long;)Z", "targetElId", "indirectParent", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;J)Z", "MINIMUM_ELEMENT_SPEED", "F", "Ljava/util/WeakHashMap;", "strokeBoundsCache", "Ljava/util/WeakHashMap;", "Lcom/alightcreative/app/motion/scene/Drawing;", "drawingBoundsCache", "Lcom/alightcreative/app/motion/scene/ElementReader;", "elementReaders", "Ljava/util/Map;", "getElementReaders", "()Ljava/util/Map;", "actualBoundsCache", "MAX_SCENE_SIZE", "I", "Landroid/graphics/Region;", "InfinityBounds", "Landroid/graphics/Region;", "Lkotlin/Pair;", "boundsOverLifetimeCache", "pointStringCache", "timingCache", "getHasFill", "(Lcom/alightcreative/app/motion/scene/SceneElementType;)Z", "hasFill", "isGroup", "isElementOrLinkedProject", "getVisualEffectsInOrder", "visualEffectsInOrder", "getAudioVideoSpeedFactor", "(Lcom/alightcreative/app/motion/scene/SceneElement;)F", "audioVideoSpeedFactor", "getDisplayLabel", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Ljava/lang/String;", "displayLabel", "getMissingMedia", "missingMedia", "isTimeDependent", "(Lcom/alightcreative/app/motion/scene/Scene;)Z", "Lcom/alightcreative/app/motion/scene/UserElementProperty;", "getSettableUserParams", "settableUserParams", "isValidUserElementTag", "(Ljava/lang/String;)Z", "getUserElementTagRaw", "(Ljava/lang/String;)Ljava/lang/String;", "userElementTagRaw", "getUserElementTagId", "userElementTagId", "getUserElementTagLabel", "userElementTagLabel", "getUserElementTextProperty", "(Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/UserElementProperty;", "userElementTextProperty", "getBounds", "(Lcom/alightcreative/app/motion/scene/Stroke;)Lcom/alightcreative/app/motion/scene/Rectangle;", "bounds", "(Lcom/alightcreative/app/motion/scene/Drawing;)Lcom/alightcreative/app/motion/scene/Rectangle;", "getActualBounds", "(Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/Rectangle;", "actualBounds", "getFrame", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getCenter", "(Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/Vector2D;", TtmlNode.CENTER, "getDurationInSeconds", "durationInSeconds", "ElementReader", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneElement.kt\ncom/alightcreative/app/motion/scene/SceneElementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,1131:1\n289#1:1249\n290#1:1264\n1611#2,9:1132\n1863#2:1141\n1864#2:1143\n1620#2:1144\n1872#2,2:1145\n1874#2:1148\n1863#2,2:1149\n1755#2,3:1151\n1755#2,3:1154\n1755#2,3:1157\n1797#2,3:1163\n1797#2,3:1173\n1557#2:1180\n1628#2,3:1181\n1557#2:1184\n1628#2,3:1185\n1557#2:1189\n1628#2,2:1190\n1630#2:1194\n1872#2,2:1199\n1872#2,2:1201\n1874#2:1233\n1874#2:1234\n1872#2,2:1250\n1874#2:1263\n1872#2,2:1265\n1874#2:1276\n1797#2,3:1291\n1611#2,9:1294\n1863#2:1303\n1864#2:1305\n1620#2:1306\n1557#2:1307\n1628#2,3:1308\n1755#2,2:1311\n1757#2:1316\n1755#2,3:1317\n1797#2,3:1327\n1368#2:1334\n1454#2,2:1335\n1557#2:1337\n1628#2,3:1338\n1456#2,3:1341\n1797#2,3:1344\n1863#2,2:1351\n1863#2,2:1353\n1863#2,2:1355\n1755#2,3:1359\n1797#2,3:1369\n1567#2:1372\n1598#2,3:1373\n1797#2,3:1376\n1601#2:1379\n295#2,2:1394\n1611#2,9:1396\n1863#2:1405\n1864#2:1407\n1620#2:1408\n1557#2:1409\n1628#2,3:1410\n1#3:1142\n1#3:1147\n1#3:1252\n1#3:1304\n1#3:1330\n1#3:1406\n381#4,3:1160\n384#4,4:1166\n381#4,3:1170\n384#4,4:1176\n381#4,7:1320\n381#4,3:1331\n384#4,4:1347\n381#4,7:1362\n381#4,7:1380\n381#4,7:1413\n143#5:1188\n143#5:1192\n128#5:1193\n143#5:1195\n143#5:1196\n143#5:1197\n124#5:1198\n143#5:1203\n124#5,9:1204\n143#5:1213\n124#5,9:1214\n143#5:1223\n124#5,9:1224\n143#5:1235\n124#5:1236\n143#5:1237\n124#5:1238\n143#5:1239\n124#5:1240\n143#5:1241\n124#5:1242\n143#5:1243\n132#5:1244\n124#5:1245\n143#5:1246\n132#5:1247\n124#5:1248\n143#5:1253\n140#5:1254\n124#5:1255\n140#5:1256\n124#5:1257\n124#5:1258\n124#5:1259\n124#5:1260\n124#5:1261\n124#5:1262\n143#5:1267\n124#5:1268\n140#5:1269\n124#5:1270\n124#5:1271\n124#5:1272\n124#5:1273\n124#5:1274\n124#5:1275\n143#5:1277\n124#5:1278\n143#5:1279\n124#5:1280\n143#5:1281\n124#5:1282\n143#5:1283\n124#5:1284\n143#5:1285\n124#5:1286\n143#5:1287\n124#5:1288\n143#5:1289\n124#5:1290\n188#6,3:1313\n1310#7,2:1357\n8499#7,2:1420\n9181#7,4:1422\n2210#8,7:1387\n*S KotlinDebug\n*F\n+ 1 SceneElement.kt\ncom/alightcreative/app/motion/scene/SceneElementKt\n*L\n573#1:1249\n573#1:1264\n272#1:1132,9\n272#1:1141\n272#1:1143\n272#1:1144\n289#1:1145,2\n289#1:1148\n293#1:1149,2\n298#1:1151,3\n300#1:1154,3\n302#1:1157,3\n379#1:1163,3\n386#1:1173,3\n391#1:1180\n391#1:1181,3\n399#1:1184\n399#1:1185,3\n542#1:1189\n542#1:1190,2\n542#1:1194\n547#1:1199,2\n548#1:1201,2\n548#1:1233\n547#1:1234\n573#1:1250,2\n573#1:1263\n593#1:1265,2\n593#1:1276\n623#1:1291,3\n626#1:1294,9\n626#1:1303\n626#1:1305\n626#1:1306\n637#1:1307\n637#1:1308,3\n640#1:1311,2\n640#1:1316\n641#1:1317,3\n655#1:1327,3\n738#1:1334\n738#1:1335,2\n738#1:1337\n738#1:1338,3\n738#1:1341,3\n740#1:1344,3\n775#1:1351,2\n882#1:1353,2\n893#1:1355,2\n989#1:1359,3\n1071#1:1369,3\n1073#1:1372\n1073#1:1373,3\n1073#1:1376,3\n1073#1:1379\n1127#1:1394,2\n1046#1:1396,9\n1046#1:1405\n1046#1:1407\n1046#1:1408\n1077#1:1409\n1077#1:1410,3\n272#1:1142\n573#1:1252\n626#1:1304\n1046#1:1406\n378#1:1160,3\n378#1:1166,4\n385#1:1170,3\n385#1:1176,4\n647#1:1320,7\n735#1:1331,3\n735#1:1347,4\n1026#1:1362,7\n1079#1:1380,7\n1094#1:1413,7\n536#1:1188\n542#1:1192\n542#1:1193\n543#1:1195\n544#1:1196\n545#1:1197\n545#1:1198\n550#1:1203\n550#1:1204,9\n553#1:1213\n553#1:1214,9\n556#1:1223\n556#1:1224,9\n562#1:1235\n562#1:1236\n563#1:1237\n563#1:1238\n564#1:1239\n564#1:1240\n565#1:1241\n565#1:1242\n568#1:1243\n568#1:1244\n568#1:1245\n569#1:1246\n569#1:1247\n569#1:1248\n575#1:1253\n575#1:1254\n575#1:1255\n575#1:1256\n577#1:1257\n579#1:1258\n580#1:1259\n581#1:1260\n582#1:1261\n583#1:1262\n594#1:1267\n594#1:1268\n594#1:1269\n596#1:1270\n598#1:1271\n599#1:1272\n600#1:1273\n601#1:1274\n602#1:1275\n611#1:1277\n611#1:1278\n612#1:1279\n612#1:1280\n613#1:1281\n613#1:1282\n614#1:1283\n614#1:1284\n615#1:1285\n615#1:1286\n616#1:1287\n616#1:1288\n617#1:1289\n617#1:1290\n640#1:1313,3\n922#1:1357,2\n632#1:1420,2\n632#1:1422,4\n1100#1:1387,7\n*E\n"})
public final class SceneElementKt {
    private static final Region InfinityBounds;
    private static final int MAX_SCENE_SIZE = 100000;
    public static final float MINIMUM_ELEMENT_SPEED = 0.001f;
    private static final WeakHashMap<Scene, Rectangle> actualBoundsCache;
    private static final WeakHashMap<Pair<Scene, SceneElement>, Rectangle> boundsOverLifetimeCache;
    private static final Map<String, Function3<String, XmlPullParser, Boolean, SceneElement>> elementReaders;
    private static final WeakHashMap<Stroke, String> pointStringCache;
    private static final WeakHashMap<SceneElement, WeakHashMap<Scene, ElementTiming>> timingCache;
    private static final WeakHashMap<Stroke, Rectangle> strokeBoundsCache = new WeakHashMap<>();
    private static final WeakHashMap<Drawing, Rectangle> drawingBoundsCache = new WeakHashMap<>();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SceneElementType.values().length];
            try {
                iArr[SceneElementType.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneElementType.Drawing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneElementType.Scene.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SceneElementType.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SceneElementType.Audio.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SceneElementType.Camera.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SceneElementType.NullObject.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DataType.values().length];
            try {
                iArr2[DataType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DataType.SOLID_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DataType.VEC2.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DataType.VEC3.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DataType.VEC4.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DataType.QUAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[DataType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[DataType.TEXTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[DataType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[DataType.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EdgeDecorationDirection.values().length];
            try {
                iArr3[EdgeDecorationDirection.INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[EdgeDecorationDirection.OUTSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[EdgeDecorationDirection.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EdgeDecorationType.values().length];
            try {
                iArr4[EdgeDecorationType.GLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[EdgeDecorationType.BORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[EdgeDecorationType.STROKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[EdgeDecorationType.SHADOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[EdgeDecorationType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final Rectangle boundsAtTime(SceneElement sceneElement, Scene scene, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, SzFNXybiSxdx.ZOHZofNzIqI);
        Intrinsics.checkNotNullParameter(scene, "scene");
        return boundsAtTime(sceneElement, scene, f3, TimeKt.frameNumberFromTime(sceneTime(sceneElement, f3), scene.getFramesPerHundredSeconds()), scene.getFramesPerHundredSeconds());
    }

    public static final float getAudioVideoSpeedFactor(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return 1.0f;
    }

    public static final Rectangle getBounds(Stroke stroke) {
        Intrinsics.checkNotNullParameter(stroke, "<this>");
        WeakHashMap<Stroke, Rectangle> weakHashMap = strokeBoundsCache;
        Rectangle rectangle = weakHashMap.get(stroke);
        if (rectangle == null) {
            List<StrokePoint> points = stroke.getPoints();
            Rectangle empty = Rectangle.INSTANCE.getEMPTY();
            for (StrokePoint strokePoint : points) {
                float pressure = ((stroke.getTool() == DrawingTool.BRUSH ? strokePoint.getPressure() : 1.0f) * stroke.getWidth()) / 2.0f;
                empty = GeometryKt.union(empty, strokePoint.getLocation().getX() - pressure, strokePoint.getLocation().getY() - pressure, strokePoint.getLocation().getX() + pressure, strokePoint.getLocation().getY() + pressure);
            }
            weakHashMap.put(stroke, empty);
            rectangle = empty;
        }
        Intrinsics.checkNotNullExpressionValue(rectangle, "getOrPut(...)");
        return rectangle;
    }

    private static final boolean includesScriptEffects(Collection<KeyableVisualEffectRef> collection) {
        List<ACScript> scripts;
        Collection<KeyableVisualEffectRef> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(((KeyableVisualEffectRef) it.next()).getId());
            if (visualEffectVisualEffectById != null && (scripts = visualEffectVisualEffectById.getScripts()) != null && (!scripts.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    private static final boolean includesShaderEffects(Collection<KeyableVisualEffectRef> collection) {
        Map<Integer, ShaderGroup> shaderGroups;
        Collection<KeyableVisualEffectRef> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        for (KeyableVisualEffectRef keyableVisualEffectRef : collection2) {
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef.getId());
            if (visualEffectVisualEffectById != null && (shaderGroups = visualEffectVisualEffectById.getShaderGroups()) != null && !shaderGroups.isEmpty()) {
                Iterator<Map.Entry<Integer, ShaderGroup>> it = shaderGroups.entrySet().iterator();
                while (it.hasNext()) {
                    if (!keyableVisualEffectRef.getDisabledRenderGroups().contains(it.next().getKey())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isTimeDependent(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillVideo() != null) {
            return true;
        }
        List<Keyable<? extends Object>> keyableProperties = getKeyableProperties(sceneElement);
        if (keyableProperties == null || !keyableProperties.isEmpty()) {
            Iterator<T> it = keyableProperties.iterator();
            while (it.hasNext()) {
                if (((Keyable) it.next()).getKeyed()) {
                    return true;
                }
            }
        }
        if (sceneElement.getType().getHasNestedScene() && isTimeDependent(sceneElement.getNestedScene())) {
            return true;
        }
        if (!sceneElement.getType().getHasVisualEffects()) {
            return false;
        }
        List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
        if (visualEffects != null && visualEffects.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = visualEffects.iterator();
        while (it2.hasNext()) {
            if (VisualEffectKt.isNaturallyTimeDependent((VisualEffect) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void serialize(SceneElement sceneElement, String str, XmlSerializer serializer) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        sceneElement.getType().serialize(sceneElement, str, serializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float withAbsoluteTimingAndSpeedInScene$lambda$76$lambda$75(float f3, float f4) {
        return f3;
    }

    static {
        SceneElementType[] sceneElementTypeArrValues = SceneElementType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(sceneElementTypeArrValues.length), 16));
        for (SceneElementType sceneElementType : sceneElementTypeArrValues) {
            Pair pair = TuplesKt.to(sceneElementType.getXmlTag(), new SceneElementKt$elementReaders$1$1(sceneElementType));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        elementReaders = linkedHashMap;
        actualBoundsCache = new WeakHashMap<>();
        InfinityBounds = new Region(-100000, -100000, 100000, 100000);
        boundsOverLifetimeCache = new WeakHashMap<>();
        pointStringCache = new WeakHashMap<>();
        timingCache = new WeakHashMap<>();
    }

    public static final ElementTiming absoluteTimingInScene(SceneElement sceneElement, Scene scene) {
        ElementTiming elementTiming;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        WeakHashMap<Scene, ElementTiming> weakHashMap = timingCache.get(sceneElement);
        if (weakHashMap != null && (elementTiming = weakHashMap.get(scene)) != null) {
            return elementTiming;
        }
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        List<SceneElement> listPathToElement = SceneKt.pathToElement(scene, sceneElement);
        Intrinsics.checkNotNull(listPathToElement);
        final List listDropLast = CollectionsKt.dropLast(listPathToElement, 1);
        Iterator it = listDropLast.iterator();
        int iRoundToFrame = 0;
        while (it.hasNext()) {
            iRoundToFrame += TimeKt.roundToFrame(((SceneElement) it.next()).getStartTime(), framesPerHundredSeconds);
        }
        final int iRoundToFrameStartTime = TimeKt.roundToFrameStartTime(sceneElement.getStartTime() + iRoundToFrame, framesPerHundredSeconds);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDropLast, 10));
        int i2 = 0;
        for (Object obj : listDropLast) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SceneElement sceneElement2 = (SceneElement) obj;
            Iterator it2 = CollectionsKt.take(listDropLast, i2).iterator();
            int iRoundToFrame2 = 0;
            while (it2.hasNext()) {
                iRoundToFrame2 += TimeKt.roundToFrame(((SceneElement) it2.next()).getStartTime(), framesPerHundredSeconds);
            }
            arrayList.add(Integer.valueOf(iRoundToFrame2 + sceneElement2.getEndTime()));
            i2 = i3;
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList);
        final int iCoerceAtMost = RangesKt.coerceAtMost(TimeKt.roundToFrameEndTime(sceneElement.getEndTime() + iRoundToFrame, framesPerHundredSeconds), num != null ? num.intValue() : Integer.MAX_VALUE);
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.l4Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneElementKt.absoluteTimingInScene$lambda$70(iRoundToFrameStartTime, iCoerceAtMost, listDropLast);
            }
        });
        ElementTiming elementTiming2 = new ElementTiming(iRoundToFrameStartTime, iCoerceAtMost);
        WeakHashMap<SceneElement, WeakHashMap<Scene, ElementTiming>> weakHashMap2 = timingCache;
        WeakHashMap<Scene, ElementTiming> weakHashMap3 = weakHashMap2.get(sceneElement);
        if (weakHashMap3 == null) {
            weakHashMap3 = new WeakHashMap<>();
            weakHashMap2.put(sceneElement, weakHashMap3);
        }
        weakHashMap3.put(scene, elementTiming2);
        return elementTiming2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String absoluteTimingInScene$lambda$70(int i2, int i3, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SceneElement sceneElement = (SceneElement) it.next();
            arrayList.add(sceneElement.getId() + ":" + sceneElement.getStartTime());
        }
        return "absoluteTiming: absStart=" + i2 + " absEnd=" + i3 + " parentElemens=" + arrayList;
    }

    public static final Rectangle actualBoundsFor(Scene scene, Iterable<SceneElement> elements) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Rectangle empty = Rectangle.INSTANCE.getEMPTY();
        for (SceneElement sceneElement : elements) {
            empty = (sceneElement.getType().getHasBlendingMode() && sceneElement.getBlendingMode() == BlendingMode.MASK) ? boundsOverLifetime(sceneElement, scene) : GeometryKt.union(empty, boundsOverLifetime(sceneElement, scene));
        }
        return empty;
    }

    public static final Rectangle boundsAtTime(SceneElement sceneElement, final Scene scene, final float f3, int i2, int i3) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        final SceneElement sceneElementRunScripts$default = ScriptExecutorKt.runScripts$default(sceneElement, f3, i2, i3, scene, sceneElement.getTransform().valueAtTime(f3), 0.0f, null, null, false, null, 992, null);
        if (sceneElementRunScripts$default.getType() == SceneElementType.Camera) {
            return GeometryKt.enclosingTransform(Rectangle.INSTANCE.centeredWithSize(CameraElementKt.calcCameraDimensions(scene, ((Number) KeyableKt.valueAtTime(sceneElementRunScripts$default.getCameraProperties().getFov(), f3)).floatValue(), -((Vector3D) KeyableKt.valueAtTime(sceneElementRunScripts$default.getTransform().getLocation(), f3)).getZ())), sceneElementRunScripts$default.getTransform().valueAtTime(f3));
        }
        if (sceneElementRunScripts$default.getType() == SceneElementType.NullObject) {
            return GeometryKt.enclosingTransform(Rectangle.INSTANCE.centeredWithSize(new Vector2D(50.0f, 50.0f)), sceneElementRunScripts$default.getTransform().valueAtTime(f3));
        }
        if (!sceneElementRunScripts$default.getType().getHasOutline()) {
            XoT.C.Uo(sceneElementRunScripts$default, new Function0() { // from class: com.alightcreative.app.motion.scene.OU
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneElementKt.boundsAtTime$lambda$42$lambda$41(sceneElementRunScripts$default, scene, f3);
                }
            });
            return GeometryKt.enclosingTransform(boundsInScene(sceneElementRunScripts$default, scene), sceneElementRunScripts$default.getTransform().valueAtTime(f3));
        }
        final RectF rectF = new RectF();
        Path pathT = CubicBSplineKt.toPath(CubicBSplineKt.valueAtTime(sceneElementRunScripts$default.getOutline(), f3)).t();
        pathT.transform(sceneElementRunScripts$default.getTransform().valueAtTime(f3).getMatrix());
        pathT.computeBounds(rectF, true);
        if (sceneElementRunScripts$default.getType().getHasBorderAndShadow()) {
            float fMax = 0.0f;
            float fMax2 = 0.0f;
            float fMax3 = 0.0f;
            float fMax4 = 0.0f;
            for (KeyableEdgeDecoration keyableEdgeDecoration : getEdgeDecorations(sceneElementRunScripts$default)) {
                if (keyableEdgeDecoration.getEnabled()) {
                    Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(keyableEdgeDecoration.getOffset(), f3);
                    int i5 = WhenMappings.$EnumSwitchMapping$2[keyableEdgeDecoration.getDirection().ordinal()];
                    if (i5 == 1) {
                        fFloatValue = 0.0f;
                    } else if (i5 == 2) {
                        fFloatValue = ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getSize(), f3)).floatValue();
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fFloatValue = ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getSize(), f3)).floatValue() / 2.0f;
                    }
                    fMax = Math.max(fMax, (-vector2D.getX()) + fFloatValue);
                    fMax2 = Math.max(fMax2, (-vector2D.getY()) + fFloatValue);
                    fMax3 = Math.max(fMax3, vector2D.getX() + fFloatValue);
                    fMax4 = Math.max(fMax4, vector2D.getY() + fFloatValue);
                }
            }
            rectF.left -= fMax;
            rectF.top -= fMax2;
            rectF.right += fMax3;
            rectF.bottom += fMax4;
        }
        XoT.C.Uo(sceneElementRunScripts$default, new Function0() { // from class: com.alightcreative.app.motion.scene.mz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneElementKt.boundsAtTime$lambda$42$lambda$40(rectF);
            }
        });
        return GeometryKt.toRectangle(rectF);
    }

    public static final Rectangle boundsInScene(SceneElement sceneElement, Scene scene) {
        Rectangle bounds;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElement.getType().ordinal()];
        if (i2 == 1) {
            bounds = CubicBSplineKt.getBounds(CubicBSplineKt.valueAtTime(sceneElement.getOutline(), 0.0f));
        } else if (i2 == 2) {
            bounds = getBounds(sceneElement.getDrawing());
        } else if (i2 == 3) {
            Rectangle actualBounds = getActualBounds(sceneElement.getNestedScene());
            bounds = actualBounds.isEmpty() ? getBounds(sceneElement.getNestedScene()) : GeometryKt.minus(actualBounds, GeometryKt.div(SceneKt.getSize(sceneElement.getNestedScene()), 2.0f));
        } else if (i2 != 4) {
            bounds = i2 != 6 ? i2 != 7 ? Rectangle.INSTANCE.getEMPTY() : Rectangle.INSTANCE.centeredWithSize(new Vector2D(50.0f, 50.0f)) : Rectangle.INSTANCE.centeredWithSize(CameraElementKt.calcCameraDimensions(scene, ((Number) KeyableKt.valueAtTime(sceneElement.getCameraProperties().getFov(), 0.0f)).floatValue(), -((Vector3D) KeyableKt.valueAtTime(sceneElement.getTransform().getLocation(), 0.0f)).getZ()));
        } else {
            Vector2D textDimensions = TextElementKt.getTextDimensions(sceneElement.getText(), StyleParams.INSTANCE.forElement(sceneElement, 0.0f));
            float x2 = textDimensions.getX();
            float y2 = textDimensions.getY();
            float f3 = 2;
            bounds = new Rectangle((-x2) / f3, (-y2) / f3, x2 / f3, y2 / f3);
        }
        if (!Float.isNaN(bounds.getWidth()) && !Float.isNaN(bounds.getHeight())) {
            return bounds;
        }
        XoT.C.nr("NAN Bounds Scene: " + scene);
        XoT.C.nr("NAN Bounds Element: " + sceneElement);
        FirebaseCrashlytics.getInstance().recordException(new IllegalStateException("Invalid NAN bounds returned for element in scene: " + bounds));
        return bounds;
    }

    public static final Rectangle boundsOverLifetime(SceneElement sceneElement, Scene scene) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        WeakHashMap<Pair<Scene, SceneElement>, Rectangle> weakHashMap = boundsOverLifetimeCache;
        Pair<Scene, SceneElement> pair = TuplesKt.to(scene, sceneElement);
        Rectangle rectangle = weakHashMap.get(pair);
        if (rectangle == null) {
            List<Keyable<? extends Object>> keyableProperties = TransformKt.getKeyableProperties(sceneElement.getTransform());
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keyableProperties.iterator();
            while (it.hasNext()) {
                List keyframes = ((Keyable) it.next()).getKeyframes();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
                Iterator it2 = keyframes.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(((Keyframe) it2.next()).getTime()));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            Set set = CollectionsKt.toSet(arrayList);
            Rectangle empty = Rectangle.INSTANCE.getEMPTY();
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                float fFloatValue = ((Number) it3.next()).floatValue();
                empty = GeometryKt.union(empty, boundsAtTime(LayerParentingKt.applyLayerParenting(sceneElement, scene, fFloatValue), scene, fFloatValue, TimeKt.frameNumberFromTime((int) (((sceneElement.getEndTime() - sceneElement.getStartTime()) * fFloatValue) + sceneElement.getStartTime()), 30), 30));
            }
            weakHashMap.put(pair, empty);
            rectangle = empty;
        }
        Intrinsics.checkNotNullExpressionValue(rectangle, "getOrPut(...)");
        return rectangle;
    }

    public static final SceneElement copyAdjustingKeyframeTiming(SceneElement sceneElement, final Function1<? super Float, Float> adjuster) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(adjuster, "adjuster");
        Iterator<T> it = getAdjustablePropertyLenses(sceneElement).iterator();
        while (it.hasNext()) {
            sceneElement = (SceneElement) oA.fuX.t((oA.j) it.next(), sceneElement, new Function1<?, Object>() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$copyAdjustingKeyframeTiming$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Keyable<? extends Object> it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return KeyableKt.copyAdjustingTime(it2, adjuster);
                }
            });
        }
        return sceneElement;
    }

    public static final boolean directParent(SceneElement sceneElement, Long l2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return l2 != null && sceneElement.getId() == l2.longValue();
    }

    public static final void forEachVisualEffect(SceneElement sceneElement, Function2<? super Long, ? super KeyableVisualEffectRef, Unit> action) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = sceneElement.getVisualEffectOrder().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            KeyableVisualEffectRef keyableVisualEffectRef = sceneElement.getVisualEffects().get(Long.valueOf(jLongValue));
            if (keyableVisualEffectRef != null) {
                action.invoke(Long.valueOf(jLongValue), keyableVisualEffectRef);
            }
        }
    }

    public static final void forEachVisualEffectIndexed(SceneElement sceneElement, Function3<? super Integer, ? super Long, ? super KeyableVisualEffectRef, Unit> action) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i2 = 0;
        for (Object obj : sceneElement.getVisualEffectOrder()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long jLongValue = ((Number) obj).longValue();
            KeyableVisualEffectRef keyableVisualEffectRef = sceneElement.getVisualEffects().get(Long.valueOf(jLongValue));
            if (keyableVisualEffectRef != null) {
                action.invoke(Integer.valueOf(i2), Long.valueOf(jLongValue), keyableVisualEffectRef);
            }
            i2 = i3;
        }
    }

    public static final float fractionalTime(SceneElement sceneElement, int i2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return (i2 - sceneElement.getStartTime()) / (sceneElement.getEndTime() - sceneElement.getStartTime());
    }

    public static final Rectangle getActualBounds(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        WeakHashMap<Scene, Rectangle> weakHashMap = actualBoundsCache;
        Rectangle frame = weakHashMap.get(scene);
        if (frame == null) {
            frame = ((double) scene.getBackground().getA()) > 0.001d ? getFrame(scene) : GeometryKt.intersect(actualBoundsFor(scene, scene.getElements()), getFrame(scene));
            weakHashMap.put(scene, frame);
        }
        Intrinsics.checkNotNullExpressionValue(frame, "getOrPut(...)");
        return frame;
    }

    public static final List<oA.j> getAdjustablePropertyLenses(SceneElement sceneElement) {
        LiveShape shape;
        List<UserParameter> parameters;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        ArrayList arrayList = new ArrayList();
        if (sceneElement.getType().getHasTransform()) {
            List<oA.j> keyablePropertyLenses = TransformKt.getKeyablePropertyLenses(sceneElement.getTransform());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyablePropertyLenses, 10));
            for (oA.j jVar : keyablePropertyLenses) {
                SceneElementKt$getAdjustablePropertyLenses$1$1 sceneElementKt$getAdjustablePropertyLenses$1$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$1$1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getTransform();
                    }
                };
                arrayList2.add(new oA.Dsr(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.nr(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$1$1.getReturnType(), sceneElementKt$getAdjustablePropertyLenses$1$1), jVar));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        if (sceneElement.getType().getHasFillColor()) {
            AnonymousClass2 anonymousClass2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.2
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getFillColor();
                }
            };
            arrayList.add(new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass2.getReturnType(), anonymousClass2));
        }
        if (sceneElement.getType().getHasVolume()) {
            AnonymousClass3 anonymousClass3 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.3
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getGain();
                }
            };
            arrayList.add(new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass3.getReturnType(), anonymousClass3));
        }
        if (sceneElement.getType().getHasOutline()) {
            AnonymousClass4 anonymousClass4 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.4
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getStroke();
                }
            };
            oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass4.getReturnType(), anonymousClass4);
            AnonymousClass5 anonymousClass5 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.5
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableEdgeDecoration) obj).getSize();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass5.getReturnType(), nVar, anonymousClass5));
        }
        if (sceneElement.getType().getHasOutline() && sceneElement.getLiveShape().getId() == null) {
            int i2 = 0;
            for (Object obj : sceneElement.getOutline().getContours()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i5 = 0;
                for (Object obj2 : sceneElement.getOutline().getContours().get(i2).getKnots()) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    KeyableCBKnot keyableCBKnot = (KeyableCBKnot) obj2;
                    if (keyableCBKnot.getP().getKeyed()) {
                        SceneElementKt$getAdjustablePropertyLenses$6$1$1 sceneElementKt$getAdjustablePropertyLenses$6$1$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$1
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((SceneElement) obj3).getOutline();
                            }
                        };
                        oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$1.getReturnType(), sceneElementKt$getAdjustablePropertyLenses$6$1$1);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$2 sceneElementKt$getAdjustablePropertyLenses$6$1$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$2
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCompoundCubicBSpline) obj3).getContours();
                            }
                        };
                        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$2.getReturnType(), nVar2, sceneElementKt$getAdjustablePropertyLenses$6$1$2);
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type = aCVar.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type);
                        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$3 sceneElementKt$getAdjustablePropertyLenses$6$1$3 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$3
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCubicBSpline) obj3).getKnots();
                            }
                        };
                        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$3.getReturnType(), w6Var, sceneElementKt$getAdjustablePropertyLenses$6$1$3);
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type2 = aCVar2.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type2);
                        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i5);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$4 sceneElementKt$getAdjustablePropertyLenses$6$1$4 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$4
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCBKnot) obj3).getP();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$4.getReturnType(), w6Var2, sceneElementKt$getAdjustablePropertyLenses$6$1$4));
                    }
                    if ((keyableCBKnot.getCurveIn() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveIn()).getKeyed()) {
                        SceneElementKt$getAdjustablePropertyLenses$6$1$5 sceneElementKt$getAdjustablePropertyLenses$6$1$5 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$5
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((SceneElement) obj3).getOutline();
                            }
                        };
                        oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$5.getReturnType(), sceneElementKt$getAdjustablePropertyLenses$6$1$5);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$6 sceneElementKt$getAdjustablePropertyLenses$6$1$6 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$6
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCompoundCubicBSpline) obj3).getContours();
                            }
                        };
                        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$6.getReturnType(), nVar3, sceneElementKt$getAdjustablePropertyLenses$6$1$6);
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type3 = aCVar3.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type3);
                        oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar3, i2);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$7 sceneElementKt$getAdjustablePropertyLenses$6$1$7 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$7
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCubicBSpline) obj3).getKnots();
                            }
                        };
                        oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$7.getReturnType(), w6Var3, sceneElementKt$getAdjustablePropertyLenses$6$1$7);
                        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type4 = aCVar4.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type4);
                        oA.w6 w6Var4 = new oA.w6(orCreateKotlinClass4, type4, aCVar4, i5);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$8 sceneElementKt$getAdjustablePropertyLenses$6$1$8 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$8
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCBKnot) obj3).getCurveIn();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$8.getReturnType(), w6Var4, sceneElementKt$getAdjustablePropertyLenses$6$1$8));
                    }
                    if ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyed()) {
                        SceneElementKt$getAdjustablePropertyLenses$6$1$9 sceneElementKt$getAdjustablePropertyLenses$6$1$9 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$9
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((SceneElement) obj3).getOutline();
                            }
                        };
                        oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$9.getReturnType(), sceneElementKt$getAdjustablePropertyLenses$6$1$9);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$10 sceneElementKt$getAdjustablePropertyLenses$6$1$10 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$10
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCompoundCubicBSpline) obj3).getContours();
                            }
                        };
                        oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$10.getReturnType(), nVar4, sceneElementKt$getAdjustablePropertyLenses$6$1$10);
                        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type5 = aCVar5.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type5);
                        oA.w6 w6Var5 = new oA.w6(orCreateKotlinClass5, type5, aCVar5, i2);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$11 sceneElementKt$getAdjustablePropertyLenses$6$1$11 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$11
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCubicBSpline) obj3).getKnots();
                            }
                        };
                        oA.aC aCVar6 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$11.getReturnType(), w6Var5, sceneElementKt$getAdjustablePropertyLenses$6$1$11);
                        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type6 = aCVar6.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type6);
                        oA.w6 w6Var6 = new oA.w6(orCreateKotlinClass6, type6, aCVar6, i5);
                        SceneElementKt$getAdjustablePropertyLenses$6$1$12 sceneElementKt$getAdjustablePropertyLenses$6$1$12 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj3) {
                                return ((KeyableCBKnot) obj3).getCurveOut();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$6$1$12.getReturnType(), w6Var6, sceneElementKt$getAdjustablePropertyLenses$6$1$12));
                    }
                    i5 = i7;
                }
                i2 = i3;
            }
        }
        if (sceneElement.getType().getHasBorderAndShadow()) {
            AnonymousClass7 anonymousClass7 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.7
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((SceneElement) obj3).getDropShadow();
                }
            };
            oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass7.getReturnType(), anonymousClass7);
            AnonymousClass8 anonymousClass8 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.8
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((KeyableEdgeDecoration) obj3).getColor();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass8.getReturnType(), nVar5, anonymousClass8));
            AnonymousClass9 anonymousClass9 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.9
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((SceneElement) obj3).getDropShadow();
                }
            };
            oA.n nVar6 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass9.getReturnType(), anonymousClass9);
            AnonymousClass10 anonymousClass10 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.10
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((KeyableEdgeDecoration) obj3).getSize();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass10.getReturnType(), nVar6, anonymousClass10));
            AnonymousClass11 anonymousClass11 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.11
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((SceneElement) obj3).getDropShadow();
                }
            };
            oA.n nVar7 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass11.getReturnType(), anonymousClass11);
            AnonymousClass12 anonymousClass12 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.12
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((KeyableEdgeDecoration) obj3).getAlpha();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass12.getReturnType(), nVar7, anonymousClass12));
            AnonymousClass13 anonymousClass13 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.13
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((SceneElement) obj3).getDropShadow();
                }
            };
            oA.n nVar8 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass13.getReturnType(), anonymousClass13);
            AnonymousClass14 anonymousClass14 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.14
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((KeyableEdgeDecoration) obj3).getOffset();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass14.getReturnType(), nVar8, anonymousClass14));
            int size = sceneElement.getBorders().size();
            for (int i8 = 0; i8 < size; i8++) {
                AnonymousClass15 anonymousClass15 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.15
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((SceneElement) obj3).getBorders();
                    }
                };
                oA.n nVar9 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass15.getReturnType(), anonymousClass15);
                KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type7 = nVar9.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type7);
                oA.w6 w6Var7 = new oA.w6(orCreateKotlinClass7, type7, nVar9, i8);
                AnonymousClass16 anonymousClass16 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.16
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((KeyableEdgeDecoration) obj3).getColor();
                    }
                };
                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass16.getReturnType(), w6Var7, anonymousClass16));
                AnonymousClass17 anonymousClass17 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.17
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((SceneElement) obj3).getBorders();
                    }
                };
                oA.n nVar10 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass17.getReturnType(), anonymousClass17);
                KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type8 = nVar10.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type8);
                oA.w6 w6Var8 = new oA.w6(orCreateKotlinClass8, type8, nVar10, i8);
                AnonymousClass18 anonymousClass18 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.18
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((KeyableEdgeDecoration) obj3).getSize();
                    }
                };
                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass18.getReturnType(), w6Var8, anonymousClass18));
            }
        }
        if (sceneElement.getType().getHasVisualEffects()) {
            int i9 = 0;
            for (Object obj3 : sceneElement.getVisualEffectOrder()) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                long jLongValue = ((Number) obj3).longValue();
                KeyableVisualEffectRef keyableVisualEffectRef = sceneElement.getVisualEffects().get(Long.valueOf(jLongValue));
                if (keyableVisualEffectRef != null) {
                    for (Map.Entry<String, KeyableUserParameterValue> entry : keyableVisualEffectRef.getParameters().entrySet()) {
                        String key = entry.getKey();
                        KeyableUserParameterValue value = entry.getValue();
                        SceneElementKt$getAdjustablePropertyLenses$19$baseLens$1 sceneElementKt$getAdjustablePropertyLenses$19$baseLens$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$baseLens$1
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj4) {
                                return ((SceneElement) obj4).getVisualEffects();
                            }
                        };
                        oA.n nVar11 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$baseLens$1.getReturnType(), sceneElementKt$getAdjustablePropertyLenses$19$baseLens$1);
                        Long lValueOf = Long.valueOf(jLongValue);
                        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type9 = nVar11.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type9);
                        oA.Ml ml = new oA.Ml(orCreateKotlinClass9, type9, nVar11, lValueOf);
                        SceneElementKt$getAdjustablePropertyLenses$19$baseLens$2 sceneElementKt$getAdjustablePropertyLenses$19$baseLens$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$baseLens$2
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj4) {
                                return ((KeyableVisualEffectRef) obj4).getParameters();
                            }
                        };
                        oA.aC aCVar7 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$baseLens$2.getReturnType(), ml, sceneElementKt$getAdjustablePropertyLenses$19$baseLens$2);
                        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type10 = aCVar7.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type10);
                        oA.Ml ml2 = new oA.Ml(orCreateKotlinClass10, type10, aCVar7, key);
                        switch (WhenMappings.$EnumSwitchMapping$1[value.getDataType().ordinal()]) {
                            case 1:
                                SceneElementKt$getAdjustablePropertyLenses$19$1 sceneElementKt$getAdjustablePropertyLenses$19$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$1
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj4) {
                                        return ((KeyableUserParameterValue) obj4).getFloatValue();
                                    }
                                };
                                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$1.getReturnType(), ml2, sceneElementKt$getAdjustablePropertyLenses$19$1));
                                Unit unit = Unit.INSTANCE;
                                break;
                            case 2:
                                Unit unit2 = Unit.INSTANCE;
                                break;
                            case 3:
                                SceneElementKt$getAdjustablePropertyLenses$19$2 sceneElementKt$getAdjustablePropertyLenses$19$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$2
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj4) {
                                        return ((KeyableUserParameterValue) obj4).getColorValue();
                                    }
                                };
                                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$2.getReturnType(), ml2, sceneElementKt$getAdjustablePropertyLenses$19$2));
                                Unit unit3 = Unit.INSTANCE;
                                break;
                            case 4:
                                SceneElementKt$getAdjustablePropertyLenses$19$3 sceneElementKt$getAdjustablePropertyLenses$19$3 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$3
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj4) {
                                        return ((KeyableUserParameterValue) obj4).getVec2DValue();
                                    }
                                };
                                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$3.getReturnType(), ml2, sceneElementKt$getAdjustablePropertyLenses$19$3));
                                Unit unit4 = Unit.INSTANCE;
                                break;
                            case 5:
                                SceneElementKt$getAdjustablePropertyLenses$19$4 sceneElementKt$getAdjustablePropertyLenses$19$4 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$4
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj4) {
                                        return ((KeyableUserParameterValue) obj4).getVec3DValue();
                                    }
                                };
                                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$4.getReturnType(), ml2, sceneElementKt$getAdjustablePropertyLenses$19$4));
                                Unit unit5 = Unit.INSTANCE;
                                break;
                            case 6:
                                SceneElementKt$getAdjustablePropertyLenses$19$5 sceneElementKt$getAdjustablePropertyLenses$19$5 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$5
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj4) {
                                        return ((KeyableUserParameterValue) obj4).getVec4DValue();
                                    }
                                };
                                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$5.getReturnType(), ml2, sceneElementKt$getAdjustablePropertyLenses$19$5));
                                Unit unit6 = Unit.INSTANCE;
                                break;
                            case 7:
                                SceneElementKt$getAdjustablePropertyLenses$19$6 sceneElementKt$getAdjustablePropertyLenses$19$6 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$6
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj4) {
                                        return ((KeyableUserParameterValue) obj4).getQuatValue();
                                    }
                                };
                                arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$19$6.getReturnType(), ml2, sceneElementKt$getAdjustablePropertyLenses$19$6));
                                Unit unit7 = Unit.INSTANCE;
                                break;
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                Unit unit72 = Unit.INSTANCE;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    Unit unit8 = Unit.INSTANCE;
                }
                i9 = i10;
            }
        }
        if (sceneElement.getLiveShape().getId() != null && (shape = LiveShapeKt.getShape(sceneElement.getLiveShape())) != null && (parameters = shape.getParameters()) != null) {
            int i11 = 0;
            for (Object obj4 : parameters) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                UserParameter userParameter = (UserParameter) obj4;
                SceneElementKt$getAdjustablePropertyLenses$20$baseLens$1 sceneElementKt$getAdjustablePropertyLenses$20$baseLens$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$baseLens$1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj5) {
                        return ((SceneElement) obj5).getLiveShape();
                    }
                };
                oA.n nVar12 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$baseLens$1.getReturnType(), sceneElementKt$getAdjustablePropertyLenses$20$baseLens$1);
                SceneElementKt$getAdjustablePropertyLenses$20$baseLens$2 sceneElementKt$getAdjustablePropertyLenses$20$baseLens$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$baseLens$2
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj5) {
                        return ((LiveShapeRef) obj5).getParamValues();
                    }
                };
                oA.aC aCVar8 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$baseLens$2.getReturnType(), nVar12, sceneElementKt$getAdjustablePropertyLenses$20$baseLens$2);
                String name = userParameter.getName();
                KClass orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type11 = aCVar8.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type11);
                oA.Ml ml3 = new oA.Ml(orCreateKotlinClass11, type11, aCVar8, name);
                switch (WhenMappings.$EnumSwitchMapping$1[userParameter.getDataType().ordinal()]) {
                    case 1:
                        SceneElementKt$getAdjustablePropertyLenses$20$1 sceneElementKt$getAdjustablePropertyLenses$20$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$1
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj5) {
                                return ((KeyableUserParameterValue) obj5).getFloatValue();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$1.getReturnType(), ml3, sceneElementKt$getAdjustablePropertyLenses$20$1));
                    case 2:
                        Unit unit9 = Unit.INSTANCE;
                        i11 = i12;
                        break;
                    case 3:
                        SceneElementKt$getAdjustablePropertyLenses$20$2 sceneElementKt$getAdjustablePropertyLenses$20$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$2
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj5) {
                                return ((KeyableUserParameterValue) obj5).getColorValue();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$2.getReturnType(), ml3, sceneElementKt$getAdjustablePropertyLenses$20$2));
                        Unit unit10 = Unit.INSTANCE;
                        i11 = i12;
                        break;
                    case 4:
                        SceneElementKt$getAdjustablePropertyLenses$20$3 sceneElementKt$getAdjustablePropertyLenses$20$3 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$3
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj5) {
                                return ((KeyableUserParameterValue) obj5).getVec2DValue();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$3.getReturnType(), ml3, sceneElementKt$getAdjustablePropertyLenses$20$3));
                        Unit unit11 = Unit.INSTANCE;
                        i11 = i12;
                        break;
                    case 5:
                        SceneElementKt$getAdjustablePropertyLenses$20$4 sceneElementKt$getAdjustablePropertyLenses$20$4 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$4
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj5) {
                                return ((KeyableUserParameterValue) obj5).getVec3DValue();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$4.getReturnType(), ml3, sceneElementKt$getAdjustablePropertyLenses$20$4));
                        Unit unit12 = Unit.INSTANCE;
                        i11 = i12;
                        break;
                    case 6:
                        SceneElementKt$getAdjustablePropertyLenses$20$5 sceneElementKt$getAdjustablePropertyLenses$20$5 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$5
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj5) {
                                return ((KeyableUserParameterValue) obj5).getVec4DValue();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$5.getReturnType(), ml3, sceneElementKt$getAdjustablePropertyLenses$20$5));
                        Unit unit13 = Unit.INSTANCE;
                        i11 = i12;
                        break;
                    case 7:
                        SceneElementKt$getAdjustablePropertyLenses$20$6 sceneElementKt$getAdjustablePropertyLenses$20$6 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$6
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj5) {
                                return ((KeyableUserParameterValue) obj5).getQuatValue();
                            }
                        };
                        arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sceneElementKt$getAdjustablePropertyLenses$20$6.getReturnType(), ml3, sceneElementKt$getAdjustablePropertyLenses$20$6));
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        Unit unit14 = Unit.INSTANCE;
                        i11 = i12;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            Unit unit15 = Unit.INSTANCE;
        }
        if (sceneElement.getType() == SceneElementType.Camera) {
            AnonymousClass21 anonymousClass21 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.21
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar13 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass21.getReturnType(), anonymousClass21);
            AnonymousClass22 anonymousClass22 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.22
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFov();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass22.getReturnType(), nVar13, anonymousClass22));
            AnonymousClass23 anonymousClass23 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.23
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar14 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass23.getReturnType(), anonymousClass23);
            AnonymousClass24 anonymousClass24 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.24
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFocusDistance();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass24.getReturnType(), nVar14, anonymousClass24));
            AnonymousClass25 anonymousClass25 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.25
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar15 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass25.getReturnType(), anonymousClass25);
            AnonymousClass26 anonymousClass26 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.26
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFocusBlurStrength();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass26.getReturnType(), nVar15, anonymousClass26));
            AnonymousClass27 anonymousClass27 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.27
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar16 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass27.getReturnType(), anonymousClass27);
            AnonymousClass28 anonymousClass28 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.28
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFocusDepthOfField();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass28.getReturnType(), nVar16, anonymousClass28));
            AnonymousClass29 anonymousClass29 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.29
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar17 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass29.getReturnType(), anonymousClass29);
            AnonymousClass30 anonymousClass30 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.30
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFogColor();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass30.getReturnType(), nVar17, anonymousClass30));
            AnonymousClass31 anonymousClass31 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.31
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar18 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass31.getReturnType(), anonymousClass31);
            AnonymousClass32 anonymousClass32 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.32
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFogFarZ();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass32.getReturnType(), nVar18, anonymousClass32));
            AnonymousClass33 anonymousClass33 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.33
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((SceneElement) obj5).getCameraProperties();
                }
            };
            oA.n nVar19 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass33.getReturnType(), anonymousClass33);
            AnonymousClass34 anonymousClass34 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses.34
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj5) {
                    return ((CameraProperties) obj5).getFogNearZ();
                }
            };
            arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass34.getReturnType(), nVar19, anonymousClass34));
        }
        return arrayList;
    }

    public static final Vector2D getCenter(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return new Vector2D(scene.getWidth() / 2.0f, scene.getHeight() / 2.0f);
    }

    public static final String getDisplayLabel(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return (StringsKt.trim((CharSequence) sceneElement.getLabel()).toString().length() == 0 && sceneElement.getType().getHasText() && StringsKt.trim((CharSequence) sceneElement.getText().getText()).toString().length() > 0) ? sceneElement.getText().getText() : sceneElement.getLabel();
    }

    public static final float getDurationInSeconds(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return (sceneElement.getEndTime() - sceneElement.getStartTime()) / 1000.0f;
    }

    public static final List<KeyableEdgeDecoration> getEdgeDecorations(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return sceneElement.getType().getHasBorderAndShadow() ? CollectionsKt.plus((Collection) sceneElement.getBorders(), (Iterable) CollectionsKt.listOf(sceneElement.getDropShadow())) : CollectionsKt.emptyList();
    }

    public static final Map<String, Function3<String, XmlPullParser, Boolean, SceneElement>> getElementReaders() {
        return elementReaders;
    }

    public static final Rectangle getFrame(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return new Rectangle(0.0f, 0.0f, scene.getWidth(), scene.getHeight());
    }

    public static final boolean getHasFill(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        return sceneElementType.getHasFillColor() || sceneElementType.getHasFillGradient() || sceneElementType.getHasFillVideo() || sceneElementType.getHasFillImage() || sceneElementType.getHasFillType();
    }

    public static final List<Keyable<? extends Object>> getKeyableProperties(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        List<oA.j> keyablePropertyLenses = getKeyablePropertyLenses(sceneElement);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keyablePropertyLenses.iterator();
        while (it.hasNext()) {
            Keyable keyable = (Keyable) ((oA.j) it.next()).O(sceneElement);
            if (keyable != null) {
                arrayList.add(keyable);
            }
        }
        return arrayList;
    }

    public static final List<oA.j> getKeyablePropertyLenses(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        List<oA.j> adjustablePropertyLenses = getAdjustablePropertyLenses(sceneElement);
        AnonymousClass1 anonymousClass1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.SceneElementKt.getKeyablePropertyLenses.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTimeKeyframes();
            }
        };
        return CollectionsKt.plus((Collection<? extends oA.n>) adjustablePropertyLenses, new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), anonymousClass1.getReturnType(), anonymousClass1));
    }

    public static final boolean getMissingMedia(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillVideo() != null) {
            return tu.r.r(sceneElement.getFillVideo());
        }
        if (sceneElement.getType().getHasFillImage() && sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillImage() != null) {
            return tu.r.r(sceneElement.getFillImage());
        }
        if (sceneElement.getType() == SceneElementType.Audio) {
            return tu.r.r(sceneElement.getSrc());
        }
        return false;
    }

    public static final List<UserElementProperty> getSettableUserParams(SceneElement sceneElement) {
        List<UserElementProperty> listListOf;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sceneElement.getType().ordinal()]) {
            case 1:
                return CollectionsKt.emptyList();
            case 2:
                return CollectionsKt.emptyList();
            case 3:
                return SceneKt.getSettableUserParams(sceneElement.getNestedScene());
            case 4:
                UserElementProperty userElementTextProperty = getUserElementTextProperty(sceneElement.getText().getText());
                return (userElementTextProperty == null || (listListOf = CollectionsKt.listOf(userElementTextProperty)) == null) ? CollectionsKt.emptyList() : listListOf;
            case 5:
                return CollectionsKt.emptyList();
            case 6:
                return CollectionsKt.emptyList();
            case 7:
                return CollectionsKt.emptyList();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getUserElementTagId(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return getUserElementTagRaw(str);
    }

    public static final String getUserElementTagLabel(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return getUserElementTagRaw(str);
    }

    public static final String getUserElementTagRaw(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (isValidUserElementTag(str)) {
            return str;
        }
        return null;
    }

    public static final UserElementProperty getUserElementTextProperty(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!isValidUserElementTag(str)) {
            return null;
        }
        String userElementTagId = getUserElementTagId(str);
        Intrinsics.checkNotNull(userElementTagId);
        String userElementTagLabel = getUserElementTagLabel(str);
        Intrinsics.checkNotNull(userElementTagLabel);
        return new UserElementProperty(userElementTagId, userElementTagLabel, DataType.STRING);
    }

    public static final List<KeyableVisualEffectRef> getVisualEffectsInOrder(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        List<Long> visualEffectOrder = sceneElement.getVisualEffectOrder();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = visualEffectOrder.iterator();
        while (it.hasNext()) {
            KeyableVisualEffectRef keyableVisualEffectRef = sceneElement.getVisualEffects().get(Long.valueOf(((Number) it.next()).longValue()));
            if (keyableVisualEffectRef != null) {
                arrayList.add(keyableVisualEffectRef);
            }
        }
        return arrayList;
    }

    public static final boolean hasAnyAudio(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElement.getType().ordinal()];
        return i2 != 1 ? i2 != 3 ? i2 == 5 : SceneKt.hasAnyAudio(sceneElement.getNestedScene()) : sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillVideo() != null;
    }

    public static final boolean hasAnyVideo(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElement.getType().ordinal()];
        if (i2 == 1) {
            return sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillVideo() != null;
        }
        if (i2 != 3) {
            return false;
        }
        return SceneKt.hasAnyVideo(sceneElement.getNestedScene());
    }

    public static final boolean hitTestAtTime(SceneElement sceneElement, Scene scene, float f3, float f4, float f5, nKE userPreviewMode, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        SceneElement sceneElementRunScripts$default = ScriptExecutorKt.runScripts$default(sceneElement, f5, i2, i3, scene, sceneElement.getTransform().valueAtTime(f5), 0.0f, null, null, false, null, 992, null);
        Region region = new Region();
        if (sceneElementRunScripts$default.getType().getHasOutline()) {
            Path pathT = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(sceneElementRunScripts$default, f5)).t();
            TransformKt.transform(pathT, CameraElementKt.applyCameraAndParenting(sceneElementRunScripts$default, scene, f5, userPreviewMode).getTransform().valueAtTime(f5));
            region.setPath(pathT, InfinityBounds);
        } else if (sceneElementRunScripts$default.getType().isRenderable()) {
            Path pathAsPath = GeometryKt.asPath(boundsInScene(sceneElementRunScripts$default, scene));
            TransformKt.transform(pathAsPath, CameraElementKt.applyCameraAndParenting(sceneElementRunScripts$default, scene, f5, userPreviewMode).getTransform().valueAtTime(f5));
            region.setPath(pathAsPath, InfinityBounds);
        } else {
            region.setEmpty();
        }
        return region.contains((int) f3, (int) f4);
    }

    public static final boolean indirectParent(SceneElement sceneElement, Scene scene, long j2) {
        Object next;
        Long parent;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        boolean z2 = (sceneElement.getParent() == null || (parent = sceneElement.getParent()) == null || parent.longValue() != j2) ? false : true;
        if (sceneElement.getParent() == null || z2) {
            return z2;
        }
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long id = ((SceneElement) next).getId();
            Long parent2 = sceneElement.getParent();
            if (parent2 != null && id == parent2.longValue()) {
                break;
            }
        }
        SceneElement sceneElement2 = (SceneElement) next;
        if (sceneElement2 != null) {
            return indirectParent(sceneElement2, scene, j2);
        }
        return false;
    }

    public static final boolean isElementOrLinkedProject(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return sceneElement.getType() == SceneElementType.Scene && sceneElement.getLinkedSceneUUID() != null;
    }

    public static final boolean isGroup(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return sceneElement.getType() == SceneElementType.Scene && sceneElement.getLinkedSceneUUID() == null;
    }

    public static final boolean isValidUserElementTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return !StringsKt.isBlank(str);
    }

    public static final SceneElement mapChildren(SceneElement sceneElement, Function1<? super SceneElement, SceneElement> transform) {
        SceneElement sceneElementCopy$default;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (sceneElement.getType().getHasNestedScene()) {
            Scene nestedScene = sceneElement.getNestedScene();
            List<SceneElement> elements = sceneElement.getNestedScene().getElements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(mapChildren((SceneElement) it.next(), transform));
            }
            sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(nestedScene, null, 0, 0, 0, 0, 0, arrayList, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
        } else {
            sceneElementCopy$default = sceneElement;
        }
        return transform.invoke(sceneElementCopy$default);
    }

    public static final SceneElement mapChildrenWithDepth(SceneElement sceneElement, int i2, Function2<? super Integer, ? super SceneElement, SceneElement> transform) {
        SceneElement sceneElementCopy$default;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (sceneElement.getType().getHasNestedScene()) {
            Scene nestedScene = sceneElement.getNestedScene();
            List<SceneElement> elements = sceneElement.getNestedScene().getElements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(mapChildrenWithDepth((SceneElement) it.next(), i2 + 1, transform));
            }
            sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(nestedScene, null, 0, 0, 0, 0, 0, arrayList, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
        } else {
            sceneElementCopy$default = sceneElement;
        }
        return transform.invoke(Integer.valueOf(i2), sceneElementCopy$default);
    }

    public static /* synthetic */ SceneElement mapChildrenWithDepth$default(SceneElement sceneElement, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return mapChildrenWithDepth(sceneElement, i2, function2);
    }

    public static final SceneElement recreateEngineState(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        EngineState engineState = new EngineState(nCS.j.f71005n.n());
        Scene nestedScene = sceneElement.getNestedScene();
        List<SceneElement> elements = sceneElement.getNestedScene().getElements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(recreateEngineState((SceneElement) it.next()));
        }
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, engineState, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(nestedScene, null, 0, 0, 0, 0, 0, arrayList, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388625, 127, null);
    }

    public static final int sceneFrameToMediaFrameMillis(SceneElement sceneElement, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        int iRoundToInt = MathKt.roundToInt(((TimeKt.timeFromFrameNumber(i2, i3) - sceneElement.getStartTime()) * getAudioVideoSpeedFactor(sceneElement)) + sceneElement.getStartTime());
        int outTime = sceneElement.getOutTime() - sceneElement.getInTime();
        return TimeKt.frameNumberFromTime((sceneElement.getLoop() ? (Math.min(iRoundToInt, sceneElement.getEndTime()) - sceneElement.getStartTime()) % outTime : Math.min(Math.min(iRoundToInt, sceneElement.getEndTime()) - sceneElement.getStartTime(), outTime)) + sceneElement.getInTime(), i3);
    }

    public static final int sceneFrameToMediaTimeMillis(SceneElement sceneElement, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        int iMax = Math.max(i5, sceneElement.getStartTime());
        int iRoundToInt = MathKt.roundToInt(((TimeKt.timeFromFrameNumber(i2, i3) - iMax) * getAudioVideoSpeedFactor(sceneElement)) + iMax);
        int outTime = sceneElement.getOutTime() - sceneElement.getInTime();
        return (sceneElement.getLoop() ? (Math.min(iRoundToInt, (sceneElement.getEndTime() - sceneElement.getStartTime()) + iMax) - iMax) % outTime : Math.min(Math.min(iRoundToInt, (sceneElement.getEndTime() - sceneElement.getStartTime()) + iMax) - iMax, outTime)) + sceneElement.getInTime();
    }

    public static final int sceneTime(SceneElement sceneElement, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return (int) (((sceneElement.getEndTime() - sceneElement.getStartTime()) * f3) + sceneElement.getStartTime());
    }

    public static final double sceneTimeSeconds(SceneElement sceneElement, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return ((double) (((sceneElement.getEndTime() - sceneElement.getStartTime()) * f3) + sceneElement.getStartTime())) / 1000.0d;
    }

    public static final long sceneTimeToMediaTimeMicros(SceneElement sceneElement, long j2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        long outTime = ((long) (sceneElement.getOutTime() - sceneElement.getInTime())) * 1000;
        return (sceneElement.getLoop() ? (Math.min(j2, ((long) sceneElement.getEndTime()) * 1000) - (((long) sceneElement.getStartTime()) * 1000)) % outTime : Math.min(Math.min(j2, ((long) sceneElement.getEndTime()) * 1000) - (((long) sceneElement.getStartTime()) * 1000), outTime)) + ((long) sceneElement.getInTime());
    }

    public static final int sceneTimeToMediaTimeMillis(SceneElement sceneElement, int i2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        int outTime = sceneElement.getOutTime() - sceneElement.getInTime();
        return (sceneElement.getLoop() ? (Math.min(i2, sceneElement.getEndTime()) - sceneElement.getStartTime()) % outTime : Math.min(Math.min(i2, sceneElement.getEndTime()) - sceneElement.getStartTime(), outTime)) + sceneElement.getInTime();
    }

    public static final long sceneTimeToMediaTimeNanos(SceneElement sceneElement, long j2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        long outTime = ((long) (sceneElement.getOutTime() - sceneElement.getInTime())) * 1000000;
        return (sceneElement.getLoop() ? (Math.min(j2, ((long) sceneElement.getEndTime()) * 1000000) - (((long) sceneElement.getStartTime()) * 1000000)) % outTime : Math.min(Math.min(j2, ((long) sceneElement.getEndTime()) * 1000000) - (((long) sceneElement.getStartTime()) * 1000000), outTime)) + ((long) sceneElement.getInTime());
    }

    public static final void serialize(Stroke stroke, String str, XmlSerializer serializer) {
        Intrinsics.checkNotNullParameter(stroke, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        WeakHashMap<Stroke, String> weakHashMap = pointStringCache;
        String strJoinToString$default = weakHashMap.get(stroke);
        if (strJoinToString$default == null) {
            strJoinToString$default = CollectionsKt.joinToString$default(stroke.getPoints(), ";", null, null, 0, null, new Function1() { // from class: com.alightcreative.app.motion.scene.LEl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SceneElementKt.serialize$lambda$60$lambda$59((StrokePoint) obj);
                }
            }, 30, null);
            weakHashMap.put(stroke, strJoinToString$default);
        }
        serializer.startTag(str, "stroke");
        serializer.attribute(str, TtmlNode.ATTR_TTS_COLOR, HI0.qf.rl(ColorKt.toInt(stroke.getColor())));
        HI0.YzO.n(serializer, str, "width", stroke.getWidth());
        String strName = stroke.getTool().name();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = strName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        serializer.attribute(str, "type", lowerCase);
        serializer.attribute(str, "points", strJoinToString$default);
        serializer.endTag(str, "stroke");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence serialize$lambda$60$lambda$59(StrokePoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return HI0.DAz.n(it.getLocation().getX()) + "," + HI0.DAz.n(it.getLocation().getY()) + "," + HI0.DAz.n(it.getPressure());
    }

    public static final void serializeCommonAttributes(SceneElement sceneElement, String str, XmlSerializer serializer) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        HI0.YzO.t(serializer, str, "id", sceneElement.getId());
        if (!StringsKt.isBlank(sceneElement.getTag().getId())) {
            serializer.attribute(str, "tag", sceneElement.getTag().getId());
        }
        if (!StringsKt.isBlank(sceneElement.getLabel())) {
            serializer.attribute(str, "label", sceneElement.getLabel());
        }
        if (sceneElement.getHidden()) {
            HI0.YzO.nr(serializer, str, "hidden", true);
        }
        HI0.YzO.rl(serializer, str, "startTime", sceneElement.getStartTime());
        HI0.YzO.rl(serializer, str, "endTime", sceneElement.getEndTime());
        if (sceneElement.getClippingMask()) {
            HI0.YzO.nr(serializer, str, "clippingMask", true);
        }
        if (sceneElement.getType().getHasFillType()) {
            String strName = sceneElement.getFillType().name();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = strName.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            serializer.attribute(str, "fillType", lowerCase);
        }
        if (sceneElement.getType().getHasBlendingMode() && sceneElement.getBlendingMode() != BlendingMode.NORMAL) {
            serializer.attribute(str, "blending", sceneElement.getBlendingMode().getId());
        }
        if (sceneElement.getType().getHasFillImage() && sceneElement.getFillImage() != null) {
            serializer.attribute(str, "fillImage", sceneElement.getFillImage().toString());
        }
        if (sceneElement.getType() == SceneElementType.Scene && sceneElement.getNestedScene().getReTimingMethod() == ReTimingMethod.OFF) {
            if (sceneElement.getInTime() != 0) {
                HI0.YzO.rl(serializer, str, "inTime", sceneElement.getInTime());
            }
            if (sceneElement.getOutTime() != Integer.MAX_VALUE) {
                HI0.YzO.rl(serializer, str, "outTime", sceneElement.getOutTime());
            }
        } else if (sceneElement.getType().getHasSourceMedia()) {
            serializer.attribute(str, inFlMLxL.cZKZDgLwGc, sceneElement.getSrc().toString());
            if (sceneElement.getInTime() != 0) {
                HI0.YzO.rl(serializer, str, "inTime", sceneElement.getInTime());
            }
            if (sceneElement.getOutTime() != Integer.MAX_VALUE) {
                HI0.YzO.rl(serializer, str, "outTime", sceneElement.getOutTime());
            }
            if (sceneElement.getLoop()) {
                HI0.YzO.nr(serializer, str, "loop", true);
            }
        } else if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillVideo() != null) {
            serializer.attribute(str, "fillVideo", sceneElement.getFillVideo().toString());
            if (sceneElement.getInTime() != 0) {
                HI0.YzO.rl(serializer, str, "inTime", sceneElement.getInTime());
            }
            if (sceneElement.getOutTime() != Integer.MAX_VALUE) {
                HI0.YzO.rl(serializer, str, "outTime", sceneElement.getOutTime());
            }
            if (sceneElement.getLoop()) {
                HI0.YzO.nr(serializer, str, "loop", true);
            }
        }
        if (sceneElement.getSpeedMap().getKeyframes().size() == 1) {
            float fFloatValue = ((Number) ((Keyframe) CollectionsKt.first((List) sceneElement.getSpeedMap().getKeyframes())).getValue()).floatValue();
            if (fFloatValue != 1.0f) {
                HI0.YzO.n(serializer, str, "speed", fFloatValue);
            }
        }
        String lowerCase2 = sceneElement.getMediaFillMode().toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        serializer.attribute(str, "mediaFillMode", lowerCase2);
        if (sceneElement.getParent() != null) {
            HI0.YzO.t(serializer, str, "parent", sceneElement.getParent().longValue());
        }
        String templatePPId = sceneElement.getTemplatePPId();
        if (templatePPId != null) {
            serializer.attribute(str, "templatePPId", templatePPId);
        }
        String presetId = sceneElement.getPresetId();
        if (presetId != null) {
            serializer.attribute(str, "presetId", presetId);
        }
    }

    public static final void serializeCommonChildTags(SceneElement sceneElement, String str, XmlSerializer serializer) {
        KeyableEdgeDecoration no_inner_border;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (sceneElement.getType().getHasTransform()) {
            TransformKt.serialize(sceneElement.getTransform(), str, serializer, "transform");
        }
        if (sceneElement.getType().getHasFillColor()) {
            KeyableSerializerKt.serialize$default(sceneElement.getFillColor(), SolidColor.INSTANCE.getWHITE(), str, serializer, "fillColor", null, 16, null);
        }
        if (sceneElement.getType().getHasFillGradient()) {
            GradientFillKt.serialize(sceneElement.getFillGradient(), GradientFill.INSTANCE.getDEFAULT(), str, serializer, "gradient");
        }
        if (sceneElement.getType().getHasVisualEffects()) {
            Iterator<T> it = getVisualEffectsInOrder(sceneElement).iterator();
            while (it.hasNext()) {
                VisualEffectKt.serialize((KeyableVisualEffectRef) it.next(), str, serializer);
            }
        }
        if (sceneElement.getType().getHasGain()) {
            KeyableSerializerKt.serialize$default(sceneElement.getGain(), Float.valueOf(1.0f), str, serializer, "gain", null, 16, null);
        }
        if (sceneElement.getSpeedMap().getKeyframes().size() > 1) {
            KeyableSerializerKt.serialize$default(sceneElement.getSpeedMap(), Float.valueOf(1.0f), str, serializer, "speedMap", null, 16, null);
        }
        if (sceneElement.getType().getHasBorderAndShadow()) {
            for (KeyableEdgeDecoration keyableEdgeDecoration : sceneElement.getBorders()) {
                int i2 = WhenMappings.$EnumSwitchMapping$2[keyableEdgeDecoration.getDirection().ordinal()];
                if (i2 == 1) {
                    no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_INNER_BORDER();
                } else if (i2 == 2) {
                    no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_OUTER_BORDER();
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_CENTERED_BORDER();
                }
                EdgeDecorationKt.serialize(keyableEdgeDecoration, no_inner_border, str, serializer);
            }
            KeyableEdgeDecoration stroke = sceneElement.getStroke();
            KeyableEdgeDecoration.Companion companion = KeyableEdgeDecoration.INSTANCE;
            EdgeDecorationKt.serialize(stroke, companion.getNO_STROKE(), str, serializer);
            EdgeDecorationKt.serialize(sceneElement.getDropShadow(), companion.getNO_SHADOW(), str, serializer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SceneElement unserializeBaseSceneElement(SceneElementType type, String str, XmlPullParser parser) {
        Integer intOrNull;
        Integer intOrNull2;
        ElementTag elementTag;
        FillType fillType;
        BlendingMode blendingMode;
        TextureCropMode textureCropMode;
        Uri uri;
        Long longOrNull;
        Integer intOrNull3;
        Integer intOrNull4;
        Float floatOrNull;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parser, "parser");
        String attributeValue = parser.getAttributeValue(str, "startTime");
        if (attributeValue == null || (intOrNull = StringsKt.toIntOrNull(attributeValue)) == null) {
            throw new XmlPullParserException("startTime missing: " + parser.getPositionDescription());
        }
        int iIntValue = intOrNull.intValue();
        String attributeValue2 = parser.getAttributeValue(str, "endTime");
        if (attributeValue2 == null || (intOrNull2 = StringsKt.toIntOrNull(attributeValue2)) == null) {
            throw new XmlPullParserException("endTime missing: " + parser.getPositionDescription());
        }
        int iIntValue2 = intOrNull2.intValue();
        String attributeValue3 = parser.getAttributeValue(str, "label");
        if (attributeValue3 == null) {
            attributeValue3 = "";
        }
        String str2 = attributeValue3;
        String attributeValue4 = parser.getAttributeValue(str, "speed");
        float fFloatValue = (attributeValue4 == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue4)) == null) ? 1.0f : floatOrNull.floatValue();
        String attributeValue5 = parser.getAttributeValue(str, "inTime");
        int iIntValue3 = (attributeValue5 == null || (intOrNull4 = StringsKt.toIntOrNull(attributeValue5)) == null) ? 0 : intOrNull4.intValue();
        String attributeValue6 = parser.getAttributeValue(str, "outTime");
        int iIntValue4 = (attributeValue6 == null || (intOrNull3 = StringsKt.toIntOrNull(attributeValue6)) == null) ? Integer.MAX_VALUE : intOrNull3.intValue();
        String attributeValue7 = parser.getAttributeValue(str, "loop");
        boolean z2 = attributeValue7 != null ? Boolean.parseBoolean(attributeValue7) : false;
        ElementTag[] elementTagArrValues = ElementTag.values();
        int length = elementTagArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                elementTag = null;
                break;
            }
            elementTag = elementTagArrValues[i2];
            if (Intrinsics.areEqual(elementTag.getId(), parser.getAttributeValue(str, "tag"))) {
                break;
            }
            i2++;
        }
        if (elementTag == null) {
            elementTag = ElementTag.NONE;
        }
        ElementTag elementTag2 = elementTag;
        String attributeValue8 = parser.getAttributeValue(str, "id");
        long jLongValue = (attributeValue8 == null || (longOrNull = StringsKt.toLongOrNull(attributeValue8)) == null) ? 0L : longOrNull.longValue();
        String attributeValue9 = parser.getAttributeValue(str, "fillType");
        if (attributeValue9 != null) {
            FillType[] fillTypeArrValues = FillType.values();
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, HrvQKfmFZJudBc.jmQJDz);
            String upperCase = attributeValue9.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            fillType = (FillType) HI0.Ew.n(fillTypeArrValues, upperCase);
        } else {
            fillType = null;
        }
        String attributeValue10 = parser.getAttributeValue(str, "blending");
        if (attributeValue10 != null) {
            BlendingMode[] blendingModeArrValues = BlendingMode.values();
            int length2 = blendingModeArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    blendingMode = null;
                    break;
                }
                blendingMode = blendingModeArrValues[i3];
                if (Intrinsics.areEqual(blendingMode.getId(), attributeValue10)) {
                    break;
                }
                i3++;
            }
            if (blendingMode == null) {
                blendingMode = BlendingMode.NORMAL;
            }
        }
        BlendingMode blendingMode2 = blendingMode;
        String attributeValue11 = parser.getAttributeValue(str, "fillImage");
        Uri uri2 = attributeValue11 != null ? Uri.parse(attributeValue11) : null;
        String attributeValue12 = parser.getAttributeValue(str, "fillVideo");
        Uri uri3 = attributeValue12 != null ? Uri.parse(attributeValue12) : null;
        String attributeValue13 = parser.getAttributeValue(str, "mediaFillMode");
        if (attributeValue13 != null) {
            TextureCropMode[] textureCropModeArrValues = TextureCropMode.values();
            String upperCase2 = attributeValue13.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            textureCropMode = (TextureCropMode) HI0.Ew.n(textureCropModeArrValues, upperCase2);
            if (textureCropMode == null) {
                textureCropMode = TextureCropMode.STRETCH;
            }
        }
        TextureCropMode textureCropMode2 = textureCropMode;
        String attributeValue14 = parser.getAttributeValue(str, "hidden");
        boolean z3 = attributeValue14 != null ? Boolean.parseBoolean(attributeValue14) : false;
        String attributeValue15 = parser.getAttributeValue(str, "clippingMask");
        boolean z4 = attributeValue15 != null ? Boolean.parseBoolean(attributeValue15) : false;
        String attributeValue16 = parser.getAttributeValue(str, "src");
        if (attributeValue16 == null || (uri = Uri.parse(attributeValue16)) == null) {
            uri = Uri.EMPTY;
        }
        Uri uri4 = uri;
        String attributeValue17 = parser.getAttributeValue(str, "parent");
        Long longOrNull2 = attributeValue17 != null ? StringsKt.toLongOrNull(attributeValue17) : null;
        String attributeValue18 = parser.getAttributeValue(str, "templatePPId");
        String string = attributeValue18 != null ? attributeValue18.toString() : null;
        String attributeValue19 = parser.getAttributeValue(str, "presetId");
        String string2 = attributeValue19 != null ? attributeValue19.toString() : null;
        FillType fillType2 = fillType;
        EngineState engineState = new EngineState(nCS.j.f71005n.n());
        Intrinsics.checkNotNull(uri4);
        if (fillType2 == null) {
            fillType2 = (uri3 == null && uri2 == null) ? SceneElementTypeKt.getSupportsIntrinsicFill(type) ? FillType.INTRINSIC : (type == SceneElementType.Shape || type == SceneElementType.Text) ? FillType.COLOR : FillType.NONE : FillType.MEDIA;
        }
        return new SceneElement(type, iIntValue, iIntValue2, jLongValue, engineState, str2, null, KeyableSolidColor.INSTANCE.getWHITE(), uri2, uri3, null, fillType2, textureCropMode2, null, uri4, KeyableKt.keyable(fFloatValue), null, iIntValue3, iIntValue4, z2, null, null, blendingMode2, null, null, null, null, elementTag2, null, null, null, null, null, z3, null, longOrNull2, z4, string, string2, -139385792, 5, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03c9, code lost:
    
        if (r0.hasNext() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03cb, code lost:
    
        r1 = java.lang.Integer.valueOf(((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) r0.next()).getBorderId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03dd, code lost:
    
        if (r4.compareTo(r1) >= 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03e0, code lost:
    
        if (r4 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03e2, code lost:
    
        r0 = r4.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03e7, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03e8, code lost:
    
        r0 = r33.copy((16339 & 1) != 0 ? r33.type : null, (16339 & 2) != 0 ? r33.direction : null, (16339 & 4) != 0 ? r33.enabled : false, (16339 & 8) != 0 ? r33.color : null, (16339 & 16) != 0 ? r33.alpha : null, (16339 & 32) != 0 ? r33.size : null, (16339 & 64) != 0 ? r33.hardness : null, (16339 & 128) != 0 ? r33.offset : null, (16339 & 256) != 0 ? r33.cap : null, (16339 & 512) != 0 ? r33.join : null, (16339 & 1024) != 0 ? r33.startStyle : null, (16339 & 2048) != 0 ? r33.endStyle : null, (16339 & 4096) != 0 ? r33.endSize : 0.0f, (16339 & 8192) != 0 ? r33.borderId : r0 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0458, code lost:
    
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(r45, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.alightcreative.app.motion.scene.KeyableEdgeDecoration>) r45.getBorders(), r0), null, false, null, null, false, null, null, Integer.MAX_VALUE, 127, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x046f, code lost:
    
        throw new kotlin.NotImplementedError("An operation is not implemented: Implement glow support");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0088, code lost:
    
        if (r46.equals("path-stroke") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        if (r46.equals("glow") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0154, code lost:
    
        if (r46.equals("shadow") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x023e, code lost:
    
        if (r46.equals("border") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0242, code lost:
    
        r33 = com.alightcreative.app.motion.scene.EdgeDecorationKt.unserializeKeyableEdgeDecoration(r47, r48, r46, r49);
        r0 = com.alightcreative.app.motion.scene.SceneElementKt.WhenMappings.$EnumSwitchMapping$3[r33.getType().ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0255, code lost:
    
        if (r0 == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0257, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0259, code lost:
    
        if (r0 == 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025c, code lost:
    
        if (r0 == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x025f, code lost:
    
        if (r0 == 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0262, code lost:
    
        if (r0 == 5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0269, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0274, code lost:
    
        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(null, null, false, 7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0275, code lost:
    
        r0 = com.alightcreative.app.motion.scene.SceneElementKt.WhenMappings.$EnumSwitchMapping$2[r33.getDirection().ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0281, code lost:
    
        if (r0 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0283, code lost:
    
        if (r0 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0285, code lost:
    
        if (r0 == 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028c, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0297, code lost:
    
        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(null, null, false, 7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02e6, code lost:
    
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(r45, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, r33, false, null, null, false, null, null, -1, 126, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02fd, code lost:
    
        throw new kotlin.NotImplementedError("An operation is not implemented: Implement inner shadow");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02fe, code lost:
    
        r0 = com.alightcreative.app.motion.scene.SceneElementKt.WhenMappings.$EnumSwitchMapping$2[r33.getDirection().ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x030c, code lost:
    
        if (r0 == 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x030e, code lost:
    
        if (r0 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0310, code lost:
    
        if (r0 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0361, code lost:
    
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(r45, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, r33, null, null, false, null, null, false, null, null, -1073741825, 127, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0367, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x036d, code lost:
    
        throw new kotlin.NotImplementedError(null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0373, code lost:
    
        throw new kotlin.NotImplementedError(null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x037a, code lost:
    
        if (r33.getBorderId() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x037c, code lost:
    
        r0 = r45.getBorders();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0380, code lost:
    
        if (r0 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0386, code lost:
    
        if (r0.isEmpty() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0389, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0391, code lost:
    
        if (r0.hasNext() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03a1, code lost:
    
        if (((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) r0.next()).getBorderId() != r33.getBorderId()) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03a4, code lost:
    
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03a7, code lost:
    
        r0 = r45.getBorders().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03b3, code lost:
    
        if (r0.hasNext() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03b6, code lost:
    
        r1 = java.lang.Integer.valueOf(((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) r0.next()).getBorderId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03c4, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SceneElement unserializeCommonChildTag(SceneElement sceneElement, String tag, String str, XmlPullParser parser, boolean z2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(parser, "parser");
        int iHashCode = tag.hashCode();
        Float fValueOf = Float.valueOf(1.0f);
        switch (iHashCode) {
            case -2131201131:
                if (tag.equals("speedMap")) {
                    return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableSerializerKt.unserializeKeyable(str, parser, tag, fValueOf, z2), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32769, 127, null);
                }
                HI0.YzO.J2(parser);
                return sceneElement;
            case -1383304148:
                break;
            case -1306084975:
                if (tag.equals("effect")) {
                    KeyableVisualEffectRef keyableVisualEffectRefUnserializeVisualEffect = VisualEffectKt.unserializeVisualEffect(str, parser, z2);
                    return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(sceneElement.getVisualEffects(), TuplesKt.to(Long.valueOf(keyableVisualEffectRefUnserializeVisualEffect.getInstanceId()), keyableVisualEffectRefUnserializeVisualEffect)), CollectionsKt.plus((Collection<? extends Long>) sceneElement.getVisualEffectOrder(), Long.valueOf(keyableVisualEffectRefUnserializeVisualEffect.getInstanceId())), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
                }
                HI0.YzO.J2(parser);
                return sceneElement;
            case -1141881952:
                if (tag.equals("fillColor")) {
                    return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, KeyableSerializerKt.unserializeKeyable(str, parser, tag, SolidColor.INSTANCE.getWHITE(), z2), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -129, 127, null);
                }
                HI0.YzO.J2(parser);
                return sceneElement;
            case -903579360:
                break;
            case 3165055:
                if (tag.equals("gain")) {
                    return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, KeyableSerializerKt.unserializeKeyable(str, parser, tag, fValueOf, z2), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1048577, 127, null);
                }
                HI0.YzO.J2(parser);
                return sceneElement;
            case 3175821:
                break;
            case 89650992:
                if (tag.equals("gradient")) {
                    return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, GradientFillKt.gradientFillFromXml(str, parser), null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1025, 127, null);
                }
                HI0.YzO.J2(parser);
                return sceneElement;
            case 766277856:
                break;
            case 1052666732:
                if (tag.equals("transform")) {
                    return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.keyableTransformFromXml(str, parser, z2), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                }
                HI0.YzO.J2(parser);
                return sceneElement;
            default:
                HI0.YzO.J2(parser);
                return sceneElement;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Stroke unserializeStroke(String str, XmlPullParser parser) throws XmlPullParserException, IOException {
        SolidColor blue;
        DrawingTool drawingTool;
        Float floatOrNull;
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, str, "stroke");
        String attributeValue = parser.getAttributeValue(str, TtmlNode.ATTR_TTS_COLOR);
        if (attributeValue == null || (blue = HI0.qf.t(HI0.gnv.Uo(attributeValue))) == null) {
            blue = SolidColor.INSTANCE.getBLUE();
        }
        String attributeValue2 = parser.getAttributeValue(str, "width");
        float fFloatValue = (attributeValue2 == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue2)) == null) ? 5.0f : floatOrNull.floatValue();
        String attributeValue3 = parser.getAttributeValue(str, "type");
        if (attributeValue3 != null) {
            DrawingTool[] drawingToolArrValues = DrawingTool.values();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = attributeValue3.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            drawingTool = (DrawingTool) HI0.Ew.n(drawingToolArrValues, upperCase);
            if (drawingTool == null) {
                drawingTool = DrawingTool.PEN;
            }
        }
        String attributeValue4 = parser.getAttributeValue(str, "points");
        if (attributeValue4 == null) {
            attributeValue4 = "";
        }
        Sequence sequenceMapNotNull = SequencesKt.mapNotNull(StringsKt.splitToSequence$default((CharSequence) attributeValue4, new String[]{";"}, false, 0, 6, (Object) null), new Function1() { // from class: com.alightcreative.app.motion.scene.Sis
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SceneElementKt.unserializeStroke$lambda$64((String) obj);
            }
        });
        HI0.YzO.J2(parser);
        return new Stroke(SequencesKt.toList(sequenceMapNotNull), blue, drawingTool, fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StrokePoint unserializeStroke$lambda$64(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List listSplit$default = StringsKt.split$default((CharSequence) it, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listSplit$default.iterator();
        while (it2.hasNext()) {
            Float floatOrNull = StringsKt.toFloatOrNull((String) it2.next());
            if (floatOrNull != null) {
                arrayList.add(floatOrNull);
            }
        }
        List listUnserializeStroke$requireMinLengthOrNull = unserializeStroke$requireMinLengthOrNull(arrayList, 3);
        if (listUnserializeStroke$requireMinLengthOrNull == null) {
            return null;
        }
        float fFloatValue = ((Number) listUnserializeStroke$requireMinLengthOrNull.get(0)).floatValue();
        float fFloatValue2 = ((Number) listUnserializeStroke$requireMinLengthOrNull.get(1)).floatValue();
        return new StrokePoint(new Vector2D(fFloatValue, fFloatValue2), ((Number) listUnserializeStroke$requireMinLengthOrNull.get(2)).floatValue());
    }

    public static final KeyableVisualEffectRef visualEffectAtPosition(SceneElement sceneElement, int i2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        KeyableVisualEffectRef keyableVisualEffectRef = sceneElement.getVisualEffects().get(sceneElement.getVisualEffectOrder().get(i2));
        if (keyableVisualEffectRef != null) {
            return keyableVisualEffectRef;
        }
        throw new RuntimeException("Visual effect at index " + i2 + " (iid=" + sceneElement.getVisualEffectOrder().get(i2) + ") does not exist.");
    }

    public static final SceneElement withAbsoluteTimingAndSpeedInScene(SceneElement sceneElement, List<SceneElement> elementPath, final Map<SceneElement, SceneElement> withClippingCache) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(elementPath, "elementPath");
        Intrinsics.checkNotNullParameter(withClippingCache, "withClippingCache");
        if (elementPath.size() == 1) {
            return sceneElement;
        }
        Iterator it = SequencesKt.map(CollectionsKt.asSequence(elementPath), new Function1() { // from class: com.alightcreative.app.motion.scene.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SceneElementKt.withAbsoluteTimingAndSpeedInScene$lambda$74(withClippingCache, (SceneElement) obj);
            }
        }).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            SceneElement sceneElement2 = (SceneElement) it.next();
            SceneElement sceneElement3 = (SceneElement) next;
            Ml.j jVar = d2n.Ml.f63370t;
            int iCoerceAtMost = RangesKt.coerceAtMost(((int) d2n.Ml.mUb(bK.n.nr(jVar.rl(sceneElement2.getStartTime()), jVar.rl(sceneElement3.getInTime()), sceneElement3.getTimeMapping().getSpeedFunction()))) + sceneElement3.getStartTime(), sceneElement3.getEndTime());
            int iCoerceAtMost2 = RangesKt.coerceAtMost(((int) d2n.Ml.mUb(bK.n.nr(jVar.rl(sceneElement2.getEndTime()), jVar.rl(sceneElement3.getInTime()), sceneElement3.getTimeMapping().getSpeedFunction()))) + sceneElement3.getStartTime(), sceneElement3.getEndTime());
            final float nestedSceneSpeedFactor = sceneElement3.getNestedSceneSpeedFactor();
            next = SceneElement.copy$default(sceneElement2, null, iCoerceAtMost, iCoerceAtMost2, 0L, null, null, null, null, null, null, null, null, null, null, null, UserParameterKt.copyAdjustingFloatValue(sceneElement2.getSpeedMap(), new Function1() { // from class: com.alightcreative.app.motion.scene.O
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Float.valueOf(SceneElementKt.withAbsoluteTimingAndSpeedInScene$lambda$76$lambda$75(nestedSceneSpeedFactor, ((Float) obj).floatValue()));
                }
            }), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32775, 127, null);
        }
        return (SceneElement) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement withAbsoluteTimingAndSpeedInScene$lambda$74(Map map, SceneElement el) {
        Intrinsics.checkNotNullParameter(el, "el");
        Object obj = map.get(el);
        if (obj == null) {
            obj = (SceneElement) w9.Wre.n(el, el.getType() == SceneElementType.Scene, new Function1() { // from class: com.alightcreative.app.motion.scene.pO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SceneElementKt.withAbsoluteTimingAndSpeedInScene$lambda$74$lambda$73$lambda$72((SceneElement) obj2);
                }
            });
            map.put(el, obj);
        }
        return (SceneElement) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement withAbsoluteTimingAndSpeedInScene$lambda$74$lambda$73$lambda$72(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, NestedSceneClippingKt.getNestedSceneApplyingClipping(it), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String boundsAtTime$lambda$42$lambda$40(RectF rectF) {
        return "SceneElement.boundsAtTime [by outline] pathBounds=" + GeometryKt.toRectangle(rectF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String boundsAtTime$lambda$42$lambda$41(SceneElement sceneElement, Scene scene, float f3) {
        return "SceneElement.boundsAtTime [by enclosingTransform] bounds=" + boundsInScene(sceneElement, scene) + " afterTransform=" + GeometryKt.enclosingTransform(boundsInScene(sceneElement, scene), sceneElement.getTransform().valueAtTime(f3)) + " transform(" + f3 + ")=" + sceneElement.getTransform().valueAtTime(f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> List<T> unserializeStroke$requireMinLengthOrNull(List<? extends T> list, int i2) {
        if (list.size() < i2) {
            return null;
        }
        return list;
    }

    private static final boolean includesScriptEffects(Map<?, KeyableVisualEffectRef> map) {
        return includesScriptEffects(map.values());
    }

    private static final boolean includesShaderEffects(Map<?, KeyableVisualEffectRef> map) {
        return includesShaderEffects(map.values());
    }

    public static final Rectangle getBounds(Drawing drawing) {
        Intrinsics.checkNotNullParameter(drawing, "<this>");
        WeakHashMap<Drawing, Rectangle> weakHashMap = drawingBoundsCache;
        Rectangle rectangle = weakHashMap.get(drawing);
        if (rectangle == null) {
            List<Stroke> strokes = drawing.getStrokes();
            Rectangle empty = Rectangle.INSTANCE.getEMPTY();
            Iterator<T> it = strokes.iterator();
            while (it.hasNext()) {
                empty = GeometryKt.union(empty, getBounds((Stroke) it.next()));
            }
            weakHashMap.put(drawing, empty);
            rectangle = empty;
        }
        Intrinsics.checkNotNullExpressionValue(rectangle, "getOrPut(...)");
        return rectangle;
    }

    public static final boolean isTimeDependent(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        int duration = SceneKt.getDuration(scene);
        List<SceneElement> elements = scene.getElements();
        if (elements != null && elements.isEmpty()) {
            return false;
        }
        for (SceneElement sceneElement : elements) {
            if (isTimeDependent(sceneElement) || sceneElement.getStartTime() > 5 || sceneElement.getEndTime() < duration - 5) {
                return true;
            }
        }
        return false;
    }

    public static final Rectangle getBounds(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return new Rectangle((-scene.getWidth()) / 2.0f, (-scene.getHeight()) / 2.0f, scene.getWidth() / 2.0f, scene.getHeight() / 2.0f);
    }
}
