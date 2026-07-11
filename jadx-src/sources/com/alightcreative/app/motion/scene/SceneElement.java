package com.alightcreative.app.motion.scene;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.timemapping.TimeMapping;
import com.alightcreative.app.motion.scene.timemapping.TimeMappingKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B½\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020%\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020100\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\b03\u0012\b\b\u0002\u00104\u001a\u000205\u0012\b\b\u0002\u00106\u001a\u000207\u0012\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020900\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;03\u0012\b\b\u0002\u0010=\u001a\u00020;\u0012\b\b\u0002\u0010>\u001a\u00020%\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010B\u001a\u00020%\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bE\u0010FJ\t\u0010\u0095\u0001\u001a\u00020\u0005H\u0016J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u000eHÆ\u0003J\u0010\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u001aHÆ\u0003J\n\u0010£\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0013HÆ\u0003J\u0010\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010HÆ\u0003J\n\u0010¦\u0001\u001a\u00020!HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010©\u0001\u001a\u00020%HÆ\u0003J\u0010\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010HÆ\u0003J\n\u0010«\u0001\u001a\u00020(HÆ\u0003J\n\u0010¬\u0001\u001a\u00020*HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020,HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\u0016\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020100HÆ\u0003J\u0010\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\b03HÆ\u0003J\n\u0010±\u0001\u001a\u000205HÆ\u0003J\n\u0010²\u0001\u001a\u000207HÆ\u0003J\u0016\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020900HÆ\u0003J\n\u0010´\u0001\u001a\u00020;HÆ\u0003J\u0010\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020;03HÆ\u0003J\n\u0010¶\u0001\u001a\u00020;HÆ\u0003J\n\u0010·\u0001\u001a\u00020%HÆ\u0003J\n\u0010¸\u0001\u001a\u00020@HÆ\u0003J\u0012\u0010¹\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0003\u0010\u0083\u0001J\n\u0010º\u0001\u001a\u00020%HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003JØ\u0003\u0010½\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020%2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u000201002\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\b032\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u0002072\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000209002\b\b\u0002\u0010:\u001a\u00020;2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;032\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020%2\b\b\u0002\u0010?\u001a\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010B\u001a\u00020%2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0003\u0010¾\u0001J\u0015\u0010¿\u0001\u001a\u00020%2\t\u0010À\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Á\u0001\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bX\u0010WR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010\u001d\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\ba\u0010WR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010¢\u0006\b\n\u0000\u001a\u0004\bb\u0010UR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010JR\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010JR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010¢\u0006\b\n\u0000\u001a\u0004\bi\u0010UR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020100¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\b03¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u001d\u00108\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020900¢\u0006\b\n\u0000\u001a\u0004\bz\u0010sR\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020;03¢\u0006\b\n\u0000\u001a\u0004\b}\u0010uR\u0011\u0010=\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b~\u0010|R\u0011\u0010>\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010hR\u0013\u0010?\u001a\u00020@¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010A\u001a\u0004\u0018\u00010\b¢\u0006\r\n\u0003\u0010\u0084\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0012\u0010B\u001a\u00020%¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010hR\u0014\u0010C\u001a\u0004\u0018\u00010\f¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010QR\u0014\u0010D\u001a\u0004\u0018\u00010\f¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010QR \u0010\u0088\u0001\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008d\u0001\u001a\u00030\u008e\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00108F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010UR\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Â\u0001"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElement;", "", "type", "Lcom/alightcreative/app/motion/scene/SceneElementType;", "startTime", "", "endTime", "id", "", "engineState", "Lcom/alightcreative/app/motion/scene/EngineState;", "label", "", "transform", "Lcom/alightcreative/app/motion/scene/KeyableTransform;", "fillColor", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "fillImage", "Landroid/net/Uri;", "fillVideo", "fillGradient", "Lcom/alightcreative/app/motion/scene/GradientFill;", "fillType", "Lcom/alightcreative/app/motion/scene/FillType;", "mediaFillMode", "Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;", "outline", "Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "src", "speedMap", "", "liveShape", "Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "inTime", "outTime", "loop", "", "gain", "text", "Lcom/alightcreative/app/motion/scene/StyledText;", "blendingMode", "Lcom/alightcreative/app/motion/scene/BlendingMode;", "nestedScene", "Lcom/alightcreative/app/motion/scene/Scene;", "linkedSceneUUID", "Ljava/util/UUID;", "visualEffects", "", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "visualEffectOrder", "", "tag", "Lcom/alightcreative/app/motion/scene/ElementTag;", "drawing", "Lcom/alightcreative/app/motion/scene/Drawing;", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "stroke", "Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "borders", "dropShadow", "hidden", "cameraProperties", "Lcom/alightcreative/app/motion/scene/CameraProperties;", "parent", "clippingMask", "templatePPId", "presetId", "<init>", "(Lcom/alightcreative/app/motion/scene/SceneElementType;IIJLcom/alightcreative/app/motion/scene/EngineState;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/KeyableTransform;Lcom/alightcreative/app/motion/scene/Keyable;Landroid/net/Uri;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/GradientFill;Lcom/alightcreative/app/motion/scene/FillType;Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;IIZLcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/BlendingMode;Lcom/alightcreative/app/motion/scene/Scene;Ljava/util/UUID;Ljava/util/Map;Ljava/util/List;Lcom/alightcreative/app/motion/scene/ElementTag;Lcom/alightcreative/app/motion/scene/Drawing;Ljava/util/Map;Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;Ljava/util/List;Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;ZLcom/alightcreative/app/motion/scene/CameraProperties;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/alightcreative/app/motion/scene/SceneElementType;", "getStartTime", "()I", "getEndTime", "getId", "()J", "getEngineState", "()Lcom/alightcreative/app/motion/scene/EngineState;", "getLabel", "()Ljava/lang/String;", "getTransform", "()Lcom/alightcreative/app/motion/scene/KeyableTransform;", "getFillColor", "()Lcom/alightcreative/app/motion/scene/Keyable;", "getFillImage", "()Landroid/net/Uri;", "getFillVideo", "getFillGradient", "()Lcom/alightcreative/app/motion/scene/GradientFill;", "getFillType", "()Lcom/alightcreative/app/motion/scene/FillType;", "getMediaFillMode", "()Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;", "getOutline", "()Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "getSrc", "getSpeedMap", "getLiveShape", "()Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "getInTime", "getOutTime", "getLoop", "()Z", "getGain", "getText", "()Lcom/alightcreative/app/motion/scene/StyledText;", "getBlendingMode", "()Lcom/alightcreative/app/motion/scene/BlendingMode;", "getNestedScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "getLinkedSceneUUID", "()Ljava/util/UUID;", "getVisualEffects", "()Ljava/util/Map;", "getVisualEffectOrder", "()Ljava/util/List;", "getTag", "()Lcom/alightcreative/app/motion/scene/ElementTag;", "getDrawing", "()Lcom/alightcreative/app/motion/scene/Drawing;", "getUserElementParamValues", "getStroke", "()Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "getBorders", "getDropShadow", "getHidden", "getCameraProperties", "()Lcom/alightcreative/app/motion/scene/CameraProperties;", "getParent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClippingMask", "getTemplatePPId", "getPresetId", "nestedSceneSpeedFactor", "getNestedSceneSpeedFactor", "()F", "nestedSceneSpeedFactor$delegate", "Lkotlin/Lazy;", "timeMapping", "Lcom/alightcreative/app/motion/scene/timemapping/TimeMapping;", "getTimeMapping", "()Lcom/alightcreative/app/motion/scene/timemapping/TimeMapping;", "timeMapping$delegate", "timeKeyframes", "getTimeKeyframes", "_hashCode", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(Lcom/alightcreative/app/motion/scene/SceneElementType;IIJLcom/alightcreative/app/motion/scene/EngineState;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/KeyableTransform;Lcom/alightcreative/app/motion/scene/Keyable;Landroid/net/Uri;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/GradientFill;Lcom/alightcreative/app/motion/scene/FillType;Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;IIZLcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/BlendingMode;Lcom/alightcreative/app/motion/scene/Scene;Ljava/util/UUID;Ljava/util/Map;Ljava/util/List;Lcom/alightcreative/app/motion/scene/ElementTag;Lcom/alightcreative/app/motion/scene/Drawing;Ljava/util/Map;Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;Ljava/util/List;Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;ZLcom/alightcreative/app/motion/scene/CameraProperties;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/SceneElement;", "equals", InneractiveMediationNameConsts.OTHER, "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SceneElement {
    public static final int $stable = 8;
    private int _hashCode;
    private final BlendingMode blendingMode;
    private final List<KeyableEdgeDecoration> borders;
    private final CameraProperties cameraProperties;
    private final boolean clippingMask;
    private final Drawing drawing;
    private final KeyableEdgeDecoration dropShadow;
    private final int endTime;
    private final EngineState engineState;
    private final Keyable<SolidColor> fillColor;
    private final GradientFill fillGradient;
    private final Uri fillImage;
    private final FillType fillType;
    private final Uri fillVideo;
    private final Keyable<Float> gain;
    private final boolean hidden;
    private final long id;
    private final int inTime;
    private final String label;
    private final UUID linkedSceneUUID;
    private final LiveShapeRef liveShape;
    private final boolean loop;
    private final TextureCropMode mediaFillMode;
    private final Scene nestedScene;

    /* JADX INFO: renamed from: nestedSceneSpeedFactor$delegate, reason: from kotlin metadata */
    private final Lazy nestedSceneSpeedFactor;
    private final int outTime;
    private final KeyableCompoundCubicBSpline outline;
    private final Long parent;
    private final String presetId;
    private final Keyable<Float> speedMap;
    private final Uri src;
    private final int startTime;
    private final KeyableEdgeDecoration stroke;
    private final ElementTag tag;
    private final String templatePPId;
    private final StyledText text;

    /* JADX INFO: renamed from: timeMapping$delegate, reason: from kotlin metadata */
    private final Lazy timeMapping;
    private final KeyableTransform transform;
    private final SceneElementType type;
    private final Map<String, KeyableUserParameterValue> userElementParamValues;
    private final List<Long> visualEffectOrder;
    private final Map<Long, KeyableVisualEffectRef> visualEffects;

    public SceneElement(SceneElementType type, int i2, int i3, long j2, EngineState engineState, String label, KeyableTransform transform, Keyable<SolidColor> fillColor, Uri uri, Uri uri2, GradientFill fillGradient, FillType fillType, TextureCropMode mediaFillMode, KeyableCompoundCubicBSpline outline, Uri src, Keyable<Float> speedMap, LiveShapeRef liveShape, int i5, int i7, boolean z2, Keyable<Float> gain, StyledText text, BlendingMode blendingMode, Scene nestedScene, UUID uuid, Map<Long, KeyableVisualEffectRef> visualEffects, List<Long> visualEffectOrder, ElementTag tag, Drawing drawing, Map<String, KeyableUserParameterValue> userElementParamValues, KeyableEdgeDecoration stroke, List<KeyableEdgeDecoration> borders, KeyableEdgeDecoration dropShadow, boolean z3, CameraProperties cameraProperties, Long l2, boolean z4, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(engineState, "engineState");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Intrinsics.checkNotNullParameter(fillGradient, "fillGradient");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        Intrinsics.checkNotNullParameter(mediaFillMode, "mediaFillMode");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(speedMap, "speedMap");
        Intrinsics.checkNotNullParameter(liveShape, "liveShape");
        Intrinsics.checkNotNullParameter(gain, "gain");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        Intrinsics.checkNotNullParameter(nestedScene, "nestedScene");
        Intrinsics.checkNotNullParameter(visualEffects, "visualEffects");
        Intrinsics.checkNotNullParameter(visualEffectOrder, "visualEffectOrder");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(drawing, "drawing");
        Intrinsics.checkNotNullParameter(userElementParamValues, "userElementParamValues");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Intrinsics.checkNotNullParameter(borders, "borders");
        Intrinsics.checkNotNullParameter(dropShadow, "dropShadow");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        this.type = type;
        this.startTime = i2;
        this.endTime = i3;
        this.id = j2;
        this.engineState = engineState;
        this.label = label;
        this.transform = transform;
        this.fillColor = fillColor;
        this.fillImage = uri;
        this.fillVideo = uri2;
        this.fillGradient = fillGradient;
        this.fillType = fillType;
        this.mediaFillMode = mediaFillMode;
        this.outline = outline;
        this.src = src;
        this.speedMap = speedMap;
        this.liveShape = liveShape;
        this.inTime = i5;
        this.outTime = i7;
        this.loop = z2;
        this.gain = gain;
        this.text = text;
        this.blendingMode = blendingMode;
        this.nestedScene = nestedScene;
        this.linkedSceneUUID = uuid;
        this.visualEffects = visualEffects;
        this.visualEffectOrder = visualEffectOrder;
        this.tag = tag;
        this.drawing = drawing;
        this.userElementParamValues = userElementParamValues;
        this.stroke = stroke;
        this.borders = borders;
        this.dropShadow = dropShadow;
        this.hidden = z3;
        this.cameraProperties = cameraProperties;
        this.parent = l2;
        this.clippingMask = z4;
        this.templatePPId = str;
        this.presetId = str2;
        this.nestedSceneSpeedFactor = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.scene.iF
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(SceneElement.nestedSceneSpeedFactor_delegate$lambda$2(this.f46090n));
            }
        });
        this.timeMapping = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.scene.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneElement.timeMapping_delegate$lambda$3(this.f46381n);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SceneElement copy$default(SceneElement sceneElement, SceneElementType sceneElementType, int i2, int i3, long j2, EngineState engineState, String str, KeyableTransform keyableTransform, Keyable keyable, Uri uri, Uri uri2, GradientFill gradientFill, FillType fillType, TextureCropMode textureCropMode, KeyableCompoundCubicBSpline keyableCompoundCubicBSpline, Uri uri3, Keyable keyable2, LiveShapeRef liveShapeRef, int i5, int i7, boolean z2, Keyable keyable3, StyledText styledText, BlendingMode blendingMode, Scene scene, UUID uuid, Map map, List list, ElementTag elementTag, Drawing drawing, Map map2, KeyableEdgeDecoration keyableEdgeDecoration, List list2, KeyableEdgeDecoration keyableEdgeDecoration2, boolean z3, CameraProperties cameraProperties, Long l2, boolean z4, String str2, String str3, int i8, int i9, Object obj) {
        String str4;
        String str5;
        BlendingMode blendingMode2;
        Scene scene2;
        UUID uuid2;
        Map map3;
        List list3;
        ElementTag elementTag2;
        Drawing drawing2;
        Map map4;
        KeyableEdgeDecoration keyableEdgeDecoration3;
        List list4;
        KeyableEdgeDecoration keyableEdgeDecoration4;
        boolean z5;
        CameraProperties cameraProperties2;
        Long l5;
        boolean z6;
        Uri uri4;
        Keyable keyable4;
        Uri uri5;
        Uri uri6;
        GradientFill gradientFill2;
        FillType fillType2;
        TextureCropMode textureCropMode2;
        KeyableCompoundCubicBSpline keyableCompoundCubicBSpline2;
        Keyable keyable5;
        LiveShapeRef liveShapeRef2;
        int i10;
        int i11;
        boolean z7;
        Keyable keyable6;
        StyledText styledText2;
        int i12;
        int i13;
        long j3;
        EngineState engineState2;
        String str6;
        KeyableTransform keyableTransform2;
        SceneElementType sceneElementType2 = (i8 & 1) != 0 ? sceneElement.type : sceneElementType;
        int i14 = (i8 & 2) != 0 ? sceneElement.startTime : i2;
        int i15 = (i8 & 4) != 0 ? sceneElement.endTime : i3;
        long j4 = (i8 & 8) != 0 ? sceneElement.id : j2;
        EngineState engineState3 = (i8 & 16) != 0 ? sceneElement.engineState : engineState;
        String str7 = (i8 & 32) != 0 ? sceneElement.label : str;
        KeyableTransform keyableTransform3 = (i8 & 64) != 0 ? sceneElement.transform : keyableTransform;
        Keyable keyable7 = (i8 & 128) != 0 ? sceneElement.fillColor : keyable;
        Uri uri7 = (i8 & 256) != 0 ? sceneElement.fillImage : uri;
        Uri uri8 = (i8 & 512) != 0 ? sceneElement.fillVideo : uri2;
        GradientFill gradientFill3 = (i8 & 1024) != 0 ? sceneElement.fillGradient : gradientFill;
        FillType fillType3 = (i8 & 2048) != 0 ? sceneElement.fillType : fillType;
        TextureCropMode textureCropMode3 = (i8 & 4096) != 0 ? sceneElement.mediaFillMode : textureCropMode;
        SceneElementType sceneElementType3 = sceneElementType2;
        KeyableCompoundCubicBSpline keyableCompoundCubicBSpline3 = (i8 & 8192) != 0 ? sceneElement.outline : keyableCompoundCubicBSpline;
        Uri uri9 = (i8 & 16384) != 0 ? sceneElement.src : uri3;
        Keyable keyable8 = (i8 & 32768) != 0 ? sceneElement.speedMap : keyable2;
        LiveShapeRef liveShapeRef3 = (i8 & 65536) != 0 ? sceneElement.liveShape : liveShapeRef;
        int i16 = (i8 & 131072) != 0 ? sceneElement.inTime : i5;
        int i17 = (i8 & 262144) != 0 ? sceneElement.outTime : i7;
        boolean z9 = (i8 & 524288) != 0 ? sceneElement.loop : z2;
        Keyable keyable9 = (i8 & 1048576) != 0 ? sceneElement.gain : keyable3;
        StyledText styledText3 = (i8 & 2097152) != 0 ? sceneElement.text : styledText;
        BlendingMode blendingMode3 = (i8 & 4194304) != 0 ? sceneElement.blendingMode : blendingMode;
        Scene scene3 = (i8 & 8388608) != 0 ? sceneElement.nestedScene : scene;
        UUID uuid3 = (i8 & 16777216) != 0 ? sceneElement.linkedSceneUUID : uuid;
        Map map5 = (i8 & 33554432) != 0 ? sceneElement.visualEffects : map;
        List list5 = (i8 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? sceneElement.visualEffectOrder : list;
        ElementTag elementTag3 = (i8 & 134217728) != 0 ? sceneElement.tag : elementTag;
        Drawing drawing3 = (i8 & 268435456) != 0 ? sceneElement.drawing : drawing;
        Map map6 = (i8 & 536870912) != 0 ? sceneElement.userElementParamValues : map2;
        KeyableEdgeDecoration keyableEdgeDecoration5 = (i8 & 1073741824) != 0 ? sceneElement.stroke : keyableEdgeDecoration;
        List list6 = (i8 & Integer.MIN_VALUE) != 0 ? sceneElement.borders : list2;
        KeyableEdgeDecoration keyableEdgeDecoration6 = (i9 & 1) != 0 ? sceneElement.dropShadow : keyableEdgeDecoration2;
        boolean z10 = (i9 & 2) != 0 ? sceneElement.hidden : z3;
        CameraProperties cameraProperties3 = (i9 & 4) != 0 ? sceneElement.cameraProperties : cameraProperties;
        Long l6 = (i9 & 8) != 0 ? sceneElement.parent : l2;
        boolean z11 = (i9 & 16) != 0 ? sceneElement.clippingMask : z4;
        String str8 = (i9 & 32) != 0 ? sceneElement.templatePPId : str2;
        if ((i9 & 64) != 0) {
            str5 = str8;
            str4 = sceneElement.presetId;
            scene2 = scene3;
            uuid2 = uuid3;
            map3 = map5;
            list3 = list5;
            elementTag2 = elementTag3;
            drawing2 = drawing3;
            map4 = map6;
            keyableEdgeDecoration3 = keyableEdgeDecoration5;
            list4 = list6;
            keyableEdgeDecoration4 = keyableEdgeDecoration6;
            z5 = z10;
            cameraProperties2 = cameraProperties3;
            l5 = l6;
            z6 = z11;
            uri4 = uri9;
            uri5 = uri7;
            uri6 = uri8;
            gradientFill2 = gradientFill3;
            fillType2 = fillType3;
            textureCropMode2 = textureCropMode3;
            keyableCompoundCubicBSpline2 = keyableCompoundCubicBSpline3;
            keyable5 = keyable8;
            liveShapeRef2 = liveShapeRef3;
            i10 = i16;
            i11 = i17;
            z7 = z9;
            keyable6 = keyable9;
            styledText2 = styledText3;
            blendingMode2 = blendingMode3;
            i12 = i14;
            i13 = i15;
            j3 = j4;
            engineState2 = engineState3;
            str6 = str7;
            keyableTransform2 = keyableTransform3;
            keyable4 = keyable7;
        } else {
            str4 = str3;
            str5 = str8;
            blendingMode2 = blendingMode3;
            scene2 = scene3;
            uuid2 = uuid3;
            map3 = map5;
            list3 = list5;
            elementTag2 = elementTag3;
            drawing2 = drawing3;
            map4 = map6;
            keyableEdgeDecoration3 = keyableEdgeDecoration5;
            list4 = list6;
            keyableEdgeDecoration4 = keyableEdgeDecoration6;
            z5 = z10;
            cameraProperties2 = cameraProperties3;
            l5 = l6;
            z6 = z11;
            uri4 = uri9;
            keyable4 = keyable7;
            uri5 = uri7;
            uri6 = uri8;
            gradientFill2 = gradientFill3;
            fillType2 = fillType3;
            textureCropMode2 = textureCropMode3;
            keyableCompoundCubicBSpline2 = keyableCompoundCubicBSpline3;
            keyable5 = keyable8;
            liveShapeRef2 = liveShapeRef3;
            i10 = i16;
            i11 = i17;
            z7 = z9;
            keyable6 = keyable9;
            styledText2 = styledText3;
            i12 = i14;
            i13 = i15;
            j3 = j4;
            engineState2 = engineState3;
            str6 = str7;
            keyableTransform2 = keyableTransform3;
        }
        return sceneElement.copy(sceneElementType3, i12, i13, j3, engineState2, str6, keyableTransform2, keyable4, uri5, uri6, gradientFill2, fillType2, textureCropMode2, keyableCompoundCubicBSpline2, uri4, keyable5, liveShapeRef2, i10, i11, z7, keyable6, styledText2, blendingMode2, scene2, uuid2, map3, list3, elementTag2, drawing2, map4, keyableEdgeDecoration3, list4, keyableEdgeDecoration4, z5, cameraProperties2, l5, z6, str5, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SceneElementType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Uri getFillVideo() {
        return this.fillVideo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final GradientFill getFillGradient() {
        return this.fillGradient;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final FillType getFillType() {
        return this.fillType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TextureCropMode getMediaFillMode() {
        return this.mediaFillMode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final KeyableCompoundCubicBSpline getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Uri getSrc() {
        return this.src;
    }

    public final Keyable<Float> component16() {
        return this.speedMap;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final LiveShapeRef getLiveShape() {
        return this.liveShape;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getInTime() {
        return this.inTime;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getOutTime() {
        return this.outTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getLoop() {
        return this.loop;
    }

    public final Keyable<Float> component21() {
        return this.gain;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final StyledText getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BlendingMode getBlendingMode() {
        return this.blendingMode;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Scene getNestedScene() {
        return this.nestedScene;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final UUID getLinkedSceneUUID() {
        return this.linkedSceneUUID;
    }

    public final Map<Long, KeyableVisualEffectRef> component26() {
        return this.visualEffects;
    }

    public final List<Long> component27() {
        return this.visualEffectOrder;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final ElementTag getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Drawing getDrawing() {
        return this.drawing;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    public final Map<String, KeyableUserParameterValue> component30() {
        return this.userElementParamValues;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final KeyableEdgeDecoration getStroke() {
        return this.stroke;
    }

    public final List<KeyableEdgeDecoration> component32() {
        return this.borders;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final KeyableEdgeDecoration getDropShadow() {
        return this.dropShadow;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Long getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getClippingMask() {
        return this.clippingMask;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getTemplatePPId() {
        return this.templatePPId;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getPresetId() {
        return this.presetId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EngineState getEngineState() {
        return this.engineState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final KeyableTransform getTransform() {
        return this.transform;
    }

    public final Keyable<SolidColor> component8() {
        return this.fillColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Uri getFillImage() {
        return this.fillImage;
    }

    public final SceneElement copy(SceneElementType type, int startTime, int endTime, long id, EngineState engineState, String label, KeyableTransform transform, Keyable<SolidColor> fillColor, Uri fillImage, Uri fillVideo, GradientFill fillGradient, FillType fillType, TextureCropMode mediaFillMode, KeyableCompoundCubicBSpline outline, Uri src, Keyable<Float> speedMap, LiveShapeRef liveShape, int inTime, int outTime, boolean loop, Keyable<Float> gain, StyledText text, BlendingMode blendingMode, Scene nestedScene, UUID linkedSceneUUID, Map<Long, KeyableVisualEffectRef> visualEffects, List<Long> visualEffectOrder, ElementTag tag, Drawing drawing, Map<String, KeyableUserParameterValue> userElementParamValues, KeyableEdgeDecoration stroke, List<KeyableEdgeDecoration> borders, KeyableEdgeDecoration dropShadow, boolean hidden, CameraProperties cameraProperties, Long parent, boolean clippingMask, String templatePPId, String presetId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(engineState, "engineState");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Intrinsics.checkNotNullParameter(fillGradient, "fillGradient");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        Intrinsics.checkNotNullParameter(mediaFillMode, "mediaFillMode");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(speedMap, "speedMap");
        Intrinsics.checkNotNullParameter(liveShape, "liveShape");
        Intrinsics.checkNotNullParameter(gain, "gain");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        Intrinsics.checkNotNullParameter(nestedScene, "nestedScene");
        Intrinsics.checkNotNullParameter(visualEffects, "visualEffects");
        Intrinsics.checkNotNullParameter(visualEffectOrder, "visualEffectOrder");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(drawing, "drawing");
        Intrinsics.checkNotNullParameter(userElementParamValues, "userElementParamValues");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Intrinsics.checkNotNullParameter(borders, "borders");
        Intrinsics.checkNotNullParameter(dropShadow, "dropShadow");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        return new SceneElement(type, startTime, endTime, id, engineState, label, transform, fillColor, fillImage, fillVideo, fillGradient, fillType, mediaFillMode, outline, src, speedMap, liveShape, inTime, outTime, loop, gain, text, blendingMode, nestedScene, linkedSceneUUID, visualEffects, visualEffectOrder, tag, drawing, userElementParamValues, stroke, borders, dropShadow, hidden, cameraProperties, parent, clippingMask, templatePPId, presetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneElement)) {
            return false;
        }
        SceneElement sceneElement = (SceneElement) other;
        return this.type == sceneElement.type && this.startTime == sceneElement.startTime && this.endTime == sceneElement.endTime && this.id == sceneElement.id && Intrinsics.areEqual(this.engineState, sceneElement.engineState) && Intrinsics.areEqual(this.label, sceneElement.label) && Intrinsics.areEqual(this.transform, sceneElement.transform) && Intrinsics.areEqual(this.fillColor, sceneElement.fillColor) && Intrinsics.areEqual(this.fillImage, sceneElement.fillImage) && Intrinsics.areEqual(this.fillVideo, sceneElement.fillVideo) && Intrinsics.areEqual(this.fillGradient, sceneElement.fillGradient) && this.fillType == sceneElement.fillType && this.mediaFillMode == sceneElement.mediaFillMode && Intrinsics.areEqual(this.outline, sceneElement.outline) && Intrinsics.areEqual(this.src, sceneElement.src) && Intrinsics.areEqual(this.speedMap, sceneElement.speedMap) && Intrinsics.areEqual(this.liveShape, sceneElement.liveShape) && this.inTime == sceneElement.inTime && this.outTime == sceneElement.outTime && this.loop == sceneElement.loop && Intrinsics.areEqual(this.gain, sceneElement.gain) && Intrinsics.areEqual(this.text, sceneElement.text) && this.blendingMode == sceneElement.blendingMode && Intrinsics.areEqual(this.nestedScene, sceneElement.nestedScene) && Intrinsics.areEqual(this.linkedSceneUUID, sceneElement.linkedSceneUUID) && Intrinsics.areEqual(this.visualEffects, sceneElement.visualEffects) && Intrinsics.areEqual(this.visualEffectOrder, sceneElement.visualEffectOrder) && this.tag == sceneElement.tag && Intrinsics.areEqual(this.drawing, sceneElement.drawing) && Intrinsics.areEqual(this.userElementParamValues, sceneElement.userElementParamValues) && Intrinsics.areEqual(this.stroke, sceneElement.stroke) && Intrinsics.areEqual(this.borders, sceneElement.borders) && Intrinsics.areEqual(this.dropShadow, sceneElement.dropShadow) && this.hidden == sceneElement.hidden && Intrinsics.areEqual(this.cameraProperties, sceneElement.cameraProperties) && Intrinsics.areEqual(this.parent, sceneElement.parent) && this.clippingMask == sceneElement.clippingMask && Intrinsics.areEqual(this.templatePPId, sceneElement.templatePPId) && Intrinsics.areEqual(this.presetId, sceneElement.presetId);
    }

    public String toString() {
        return "SceneElement(type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", id=" + this.id + ", engineState=" + this.engineState + FijIa.oWLUVdkaxp + this.label + ", transform=" + this.transform + ", fillColor=" + this.fillColor + ", fillImage=" + this.fillImage + ", fillVideo=" + this.fillVideo + ", fillGradient=" + this.fillGradient + ", fillType=" + this.fillType + ", mediaFillMode=" + this.mediaFillMode + ", outline=" + this.outline + ", src=" + this.src + ", speedMap=" + this.speedMap + ", liveShape=" + this.liveShape + ", inTime=" + this.inTime + ", outTime=" + this.outTime + ", loop=" + this.loop + ", gain=" + this.gain + ", text=" + this.text + ", blendingMode=" + this.blendingMode + ", nestedScene=" + this.nestedScene + ", linkedSceneUUID=" + this.linkedSceneUUID + ", visualEffects=" + this.visualEffects + ", visualEffectOrder=" + this.visualEffectOrder + ", tag=" + this.tag + ", drawing=" + this.drawing + ", userElementParamValues=" + this.userElementParamValues + ", stroke=" + this.stroke + ", borders=" + this.borders + ", dropShadow=" + this.dropShadow + ", hidden=" + this.hidden + ", cameraProperties=" + this.cameraProperties + ", parent=" + this.parent + ", clippingMask=" + this.clippingMask + ", templatePPId=" + this.templatePPId + ", presetId=" + this.presetId + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nestedSceneSpeedFactor_delegate$lambda$2(SceneElement sceneElement) {
        SceneElementType sceneElementType = sceneElement.type;
        if (sceneElementType != SceneElementType.Scene) {
            throw new IllegalStateException(("Speed factor cannot be accessed for elements which are not nested scenes! Element type:" + sceneElementType).toString());
        }
        if (!sceneElement.speedMap.getKeyed()) {
            return ((Number) ((Keyframe) CollectionsKt.first((List) sceneElement.speedMap.getKeyframes())).getValue()).floatValue();
        }
        throw new IllegalStateException(("Incompatible speedValue detected. Expecting a non-keyed keyable! Speed value: " + sceneElement.speedMap).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeMapping timeMapping_delegate$lambda$3(SceneElement sceneElement) {
        return TimeMappingKt.m17toTimeMappingUqo2Ic(sceneElement.speedMap, d2n.Ml.f63370t.rl(sceneElement.inTime), d2n.j.f63374t.t(RangesKt.coerceAtLeast(sceneElement.endTime - sceneElement.startTime, 1L)), (12 & 4) != 0 ? d2n.j.f63374t.t(TimeMappingKt.EASYING_SAMPLING_INTERVAL_MILLIS) : 0L, (12 & 8) != 0 ? TimeMappingKt.EASYING_SAMPLING_MAX_INTERVALS : 0);
    }

    public final BlendingMode getBlendingMode() {
        return this.blendingMode;
    }

    public final List<KeyableEdgeDecoration> getBorders() {
        return this.borders;
    }

    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    public final boolean getClippingMask() {
        return this.clippingMask;
    }

    public final Drawing getDrawing() {
        return this.drawing;
    }

    public final KeyableEdgeDecoration getDropShadow() {
        return this.dropShadow;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final EngineState getEngineState() {
        return this.engineState;
    }

    public final Keyable<SolidColor> getFillColor() {
        return this.fillColor;
    }

    public final GradientFill getFillGradient() {
        return this.fillGradient;
    }

    public final Uri getFillImage() {
        return this.fillImage;
    }

    public final FillType getFillType() {
        return this.fillType;
    }

    public final Uri getFillVideo() {
        return this.fillVideo;
    }

    public final Keyable<Float> getGain() {
        return this.gain;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final long getId() {
        return this.id;
    }

    public final int getInTime() {
        return this.inTime;
    }

    public final String getLabel() {
        return this.label;
    }

    public final UUID getLinkedSceneUUID() {
        return this.linkedSceneUUID;
    }

    public final LiveShapeRef getLiveShape() {
        return this.liveShape;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final TextureCropMode getMediaFillMode() {
        return this.mediaFillMode;
    }

    public final Scene getNestedScene() {
        return this.nestedScene;
    }

    public final float getNestedSceneSpeedFactor() {
        return ((Number) this.nestedSceneSpeedFactor.getValue()).floatValue();
    }

    public final int getOutTime() {
        return this.outTime;
    }

    public final KeyableCompoundCubicBSpline getOutline() {
        return this.outline;
    }

    public final Long getParent() {
        return this.parent;
    }

    public final String getPresetId() {
        return this.presetId;
    }

    public final Keyable<Float> getSpeedMap() {
        return this.speedMap;
    }

    public final Uri getSrc() {
        return this.src;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final KeyableEdgeDecoration getStroke() {
        return this.stroke;
    }

    public final ElementTag getTag() {
        return this.tag;
    }

    public final String getTemplatePPId() {
        return this.templatePPId;
    }

    public final StyledText getText() {
        return this.text;
    }

    public final TimeMapping getTimeMapping() {
        return (TimeMapping) this.timeMapping.getValue();
    }

    public final KeyableTransform getTransform() {
        return this.transform;
    }

    public final SceneElementType getType() {
        return this.type;
    }

    public final Map<String, KeyableUserParameterValue> getUserElementParamValues() {
        return this.userElementParamValues;
    }

    public final List<Long> getVisualEffectOrder() {
        return this.visualEffectOrder;
    }

    public final Map<Long, KeyableVisualEffectRef> getVisualEffects() {
        return this.visualEffects;
    }

    public int hashCode() {
        int i2 = this._hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((((((((this.type.hashCode() * 31) + this.startTime) * 31) + this.endTime) * 31) + Long.hashCode(this.id)) * 31) + this.label.hashCode()) * 31) + this.transform.hashCode()) * 31) + this.fillColor.hashCode()) * 31;
        Uri uri = this.fillImage;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Uri uri2 = this.fillVideo;
        int iHashCode3 = (((((((((((((((((((((((((((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31) + this.fillGradient.hashCode()) * 31) + this.fillType.hashCode()) * 31) + this.outline.hashCode()) * 31) + this.src.hashCode()) * 31) + this.speedMap.hashCode()) * 31) + this.liveShape.hashCode()) * 31) + this.inTime) * 31) + this.outTime) * 31) + Boolean.hashCode(this.loop)) * 31) + this.gain.hashCode()) * 31) + this.text.hashCode()) * 31) + this.blendingMode.hashCode()) * 31) + this.nestedScene.hashCode()) * 31;
        UUID uuid = this.linkedSceneUUID;
        int iHashCode4 = (((((((((((((((((((((((iHashCode3 + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.visualEffects.hashCode()) * 31) + this.visualEffectOrder.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.drawing.hashCode()) * 31) + this.userElementParamValues.hashCode()) * 31) + this.stroke.hashCode()) * 31) + this.borders.hashCode()) * 31) + this.dropShadow.hashCode()) * 31) + Boolean.hashCode(this.hidden)) * 31) + this.cameraProperties.hashCode()) * 31) + Boolean.hashCode(this.clippingMask)) * 31;
        Long l2 = this.parent;
        int iHashCode5 = iHashCode4 + (l2 != null ? l2.hashCode() : 0);
        this._hashCode = iHashCode5;
        return iHashCode5;
    }

    public final Keyable<Float> getTimeKeyframes() {
        return getTimeMapping().getItemKeyable();
    }

    public /* synthetic */ SceneElement(SceneElementType sceneElementType, int i2, int i3, long j2, EngineState engineState, String str, KeyableTransform keyableTransform, Keyable keyable, Uri uri, Uri uri2, GradientFill gradientFill, FillType fillType, TextureCropMode textureCropMode, KeyableCompoundCubicBSpline keyableCompoundCubicBSpline, Uri uri3, Keyable keyable2, LiveShapeRef liveShapeRef, int i5, int i7, boolean z2, Keyable keyable3, StyledText styledText, BlendingMode blendingMode, Scene scene, UUID uuid, Map map, List list, ElementTag elementTag, Drawing drawing, Map map2, KeyableEdgeDecoration keyableEdgeDecoration, List list2, KeyableEdgeDecoration keyableEdgeDecoration2, boolean z3, CameraProperties cameraProperties, Long l2, boolean z4, String str2, String str3, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(sceneElementType, i2, i3, j2, engineState, str, (i8 & 64) != 0 ? new KeyableTransform(KeyableKt.keyable(Vector3D.INSTANCE.getZERO()), null, null, null, 0.0f, 0.0f, null, null, false, 510, null) : keyableTransform, (i8 & 128) != 0 ? KeyableKt.keyable(new SolidColor(0.0f, 0.0f, 0.0f, 0.0f, 8, null)) : keyable, (i8 & 256) != 0 ? null : uri, (i8 & 512) != 0 ? null : uri2, (i8 & 1024) != 0 ? GradientFill.INSTANCE.getDEFAULT() : gradientFill, (i8 & 2048) != 0 ? FillType.NONE : fillType, (i8 & 4096) != 0 ? TextureCropMode.FILL : textureCropMode, (i8 & 8192) != 0 ? KeyableCompoundCubicBSpline.INSTANCE.getEMPTY() : keyableCompoundCubicBSpline, (i8 & 16384) != 0 ? Uri.EMPTY : uri3, (32768 & i8) != 0 ? KeyableKt.keyable(1.0f) : keyable2, (65536 & i8) != 0 ? LiveShapeRef.INSTANCE.getNONE() : liveShapeRef, i5, i7, z2, (1048576 & i8) != 0 ? KeyableKt.keyable(1.0f) : keyable3, (2097152 & i8) != 0 ? new StyledText(null, 0.0f, null, 0, null, 31, null) : styledText, (4194304 & i8) != 0 ? BlendingMode.NORMAL : blendingMode, (8388608 & i8) != 0 ? SceneKt.getEMPTY_SCENE() : scene, (16777216 & i8) != 0 ? null : uuid, (33554432 & i8) != 0 ? MapsKt.emptyMap() : map, (67108864 & i8) != 0 ? CollectionsKt.emptyList() : list, (134217728 & i8) != 0 ? ElementTag.NONE : elementTag, (268435456 & i8) != 0 ? Drawing.INSTANCE.getEMPTY() : drawing, (536870912 & i8) != 0 ? MapsKt.emptyMap() : map2, (1073741824 & i8) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : keyableEdgeDecoration, (i8 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list2, (i9 & 1) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_SHADOW() : keyableEdgeDecoration2, (i9 & 2) != 0 ? false : z3, (i9 & 4) != 0 ? CameraProperties.INSTANCE.getDEFAULT() : cameraProperties, (i9 & 8) != 0 ? null : l2, (i9 & 16) != 0 ? false : z4, (i9 & 32) != 0 ? null : str2, (i9 & 64) != 0 ? null : str3);
    }
}
