package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualIterator;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final /* synthetic */ class Fl implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f51710n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51711t;

    public /* synthetic */ Fl(Object obj, V8Runtime v8Runtime) {
        this.f51710n = obj;
        this.f51711t = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        Object obj = this.f51710n;
        return BaseJavetProxyPlugin.PROXY_CONVERTER.toV8Value(this.f51711t, new V8VirtualIterator(((List) IntStream.range(0, Array.getLength(obj)).mapToObj(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: RETURN 
              (wrap:com.caoccao.javet.values.V8Value:0x0004: INVOKE 
              (wrap:com.caoccao.javet.interop.converters.JavetProxyConverter:0x001c: SGET  A[WRAPPED] (LINE:30) com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin.PROXY_CONVERTER com.caoccao.javet.interop.converters.JavetProxyConverter)
              (wrap:com.caoccao.javet.interop.V8Runtime:0x0002: IGET (r2v0 'this' com.caoccao.javet.interop.proxy.plugins.Fl A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] com.caoccao.javet.interop.proxy.plugins.Fl.t com.caoccao.javet.interop.V8Runtime)
              (wrap:com.caoccao.javet.values.virtual.V8VirtualIterator:0x0024: CONSTRUCTOR 
              (wrap:java.util.Iterator:0x0020: INVOKE 
              (wrap:java.util.List:0x001a: CHECK_CAST (java.util.List) (wrap:java.lang.Object:0x0016: INVOKE 
              (wrap:java.util.stream.Stream:0x000e: INVOKE 
              (wrap:java.util.stream.IntStream:0x0005: INVOKE 
              (0 int)
              (wrap:int:0x0000: INVOKE (r0v0 'obj' java.lang.Object) STATIC call: java.lang.reflect.Array.getLength(java.lang.Object):int A[MD:(java.lang.Object):int (c), WRAPPED] (LINE:3))
             STATIC call: java.util.stream.IntStream.range(int, int):java.util.stream.IntStream A[MD:(int, int):java.util.stream.IntStream (c), WRAPPED] (LINE:8))
              (wrap:java.util.function.IntFunction:0x000b: CONSTRUCTOR (r0v0 'obj' java.lang.Object) A[MD:(java.lang.Object):void (m), WRAPPED] (LINE:14) call: com.caoccao.javet.interop.proxy.plugins.pq.<init>(java.lang.Object):void type: CONSTRUCTOR)
             INTERFACE call: java.util.stream.IntStream.mapToObj(java.util.function.IntFunction):java.util.stream.Stream A[MD:<U>:(java.util.function.IntFunction<? extends U>):java.util.stream.Stream<U> (c), WRAPPED] (LINE:17))
              (wrap:java.util.stream.Collector:0x0012: INVOKE  STATIC call: java.util.stream.Collectors.toList():java.util.stream.Collector A[MD:<T>:():java.util.stream.Collector<T, ?, java.util.List<T>> (c), WRAPPED] (LINE:21))
             INTERFACE call: java.util.stream.Stream.collect(java.util.stream.Collector):java.lang.Object A[MD:<R, A>:(java.util.stream.Collector<? super T, A, R>):R (c), WRAPPED] (LINE:25)))
             INTERFACE call: java.util.List.iterator():java.util.Iterator A[MD:():java.util.Iterator<E> (c), WRAPPED] (LINE:35))
             A[MD:(java.util.Iterator<T>):void (m), WRAPPED] (LINE:39) call: com.caoccao.javet.values.virtual.V8VirtualIterator.<init>(java.util.Iterator):void type: CONSTRUCTOR)
             VIRTUAL call: com.caoccao.javet.interop.converters.BaseJavetConverter.toV8Value(com.caoccao.javet.interop.V8Runtime, java.lang.Object):com.caoccao.javet.values.V8Value A[MD:<T extends com.caoccao.javet.values.V8Value>:(com.caoccao.javet.interop.V8Runtime, java.lang.Object):T extends com.caoccao.javet.values.V8Value throws com.caoccao.javet.exceptions.JavetException (m), WRAPPED] (LINE:42))
             (LINE:42) in method: com.caoccao.javet.interop.proxy.plugins.Fl.call(com.caoccao.javet.values.V8Value[]):com.caoccao.javet.values.V8Value, file: /content/repo2/apk-analysis/Alight motion /classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.caoccao.javet.interop.proxy.plugins.pq, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:97)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:878)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:97)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:878)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            java.lang.Object r0 = r2.f51710n
            com.caoccao.javet.interop.V8Runtime r1 = r2.f51711t
            com.caoccao.javet.values.V8Value r3 = com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginArray.aYN(r0, r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caoccao.javet.interop.proxy.plugins.Fl.call(com.caoccao.javet.values.V8Value[]):com.caoccao.javet.values.V8Value");
    }
}
