package com.alightcreative.app.motion.scene;

import android.net.Uri;
import com.alightcreative.app.motion.easing.EasingKt;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import d8q.jqQ.QTafcm;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f*\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001d\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010\"\u001a\u00020\u0000*\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'\u001a\u0015\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0015¢\u0006\u0004\b&\u0010)\u001a\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0015¢\u0006\u0004\b+\u0010)\u001a\r\u0010,\u001a\u00020%¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010/\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b/\u00100\u001a\u001d\u00101\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b1\u00100\u001a\u001d\u00103\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b3\u00100\u001a\u0011\u00104\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b4\u00105\u001a\u0011\u00107\u001a\u000206*\u00020\u0000¢\u0006\u0004\b7\u00108\u001a\u0011\u00109\u001a\u000206*\u00020\u0000¢\u0006\u0004\b9\u00108\u001a\u0011\u0010:\u001a\u000206*\u00020\u0000¢\u0006\u0004\b:\u00108\u001a\u0011\u0010;\u001a\u000206*\u00020\u0000¢\u0006\u0004\b;\u00108\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u0010*\u00020\u0000¢\u0006\u0004\b<\u0010=\u001a\u0019\u0010@\u001a\u00020?*\u00020\u00002\u0006\u0010>\u001a\u00020\u0005¢\u0006\u0004\b@\u0010A\u001a3\u0010E\u001a\u00020C*\u00020\u00002\u0006\u0010>\u001a\u00020\u00052\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020C0BH\u0086\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u000206*\u00020\u00002\u0006\u0010>\u001a\u00020\u0005¢\u0006\u0004\bG\u0010H\u001a7\u0010J\u001a\u00020C*\u00020\u00002\u001e\u0010D\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020C0IH\u0086\bø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a7\u0010M\u001a\u00020C*\u00020\u00002\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150L\u0012\u0004\u0012\u00020C0BH\u0086\bø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a-\u0010P\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002060BH\u0086\bø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a!\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\bR\u0010S\u001a=\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f*\u00020\u00002\u000e\b\u0002\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002060B¢\u0006\u0004\bR\u0010U\u001a\u0019\u0010Y\u001a\u00020X*\u00020\u00002\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bY\u0010Z\u001a\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[*\u00020\u00002\u0006\u0010W\u001a\u00020V¢\u0006\u0004\b]\u0010^\u001a\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_*\u00020\u0000¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020c0_*\u00020\u0000¢\u0006\u0004\bd\u0010b\u001a%\u0010f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020`0B¢\u0006\u0004\bf\u0010g\u001a\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020`0\u000f*\u00020\u0000¢\u0006\u0004\bh\u0010i\u001a\u0019\u0010k\u001a\u00020c*\u00020\u00002\u0006\u0010j\u001a\u00020c¢\u0006\u0004\bk\u0010l\u001a\u001b\u0010n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010m\u001a\u00020\u0010H\u0002¢\u0006\u0004\bn\u0010o\"\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0014\u0010t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\bt\u0010u\"\u0014\u0010v\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010u\"\u0014\u0010w\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\bw\u0010u\" \u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020c0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z\"\u0017\u0010{\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0017\u0010\u007f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001\"\u001b\u0010\u0081\u0001\u001a\u00020%8\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010-\"\u0014\u0010\u0086\u0001\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0018\u0010\u0089\u0001\u001a\u00020\u0005*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0018\u0010\u008a\u0001\u001a\u000206*\u00020\u00028F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u001e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u000f*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010i\"\u0019\u0010\u0092\u0001\u001a\u00030\u008f\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0018\u0010\u0095\u0001\u001a\u00020c*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0018\u0010\u0098\u0001\u001a\u00020\u0010*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0018\u0010\u0099\u0001\u001a\u000206*\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u008b\u0001\"\u0017\u0010\u009b\u0001\u001a\u000206*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u00108\"\u001e\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020c0[*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0017\u0010 \u0001\u001a\u000206*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u00108\"\u0017\u0010¢\u0001\u001a\u000206*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¡\u0001\u00108\"\u001e\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100[*\u00020%8F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001\"\u001d\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010i\"\u0017\u0010©\u0001\u001a\u000206*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b¨\u0001\u00108\"\u0017\u0010«\u0001\u001a\u000206*\u00020\u00008F¢\u0006\u0007\u001a\u0005\bª\u0001\u00108\"\u0018\u0010\u00ad\u0001\u001a\u00020\u0005*\u00020\u00008F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u0088\u0001\"\u0018\u0010¯\u0001\u001a\u000206*\u00020\u00028F¢\u0006\b\u001a\u0006\b®\u0001\u0010\u008b\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006°\u0001"}, d2 = {"Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "SceneHolder", "(Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/SceneHolder;", "", "width", "height", "emptyScene", "(II)Lcom/alightcreative/app/motion/scene/Scene;", "Ljava/io/File;", "projectFile", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "getProjectInfo", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/io/File;)Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "", "", "nestedSceneIds", "newScene", "copyUpdatingNestedScene", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/util/List;Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/Scene;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "toUpdate", "element", "copyReplacingFirst", "(Ljava/util/List;JLcom/alightcreative/app/motion/scene/SceneElement;)Ljava/util/List;", "index", "getEditingScene", "(Lcom/alightcreative/app/motion/scene/SceneHolder;I)Lcom/alightcreative/app/motion/scene/Scene;", "prepElementForAdd", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;)Lcom/alightcreative/app/motion/scene/SceneElement;", "copyUpdatingElement", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;)Lcom/alightcreative/app/motion/scene/Scene;", "elements", "copyUpdatingElements", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/util/List;)Lcom/alightcreative/app/motion/scene/Scene;", "selectedElementId", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "singleElementSelection", "(J)Lcom/alightcreative/app/motion/scene/SceneSelection;", "selectedElement", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Lcom/alightcreative/app/motion/scene/SceneSelection;", "hintElement", "selectionHint", "overlaySelectionHint", "()Lcom/alightcreative/app/motion/scene/SceneSelection;", "id", "elementById", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/lang/Long;)Lcom/alightcreative/app/motion/scene/SceneElement;", "nestedElementById", "trackId", "nestedElementByTrackId", "uniquifyIds", "(Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/Scene;", "", "hasAnyAudio", "(Lcom/alightcreative/app/motion/scene/Scene;)Z", "hasAnyVideo", "hasUniqueIds", "hasCameraObject", "getMainCameraId", "(Lcom/alightcreative/app/motion/scene/Scene;)Ljava/lang/Long;", "frame", "Lcom/alightcreative/app/motion/scene/FrameStats;", "statsForFrame", "(Lcom/alightcreative/app/motion/scene/Scene;I)Lcom/alightcreative/app/motion/scene/FrameStats;", "Lkotlin/Function1;", "", FileUploadManager.f61572j, "forEachElementWithActiveVideoTrackAtFrame", "(Lcom/alightcreative/app/motion/scene/Scene;ILkotlin/jvm/functions/Function1;)V", "checkDrawingAtTime", "(Lcom/alightcreative/app/motion/scene/Scene;I)Z", "Lkotlin/Function2;", "forEachElementRecursive", "(Lcom/alightcreative/app/motion/scene/Scene;Lkotlin/jvm/functions/Function2;)V", "LoA/j;", "forEachElementRecursiveWithLens", "(Lcom/alightcreative/app/motion/scene/Scene;Lkotlin/jvm/functions/Function1;)V", "predicate", "findElementRecursive", "(Lcom/alightcreative/app/motion/scene/Scene;Lkotlin/jvm/functions/Function1;)Lcom/alightcreative/app/motion/scene/SceneElement;", "pathToElement", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;)Ljava/util/List;", "parentElements", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "LHI0/Q;", "contentResolver", "LICC/n;", "makeMediaComp", "(Lcom/alightcreative/app/motion/scene/Scene;LHI0/Q;)LICC/n;", "", "Lcom/alightcreative/app/motion/scene/ExportProblem;", "checkCanExport", "(Lcom/alightcreative/app/motion/scene/Scene;LHI0/Q;)Ljava/util/Set;", "Lkotlin/sequences/Sequence;", "Landroid/net/Uri;", "externalMediaSequence", "(Lcom/alightcreative/app/motion/scene/Scene;)Lkotlin/sequences/Sequence;", "", "effectIdsSequence", "uriMapper", "remapMediaUris", "(Lcom/alightcreative/app/motion/scene/Scene;Lkotlin/jvm/functions/Function1;)Lcom/alightcreative/app/motion/scene/Scene;", "audioUris", "(Lcom/alightcreative/app/motion/scene/Scene;)Ljava/util/List;", "baseLabel", "makeNumberedLabel", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/lang/String;)Ljava/lang/String;", "editedElementId", "withUpdatedTrimmingFor", "(Lcom/alightcreative/app/motion/scene/Scene;J)Lcom/alightcreative/app/motion/scene/Scene;", "STANDARD_FRAME_RATES", "Ljava/util/List;", "getSTANDARD_FRAME_RATES", "()Ljava/util/List;", "PROJECT_FORMAT_VERSION", "I", "PRESET_FORMAT_VERSION", "TIME_REMAPPING_VERSION", "Ljava/util/WeakHashMap;", "sceneHashes", "Ljava/util/WeakHashMap;", "EMPTY_SCENE", "Lcom/alightcreative/app/motion/scene/Scene;", "getEMPTY_SCENE", "()Lcom/alightcreative/app/motion/scene/Scene;", "lastUsedElementId", "J", "EMPTY_SCENE_SELECTION", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "getEMPTY_SCENE_SELECTION", "getMAX_SUPPORTED_PROJECT_FORMAT_VERSION", "()I", "MAX_SUPPORTED_PROJECT_FORMAT_VERSION", "getThumbTime", "(Lcom/alightcreative/app/motion/scene/Scene;)I", "thumbTime", "isNestedSceneValid", "(Lcom/alightcreative/app/motion/scene/SceneHolder;)Z", "Lcom/alightcreative/app/motion/scene/UserElementProperty;", "getSettableUserParams", "settableUserParams", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getSize", "(Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/Vector2D;", "size", "getSha1", "(Lcom/alightcreative/app/motion/scene/Scene;)Ljava/lang/String;", "sha1", "getNextAvailableId", "(Lcom/alightcreative/app/motion/scene/Scene;)J", "nextAvailableId", "isEditingNestedScene", "getHasTrialEffectItem", "hasTrialEffectItem", "getPremiumEffectIds", "(Lcom/alightcreative/app/motion/scene/Scene;)Ljava/util/Set;", "premiumEffectIds", "getHasTrialEasingItem", "hasTrialEasingItem", "getHasLayerParenting", "hasLayerParenting", "getMultiSelectionElements", "(Lcom/alightcreative/app/motion/scene/SceneSelection;)Ljava/util/Set;", "multiSelectionElements", "getRecursiveElements", "recursiveElements", "getHasExternalMedia", "hasExternalMedia", "getHasExternalAudio", "hasExternalAudio", "getDuration", "duration", "getHasActiveReTiming", "hasActiveReTiming", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 ListUtil.kt\ncom/alightcreative/ext/ListUtilKt\n+ 7 SceneElement.kt\ncom/alightcreative/app/motion/scene/SceneElementKt\n+ 8 Lens.kt\ncom/alightcreative/lens/LensKt\n*L\n1#1,1120:1\n845#1,2:1200\n847#1,5:1203\n854#1,10:1209\n845#1,2:1219\n847#1,5:1222\n854#1,10:1228\n797#1,2:1261\n799#1:1264\n800#1,4:1270\n806#1,5:1275\n811#1,4:1282\n816#1,2:1287\n797#1,2:1289\n799#1,5:1292\n806#1,12:1298\n845#1,2:1310\n847#1,5:1313\n854#1,10:1319\n797#1,2:1362\n799#1,5:1365\n806#1,12:1371\n797#1,2:1385\n799#1,5:1388\n806#1,12:1394\n797#1,2:1412\n799#1,5:1415\n806#1,12:1421\n797#1,2:1433\n799#1,5:1436\n806#1,12:1442\n820#1,2:1454\n822#1:1458\n823#1,5:1469\n830#1,13:1475\n797#1,2:1488\n799#1,5:1491\n806#1,12:1497\n797#1,2:1531\n799#1:1534\n800#1,4:1538\n806#1,5:1543\n811#1,4:1551\n816#1,2:1556\n1437#2,14:1121\n1#3:1135\n1#3:1149\n1#3:1267\n1368#4:1136\n1454#4,2:1137\n1611#4,9:1139\n1863#4:1148\n1864#4:1150\n1620#4:1151\n1456#4,3:1152\n360#4,7:1167\n1797#4,3:1174\n2632#4,3:1177\n1863#4:1180\n1863#4,2:1181\n1864#4:1183\n1863#4:1184\n1863#4,2:1185\n1864#4:1187\n1863#4:1188\n1368#4:1189\n1454#4,5:1190\n1863#4,2:1195\n1864#4:1197\n1863#4,2:1198\n1863#4:1202\n1864#4:1208\n1863#4:1221\n1864#4:1227\n1557#4:1238\n1628#4,3:1239\n1755#4,3:1242\n1755#4,3:1245\n1557#4:1248\n1628#4,3:1249\n1734#4,3:1252\n1755#4,3:1255\n774#4:1258\n865#4,2:1259\n1863#4:1263\n1863#4:1266\n1864#4:1268\n1864#4:1274\n1863#4,2:1280\n1864#4:1286\n1863#4:1291\n1864#4:1297\n1863#4:1312\n1864#4:1318\n1863#4,2:1329\n1863#4,2:1331\n1872#4,2:1333\n1874#4:1345\n1872#4,2:1346\n1874#4:1357\n1863#4,2:1358\n1863#4,2:1360\n1863#4:1364\n1864#4:1370\n1863#4,2:1383\n1863#4:1387\n1864#4:1393\n1053#4:1406\n1863#4,2:1407\n1053#4:1409\n1863#4,2:1410\n1863#4:1414\n1864#4:1420\n1863#4:1435\n1864#4:1441\n1872#4,2:1456\n1874#4:1474\n1863#4:1490\n1864#4:1496\n230#4:1509\n2632#4,3:1510\n231#4:1513\n1971#4,14:1514\n1797#4,3:1528\n1863#4:1533\n1797#4,3:1535\n1864#4:1542\n1797#4,3:1548\n1864#4:1555\n381#5,7:1155\n109#6,5:1162\n293#7:1265\n294#7:1269\n150#8:1335\n124#8,9:1336\n124#8,9:1348\n150#8:1459\n124#8,9:1460\n*S KotlinDebug\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n*L\n651#1:1200,2\n651#1:1203,5\n651#1:1209,10\n652#1:1219,2\n652#1:1222,5\n652#1:1228,10\n750#1:1261,2\n750#1:1264\n750#1:1270,4\n750#1:1275,5\n750#1:1282,4\n750#1:1287,2\n773#1:1289,2\n773#1:1292,5\n773#1:1298,12\n788#1:1310,2\n788#1:1313,5\n788#1:1319,10\n867#1:1362,2\n867#1:1365,5\n867#1:1371,12\n955#1:1385,2\n955#1:1388,5\n955#1:1394,12\n1024#1:1412,2\n1024#1:1415,5\n1024#1:1421,12\n1037#1:1433,2\n1037#1:1436,5\n1037#1:1442,12\n1069#1:1454,2\n1069#1:1458\n1069#1:1469,5\n1069#1:1475,13\n1086#1:1488,2\n1086#1:1491,5\n1086#1:1497,12\n893#1:1531,2\n893#1:1534\n893#1:1538,4\n893#1:1543,5\n893#1:1551,4\n893#1:1556,2\n94#1:1121,14\n190#1:1149\n762#1:1267\n188#1:1136\n188#1:1137,2\n190#1:1139,9\n190#1:1148\n190#1:1150\n190#1:1151\n188#1:1152,3\n289#1:1167,7\n298#1:1174,3\n519#1:1177,3\n556#1:1180\n557#1:1181,2\n556#1:1183\n566#1:1184\n567#1:1185,2\n566#1:1187\n575#1:1188\n576#1:1189\n576#1:1190,5\n576#1:1195,2\n575#1:1197\n585#1:1198,2\n651#1:1202\n651#1:1208\n652#1:1221\n652#1:1227\n684#1:1238\n684#1:1239,3\n711#1:1242,3\n712#1:1245,3\n714#1:1248\n714#1:1249,3\n714#1:1252,3\n732#1:1255,3\n737#1:1258\n737#1:1259,2\n750#1:1263\n762#1:1266\n762#1:1268\n750#1:1274\n762#1:1280,2\n750#1:1286\n773#1:1291\n773#1:1297\n788#1:1312\n788#1:1318\n798#1:1329,2\n809#1:1331,2\n821#1:1333,2\n821#1:1345\n833#1:1346,2\n833#1:1357\n846#1:1358,2\n855#1:1360,2\n867#1:1364\n867#1:1370\n873#1:1383,2\n955#1:1387\n955#1:1393\n989#1:1406\n989#1:1407,2\n996#1:1409\n996#1:1410,2\n1024#1:1414\n1024#1:1420\n1037#1:1435\n1037#1:1441\n1069#1:1456,2\n1069#1:1474\n1086#1:1490\n1086#1:1496\n1095#1:1509\n1097#1:1510,3\n1095#1:1513\n1100#1:1514,14\n922#1:1528,3\n893#1:1533\n905#1:1535,3\n893#1:1542\n905#1:1548,3\n893#1:1555\n214#1:1155,7\n262#1:1162,5\n762#1:1265\n762#1:1269\n822#1:1335\n822#1:1336,9\n834#1:1348,9\n1069#1:1459\n1069#1:1460,9\n*E\n"})
public final class SceneKt {
    public static final int PRESET_FORMAT_VERSION = 107;
    public static final int PROJECT_FORMAT_VERSION = 106;
    public static final int TIME_REMAPPING_VERSION = 108;
    private static long lastUsedElementId;
    private static final List<Integer> STANDARD_FRAME_RATES = CollectionsKt.listOf((Object[]) new Integer[]{12, 15, 18, 20, 24, 25, 30, 48, 50, 60});
    private static final WeakHashMap<Scene, String> sceneHashes = new WeakHashMap<>();
    private static final Scene EMPTY_SCENE = emptyScene$default(0, 0, 3, null);
    private static final SceneSelection EMPTY_SCENE_SELECTION = new SceneSelection(SetsKt.emptySet(), null, null, null, null, null, null, null, false, null, null, null, 4092, null);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneElementType.values().length];
            try {
                iArr[SceneElementType.Scene.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.scene.SceneKt$effectIdsSequence$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.alightcreative.app.motion.scene.SceneKt$effectIdsSequence$1", f = "Scene.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {1062, 1062}, m = "invokeSuspend", n = {"$this$sequence", "todo$iv", "it$iv", "$this$sequence", "todo$iv", "entry$iv", "parentElements$iv", "it$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$2", "L$3", "L$6"})
    @SourceDebugExtension({"SMAP\nScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt$effectIdsSequence$1\n+ 2 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1120:1\n797#2,2:1121\n799#2:1124\n800#2,4:1127\n806#2,5:1132\n811#2,4:1139\n816#2,2:1144\n1863#3:1123\n1863#3,2:1125\n1864#3:1131\n1863#3,2:1137\n1864#3:1143\n*S KotlinDebug\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt$effectIdsSequence$1\n*L\n1060#1:1121,2\n1060#1:1124\n1060#1:1127,4\n1060#1:1132,5\n1060#1:1139,4\n1060#1:1144,2\n1060#1:1123\n1062#1:1125,2\n1060#1:1131\n1062#1:1137,2\n1060#1:1143\n*E\n"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Scene $this_effectIdsSequence;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Scene scene, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_effectIdsSequence = scene;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_effectIdsSequence, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007c -> B:22:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007e -> B:16:0x0092). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00da -> B:42:0x0165). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00dc -> B:28:0x00f0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0104 -> B:39:0x014b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0106 -> B:33:0x011d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.app.motion.scene.SceneKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.scene.SceneKt$externalMediaSequence$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/net/Uri;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.alightcreative.app.motion.scene.SceneKt$externalMediaSequence$1", f = "Scene.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {1048, 1051, 1054, 1048, 1051, 1054}, m = "invokeSuspend", n = {"$this$sequence", "todo$iv", "it$iv", "el", "$this$sequence", "todo$iv", "it$iv", "el", "$this$sequence", "todo$iv", "it$iv", "$this$sequence", "todo$iv", "entry$iv", "parentElements$iv", "el", "it$iv", "$this$sequence", "todo$iv", "entry$iv", "parentElements$iv", "el", "it$iv", "$this$sequence", "todo$iv", "entry$iv", "parentElements$iv", "it$iv"}, s = {"L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$5"})
    @SourceDebugExtension({"SMAP\nScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt$externalMediaSequence$1\n+ 2 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1120:1\n797#2,2:1121\n799#2,5:1124\n806#2,12:1130\n1863#3:1123\n1864#3:1129\n*S KotlinDebug\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt$externalMediaSequence$1\n*L\n1046#1:1121,2\n1046#1:1124,5\n1046#1:1130,12\n1046#1:1123\n1046#1:1129\n*E\n"})
    static final class C17461 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Uri>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Scene $this_externalMediaSequence;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C17461(Scene scene, Continuation<? super C17461> continuation) {
            super(2, continuation);
            this.$this_externalMediaSequence = scene;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17461 c17461 = new C17461(this.$this_externalMediaSequence, continuation);
            c17461.L$0 = obj;
            return c17461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Uri> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C17461) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Path cross not found for [B:34:0x015b, B:31:0x0142], limit reached: 81 */
        /* JADX WARN: Path cross not found for [B:70:0x025a, B:67:0x023e], limit reached: 81 */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02b4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0161 -> B:43:0x0190). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x016d -> B:43:0x0190). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0188 -> B:42:0x018c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01b1 -> B:83:0x02b2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b3 -> B:49:0x01cc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0260 -> B:79:0x0294). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x026c -> B:79:0x0294). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x028a -> B:78:0x028f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 714
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.app.motion.scene.SceneKt.C17461.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean isNestedSceneValid(SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(sceneHolder, "<this>");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float makeMediaComp$lambda$58$lambda$56$lambda$54$lambda$53(SceneElement sceneElement, List list, long j2) {
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElement.getGain(), SceneElementKt.fractionalTime(sceneElement, (int) (j2 / 1000000.0d)))).floatValue();
        Iterator it = list.iterator();
        float fFloatValue2 = 1.0f;
        while (it.hasNext()) {
            SceneElement sceneElement2 = (SceneElement) it.next();
            fFloatValue2 = ((Number) KeyableKt.valueAtTime(sceneElement2.getGain(), SceneElementKt.fractionalTime(sceneElement2, (int) (j2 / 1000000.0f)))).floatValue();
        }
        return fFloatValue * fFloatValue2;
    }

    public static final List<SceneElement> pathToElement(Scene scene, final SceneElement element) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        return pathToElement$default(scene, null, new Function1() { // from class: com.alightcreative.app.motion.scene.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SceneKt.pathToElement$lambda$46(element, (SceneElement) obj));
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pathToElement$lambda$46(SceneElement sceneElement, SceneElement sceneElement2) {
        Intrinsics.checkNotNullParameter(sceneElement2, LHbnkhI.pzlILCrUJ);
        return sceneElement2 == sceneElement;
    }

    public static final SceneSelection singleElementSelection(long j2) {
        return new SceneSelection(SetsKt.setOf(Long.valueOf(j2)), Long.valueOf(j2), null, null, null, null, null, null, false, null, null, null, 4092, null);
    }

    public static final SceneHolder SceneHolder(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        return new SceneHolderImpl(scene);
    }

    public static /* synthetic */ SceneHolder SceneHolder$default(Scene scene, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scene = EMPTY_SCENE;
        }
        return SceneHolder(scene);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_thumbTime_$lambda$0(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType().isRenderable();
    }

    public static final List<Uri> audioUris(Scene scene) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            CollectionsKt.emptyList();
            if (sceneElement.getType() == SceneElementType.Audio && !Intrinsics.areEqual(sceneElement.getSrc(), Uri.EMPTY)) {
                arrayList.add(sceneElement.getSrc());
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList2.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList2);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    if (sceneElement2.getType() == SceneElementType.Audio && !Intrinsics.areEqual(sceneElement2.getSrc(), Uri.EMPTY)) {
                        arrayList.add(sceneElement2.getSrc());
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList2.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        return arrayList;
    }

    public static final Set<ExportProblem> checkCanExport(Scene scene, HI0.Q contentResolver) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        XoT.C.Uo(scene, new Function0() { // from class: com.alightcreative.app.motion.scene.QaP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneKt.checkCanExport$lambda$59();
            }
        });
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = scene.getElements().iterator();
        int i5 = 0;
        while (true) {
            int i7 = -1;
            int i8 = 1;
            if (it.hasNext()) {
                SceneElement sceneElement = (SceneElement) it.next();
                CollectionsKt.emptyList();
                if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillVideo() != null) {
                    tu.SPz sPzTe = tu.r.te(contentResolver, sceneElement.getFillVideo(), false, 4, null);
                    if (sPzTe instanceof tu.aC) {
                        tu.aC aCVar = (tu.aC) sPzTe;
                        int iMax = Math.max((Math.min(aCVar.qie(), aCVar.J2()) * 9) / 16, Math.min(aCVar.qie(), aCVar.J2()));
                        if (iMax > com.alightcreative.app.motion.persist.j.INSTANCE.getMaxRes()) {
                            linkedHashSet.add(ExportProblem.ContentResTooHigh);
                        } else {
                            arrayList.add(TuplesKt.to(Integer.valueOf(sceneElement.getStartTime()), Integer.valueOf(iMax)));
                            arrayList.add(TuplesKt.to(Integer.valueOf(sceneElement.getEndTime()), Integer.valueOf(-iMax)));
                            arrayList2.add(TuplesKt.to(Integer.valueOf(sceneElement.getStartTime()), 1));
                            arrayList2.add(TuplesKt.to(Integer.valueOf(sceneElement.getEndTime()), -1));
                        }
                    } else {
                        if (!(sPzTe instanceof tu.C)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        linkedHashSet.add(ExportProblem.MissingOrErrorContent);
                    }
                    i5 = 1;
                }
                if (sceneElement.getType().getHasNestedScene()) {
                    arrayList3.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
                }
            } else {
                while (true) {
                    Pair pair = (Pair) XoT.qz.n(arrayList3);
                    if (pair != null) {
                        List list = (List) pair.component1();
                        for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                            if (sceneElement2.getType().getHasFillVideo()) {
                                i2 = i7;
                                i3 = i8;
                                if (sceneElement2.getFillType() == FillType.MEDIA && sceneElement2.getFillVideo() != null) {
                                    tu.SPz sPzTe2 = tu.r.te(contentResolver, sceneElement2.getFillVideo(), false, 4, null);
                                    if (sPzTe2 instanceof tu.aC) {
                                        tu.aC aCVar2 = (tu.aC) sPzTe2;
                                        int iMax2 = Math.max((Math.min(aCVar2.qie(), aCVar2.J2()) * 9) / 16, Math.min(aCVar2.qie(), aCVar2.J2()));
                                        if (iMax2 > com.alightcreative.app.motion.persist.j.INSTANCE.getMaxRes()) {
                                            linkedHashSet.add(ExportProblem.ContentResTooHigh);
                                        } else {
                                            arrayList.add(TuplesKt.to(Integer.valueOf(sceneElement2.getStartTime()), Integer.valueOf(iMax2)));
                                            arrayList.add(TuplesKt.to(Integer.valueOf(sceneElement2.getEndTime()), Integer.valueOf(-iMax2)));
                                            arrayList2.add(TuplesKt.to(Integer.valueOf(sceneElement2.getStartTime()), Integer.valueOf(i3)));
                                            arrayList2.add(TuplesKt.to(Integer.valueOf(sceneElement2.getEndTime()), Integer.valueOf(i2)));
                                        }
                                    } else {
                                        if (!(sPzTe2 instanceof tu.C)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        linkedHashSet.add(ExportProblem.MissingOrErrorContent);
                                    }
                                    i5 = i3;
                                }
                            } else {
                                i2 = i7;
                                i3 = i8;
                            }
                            if (sceneElement2.getType().getHasNestedScene()) {
                                arrayList3.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                            }
                            i7 = i2;
                            i8 = i3;
                        }
                    }
                    int i9 = i7;
                    int i10 = i8;
                    if (pair == null) {
                        XoT.C.Uo(scene, new Function0() { // from class: com.alightcreative.app.motion.scene.RGN
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SceneKt.checkCanExport$lambda$61();
                            }
                        });
                        int iMax3 = Math.max((Math.min(scene.getWidth(), scene.getHeight()) * 9) / 16, Math.min(scene.getWidth(), scene.getHeight()));
                        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                        if (iMax3 > (i5 != 0 ? jVar.getMaxResWithVideo() : jVar.getMaxRes())) {
                            linkedHashSet.add(i5 != 0 ? ExportProblem.SceneResTooHighWithVideo : ExportProblem.SceneResTooHigh);
                        }
                        Iterator it2 = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.alightcreative.app.motion.scene.SceneKt$checkCanExport$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t3, T t4) {
                                return ComparisonsKt.compareValues((Integer) ((Pair) t3).getFirst(), (Integer) ((Pair) t4).getFirst());
                            }
                        }).iterator();
                        int iIntValue = 0;
                        int iMax4 = 0;
                        while (it2.hasNext()) {
                            iIntValue += ((Number) ((Pair) it2.next()).getSecond()).intValue();
                            iMax4 = Math.max(iMax4, iIntValue);
                        }
                        Iterator it3 = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.alightcreative.app.motion.scene.SceneKt$checkCanExport$$inlined$sortedBy$2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t3, T t4) {
                                return ComparisonsKt.compareValues((Integer) ((Pair) t3).getFirst(), (Integer) ((Pair) t4).getFirst());
                            }
                        }).iterator();
                        int iIntValue2 = 0;
                        int iMax5 = 0;
                        while (it3.hasNext()) {
                            iIntValue2 += ((Number) ((Pair) it3.next()).getSecond()).intValue();
                            iMax5 = Math.max(iMax5, iIntValue2);
                        }
                        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(jVar2.getMaxLayers720() * 720), Integer.valueOf(jVar2.getMaxLayers1080() * 1080), Integer.valueOf(jVar2.getMaxLayers1440() * 1440), Integer.valueOf(jVar2.getMaxLayers2160() * 2160)}));
                        int iIntValue3 = num != null ? num.intValue() : 0;
                        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(jVar2.getMaxLayers720()), Integer.valueOf(jVar2.getMaxLayers1080()), Integer.valueOf(jVar2.getMaxLayers1440()), Integer.valueOf(jVar2.getMaxLayers2160())}));
                        int iIntValue4 = num2 != null ? num2.intValue() : 0;
                        if (iMax4 <= iIntValue3 && iMax5 <= iIntValue4) {
                            return linkedHashSet;
                        }
                        linkedHashSet.add(ExportProblem.ContentTooHeavy);
                        return linkedHashSet;
                    }
                    i7 = i9;
                    i8 = i10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkCanExport$lambda$59() {
        return "PrepExport: checkCanExport forEachElementRecursive IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkCanExport$lambda$61() {
        return "PrepExport: checkCanExport forEachElementRecursive OUT";
    }

    public static final boolean checkDrawingAtTime(Scene scene, int i2) {
        SceneElement sceneElement;
        List<SceneElement> elements;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        int framesPerHundredSeconds = (int) ((((long) i2) * ((long) 100000)) / ((long) scene.getFramesPerHundredSeconds()));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                loop1: while (true) {
                    Scene scene2 = (Scene) XoT.qz.n(arrayList);
                    if (scene2 != null && (elements = scene2.getElements()) != null) {
                        for (SceneElement sceneElement2 : elements) {
                            ElementTiming elementTimingAbsoluteTimingInScene = SceneElementKt.absoluteTimingInScene(sceneElement2, scene);
                            int startTime = elementTimingAbsoluteTimingInScene.getStartTime();
                            int endTime = elementTimingAbsoluteTimingInScene.getEndTime();
                            if (startTime <= framesPerHundredSeconds && framesPerHundredSeconds < endTime && sceneElement2.getType() == SceneElementType.Drawing) {
                                sceneElement = sceneElement2;
                                break loop1;
                            }
                            if (sceneElement2.getType().getHasNestedScene()) {
                                arrayList.add(sceneElement2.getNestedScene());
                            }
                        }
                    }
                    if (scene2 == null) {
                        sceneElement = null;
                        break;
                    }
                }
            } else {
                sceneElement = (SceneElement) it.next();
                ElementTiming elementTimingAbsoluteTimingInScene2 = SceneElementKt.absoluteTimingInScene(sceneElement, scene);
                int startTime2 = elementTimingAbsoluteTimingInScene2.getStartTime();
                int endTime2 = elementTimingAbsoluteTimingInScene2.getEndTime();
                if (startTime2 <= framesPerHundredSeconds && framesPerHundredSeconds < endTime2 && sceneElement.getType() == SceneElementType.Drawing) {
                    break;
                }
                if (sceneElement.getType().getHasNestedScene()) {
                    arrayList.add(sceneElement.getNestedScene());
                }
            }
        }
        return sceneElement != null;
    }

    public static final List<SceneElement> copyReplacingFirst(List<SceneElement> list, long j2, SceneElement element) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        Iterator<SceneElement> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == j2) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return list;
        }
        List<SceneElement> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i2, element);
        return mutableList;
    }

    public static final Scene copyUpdatingElement(Scene scene, SceneElement element) {
        Object next;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SceneElement) next).getId() == element.getId()) {
                break;
            }
        }
        SceneElement sceneElement = (SceneElement) next;
        return sceneElement != null ? Scene.copy$default(scene, null, 0, 0, 0, 0, 0, HI0.rv6.nr(scene.getElements(), sceneElement, element), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null) : scene;
    }

    public static final Scene copyUpdatingElements(Scene scene, List<SceneElement> elements) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<SceneElement> it = elements.iterator();
        while (it.hasNext()) {
            scene = copyUpdatingElement(scene, it.next());
        }
        return scene;
    }

    public static final Scene copyUpdatingNestedScene(Scene scene, List<Long> nestedSceneIds, Scene newScene) {
        SceneElement sceneElementCopy$default;
        SceneElement sceneElement;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(nestedSceneIds, "nestedSceneIds");
        Intrinsics.checkNotNullParameter(newScene, "newScene");
        if (nestedSceneIds.isEmpty()) {
            return newScene;
        }
        SceneElement sceneElementElementById = elementById(scene, (Long) CollectionsKt.first((List) nestedSceneIds));
        if (sceneElementElementById == null) {
            throw new IllegalStateException();
        }
        if (sceneElementElementById.getNestedScene().getReTimingMethod() != ReTimingMethod.OFF) {
            sceneElementCopy$default = SceneElement.copy$default(sceneElementElementById, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, copyUpdatingNestedScene(sceneElementElementById.getNestedScene(), CollectionsKt.drop(nestedSceneIds, 1), newScene), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
        } else {
            if (nestedSceneIds.size() == 1) {
                int endTime = newScene.getElements().isEmpty() ? sceneElementElementById.getEndTime() - sceneElementElementById.getStartTime() : newScene.getTotalTime();
                sceneElement = sceneElementElementById;
                sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, endTime, false, null, null, null, newScene, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8781825, 127, null);
                SceneElement sceneElementTrimEnd = TrimmingKt.trimEnd(sceneElementCopy$default, endTime, true);
                if (sceneElementTrimEnd != null) {
                    sceneElementCopy$default = sceneElementTrimEnd;
                }
                return Scene.copy$default(scene, null, 0, 0, 0, 0, 0, copyReplacingFirst(scene.getElements(), sceneElement.getId(), sceneElementCopy$default), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null);
            }
            Scene sceneCopyUpdatingNestedScene = copyUpdatingNestedScene(sceneElementElementById.getNestedScene(), CollectionsKt.drop(nestedSceneIds, 1), newScene);
            int totalTime = sceneCopyUpdatingNestedScene.getTotalTime();
            sceneElementElementById = sceneElementElementById;
            sceneElementCopy$default = SceneElement.copy$default(sceneElementElementById, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, totalTime, false, null, null, null, sceneCopyUpdatingNestedScene, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8781825, 127, null);
            SceneElement sceneElementTrimEnd2 = TrimmingKt.trimEnd(sceneElementCopy$default, totalTime, true);
            if (sceneElementTrimEnd2 != null) {
                sceneElementCopy$default = sceneElementTrimEnd2;
            }
        }
        sceneElement = sceneElementElementById;
        return Scene.copy$default(scene, null, 0, 0, 0, 0, 0, copyReplacingFirst(scene.getElements(), sceneElement.getId(), sceneElementCopy$default), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null);
    }

    public static final Sequence<String> effectIdsSequence(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return SequencesKt.sequence(new AnonymousClass1(scene, null));
    }

    public static final SceneElement elementById(Scene scene, Long l2) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Object obj = null;
        if (l2 == null) {
            return null;
        }
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((SceneElement) next).getId() == l2.longValue()) {
                obj = next;
                break;
            }
        }
        return (SceneElement) obj;
    }

    public static final Scene emptyScene(int i2, int i3) {
        return new Scene(null, 106, i2, i3, i2, i3, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 524225, null);
    }

    public static /* synthetic */ Scene emptyScene$default(int i2, int i3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 1280;
        }
        if ((i5 & 2) != 0) {
            i3 = 720;
        }
        return emptyScene(i2, i3);
    }

    public static final Sequence<Uri> externalMediaSequence(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return SequencesKt.sequence(new C17461(scene, null));
    }

    public static final SceneElement findElementRecursive(Scene scene, Function1<? super SceneElement, Boolean> predicate) {
        Scene scene2;
        List<SceneElement> elements;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            if (predicate.invoke(sceneElement).booleanValue()) {
                return sceneElement;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(sceneElement.getNestedScene());
            }
        }
        do {
            scene2 = (Scene) XoT.qz.n(arrayList);
            if (scene2 != null && (elements = scene2.getElements()) != null) {
                for (SceneElement sceneElement2 : elements) {
                    if (predicate.invoke(sceneElement2).booleanValue()) {
                        return sceneElement2;
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(sceneElement2.getNestedScene());
                    }
                }
            }
        } while (scene2 != null);
        return null;
    }

    public static final void forEachElementRecursive(Scene scene, Function2<? super List<SceneElement>, ? super SceneElement, Unit> action) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            action.invoke(CollectionsKt.emptyList(), sceneElement);
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    action.invoke(list, sceneElement2);
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
    }

    public static final void forEachElementRecursiveWithLens(Scene scene, Function1<? super oA.j, Unit> action) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : scene.getElements()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SceneElement sceneElement = (SceneElement) obj;
            oA.C c2 = new oA.C(Reflection.getOrCreateKotlinClass(Scene.class), KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Scene.class), null, false, null, 7, null));
            SceneKt$forEachElementRecursiveWithLens$1$lens$1 sceneKt$forEachElementRecursiveWithLens$1$lens$1 = SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$1$lens$1.getReturnType(), c2, sceneKt$forEachElementRecursiveWithLens$1$lens$1);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Scene.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            action.invoke(w6Var);
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(w6Var, sceneElement.getNestedScene()));
            }
            i2 = i3;
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                oA.j jVar = (oA.j) pair.component1();
                int i5 = 0;
                for (Object obj2 : ((Scene) pair.component2()).getElements()) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SceneElement sceneElement2 = (SceneElement) obj2;
                    SceneKt$forEachElementRecursiveWithLens$2$lens$1 sceneKt$forEachElementRecursiveWithLens$2$lens$1 = SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$1.getReturnType(), jVar, sceneKt$forEachElementRecursiveWithLens$2$lens$1);
                    SceneKt$forEachElementRecursiveWithLens$2$lens$2 sceneKt$forEachElementRecursiveWithLens$2$lens$2 = SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                    oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$2.getReturnType(), aCVar2, sceneKt$forEachElementRecursiveWithLens$2$lens$2);
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Scene.class);
                    KType type2 = aCVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar3, i5);
                    action.invoke(w6Var2);
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(w6Var2, sceneElement2.getNestedScene()));
                    }
                    i5 = i7;
                }
            }
        } while (pair != null);
    }

    public static final void forEachElementWithActiveVideoTrackAtFrame(Scene scene, int i2, Function1<? super SceneElement, Unit> action) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int framesPerHundredSeconds = (int) ((((long) i2) * ((long) 100000)) / ((long) scene.getFramesPerHundredSeconds()));
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            CollectionsKt.emptyList();
            ElementTiming elementTimingAbsoluteTimingInScene = SceneElementKt.absoluteTimingInScene(sceneElement, scene);
            int startTime = elementTimingAbsoluteTimingInScene.getStartTime();
            int endTime = elementTimingAbsoluteTimingInScene.getEndTime();
            if (startTime <= framesPerHundredSeconds && framesPerHundredSeconds < endTime && sceneElement.getType().isRenderable() && sceneElement.getType().getHasFillVideo() && sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillVideo() != null) {
                action.invoke(sceneElement);
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    ElementTiming elementTimingAbsoluteTimingInScene2 = SceneElementKt.absoluteTimingInScene(sceneElement2, scene);
                    int startTime2 = elementTimingAbsoluteTimingInScene2.getStartTime();
                    int endTime2 = elementTimingAbsoluteTimingInScene2.getEndTime();
                    if (startTime2 <= framesPerHundredSeconds && framesPerHundredSeconds < endTime2 && sceneElement2.getType().isRenderable() && sceneElement2.getType().getHasFillVideo() && sceneElement2.getFillType() == FillType.MEDIA && sceneElement2.getFillVideo() != null) {
                        action.invoke(sceneElement2);
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
    }

    public static final int getDuration(Scene scene) {
        Object obj;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Iterator<T> it = scene.getElements().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int endTime = ((SceneElement) next).getEndTime();
                do {
                    Object next2 = it.next();
                    int endTime2 = ((SceneElement) next2).getEndTime();
                    if (endTime < endTime2) {
                        next = next2;
                        endTime = endTime2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        SceneElement sceneElement = (SceneElement) obj;
        if (sceneElement != null) {
            return sceneElement.getEndTime();
        }
        return 0;
    }

    public static final Scene getEMPTY_SCENE() {
        return EMPTY_SCENE;
    }

    public static final SceneSelection getEMPTY_SCENE_SELECTION() {
        return EMPTY_SCENE_SELECTION;
    }

    public static final Scene getEditingScene(SceneHolder sceneHolder, int i2) {
        SceneElement sceneElementElementById;
        Intrinsics.checkNotNullParameter(sceneHolder, "<this>");
        List listTake = CollectionsKt.take(sceneHolder.getEditingNestedSceneIds(), i2);
        Scene rootScene = sceneHolder.getRootScene();
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            rootScene = (rootScene == null || (sceneElementElementById = elementById(rootScene, Long.valueOf(((Number) it.next()).longValue()))) == null) ? null : sceneElementElementById.getNestedScene();
        }
        return rootScene;
    }

    public static final boolean getHasActiveReTiming(SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(sceneHolder, "<this>");
        if (!isEditingNestedScene(sceneHolder) || sceneHolder.getScene().getReTimingMethod() == ReTimingMethod.OFF) {
            return !isEditingNestedScene(sceneHolder) && sceneHolder.getRootScene().getType() == SceneType.ELEMENT;
        }
        return true;
    }

    public static final boolean getHasExternalAudio(Scene scene) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            CollectionsKt.emptyList();
            if (sceneElement.getType() == SceneElementType.Audio && !Intrinsics.areEqual(sceneElement.getSrc(), Uri.EMPTY)) {
                return true;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    if (sceneElement2.getType() == SceneElementType.Audio && !Intrinsics.areEqual(sceneElement2.getSrc(), Uri.EMPTY)) {
                        return true;
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        return false;
    }

    public static final boolean getHasExternalMedia(Scene scene) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            CollectionsKt.emptyList();
            if (sceneElement.getType().getHasFillImage() && sceneElement.getFillImage() != null) {
                return true;
            }
            if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillVideo() != null) {
                return true;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    if (sceneElement2.getType().getHasFillImage() && sceneElement2.getFillImage() != null) {
                        return true;
                    }
                    if (sceneElement2.getType().getHasFillVideo() && sceneElement2.getFillVideo() != null) {
                        return true;
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        return false;
    }

    public static final boolean getHasLayerParenting(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        for (SceneElement sceneElement : scene.getElements()) {
            if (sceneElement.getParent() != null || getHasLayerParenting(sceneElement.getNestedScene())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean getHasTrialEasingItem(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        for (SceneElement sceneElement : scene.getElements()) {
            List<Keyable<? extends Object>> keyableProperties = SceneElementKt.getKeyableProperties(sceneElement);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keyableProperties.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Keyable) it.next()).getKeyframes());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (EasingKt.getAdvanced(((Keyframe) it2.next()).getEasing())) {
                    return true;
                }
            }
            if (getHasTrialEasingItem(sceneElement.getNestedScene())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean getHasTrialEffectItem(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        for (SceneElement sceneElement : scene.getElements()) {
            Iterator<T> it = sceneElement.getVisualEffects().values().iterator();
            while (it.hasNext()) {
                if (kgE.Md.n().contains(((KeyableVisualEffectRef) it.next()).getId())) {
                    return true;
                }
            }
            if (getHasTrialEffectItem(sceneElement.getNestedScene())) {
                return true;
            }
        }
        return false;
    }

    public static final int getMAX_SUPPORTED_PROJECT_FORMAT_VERSION() {
        return Math.max(106, 108);
    }

    public static final Long getMainCameraId(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (((SceneElement) obj).getType() == SceneElementType.Camera) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it.hasNext()) {
            iMin = Math.min(scene.getElements().indexOf((SceneElement) it.next()), iMin);
        }
        if (iMin != Integer.MAX_VALUE) {
            return Long.valueOf(scene.getElements().get(iMin).getId());
        }
        return null;
    }

    public static final Set<Long> getMultiSelectionElements(SceneSelection sceneSelection) {
        Intrinsics.checkNotNullParameter(sceneSelection, "<this>");
        return sceneSelection.getDirectSelection() == null ? sceneSelection.getSelectedElements() : SetsKt.emptySet();
    }

    public static final long getNextAvailableId(Scene scene) {
        Long l2;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Iterator<T> it = scene.getElements().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((SceneElement) it.next()).getId());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((SceneElement) it.next()).getId());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l2 = lValueOf;
        } else {
            l2 = null;
        }
        long jMax = Math.max(lastUsedElementId, l2 != null ? l2.longValue() : 0L) + 1;
        lastUsedElementId = jMax;
        return jMax;
    }

    public static final Set<String> getPremiumEffectIds(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SceneElement sceneElement : scene.getElements()) {
            for (KeyableVisualEffectRef keyableVisualEffectRef : sceneElement.getVisualEffects().values()) {
                if (kgE.Md.n().contains(keyableVisualEffectRef.getId())) {
                    linkedHashSet.add(keyableVisualEffectRef.getId());
                }
            }
            CollectionsKt.addAll(linkedHashSet, getPremiumEffectIds(sceneElement.getNestedScene()));
        }
        return linkedHashSet;
    }

    public static final ProjectInfo.n getProjectInfo(Scene scene, File projectFile) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(projectFile, "projectFile");
        String nameWithoutExtension = FilesKt.getNameWithoutExtension(projectFile);
        String title = scene.getTitle();
        int width = scene.getWidth();
        int height = scene.getHeight();
        int totalTime = scene.getTotalTime();
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        long jLastModified = projectFile.lastModified();
        long length = projectFile.length();
        SceneType type = scene.getType();
        Iterator<T> it = scene.getMediaInfo().values().iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((MediaUriInfo) it.next()).getSize();
        }
        return new ProjectInfo.n(nameWithoutExtension, title, width, height, totalTime, framesPerHundredSeconds, jLastModified, length, type, size, scene.getFormatVersion(), scene.getTemplateLink());
    }

    public static final List<SceneElement> getRecursiveElements(Scene scene) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            CollectionsKt.emptyList();
            listCreateListBuilder.add(sceneElement);
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    listCreateListBuilder.add(sceneElement2);
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final List<Integer> getSTANDARD_FRAME_RATES() {
        return STANDARD_FRAME_RATES;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<UserElementProperty> getSettableUserParams(Scene scene) {
        Collection settableUserParams;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : elements) {
            if (WhenMappings.$EnumSwitchMapping$0[sceneElement.getType().ordinal()] == 1) {
                List<UserElementProperty> settableUserParams2 = getSettableUserParams(sceneElement.getNestedScene());
                settableUserParams = new ArrayList();
                for (UserElementProperty userElementTextProperty : settableUserParams2) {
                    KeyableUserParameterValue keyableUserParameterValue = sceneElement.getUserElementParamValues().get(userElementTextProperty.getId());
                    if (keyableUserParameterValue != null) {
                        if (keyableUserParameterValue.getDataType() != DataType.STRING) {
                            userElementTextProperty = null;
                        } else if (SceneElementKt.isValidUserElementTag(keyableUserParameterValue.getStringValue())) {
                            userElementTextProperty = SceneElementKt.getUserElementTextProperty(keyableUserParameterValue.getStringValue());
                        } else if (keyableUserParameterValue.getStringValue().length() != 0) {
                        }
                    }
                    if (userElementTextProperty != null) {
                        settableUserParams.add(userElementTextProperty);
                    }
                }
            } else {
                settableUserParams = SceneElementKt.getSettableUserParams(sceneElement);
            }
            CollectionsKt.addAll(arrayList, settableUserParams);
        }
        return arrayList;
    }

    public static final String getSha1(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        WeakHashMap<Scene, String> weakHashMap = sceneHashes;
        String strO = weakHashMap.get(scene);
        if (strO == null) {
            byte[] bArrAz = HI0.gnv.az(SceneSerializerKt.serializeScene$default(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 917503, null), false, null, false, false, null, 38, null));
            Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
            strO = HI0.gnv.o(bArrAz);
            weakHashMap.put(scene, strO);
        }
        Intrinsics.checkNotNullExpressionValue(strO, "getOrPut(...)");
        return strO;
    }

    public static final Vector2D getSize(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return new Vector2D(scene.getWidth(), scene.getHeight());
    }

    public static final int getThumbTime(final Scene scene) {
        Object obj;
        final int endTime;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        SceneType type = scene.getType();
        SceneType sceneType = SceneType.ELEMENT;
        if (type == sceneType && scene.getThumbnailTime() >= 0) {
            endTime = scene.getThumbnailTime();
        } else if (scene.getType() != sceneType || scene.getReTimingInMark() == 0 || scene.getReTimingOutMark() == 0) {
            Iterator it = SequencesKt.filter(CollectionsKt.asSequence(scene.getElements()), new Function1() { // from class: com.alightcreative.app.motion.scene.kO4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(SceneKt._get_thumbTime_$lambda$0((SceneElement) obj2));
                }
            }).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int endTime2 = ((SceneElement) next).getEndTime();
                    do {
                        Object next2 = it.next();
                        int endTime3 = ((SceneElement) next2).getEndTime();
                        if (endTime2 < endTime3) {
                            next = next2;
                            endTime2 = endTime3;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            SceneElement sceneElement = (SceneElement) obj;
            endTime = (sceneElement != null ? sceneElement.getEndTime() : 0) / 3;
        } else {
            endTime = (scene.getReTimingInMark() + scene.getReTimingOutMark()) / 2;
        }
        XoT.C.Uo(scene, new Function0() { // from class: com.alightcreative.app.motion.scene.hQ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneKt._get_thumbTime_$lambda$3$lambda$2(endTime, scene);
            }
        });
        return endTime;
    }

    public static final boolean hasAnyAudio(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        if (elements != null && elements.isEmpty()) {
            return false;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (SceneElementKt.hasAnyAudio((SceneElement) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasAnyVideo(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        if (elements != null && elements.isEmpty()) {
            return false;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (SceneElementKt.hasAnyVideo((SceneElement) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasCameraObject(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        if (elements != null && elements.isEmpty()) {
            return false;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (((SceneElement) it.next()).getType() == SceneElementType.Camera) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasUniqueIds(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SceneElement) it.next()).getId()));
        }
        if (CollectionsKt.toSet(arrayList).size() != arrayList.size()) {
            return false;
        }
        List<SceneElement> elements2 = scene.getElements();
        if (elements2 != null && elements2.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = elements2.iterator();
        while (it2.hasNext()) {
            if (!hasUniqueIds(((SceneElement) it2.next()).getNestedScene())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isEditingNestedScene(SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(sceneHolder, "<this>");
        return (sceneHolder.getEditingNestedSceneIds().isEmpty() && sceneHolder.getScene() == sceneHolder.getRootScene()) ? false : true;
    }

    public static final ICC.n makeMediaComp(final Scene scene, HI0.Q contentResolver) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        final int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        XoT.C.Uo(scene, new Function0() { // from class: com.alightcreative.app.motion.scene.RzR
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneKt.makeMediaComp$lambda$48();
            }
        });
        return ICC.fuX.n(contentResolver, new Function1() { // from class: com.alightcreative.app.motion.scene.pq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SceneKt.makeMediaComp$lambda$58(framesPerHundredSeconds, scene, (ICC.CN3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeMediaComp$lambda$48() {
        return "makeMediaComp IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeMediaComp$lambda$58(int i2, Scene scene, ICC.CN3 mediaComp) {
        Pair pair;
        Intrinsics.checkNotNullParameter(mediaComp, "$this$mediaComp");
        mediaComp.mUb(Integer.valueOf(i2));
        XoT.C.Uo(mediaComp, new Function0() { // from class: com.alightcreative.app.motion.scene.xuv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneKt.makeMediaComp$lambda$58$lambda$49();
            }
        });
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        ArrayList arrayList = new ArrayList();
        for (final SceneElement sceneElement : scene.getElements()) {
            final List listEmptyList = CollectionsKt.emptyList();
            intRef.element++;
            final Uri src = sceneElement.getType() == SceneElementType.Audio ? sceneElement.getSrc() : sceneElement.getFillVideo();
            final Uri fillVideo = sceneElement.getFillVideo();
            Iterator it = listEmptyList.iterator();
            final int iRoundToFrame = 0;
            while (it.hasNext()) {
                iRoundToFrame += TimeKt.roundToFrame(((SceneElement) it.next()).getStartTime(), i2);
            }
            ElementTiming elementTimingAbsoluteTimingInScene = SceneElementKt.absoluteTimingInScene(sceneElement, scene);
            final int startTime = elementTimingAbsoluteTimingInScene.getStartTime();
            final int endTime = elementTimingAbsoluteTimingInScene.getEndTime();
            XoT.C.Uo(mediaComp, new Function0() { // from class: com.alightcreative.app.motion.scene.c7r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$51(intRef, sceneElement, iRoundToFrame, startTime, endTime, src, fillVideo);
                }
            });
            if (src != null) {
                mediaComp.O(src, new Function1() { // from class: com.alightcreative.app.motion.scene.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$54(sceneElement, startTime, endTime, listEmptyList, (ICC.o) obj);
                    }
                });
            }
            if (fillVideo != null && !sceneElement.getHidden()) {
                mediaComp.gh(fillVideo, new Function1() { // from class: com.alightcreative.app.motion.scene.cA
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$55(sceneElement, startTime, endTime, (ICC.o) obj);
                    }
                });
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                final List list = (List) pair.component1();
                for (final SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    intRef.element++;
                    final Uri src2 = sceneElement2.getType() == SceneElementType.Audio ? sceneElement2.getSrc() : sceneElement2.getFillVideo();
                    final Uri fillVideo2 = sceneElement2.getFillVideo();
                    Iterator it2 = list.iterator();
                    final int iRoundToFrame2 = 0;
                    while (it2.hasNext()) {
                        iRoundToFrame2 += TimeKt.roundToFrame(((SceneElement) it2.next()).getStartTime(), i2);
                    }
                    ElementTiming elementTimingAbsoluteTimingInScene2 = SceneElementKt.absoluteTimingInScene(sceneElement2, scene);
                    final int startTime2 = elementTimingAbsoluteTimingInScene2.getStartTime();
                    final int endTime2 = elementTimingAbsoluteTimingInScene2.getEndTime();
                    XoT.C.Uo(mediaComp, new Function0() { // from class: com.alightcreative.app.motion.scene.c7r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$51(intRef, sceneElement2, iRoundToFrame2, startTime2, endTime2, src2, fillVideo2);
                        }
                    });
                    if (src2 != null) {
                        mediaComp.O(src2, new Function1() { // from class: com.alightcreative.app.motion.scene.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$54(sceneElement2, startTime2, endTime2, list, (ICC.o) obj);
                            }
                        });
                    }
                    if (fillVideo2 != null && !sceneElement2.getHidden()) {
                        mediaComp.gh(fillVideo2, new Function1() { // from class: com.alightcreative.app.motion.scene.cA
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$55(sceneElement2, startTime2, endTime2, (ICC.o) obj);
                            }
                        });
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        XoT.C.Uo(mediaComp, new Function0() { // from class: com.alightcreative.app.motion.scene.g9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneKt.makeMediaComp$lambda$58$lambda$57();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeMediaComp$lambda$58$lambda$49() {
        return "makeMediaComp before forEachElementRecursive";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeMediaComp$lambda$58$lambda$56$lambda$51(Ref.IntRef intRef, SceneElement sceneElement, int i2, int i3, int i5, Uri uri, Uri uri2) {
        return "makeMediaComp[" + intRef.element + "]: ID=" + sceneElement.getId() + " TYPE=" + sceneElement.getType() + " startTimeOffset=" + i2 + " absStart=" + i3 + " absEnd=" + i5 + " el=[" + sceneElement.getStartTime() + "->" + sceneElement.getEndTime() + "; orig=" + sceneElement.getInTime() + "->" + sceneElement.getOutTime() + "] audioSrc=" + uri + " videoSrc=" + uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeMediaComp$lambda$58$lambda$56$lambda$54(final SceneElement sceneElement, int i2, int i3, final List list, ICC.o audioTrack) {
        Intrinsics.checkNotNullParameter(audioTrack, "$this$audioTrack");
        audioTrack.az(Long.valueOf(((long) Integer.MIN_VALUE) + sceneElement.getEngineState().getTrackId()));
        audioTrack.Ik(Double.valueOf(((double) i2) / 1000.0d));
        audioTrack.qie(Double.valueOf(((double) i3) / 1000.0d));
        audioTrack.ty(Double.valueOf(((double) sceneElement.getInTime()) / 1000.0d));
        audioTrack.HI(Double.valueOf(((double) sceneElement.getOutTime()) / 1000.0d));
        audioTrack.ck(Float.valueOf(SceneElementKt.getAudioVideoSpeedFactor(sceneElement)));
        audioTrack.r(new Function1() { // from class: com.alightcreative.app.motion.scene.qYU
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$54$lambda$53(sceneElement, list, ((Long) obj).longValue()));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeMediaComp$lambda$58$lambda$56$lambda$55(SceneElement sceneElement, int i2, int i3, ICC.o videoTrack) {
        Intrinsics.checkNotNullParameter(videoTrack, "$this$videoTrack");
        videoTrack.az(Long.valueOf(sceneElement.getEngineState().getTrackId()));
        videoTrack.Ik(Double.valueOf(((double) i2) / 1000.0d));
        videoTrack.qie(Double.valueOf(((double) i3) / 1000.0d));
        videoTrack.ty(Double.valueOf(((double) sceneElement.getInTime()) / 1000.0d));
        videoTrack.HI(Double.valueOf(((double) sceneElement.getOutTime()) / 1000.0d));
        videoTrack.ck(Float.valueOf(SceneElementKt.getAudioVideoSpeedFactor(sceneElement)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeMediaComp$lambda$58$lambda$57() {
        return "makeMediaComp after forEachElementRecursive";
    }

    public static final String makeNumberedLabel(Scene scene, String baseLabel) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(baseLabel, "baseLabel");
        Iterator<Integer> it = new IntRange(1, Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            List<SceneElement> elements = scene.getElements();
            if (elements == null || !elements.isEmpty()) {
                Iterator<T> it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((SceneElement) it2.next()).getLabel(), baseLabel + " " + iNextInt)) {
                        break;
                    }
                }
            }
            return baseLabel + " " + iNextInt;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final SceneElement nestedElementById(Scene scene, Long l2) {
        Scene scene2;
        List<SceneElement> elements;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        if (l2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            if (sceneElement.getId() == l2.longValue()) {
                return sceneElement;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(sceneElement.getNestedScene());
            }
        }
        do {
            scene2 = (Scene) XoT.qz.n(arrayList);
            if (scene2 != null && (elements = scene2.getElements()) != null) {
                for (SceneElement sceneElement2 : elements) {
                    if (sceneElement2.getId() == l2.longValue()) {
                        return sceneElement2;
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(sceneElement2.getNestedScene());
                    }
                }
            }
        } while (scene2 != null);
        return null;
    }

    public static final SceneElement nestedElementByTrackId(Scene scene, Long l2) {
        Scene scene2;
        List<SceneElement> elements;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        if (l2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            if (sceneElement.getEngineState().getTrackId() == l2.longValue()) {
                return sceneElement;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(sceneElement.getNestedScene());
            }
        }
        do {
            scene2 = (Scene) XoT.qz.n(arrayList);
            if (scene2 != null && (elements = scene2.getElements()) != null) {
                for (SceneElement sceneElement2 : elements) {
                    if (sceneElement2.getEngineState().getTrackId() == l2.longValue()) {
                        return sceneElement2;
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(sceneElement2.getNestedScene());
                    }
                }
            }
        } while (scene2 != null);
        return null;
    }

    public static final SceneSelection overlaySelectionHint() {
        return new SceneSelection(SetsKt.emptySet(), null, null, null, null, null, null, null, true, null, null, null, 3836, null);
    }

    public static final List<SceneElement> pathToElement(Scene scene, List<SceneElement> parentElements, Function1<? super SceneElement, Boolean> predicate) {
        List<SceneElement> listPathToElement;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(parentElements, "parentElements");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (SceneElement sceneElement : scene.getElements()) {
            if (predicate.invoke(sceneElement).booleanValue()) {
                return CollectionsKt.plus((Collection<? extends SceneElement>) parentElements, sceneElement);
            }
            if (!sceneElement.getNestedScene().getElements().isEmpty() && (listPathToElement = pathToElement(sceneElement.getNestedScene(), CollectionsKt.plus((Collection<? extends SceneElement>) parentElements, sceneElement), predicate)) != null) {
                return listPathToElement;
            }
        }
        return null;
    }

    public static /* synthetic */ List pathToElement$default(Scene scene, List list, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        return pathToElement(scene, list, function1);
    }

    public static final SceneElement prepElementForAdd(Scene scene, SceneElement element) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        if (element.getId() > 0) {
            List<SceneElement> elements = scene.getElements();
            if (elements != null && elements.isEmpty()) {
                return element;
            }
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (((SceneElement) it.next()).getId() == element.getId()) {
                }
            }
            return element;
        }
        return SceneElement.copy$default(element, null, 0, 0, getNextAvailableId(scene), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -9, 127, null);
    }

    public static final Scene remapMediaUris(Scene scene, final Function1<? super Uri, ? extends Uri> uriMapper) {
        Pair pair;
        Scene scene2 = scene;
        Intrinsics.checkNotNullParameter(scene2, "<this>");
        Intrinsics.checkNotNullParameter(uriMapper, "uriMapper");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Object obj = scene2;
        for (Object obj2 : scene2.getElements()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SceneElement sceneElement = (SceneElement) obj2;
            oA.C c2 = new oA.C(Reflection.getOrCreateKotlinClass(Scene.class), KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Scene.class), null, false, null, 7, null));
            SceneKt$forEachElementRecursiveWithLens$1$lens$1 sceneKt$forEachElementRecursiveWithLens$1$lens$1 = SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$1$lens$1.getReturnType(), c2, sceneKt$forEachElementRecursiveWithLens$1$lens$1);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Scene.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            SceneElement sceneElement2 = (SceneElement) w6Var.get(obj);
            Object objT = obj;
            if (sceneElement2.getType().getHasFillImage()) {
                objT = obj;
                if (sceneElement2.getFillImage() != null) {
                    objT = w6Var.t(obj, new Function1() { // from class: com.alightcreative.app.motion.scene.L0y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return SceneKt.remapMediaUris$lambda$71$lambda$68(uriMapper, (SceneElement) obj3);
                        }
                    });
                }
            }
            Object objT2 = objT;
            if (sceneElement2.getType().getHasFillVideo()) {
                objT2 = objT;
                if (sceneElement2.getFillVideo() != null) {
                    objT2 = w6Var.t(objT, new Function1() { // from class: com.alightcreative.app.motion.scene.CM
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return SceneKt.remapMediaUris$lambda$71$lambda$69(uriMapper, (SceneElement) obj3);
                        }
                    });
                }
            }
            Object objT3 = objT2;
            if (sceneElement2.getType() == SceneElementType.Audio) {
                objT3 = objT2;
                if (!Intrinsics.areEqual(sceneElement2.getSrc(), Uri.EMPTY)) {
                    objT3 = w6Var.t(objT2, new Function1() { // from class: com.alightcreative.app.motion.scene.FKk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return SceneKt.remapMediaUris$lambda$71$lambda$70(uriMapper, (SceneElement) obj3);
                        }
                    });
                }
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(w6Var, sceneElement.getNestedScene()));
            }
            i2 = i3;
            obj = objT3;
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                oA.j jVar = (oA.j) pair.component1();
                int i5 = 0;
                obj = obj;
                for (Object obj3 : ((Scene) pair.component2()).getElements()) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SceneElement sceneElement3 = (SceneElement) obj3;
                    SceneKt$forEachElementRecursiveWithLens$2$lens$1 sceneKt$forEachElementRecursiveWithLens$2$lens$1 = SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$1.getReturnType(), jVar, sceneKt$forEachElementRecursiveWithLens$2$lens$1);
                    SceneKt$forEachElementRecursiveWithLens$2$lens$2 sceneKt$forEachElementRecursiveWithLens$2$lens$2 = SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                    oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$2.getReturnType(), aCVar2, sceneKt$forEachElementRecursiveWithLens$2$lens$2);
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Scene.class);
                    KType type2 = aCVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar3, i5);
                    SceneElement sceneElement4 = (SceneElement) w6Var2.get(obj);
                    Object objT4 = obj;
                    if (sceneElement4.getType().getHasFillImage()) {
                        objT4 = obj;
                        if (sceneElement4.getFillImage() != null) {
                            objT4 = w6Var2.t(obj, new Function1() { // from class: com.alightcreative.app.motion.scene.L0y
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj32) {
                                    return SceneKt.remapMediaUris$lambda$71$lambda$68(uriMapper, (SceneElement) obj32);
                                }
                            });
                        }
                    }
                    Object objT5 = objT4;
                    if (sceneElement4.getType().getHasFillVideo()) {
                        objT5 = objT4;
                        if (sceneElement4.getFillVideo() != null) {
                            objT5 = w6Var2.t(objT4, new Function1() { // from class: com.alightcreative.app.motion.scene.CM
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj32) {
                                    return SceneKt.remapMediaUris$lambda$71$lambda$69(uriMapper, (SceneElement) obj32);
                                }
                            });
                        }
                    }
                    Object objT6 = objT5;
                    if (sceneElement4.getType() == SceneElementType.Audio) {
                        objT6 = objT5;
                        if (!Intrinsics.areEqual(sceneElement4.getSrc(), Uri.EMPTY)) {
                            objT6 = w6Var2.t(objT5, new Function1() { // from class: com.alightcreative.app.motion.scene.FKk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj32) {
                                    return SceneKt.remapMediaUris$lambda$71$lambda$70(uriMapper, (SceneElement) obj32);
                                }
                            });
                        }
                    }
                    if (sceneElement3.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(w6Var2, sceneElement3.getNestedScene()));
                    }
                    i5 = i7;
                    obj = objT6;
                }
            }
        } while (pair != null);
        return (Scene) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement remapMediaUris$lambda$71$lambda$68(Function1 function1, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Uri fillImage = it.getFillImage();
        Intrinsics.checkNotNull(fillImage);
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, (Uri) function1.invoke(fillImage), null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -257, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement remapMediaUris$lambda$71$lambda$69(Function1 function1, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Uri fillVideo = it.getFillVideo();
        Intrinsics.checkNotNull(fillVideo);
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, (Uri) function1.invoke(fillVideo), null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -513, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement remapMediaUris$lambda$71$lambda$70(Function1 function1, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, (Uri) function1.invoke(it.getSrc()), null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -16385, 127, null);
    }

    public static final SceneSelection selectionHint(SceneElement hintElement) {
        Intrinsics.checkNotNullParameter(hintElement, "hintElement");
        return new SceneSelection(SetsKt.emptySet(), null, null, null, null, null, null, Long.valueOf(hintElement.getId()), false, null, null, null, 3964, null);
    }

    public static final FrameStats statsForFrame(Scene scene, int i2) {
        Scene scene2 = scene;
        Intrinsics.checkNotNullParameter(scene2, "<this>");
        int framesPerHundredSeconds = (int) ((((long) i2) * ((long) 100000)) / ((long) scene2.getFramesPerHundredSeconds()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i5 = 0;
        for (SceneElement sceneElement : scene2.getElements()) {
            CollectionsKt.emptyList();
            ElementTiming elementTimingAbsoluteTimingInScene = SceneElementKt.absoluteTimingInScene(sceneElement, scene2);
            int startTime = elementTimingAbsoluteTimingInScene.getStartTime();
            int endTime = elementTimingAbsoluteTimingInScene.getEndTime();
            if (startTime <= framesPerHundredSeconds && framesPerHundredSeconds < endTime) {
                if (sceneElement.getType().isRenderable() && sceneElement.getType().getHasFillVideo() && sceneElement.getFillType() == FillType.MEDIA && sceneElement.getFillVideo() != null) {
                    i3++;
                }
                if (SceneElementKt.hasAnyAudio(sceneElement)) {
                    i5++;
                }
                if (sceneElement.getType().getHasVisualEffects()) {
                    Iterator<T> it = sceneElement.getVisualEffectOrder().iterator();
                    while (it.hasNext()) {
                        KeyableVisualEffectRef keyableVisualEffectRef = sceneElement.getVisualEffects().get(Long.valueOf(((Number) it.next()).longValue()));
                        if (keyableVisualEffectRef != null) {
                            arrayList.add(HI0.gnv.qie(keyableVisualEffectRef.getId(), "com.alightcreative.effects.", "."));
                        }
                    }
                }
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList2.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        while (true) {
            Pair pair = (Pair) XoT.qz.n(arrayList2);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    ElementTiming elementTimingAbsoluteTimingInScene2 = SceneElementKt.absoluteTimingInScene(sceneElement2, scene2);
                    int startTime2 = elementTimingAbsoluteTimingInScene2.getStartTime();
                    int endTime2 = elementTimingAbsoluteTimingInScene2.getEndTime();
                    if (startTime2 <= framesPerHundredSeconds && framesPerHundredSeconds < endTime2) {
                        if (sceneElement2.getType().isRenderable() && sceneElement2.getType().getHasFillVideo() && sceneElement2.getFillType() == FillType.MEDIA && sceneElement2.getFillVideo() != null) {
                            i3++;
                        }
                        if (SceneElementKt.hasAnyAudio(sceneElement2)) {
                            i5++;
                        }
                        if (sceneElement2.getType().getHasVisualEffects()) {
                            Iterator<T> it2 = sceneElement2.getVisualEffectOrder().iterator();
                            while (it2.hasNext()) {
                                KeyableVisualEffectRef keyableVisualEffectRef2 = sceneElement2.getVisualEffects().get(Long.valueOf(((Number) it2.next()).longValue()));
                                if (keyableVisualEffectRef2 != null) {
                                    arrayList.add(HI0.gnv.qie(keyableVisualEffectRef2.getId(), "com.alightcreative.effects.", "."));
                                }
                            }
                        }
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList2.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                    scene2 = scene;
                }
            }
            if (pair == null) {
                return new FrameStats(i2, i3, i5, arrayList);
            }
            scene2 = scene;
        }
    }

    public static final Scene uniquifyIds(Scene scene) {
        Scene sceneUniquifyIds;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SceneElement) it.next()).getId()));
        }
        Set set = CollectionsKt.toSet(arrayList);
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<SceneElement> it2 = scene.getElements().iterator();
        Scene sceneCopy$default = scene;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            final SceneElement next = it2.next();
            if (linkedHashSet.contains(Long.valueOf(next.getId()))) {
                Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) SetsKt.plus(set, (Iterable) linkedHashSet));
                final long jLongValue = (l2 != null ? l2.longValue() : 0L) + 1;
                XoT.C.Uo(scene, new Function0() { // from class: com.alightcreative.app.motion.scene.Fl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SceneKt.uniquifyIds$lambda$25(next, jLongValue, linkedHashSet);
                    }
                });
                sceneCopy$default = Scene.copy$default(sceneCopy$default, null, 0, 0, 0, 0, 0, HI0.rv6.nr(sceneCopy$default.getElements(), next, SceneElement.copy$default(next, null, 0, 0, jLongValue, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -9, 127, null)), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null);
                linkedHashSet.add(Long.valueOf(jLongValue));
            } else {
                linkedHashSet.add(Long.valueOf(next.getId()));
            }
        }
        Scene sceneCopy$default2 = sceneCopy$default;
        for (SceneElement sceneElement : sceneCopy$default.getElements()) {
            if (sceneElement.getType().getHasNestedScene() && (sceneUniquifyIds = uniquifyIds(sceneElement.getNestedScene())) != sceneElement.getNestedScene()) {
                XoT.C.Uo(scene, new Function0() { // from class: com.alightcreative.app.motion.scene.R6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SceneKt.uniquifyIds$lambda$26();
                    }
                });
                sceneCopy$default2 = Scene.copy$default(sceneCopy$default2, null, 0, 0, 0, 0, 0, HI0.rv6.nr(sceneCopy$default2.getElements(), sceneElement, SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, sceneUniquifyIds, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null)), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null);
            }
        }
        long j2 = lastUsedElementId;
        Long l5 = (Long) CollectionsKt.maxOrNull((Iterable) linkedHashSet);
        lastUsedElementId = Math.max(j2, l5 != null ? l5.longValue() : 1L);
        return sceneCopy$default2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uniquifyIds$lambda$26() {
        return "Replace nested scene with Unique IDs";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_thumbTime_$lambda$3$lambda$2(int i2, Scene scene) {
        return "Scene.thumbTime thumbTime=" + i2 + " totalTime=" + scene.getTotalTime() + QTafcm.sRYOEBvQPqir + scene.getType() + " reTimingInMark=" + scene.getReTimingInMark() + " reTimingOutMark=" + scene.getReTimingOutMark() + " title=" + scene.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uniquifyIds$lambda$25(SceneElement sceneElement, long j2, Set set) {
        return "Replace with Unique ID : " + sceneElement.getId() + " -> " + j2 + " (used=" + CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene withUpdatedTrimmingFor(Scene scene, long j2) {
        SceneElement sceneElementElementById = elementById(scene, Long.valueOf(j2));
        if (sceneElementElementById != null && sceneElementElementById.getNestedScene().getReTimingMethod() == ReTimingMethod.OFF) {
            SceneElement sceneElementTrimEnd$default = TrimmingKt.trimEnd$default(sceneElementElementById, sceneElementElementById.getStartTime() + RangesKt.coerceAtLeast(MathKt.roundToInt(getDuration(sceneElementElementById.getNestedScene()) / sceneElementElementById.getNestedSceneSpeedFactor()), 1), false, 2, null);
            if (sceneElementTrimEnd$default != null) {
                return copyUpdatingElement(scene, sceneElementTrimEnd$default);
            }
        }
        return scene;
    }

    public static final SceneSelection singleElementSelection(SceneElement selectedElement) {
        Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
        return new SceneSelection(SetsKt.setOf(Long.valueOf(selectedElement.getId())), Long.valueOf(selectedElement.getId()), null, null, null, null, null, null, false, null, null, null, 4092, null);
    }
}
