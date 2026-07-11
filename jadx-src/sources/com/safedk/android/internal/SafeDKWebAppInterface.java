package com.safedk.android.internal;

import ScC.FuwU.XIvb;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.SafeDK;
import com.safedk.android.SafeDKApplication;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class SafeDKWebAppInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62915a = "SafeDKWebAppInterface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62916b = "status";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62917c = "playing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62918d = "paused";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62919e = "end-card";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62920f = "e-commerce-collage-end-card";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62921g = "video-loading-screen";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62922h = "sdk_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62923i = "sdkId";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62924j = "address";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62925k = "javascript:";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62926l = "(function(){var isMainFrame=function(){return window.location===window.parent.location};var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"[video_observer] \"+sdkId+\" \"+address+\" \"+message)}}catch(error){}};var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var applovinEndCardDetected=false;var applovinEcommerceCollageEndCardDetected=false;var videoLoadingScreenDisplayed=false;var isElementInEventHidden=function(event){return isHidden(event.srcElement)};var getVideoPathWithElement=function(videoElement){try{if(videoElement==null||videoElement.tagName!=\"VIDEO\")return null;var path=videoElement.src;if(!path){var sourceNodes=videoElement.getElementsByTagName(\"SOURCE\");for(var sourceNode of sourceNodes){if(sourceNode.src){path=sourceNode.src;break}}}if(path){if(path.length>=400){path=path.substring(0,399)}}return path}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}return null};var getVideoPath=function(event){try{var videoElement=event.srcElement;if(videoElement==null||videoElement.tagName!=\"VIDEO\")return null;var path=getVideoPathWithElement(videoElement);return path}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}return null};var isEndCardDetected=function(){return applovinEndCardDetected||unityEndCardDetected};var handleHiddenPlayingVideoElement=function(){try{var videoElements=document.getElementsByTagName(\"VIDEO\");if(videoElements&&videoElements.length>0){for(i=0;i<videoElements.length;i++){var videoElement=videoElements[i];if(videoElement.safedkVideoPlayingHidden&&isHidden(videoElement)==false){videoElement.safedkVideoPlaying=true;videoElement.safedkVideoPlayingHidden=false;var message={status:\"playing\",sdk_id:sdkId};var src=getVideoPathWithElement(videoElement);if(src)message[\"src\"]=src;log(\"Notifying client that formerly hidden video is playing for sdkId: \"+sdkId+\", video ID: \"+videoElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}}}}}catch(error){log(error)}};var notifyPlayWithVideoElement=function(videoElement){if(!isEndCardDetected()&&!videoElement.safedkVideoPlaying){if(isHidden(videoElement)){log(\"hidden video is playing for sdkId: \"+sdkId+\", video ID: \"+videoElement.id);event.srcElement.safedkVideoPlayingHidden=true;setTimeout(handleHiddenPlayingVideoElement,3e3);return}videoElement.safedkVideoPlaying=true;var message={status:\"playing\",sdk_id:sdkId,address:address};var src=getVideoPathWithElement(videoElement);if(src)message[\"src\"]=src;log(\"Notifying client that video is playing for sdkId: \"+sdkId+\", video ID: \"+videoElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}}};var notifyPlay=function(event){var videoElement=event.srcElement;notifyPlayWithVideoElement(videoElement)};var notifyTimeUpdate=function(event){var videoElement=event.srcElement;if(videoElement&&videoElement.currentTime!=null){if(videoElement.safedkVideoPlaying&&videoElement.currentTime==0){notifyPause(event)}else if(!videoElement.safedkVideoPlaying&&videoElement.currentTime>0){notifyPlay(event)}}};var notifyPause=function(event){if(!isEndCardDetected()){event.srcElement.safedkVideoPlaying=false;var message={status:\"paused\",sdk_id:sdkId,address:address};var src=getVideoPath(event);if(src)message[\"src\"]=src;log(\"Notifying client that video is paused for sdkId: \"+sdkId+\", video ID: \"+event.srcElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}}};var notifyAppLovinEndCard=function(){if(!applovinEndCardDetected){applovinEndCardDetected=true;log(\"Notifying client that end-card detected for sdkId: \"+sdkId);var message={status:\"end-card\",sdk_id:sdkId,address:address};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}}};var notifyAppLovinEcommerceCollageEndCard=function(){var dpaElement=document.getElementById(\"dpa\");if(!dpaElement){dpaElement=document.querySelector('[data-block-name=\"dpa\"]')}if(dpaElement&&!applovinEcommerceCollageEndCardDetected){applovinEcommerceCollageEndCardDetected=true;log(\"Notifying client that AppLovin e-commerce collage end-card detected\");var message={status:\"e-commerce-collage-end-card\",sdk_id:sdkId,address:address};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var notifyVideoLoadingScreenDisplayed=function(){var loadingScreen=document.getElementById(\"loading-screen\");if(loadingScreen){var isHidden=getComputedStyle(loadingScreen).display===\"none\"||getComputedStyle(loadingScreen).visibility===\"hidden\";if(isHidden&&!videoLoadingScreenDisplayed){videoLoadingScreenDisplayed=true;log(\"Notifying client that ad video loading screen was displayed\");var message={status:\"video-loading-screen\",sdk_id:sdkId,address:address};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}}};var addVideoListeners=function(doc){try{if(doc.nodeName==\"#text\")return;var videoElements=doc.getElementsByTagName(\"VIDEO\");if(videoElements.length==0){if(doc.tagName&&doc.tagName==\"VIDEO\"){videoElements=[doc]}}let videosArray=Array.from(videoElements);var docWindow=doc.defaultView;if(!docWindow){docWindow=doc.contentWindow}if(docWindow&&docWindow.portraitVideo1&&docWindow.portraitVideo1.video){videosArray.push(docWindow.portraitVideo1.video)}for(i=0;i<videosArray.length;i++){var videoElement=videosArray[i];if(videoElement.safedkVideoPlaying==null){videoElement.safedkVideoPlaying=false;videoElement.addEventListener(\"play\",notifyPlay);videoElement.addEventListener(\"pause\",notifyPause);videoElement.addEventListener(\"timeupdate\",notifyTimeUpdate)}if(!videoElement.safedkVideoPlaying&&videoElement.currentTime>0&&!videoElement.paused){notifyPlayWithVideoElement(videoElement)}}}catch(error){}};var unityEndCardFound=false;var addUnityEndCardObserver=function(){try{if(!unityEndCardFound){log(\"attempting to find end-screen-adapter\");var endCardElement=document.getElementById(\"end-screen-adapter\");if(endCardElement&&endCardElement.style&&endCardElement.style.visibility){unityEndCardFound=true;log(\"found end-screen-adapter\");var endCardElement_style_visibility=endCardElement.style.visibility;if(endCardElement_style_visibility==\"visible\"){notifyUnityEndCard()}else{try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){notifyUnityEndCard()}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(endCardElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};var unityEndCardDetected=false;var notifyUnityEndCard=function(){if(!unityEndCardDetected){unityEndCardDetected=true;log(\"Notifying client that unity end-card detected for sdkId: \"+sdkId);var message={status:\"end-card\",sdk_id:sdkId,address:address};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}}};var appLovinNewTemplateEndCardObserver=function(){try{var rootElements=document.getElementsByClassName(\"root\");if(rootElements){var rootElement=rootElements[0];if(rootElement){var divElements=rootElement.getElementsByTagName(\"div\");if(divElements){for(var element of divElements){if(element.style){var style=element.style;var isBackground=style.background&&(style.background==\"rgb(32, 32, 32)\"||style.background.includes(\"rgba(32, 32, 32\"));var isDisplay=style.display&&style.display==\"flex\";if(isBackground&&isDisplay){log(\"New applovin template. endcard is displaying\");notifyAppLovinEndCard()}}}}}}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}};var addApplovinEndCardObserver=function(){try{var endCardElement=document.getElementById(\"al_endCardDiv\");if(endCardElement){var computedStyle=getComputedStyle(endCardElement);if(computedStyle&&computedStyle.display==\"flex\"){log(\"Found visible al_endCardDiv tag. sdkId: \"+sdkId);notifyAppLovinEndCard()}else{if(endCardElement.safedkEndCardObserver!=true){endCardElement.safedkEndCardObserver=true;log(\"Found al_endCardDiv tag, adding end-card observer. sdkId: \"+sdkId);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":computedStyle=getComputedStyle(mutation.target);if(computedStyle&&computedStyle.display==\"flex\"){notifyAppLovinEndCard()}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(endCardElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}}}}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){log(\"isHidden caught error: \"+error)}return false};function traverseIframes(iframeDocument,level=0){try{if(level>99){return}var iframes=iframeDocument.getElementsByTagName(\"iframe\");for(var i=0;i<iframes.length;i++){try{var iframe=iframes[i];if(isHidden(iframe)){continue}var iframeDoc=iframe.contentDocument||iframe.contentWindow.document;if(iframeDoc){traverseIframes(iframeDoc,level+1)}}catch(e){log(\"caught exception = \"+e)}}}catch(e){log(\"caught exception = \"+e)}try{addVideoListeners(iframeDocument);notifyVideoLoadingScreenDisplayed();if(iframeDocument.safedkDocRemovedNodesObserved!=true){iframeDocument.safedkDocRemovedNodesObserved=true;var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var node of mutation.removedNodes){if(node.tagName){var removedVideoElements=node.getElementsByTagName(\"VIDEO\");for(var removedVideoElement of removedVideoElements){if(removedVideoElement.safedkVideoPlaying){var event={srcElement:removedVideoElement};notifyPause(event)}}}}})});var config={childList:true,subtree:true};observer.observe(iframeDocument,config)}}catch(error){log(\"caught exception = \"+e)}}var shouldTraverseIframes=\"{{shouldTraverseIframes}}\";if(shouldTraverseIframes==\"true\"){traverseIframes(document)}else{addVideoListeners(document);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var node of mutation.addedNodes){log(\"Add video listeners for added elements: \"+node);addVideoListeners(node)}for(var node of mutation.removedNodes){if(node.tagName){var removedVideoElements=node.getElementsByTagName(\"VIDEO\");for(var removedVideoElement of removedVideoElements){if(removedVideoElement.safedkVideoPlaying){log(\"VIDEO tag removed. Calling notifyPause\");var event={srcElement:removedVideoElement};notifyPause(event)}}}}notifyAppLovinEcommerceCollageEndCard()})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}}})();\n";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62927m = "(function(){var webviewAddress=\"{{webviewAddress}}\";var sdkPackage=\"{{sdkPackage}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"get_text \"+sdkPackage+\" \"+webviewAddress+\" : \"+message)}}catch(error){}};var originalAttachShadow=Element.prototype.attachShadow;if(originalAttachShadow!=null){Element.prototype.attachShadow=function(init){var shadowRoot=originalAttachShadow.call(this,init);if(shadowRoot==null)return null;try{var yandexAdContainer=document.getElementById(\"ad_container\");if(yandexAdContainer!=null){if(init.mode===\"closed\"&&typeof WeakRef!==\"undefined\"){this.SafeDKShadowRootRef=new WeakRef(shadowRoot)}}}catch(error){log(\"error: \"+error)}return shadowRoot}}var textContentUnder=function(currentDocument,element){var node;var textSet=new Set;try{if(element){var walk=currentDocument.createTreeWalker(element,NodeFilter.SHOW_TEXT,null,false);while(node=walk.nextNode()){var parent=node.parentElement;if(!parent)continue;if(parent.nodeType!=1)continue;var parentTag=parent.tagName.toLowerCase();if(parentTag==\"script\"||parentTag==\"noscript\"||parentTag==\"style\"||parentTag==\"iframe\")continue;if(isHidden(parent))continue;var text=node.textContent.trim();if(text==\"\")continue;log(\"textContentUnder added \"+text);textSet.add(text)}}}catch(error){log(\"error : \"+error)}return textSet};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){log(\"error : \"+error)}return false};var traverseIframes=function(iframeDocument,accumulatedText,level=0){try{if(level>99){return accumulatedText}var iframes=iframeDocument.getElementsByTagName(\"IFRAME\");for(var i=0;i<iframes.length;i++){var iframe=iframes[i];if(isHidden(iframe)){continue}try{var iframeDoc=iframe.contentDocument||iframe.contentWindow.document;if(iframeDoc){traverseIframes(iframeDoc,accumulatedText,level+1)}}catch(e){if(e.name!=\"SecurityError\"){log(\"caught exception = \"+e)}}}var currentText=new Set;collectTextFromDocument(iframeDocument,currentText);for(let value of currentText){accumulatedText.add(value);log(\"adding text: \"+value+\" in level: \"+level)}}catch(e){log(\"caught exception = \"+e)}};var collectTextFromDocument=function(currentDoc,textSet){var docs=[];docs.push(currentDoc);var shadowRootElements=[].slice.call(currentDoc.getElementsByClassName(\"creative__shadow-root\"));var yandexAdContainer=document.getElementById(\"ad_container\");if(yandexAdContainer!=null){var yandexAdContainerChildren=yandexAdContainer.children;for(var i=0;i<yandexAdContainerChildren.length;i++){if(typeof yandexAdContainerChildren[i]!=\"undefined\"){shadowRootElements.push(yandexAdContainerChildren[i])}}}for(var shadowElement of shadowRootElements){var shadowRoot=null;if(typeof WeakRef!==\"undefined\"&&shadowElement.SafeDKShadowRootRef instanceof WeakRef){shadowRoot=shadowElement.SafeDKShadowRootRef.deref()}else if(typeof shadowElement.shadowRoot!=\"undefined\"){shadowRoot=shadowElement.shadowRoot}if(shadowRoot&&shadowRoot.innerHTML){var tmpDiv=currentDoc.createElement(\"div\");if(tmpDiv){tmpDiv.innerHTML=shadowRoot.innerHTML;var tmpHtml=currentDoc.createElement(\"div\");if(tmpHtml){tmpHtml.innerHTML=shadowRoot.innerHTML;tmpHtml.body=tmpDiv;tmpHtml.styleSheets=shadowRoot.styleSheets;docs.push(tmpHtml)}}}}for(var doc of docs){var texts=textContentUnder(currentDoc,doc.body);for(var text of texts){textSet.add(text)}}};var collectText=function(){var shouldTraverseIframes=\"{{shouldTraverseIframes}}\";var textSet=new Set;if(shouldTraverseIframes==\"true\"){traverseIframes(document,textSet)}else{collectTextFromDocument(document,textSet)}var text=Array.from(textSet).join(\"---\");try{if(typeof window.webkit.messageHandlers.safedkDebug.setContent===\"function\"){window.webkit.messageHandlers.safedkDebug.setContent(sdkPackage,webviewAddress,text)}}catch(error){log(\"collectText error : \"+error)}};var collectComments=function(){const comments=[];const walker=document.createTreeWalker(document.childNodes[0],NodeFilter.SHOW_COMMENT);while(walker.nextNode()){comments.push(\"comment:\"+walker.currentNode.nodeValue)}if(comments.length>0){try{if(typeof window.webkit.messageHandlers.safedkDebug.setComments===\"function\"){window.webkit.messageHandlers.safedkDebug.setComments(sdkPackage,webviewAddress,JSON.stringify(comments))}}catch(error){log(\"collectComments error : \"+error)}}};var i=0;var interval=1e3;setInterval(function(){if(i<10){i++;collectText();collectComments()}},interval)})();\n";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62928n = "(function(){var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebAppInterface safedkDebug object missing\")}}catch(error){}};var printError=function(error){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"ERROR: \"+fileName+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebAppInterface safedkDebug object missing\")}}catch(error){}};if(window.safedkXHRMonitoring){return}var fullscreenRecommendations=function(){if(window.safedkXHRMonitoring){return}var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var recommendationBoxes=document.getElementsByClassName(\"mtg-recommend-box\");if(recommendationBoxes.length>0){var recommendationBox=recommendationBoxes[0];var imageElements=recommendationBox.getElementsByTagName(\"img\");if(imageElements.length>0){var images=[];for(var i=0;i<imageElements.length;i++){var imageElement=imageElements[i];images.push(imageElement.src)}try{var message={direction:\"recommendation-images\",sdkId:sdkId,webviewAddress:webviewAddress,recommendations:images};if(typeof window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest===\"function\"){window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest(JSON.stringify(message))}else{console.log(\"SafeDKWebAppInterface safedkDebug object missing\")}}catch(error){printError(error)}window.safedkXHRMonitoring=true}}};var hookXMLHTTPRequest=function(validateUrl){if(window.safedkXHRMonitoring){return}var fileName=\"{{fileName}}\";var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var origOpen=window.XMLHttpRequest.prototype.open;function open(method,url,async,user,password){origOpen.apply(this,arguments);try{if(!validateUrl||url.includes(\"openapi/moreoffer\")){this.safedkURL=url.toString();this.addEventListener(\"load\",function(){try{var message={direction:\"response\",sdkId:sdkId,webviewAddress:webviewAddress};if(typeof this.safedkURL!=\"undefined\"&&this.safedkURL)message.url=this.safedkURL;if(typeof this.safedkRequestText!=\"undefined\"&&this.safedkRequestText)message.safedkRequestText=this.safedkRequestText;if(typeof this.responseText!=\"undefined\"&&this.responseText)message.responseText=this.responseText;if(typeof window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest===\"function\"){window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest(JSON.stringify(message))}else{console.log(\"SafeDKWebAppInterface safedkDebug object missing\")}}catch(error){printError(error)}})}}catch(error){printError(error)}}window.XMLHttpRequest.prototype.open=open;var origSend=window.XMLHttpRequest.prototype.send;function send(body){try{var message={direction:\"request\",sdkId:sdkId,webviewAddress:webviewAddress};if(typeof this.safedkURL!=\"undefined\"&&this.safedkURL)message.url=this.safedkURL;if(typeof body!=\"undefined\"&&body){if(typeof body===\"string\"){this.safedkRequestText=body;message.requestText=this.safedkRequestText}}}catch(error){printError(error)}origSend.apply(this,arguments)}window.XMLHttpRequest.prototype.send=send;window.safedkXHRMonitoring=true};try{var swiperElements=document.getElementsByClassName(\"swiper-more-offer-slide-2\");if(swiperElements.length==0){swiperElements=document.getElementsByClassName(\"swiper-more-offer-pagination\")}if(swiperElements.length>0){hookXMLHTTPRequest(false)}else{hookXMLHTTPRequest(true);window.safedkSwiperElementTimer=setInterval(function(){try{var swiperElements=document.getElementsByClassName(\"swiper-more-offer-slide-2\");if(swiperElements.length==0){swiperElements=document.getElementsByClassName(\"swiper-more-offer-pagination\")}if(swiperElements.length>0){hookXMLHTTPRequest(false);if(window.safedkSwiperElementTimer){clearInterval(window.safedkSwiperElementTimer)}}fullscreenRecommendations()}catch(error){printError(error)}},1e3)}}catch(error){printError(error)}})();\n";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f62929o = "window.safedkResCollectionFunc=function(){var sdkPackage=\"{{sdkPackage}}\";var webviewAddress=\"{{webviewAddress}}\";var eventId=\"{{eventId}}\";var excludedResources=[];var log=function(message){try{@@SafeDKWebAppInterface@@.logMessage(message)}catch(error){}};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){log(\"isHidden caught error: \"+error)}return false};var getElementAdditionalData=function(element){try{if(element==null)return null;if(element.tagName==\"IMG\"){return`(${element.width},${element.height})`}return null}catch(error){return null}};var extractBackgroundImageUris=function(backgroundImageContent){var uris=[];content=backgroundImageContent.trim();if(content.startsWith(\"url(\")){var regex=new RegExp(\"url\\\\(\\\"?'?([^)\\\"']+)\\\"?'?\\\\)\",\"g\");var match=regex.exec(content);while(match!=null){uris.push(match[1]);match=regex.exec(content)}}return uris};String.prototype.safedkHashCode=function(){var hash=0,i,chr;if(this.length===0)return hash;for(i=0;i<this.length;i++){chr=this.charCodeAt(i);hash=(hash<<5)-hash+chr;hash|=0}return hash};var sanitizeUri=function(uri,element){try{if(uri==\"none\")return\"\";uri=uri.trim();var regex=new RegExp(\"url\\\\(\\\"?'?([^)\\\"']+)\\\"?'?\\\\)\",\"g\");var match=regex.exec(uri);if(match&&match.length>1){uri=match[1]}if(sdkPackage&&sdkPackage.includes(\"com.supersonicads\")&&element.tagName==\"SOURCE\"){var dataIndex=uri.indexOf(\"data:\");if(dataIndex>-1){uri=uri.substring(dataIndex)}}if(uri.startsWith(\"data:\")){let parts=uri.split(\",\",2);if(parts.length==2&&parts[0]&&parts[1]){const foundBase64=parts[0].includes(\";base64\");if(foundBase64)return\"\";var hashCode=parts[1].safedkHashCode();if(hashCode==0||hashCode==\"\")return\"\";uri=parts[0]+\",\"+hashCode;var additionalData=getElementAdditionalData(element);if(additionalData){uri=uri+\",\"+additionalData}var style=element.style;if(typeof style!=\"undefined\"&&style&&style.zIndex&&style.zIndex==2147483647){uri=uri+\";watermark\"}}}if(sdkPackage==\"com.mintegral.msdk\"){if(uri.startsWith(\"mv://\")){return\"\"}}if(typeof Element.prototype.closest===\"function\"){if(element.tagName==\"IMG\"){var closest=element.closest(\".recommend, .m-more-offer-scroll, .recommend-box, .mtg-recommend-box\");if(closest){return\"\"}}if(sdkPackage==\"com.jirbo.adcolony\"){var closest=element.closest(\"#control-sideBar\");if(closest){excludedResources.push(uri);return\"\"}}}return uri}catch(error){log(\"sanitizeUri caught error: \"+error);return uri}};var safedkIsTwitterDspLandingPage=function(doc){if(sdkPackage!=\"com.applovin\"){return false}var head=doc.head;if(head){var metaElements=head.getElementsByTagName(\"meta\");for(const metaElement of metaElements){if(metaElement.name&&metaElement.name==\"twitter:card\"){return true}}}return false};var findResourcesInDoc=function(doc){if(safedkIsTwitterDspLandingPage(doc)){return{stopAnalyzingResources:\"yes\"}}var resourceExtractionStartTime=new Date;var tagsWithUris=[{name:\"IMG\",prop:\"src\",filterAction:1,checkIfHidden:true},{name:\"SCRIPT\",prop:\"src\",filterAction:3,checkIfHidden:false},{name:\"EMBED\",prop:\"src\",filterAction:2,checkIfHidden:true},{name:\"SOURCE\",prop:\"src\",filterAction:2,checkIfHidden:true},{name:\"AUDIO\",prop:\"src\",filterAction:1,checkIfHidden:true},{name:\"VIDEO\",prop:\"src\",filterAction:1,checkIfHidden:true},{name:\"TRACK\",prop:\"src\",filterAction:0,checkIfHidden:true},{name:\"IFRAME\",prop:\"src\",filterAction:0,checkIfHidden:true},{name:\"LINK\",prop:\"href\",filterAction:0,checkIfHidden:false},{name:\"AREA\",prop:\"href\",filterAction:0,checkIfHidden:true},{name:\"BASE\",prop:\"href\",filterAction:0,checkIfHidden:true}];var hidden_resources=[];var resources=[];var unfilteredResources=[];var videoResources=[];for(const tag of tagsWithUris){var elements=[].slice.call(doc.getElementsByTagName(tag.name));for(const element of elements){if(tag.checkIfHidden){if(isHidden(element)){hidden_resources.push(sanitizeUri(element[tag.prop],element));continue}}var uri=sanitizeUri(element[tag.prop],element);var filter_action=tag.filterAction==\"undefined\"?0:tag.filterAction;if(filter_action==0){resources.push(uri)}else if(filter_action==1){if(tag.name==\"VIDEO\")videoResources.push(uri);else unfilteredResources.push(uri)}else if(filter_action==2){if(element.type&&(element.type.startsWith(\"audio\")||element.type.startsWith(\"image\"))){unfilteredResources.push(uri)}else if(tag.name==\"SOURCE\"&&element.parentElement.tagName==\"VIDEO\"){videoResources.push(uri)}else if(tag.name==\"EMBED\"&&element.type&&element.type.startsWith(\"video\")){videoResources.push(uri)}else{resources.push(uri)}}else if(filter_action==3){try{if(typeof element.innerText!=\"undefined\"&&element.innerText!=null&&element.innerText!=\"\"){if(sdkPackage==\"com.bytedance.sdk\"&&element.innerText.includes(\"dpa_related_products\")){continue}var regex=new RegExp(\"(https?:\\\\/\\\\/[^\\\\s\\\\<\\\\>;\\\"'\\\\\\\\(){},\\\\]]+)\",\"g\");if(sdkPackage==\"com.unity3d.ads\"){var ppRegex=new RegExp('(\"dsp-list\".*<\\\\/p>)',\"ms\");var dspListMatches=element.innerText.match(ppRegex);if(dspListMatches.length>1){var ppText=dspListMatches[1];var dspResourceMatches=[...ppText.matchAll(regex)];for(var dspResourceMatch of dspResourceMatches){if(dspResourceMatch.length>1){excludedResources.push(dspResourceMatch[1])}}}}if(document.getElementById(\"smx_wrap\")!=null){var matches=[...element.innerText.matchAll(regex)];for(var match of matches){if(match.length>1){resources.push(match[1])}}}var molocoAdsIdSuccessfullySet=false;if(window.MOLOCO_MACROS!=null&&window.MOLOCO_MACROS.adid!=null&&typeof window.MOLOCO_MACROS.adid===\"string\"){let molocoAdsId;try{molocoAdsId=window.MOLOCO_MACROS.adid;unfilteredResources.push(`moloco:id:${molocoAdsId}`);molocoAdsIdSuccessfullySet=true}catch(e){log(\"caught exception = \"+e)}}if(molocoAdsIdSuccessfullySet==false){var molocoAdIdRegex=new RegExp('MOLOCO_MACROS\\\\s*=\\\\s*{[^}]*adid:\"([^\"]+)\"');var match=element.innerText.match(molocoAdIdRegex);if(match!=null&&match.length==2){unfilteredResources.push(`moloco:id:${match[1]}`)}}}else{resources.push(uri)}}catch(error){resources.push(uri)}}else{resources.push(uri)}}}var excludeUris=[\"none\",\"initial\",\"inherit\",\"unset\"];var sheets=doc.styleSheets;if(sheets){for(var sheet of sheets){try{var rules=sheet.rules?sheet.rules:sheet.cssRules;if(typeof rules!=\"undefined\"&&rules&&rules.length>0){for(var rule of rules){if(typeof rule.style!=\"undefined\"&&rule.style&&rule.style.backgroundImage){var backgroundImage=rule.style.backgroundImage;if(sdkPackage==\"com.google.ads\"&&(rule.selectorText&&rule.selectorText.includes(\"publisher-app-icon\"))){continue}for(var uri of extractBackgroundImageUris(backgroundImage)){var sanitizedUri=sanitizeUri(uri,rule);if(!excludeUris.includes(sanitizedUri)&&!sanitizedUri.includes(\"gradient\")){unfilteredResources.push(sanitizedUri)}}}}}}catch(error){}}}var tagsWithBGImage=[\"DIV\",\"CANVAS\",\"A\"];for(var tagWithBGImage of tagsWithBGImage){var divs=doc.getElementsByTagName(tagWithBGImage);for(let div of divs){if(sdkPackage==\"com.google.ads\"&&div.className.includes(\"publisher-app-icon\")){continue}var divStyle=getComputedStyle(div);if(typeof divStyle!=\"undefined\"&&divStyle){var backgroundImage=divStyle.backgroundImage;if(typeof backgroundImage!=\"undefined\"&&backgroundImage){for(var uri of extractBackgroundImageUris(backgroundImage)){var sanitizedUri=sanitizeUri(uri,div);if(!excludeUris.includes(sanitizedUri)&&!sanitizedUri.includes(\"gradient\")){if(isHidden(div)){hidden_resources.push(sanitizedUri);continue}else{unfilteredResources.push(sanitizedUri)}}}}}}}var creativeImageClassName=\"creative__image\";var imageElements=doc.getElementsByClassName(creativeImageClassName);for(let imageElement of imageElements){if(imageElement.style&&imageElement.style.cssText){var sanitizedUri=sanitizeUri(imageElement.style.cssText,null);if(sanitizedUri){unfilteredResources.push(sanitizedUri)}}}var resourceArrays=[resources,unfilteredResources,videoResources];var dataUris=[];for(var i=0;i<resourceArrays.length;i++){resourceArrays[i]=resourceArrays[i].filter(function(value,index,self){return value!=\"\"&&self.indexOf(value)===index&&!excludedResources.includes(value)});var urls=[];for(var str of resourceArrays[i]){str=str+\"\";if(str.startsWith(\"data:\")){dataUris.push(str)}else{urls.push(str)}}resourceArrays[i]=urls}var textResources=new Set;collectTextFromDocument(doc,textResources);collectComments(doc,textResources);var resourceExtractionElapsedTime=new Date-resourceExtractionStartTime;return{urls:resourceArrays[0],unfilteredUrls:resourceArrays[1],videoUrls:resourceArrays[2],dataUris:dataUris,hidden_res:hidden_resources,text_res:textResources}};var scanDocumentResources=function(currDoc){var resources={urls:[],unfilteredUrls:[],videoUrls:[],dataUris:[],hidden:[],textResources:[],isDD:false,isHI:false};var docs=[];docs.push(currDoc);var shadowRootElements=[].slice.call(document.getElementsByClassName(\"creative__shadow-root\"));var yandexAdContainer=document.getElementById(\"ad_container\");if(yandexAdContainer!=null){var yandexAdContainerChildren=yandexAdContainer.children;if(typeof yandexAdContainerChildren!=\"undefined\"&&yandexAdContainerChildren.length==1){shadowRootElements.push(yandexAdContainerChildren[0])}}for(var shadowElement of shadowRootElements){if(typeof shadowElement.shadowRoot!=\"undefined\"){var shadowRoot=shadowElement.shadowRoot;if(shadowRoot&&typeof shadowRoot.innerHTML!=\"undefined\"&&shadowRoot.innerHTML){var shadowRootChildren=[].slice.call(shadowRoot.children);if(shadowRootChildren.length>0){docs.push(...shadowRootChildren)}var tmpDiv=document.createElement(\"div\");if(tmpDiv){tmpDiv.innerHTML=shadowRoot.innerHTML;var tmpHtml=document.createElement(\"div\");if(tmpHtml){tmpHtml.innerHTML=shadowRoot.innerHTML;tmpHtml.body=tmpDiv;tmpHtml.styleSheets=shadowRoot.styleSheets;docs.push(tmpHtml)}}}}}for(var doc of docs){var resourcesInDoc=findResourcesInDoc(doc);if(resourcesInDoc){if(resourcesInDoc.stopAnalyzingResources){resources.stopAnalyzingResources=\"yes\"}else{resources.urls.push(...resourcesInDoc.urls);resources.unfilteredUrls.push(...resourcesInDoc.unfilteredUrls);resources.videoUrls.push(...resourcesInDoc.videoUrls);resources.dataUris.push(...resourcesInDoc.dataUris);resources.hidden.push(...resourcesInDoc.hidden_res);resources.textResources.push(...resourcesInDoc.text_res)}}}return resources};function traverseIframes(iframeDocument,level=0){var isDD=false;var isHI=false;try{if(level>99){return}var iframes=iframeDocument.getElementsByTagName(\"iframe\");for(var i=0;i<iframes.length;i++){try{var iframe=iframes[i];if(isHidden(iframe)){isHI=true;continue}var iframeDoc=iframe.contentDocument||iframe.contentWindow.document;if(iframeDoc){traverseIframes(iframeDoc,level+1)}}catch(e){if(e.name===\"SecurityError\"){isDD=true}else{log(\"caught exception = \"+e)}}}}catch(e){log(\"ti caught exception = \"+e)}var resourcesList={urls:[],unfilteredUrls:[],videoUrls:[],dataUris:[],hidden:[],isDD:false,isHI:false};try{resourcesList=scanDocumentResources(iframeDocument)}catch(e){log(\"sdr caught exception = \"+e)}if(isDD==true){resourcesList.isDD=true}if(isHI==true){resourcesList.isHI=true}var jsonString=JSON.stringify(resourcesList);@@SafeDKWebAppInterface@@.onResourcesCollected(sdkPackage,webviewAddress,eventId,jsonString)}var textContentUnder=function(currentDocument,element){var node;var textSet=new Set;try{if(element){var walk=currentDocument.createTreeWalker(element,NodeFilter.SHOW_TEXT,null,false);while(node=walk.nextNode()){var parent=node.parentElement;if(!parent)continue;if(parent.nodeType!=1)continue;var parentTag=parent.tagName.toLowerCase();if(parentTag==\"script\"||parentTag==\"noscript\"||parentTag==\"style\"||parentTag==\"iframe\")continue;if(isHidden(parent))continue;var text=node.textContent.trim();if(text==\"\")continue;if(text.length>1e3)continue;textSet.add(text)}}}catch(error){log(\"error : \"+error)}return textSet};var hookElementAttachShadow=function(){if(!window.ElementAttachShadow==undefined){window.ElementAttachShadow=true;var originalAttachShadow=Element.prototype.attachShadow;if(originalAttachShadow!=null){Element.prototype.attachShadow=function(init){var shadowRoot=originalAttachShadow.call(this,init);if(shadowRoot==null)return null;try{var yandexAdContainer=document.getElementById(\"ad_container\");if(yandexAdContainer!=null){if(init.mode===\"closed\"&&typeof WeakRef!==\"undefined\"){this.SafeDKShadowRootRef=new WeakRef(shadowRoot)}}}catch(error){log(\"error: \"+error)}return shadowRoot}}}};var collectTextFromDocument=function(currentDoc,textSet){try{hookElementAttachShadow();var texts=textContentUnder(currentDoc,currentDoc.body);for(var text of texts){textSet.add(\"text:\"+text)}}catch(error){log(\"error: \"+error)}};var collectComments=function(currentDoc,textSet){try{const comments=[];const walker=currentDoc.createTreeWalker(currentDoc.childNodes[0],NodeFilter.SHOW_COMMENT);while(walker.nextNode()){textSet.add(\"comment:\"+walker.currentNode.nodeValue)}}catch(error){log(\"error: \"+error)}};traverseIframes(document)};try{window.safedkResCollectionFunc()}catch(e){}\n";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f62930p = "(function(){var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var LOG_PREFIX=\"Dsp detect \"+sdkId+\", \"+webviewAddress+\" \";var OUTER_IFRAME_SELECTOR='iframe[test-id=\"mraid-frame\"]';var INNER_ID=\"mrail_iframe\";var TARGET_ID=\"adReportCloseBtn\";var TARGET_SELECTOR=\"#\"+TARGET_ID;function Log(s){try{(typeof log===\"function\"?log:console.log)(LOG_PREFIX+s)}catch(e){}}function installInnerDocObserver(doc){try{if(!doc||!doc.documentElement)return;Log(\"[inner] installing observer…\");var W=doc.defaultView||window;var mo=new W.MutationObserver(function(ms){var i,j,n,found;try{var el=doc.getElementById(TARGET_ID);if(el&&el.id===TARGET_ID){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,webviewAddress,0,0);Log(\"[inner] request no sampling done \");return}}catch(e){Log(\"[inner] notifyTargetDetected getElementById error : \"+e)}});mo.observe(doc.documentElement,{childList:true,subtree:true});Log(\"[inner] observer installed\")}catch(e){Log(\"[inner] install error: \"+String(e&&e.message))}}function wireInnerIframe(innerIframe){if(!innerIframe||innerIframe.__safedk_imdsp_wired)return;innerIframe.__safedk_imdsp_wired=true;function tryInstall(){try{var d2=innerIframe.contentDocument||innerIframe.contentWindow&&innerIframe.contentWindow.document;if(!d2||!d2.documentElement){Log(\"[outer] inner doc not ready\");return}if(d2.readyState===\"loading\"){d2.addEventListener(\"DOMContentLoaded\",function(){Log(\"[outer] inner DOMContentLoaded\");installInnerDocObserver(d2)},false)}else{Log(\"[outer] inner doc ready\");installInnerDocObserver(d2)}}catch(e){Log(\"[outer] inner tryInstall error: \"+String(e&&e.message))}}tryInstall();innerIframe.addEventListener(\"load\",function(){Log(\"[outer] inner iframe load\");tryInstall()},false)}function wireInnerInOuterDoc(outerDoc){try{if(!outerDoc||outerDoc.__safedk_imdsp_wiredInnerFinder)return;outerDoc.__safedk_imdsp_wiredInnerFinder=true;var f=outerDoc.getElementById?outerDoc.getElementById(INNER_ID):null;if(f){Log(\"[outer] found inner iframe #\"+(f.id||\"?\"));wireInnerIframe(f)}try{var el=outerDoc.querySelector?outerDoc.querySelector(TARGET_SELECTOR):null;if(el){Log(\"[outer] target present in outer doc — installing inner observer here\");installInnerDocObserver(outerDoc)}}catch(_){}var W=outerDoc.defaultView||window;var onceMo=new W.MutationObserver(function(ms){var i,j,n,found;for(i=0;i<ms.length;i++){var added=ms[i].addedNodes;if(!added)continue;for(j=0;j<added.length;j++){n=added[j];if(!n||n.nodeType!==1)continue;if(n.tagName===\"IFRAME\"&&n.id===INNER_ID){Log(\"[outer] inner iframe inserted\");wireInnerIframe(n);try{onceMo.disconnect()}catch(_){}return}if(n.querySelector){try{found=n.querySelector(\"#\"+INNER_ID);if(found){Log(\"[outer] inner iframe inserted (subtree)\");wireInnerIframe(found);try{onceMo.disconnect()}catch(_){}return}}catch(_){}}}}});onceMo.observe(outerDoc.documentElement,{childList:true,subtree:true})}catch(e){Log(\"[outer] wireInnerInOuterDoc error: \"+String(e&&e.message))}}function handleOuterIframe(outerIframe){if(!outerIframe||outerIframe.__safedk_imdsp_wiredOuter)return;outerIframe.__safedk_imdsp_wiredOuter=true;function tryOuter(){try{var d1=outerIframe.contentDocument||outerIframe.contentWindow&&outerIframe.contentWindow.document;if(!d1||!d1.documentElement){Log(\"[top] outer doc not ready\");return}wireInnerInOuterDoc(d1)}catch(e){Log(\"[top] tryOuter error: \"+String(e&&e.message))}}tryOuter();outerIframe.addEventListener(\"load\",function(){Log(\"[top] outer iframe load\");tryOuter()},false)}function scanExistingOuterIframe(){var rootDoc=document;try{var el=rootDoc.querySelector?rootDoc.querySelector(OUTER_IFRAME_SELECTOR):null;if(el){Log(\"[top] found outer iframe via selector\");handleOuterIframe(el);return true}}catch(_){}return false}function watchForOuterIframe(){var rootDoc=document;var W=rootDoc.defaultView||window;var mo=new W.MutationObserver(function(ms){var i,j,n,found;for(i=0;i<ms.length;i++){var added=ms[i].addedNodes;if(!added)continue;for(j=0;j<added.length;j++){n=added[j];if(!n||n.nodeType!==1)continue;if(n.tagName===\"IFRAME\"){if(n.matches&&n.matches(OUTER_IFRAME_SELECTOR)||n.getAttribute&&n.getAttribute(\"test-id\")===\"mraid-frame\"){handleOuterIframe(n);continue}}if(n.querySelector){try{found=n.querySelector(OUTER_IFRAME_SELECTOR);if(found){handleOuterIframe(found)}}catch(_){}}}}});mo.observe(rootDoc.documentElement,{childList:true,subtree:true});rootDoc.__safedk_imdsp_outerWatch=mo;Log(\"[top] outer-iframe watcher installed\")}function start(){var doc=document;Log(\"[top] document ready state=\"+doc.readyState);var had=scanExistingOuterIframe();if(!had){watchForOuterIframe();Log(\"[top] no outer iframe right now; watcher will catch it\")}}start()})();\n";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f62931q = "(function(){function inject(){{{SCRIPT_TO_WRAP}}}if(document.readyState===\"loading\"){document.addEventListener(\"DOMContentLoaded\",inject)}else{inject()}})();\n";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f62933t = "privacy";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f62934u = "end_of_video";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f62935v = "extract_text";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f62936w = "xml_http_request";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f62937x = "(function(){var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var LOG_PREFIX=\"Dsp detect \"+sdkId+\", \"+webviewAddress+\" \";var OUTER_IFRAME_SELECTOR='iframe[test-id=\"mraid-frame\"]';var INNER_ID=\"mrail_iframe\";var TARGET_ID=\"adReportCloseBtn\";var TARGET_SELECTOR=\"#\"+TARGET_ID;function Log(s){try{(typeof log===\"function\"?log:console.log)(LOG_PREFIX+s)}catch(e){}}function installInnerDocObserver(doc){try{if(!doc||!doc.documentElement)return;Log(\"[inner] installing observer…\");var W=doc.defaultView||window;var mo=new W.MutationObserver(function(ms){var i,j,n,found;try{var el=doc.getElementById(TARGET_ID);if(el&&el.id===TARGET_ID){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,webviewAddress,0,0);Log(\"[inner] request no sampling done \");return}}catch(e){Log(\"[inner] notifyTargetDetected getElementById error : \"+e)}});mo.observe(doc.documentElement,{childList:true,subtree:true});Log(\"[inner] observer installed\")}catch(e){Log(\"[inner] install error: \"+String(e&&e.message))}}function wireInnerIframe(innerIframe){if(!innerIframe||innerIframe.__safedk_imdsp_wired)return;innerIframe.__safedk_imdsp_wired=true;function tryInstall(){try{var d2=innerIframe.contentDocument||innerIframe.contentWindow&&innerIframe.contentWindow.document;if(!d2||!d2.documentElement){Log(\"[outer] inner doc not ready\");return}if(d2.readyState===\"loading\"){d2.addEventListener(\"DOMContentLoaded\",function(){Log(\"[outer] inner DOMContentLoaded\");installInnerDocObserver(d2)},false)}else{Log(\"[outer] inner doc ready\");installInnerDocObserver(d2)}}catch(e){Log(\"[outer] inner tryInstall error: \"+String(e&&e.message))}}tryInstall();innerIframe.addEventListener(\"load\",function(){Log(\"[outer] inner iframe load\");tryInstall()},false)}function wireInnerInOuterDoc(outerDoc){try{if(!outerDoc||outerDoc.__safedk_imdsp_wiredInnerFinder)return;outerDoc.__safedk_imdsp_wiredInnerFinder=true;var f=outerDoc.getElementById?outerDoc.getElementById(INNER_ID):null;if(f){Log(\"[outer] found inner iframe #\"+(f.id||\"?\"));wireInnerIframe(f)}try{var el=outerDoc.querySelector?outerDoc.querySelector(TARGET_SELECTOR):null;if(el){Log(\"[outer] target present in outer doc — installing inner observer here\");installInnerDocObserver(outerDoc)}}catch(_){}var W=outerDoc.defaultView||window;var onceMo=new W.MutationObserver(function(ms){var i,j,n,found;for(i=0;i<ms.length;i++){var added=ms[i].addedNodes;if(!added)continue;for(j=0;j<added.length;j++){n=added[j];if(!n||n.nodeType!==1)continue;if(n.tagName===\"IFRAME\"&&n.id===INNER_ID){Log(\"[outer] inner iframe inserted\");wireInnerIframe(n);try{onceMo.disconnect()}catch(_){}return}if(n.querySelector){try{found=n.querySelector(\"#\"+INNER_ID);if(found){Log(\"[outer] inner iframe inserted (subtree)\");wireInnerIframe(found);try{onceMo.disconnect()}catch(_){}return}}catch(_){}}}}});onceMo.observe(outerDoc.documentElement,{childList:true,subtree:true})}catch(e){Log(\"[outer] wireInnerInOuterDoc error: \"+String(e&&e.message))}}function handleOuterIframe(outerIframe){if(!outerIframe||outerIframe.__safedk_imdsp_wiredOuter)return;outerIframe.__safedk_imdsp_wiredOuter=true;function tryOuter(){try{var d1=outerIframe.contentDocument||outerIframe.contentWindow&&outerIframe.contentWindow.document;if(!d1||!d1.documentElement){Log(\"[top] outer doc not ready\");return}wireInnerInOuterDoc(d1)}catch(e){Log(\"[top] tryOuter error: \"+String(e&&e.message))}}tryOuter();outerIframe.addEventListener(\"load\",function(){Log(\"[top] outer iframe load\");tryOuter()},false)}function scanExistingOuterIframe(){var rootDoc=document;try{var el=rootDoc.querySelector?rootDoc.querySelector(OUTER_IFRAME_SELECTOR):null;if(el){Log(\"[top] found outer iframe via selector\");handleOuterIframe(el);return true}}catch(_){}return false}function watchForOuterIframe(){var rootDoc=document;var W=rootDoc.defaultView||window;var mo=new W.MutationObserver(function(ms){var i,j,n,found;for(i=0;i<ms.length;i++){var added=ms[i].addedNodes;if(!added)continue;for(j=0;j<added.length;j++){n=added[j];if(!n||n.nodeType!==1)continue;if(n.tagName===\"IFRAME\"){if(n.matches&&n.matches(OUTER_IFRAME_SELECTOR)||n.getAttribute&&n.getAttribute(\"test-id\")===\"mraid-frame\"){handleOuterIframe(n);continue}}if(n.querySelector){try{found=n.querySelector(OUTER_IFRAME_SELECTOR);if(found){handleOuterIframe(found)}}catch(_){}}}}});mo.observe(rootDoc.documentElement,{childList:true,subtree:true});rootDoc.__safedk_imdsp_outerWatch=mo;Log(\"[top] outer-iframe watcher installed\")}function start(){var doc=document;Log(\"[top] document ready state=\"+doc.readyState);var had=scanExistingOuterIframe();if(!had){watchForOuterIframe();Log(\"[top] no outer iframe right now; watcher will catch it\")}}start()})();\n";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Context f62940s;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final CharSequence f62938y = "https://webview.unityads.unity3d.com/webview/";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final CharSequence f62939z = "UnityAdsWebApp.html";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final List<String> f62914A = Arrays.asList("document.write", "(function()");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map<String, WeakReference<WebView>> f62932r = new HashMap();

    public SafeDKWebAppInterface(Context c2) {
        this.f62940s = c2;
    }

    @JavascriptInterface
    public void postMessage(String msg) {
        boolean z2;
        String string;
        boolean z3;
        boolean z4;
        boolean z5;
        String string2;
        String string3;
        Logger.d(f62915a, "postMessage : msg = ", msg);
        try {
            if (n.l(msg)) {
                JSONObject jSONObject = new JSONObject(msg);
                if (!jSONObject.has("status")) {
                    z2 = false;
                    string = null;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                } else {
                    string = jSONObject.getString("status");
                    if (jSONObject.get("status").equals(f62917c)) {
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    } else if (jSONObject.get("status").equals(f62918d)) {
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                    } else if (jSONObject.get("status").equals(f62919e)) {
                        z2 = true;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    } else if (jSONObject.get("status").equals(f62920f)) {
                        z2 = false;
                        z3 = true;
                        z4 = false;
                        z5 = false;
                    } else if (!jSONObject.get("status").equals(f62921g)) {
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        z5 = false;
                    }
                }
                if (!jSONObject.has(f62922h)) {
                    string2 = null;
                } else {
                    string2 = jSONObject.getString(f62922h);
                }
                if (!jSONObject.has(f62924j)) {
                    string3 = null;
                } else {
                    string3 = jSONObject.getString(f62924j);
                }
                Object[] objArr = new Object[8];
                objArr[0] = "postMessage : status = ";
                objArr[1] = string;
                objArr[2] = ", sdk_id = ";
                objArr[3] = string2;
                objArr[4] = ", address = ";
                objArr[5] = string3;
                objArr[6] = ", src = ";
                objArr[7] = jSONObject.has("src") ? jSONObject.get("src") : "NA";
                Logger.d(f62915a, objArr);
                if (string2 != null && !z2 && !z3 && !z4) {
                    CreativeInfoManager.a(string2, string3, z5, "js");
                    return;
                }
                if (string2 != null && string3 != null) {
                    if (z3) {
                        CreativeInfoManager.g(string2);
                    } else if (z4) {
                        CreativeInfoManager.h(string2);
                    } else {
                        CreativeInfoManager.f(string2);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62915a, "Received msg is not a JSON object : ", msg, ", ex : ", e2.getMessage(), e2);
        }
    }

    @JavascriptInterface
    public void logMessage(String msg) {
        Logger.d(f62915a, "logMessage msg = ", msg);
    }

    @JavascriptInterface
    public void interceptXmlHttpRequest(String message) {
        Logger.d(f62915a, "interceptXmlHttpRequest - message= ", message);
        try {
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(new JSONObject(message).getString(f62923i));
            if (adNetworkDiscoveryJ != null) {
                adNetworkDiscoveryJ.y(message);
            }
        } catch (JSONException e2) {
            Logger.d(f62915a, "interceptXmlHttpRequest - encountered json exception= ", e2);
        } catch (Exception e3) {
            Logger.d(f62915a, "interceptXmlHttpRequest - encountered exception= ", e3);
        }
    }

    public static String a(String str, String str2) {
        Logger.d(f62915a, "getXMLHttpRequestJsScript: sdk= ", str, ", webviewAddress= ", str2);
        return f62928n.replace("{{webviewAddress}}", str2).replace("{{SDK_ID}}", str).replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.requestNoSampling").replace("messageHandlers.safedkDebug.interceptXmlHttpRequest", "SafeDKWebAppInterface.interceptXmlHttpRequest");
    }

    public static String b(String str, String str2) {
        Logger.d(f62915a, "getDspDetectPrivacyWindowsScript: sdk= ", str, ", webviewAddress= ", str2);
        return "javascript:" + "(function(){var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var LOG_PREFIX=\"Dsp detect \"+sdkId+\", \"+webviewAddress+\" \";var OUTER_IFRAME_SELECTOR='iframe[test-id=\"mraid-frame\"]';var INNER_ID=\"mrail_iframe\";var TARGET_ID=\"adReportCloseBtn\";var TARGET_SELECTOR=\"#\"+TARGET_ID;function Log(s){try{(typeof log===\"function\"?log:console.log)(LOG_PREFIX+s)}catch(e){}}function installInnerDocObserver(doc){try{if(!doc||!doc.documentElement)return;Log(\"[inner] installing observer…\");var W=doc.defaultView||window;var mo=new W.MutationObserver(function(ms){var i,j,n,found;try{var el=doc.getElementById(TARGET_ID);if(el&&el.id===TARGET_ID){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,webviewAddress,0,0);Log(\"[inner] request no sampling done \");return}}catch(e){Log(\"[inner] notifyTargetDetected getElementById error : \"+e)}});mo.observe(doc.documentElement,{childList:true,subtree:true});Log(\"[inner] observer installed\")}catch(e){Log(\"[inner] install error: \"+String(e&&e.message))}}function wireInnerIframe(innerIframe){if(!innerIframe||innerIframe.__safedk_imdsp_wired)return;innerIframe.__safedk_imdsp_wired=true;function tryInstall(){try{var d2=innerIframe.contentDocument||innerIframe.contentWindow&&innerIframe.contentWindow.document;if(!d2||!d2.documentElement){Log(\"[outer] inner doc not ready\");return}if(d2.readyState===\"loading\"){d2.addEventListener(\"DOMContentLoaded\",function(){Log(\"[outer] inner DOMContentLoaded\");installInnerDocObserver(d2)},false)}else{Log(\"[outer] inner doc ready\");installInnerDocObserver(d2)}}catch(e){Log(\"[outer] inner tryInstall error: \"+String(e&&e.message))}}tryInstall();innerIframe.addEventListener(\"load\",function(){Log(\"[outer] inner iframe load\");tryInstall()},false)}function wireInnerInOuterDoc(outerDoc){try{if(!outerDoc||outerDoc.__safedk_imdsp_wiredInnerFinder)return;outerDoc.__safedk_imdsp_wiredInnerFinder=true;var f=outerDoc.getElementById?outerDoc.getElementById(INNER_ID):null;if(f){Log(\"[outer] found inner iframe #\"+(f.id||\"?\"));wireInnerIframe(f)}try{var el=outerDoc.querySelector?outerDoc.querySelector(TARGET_SELECTOR):null;if(el){Log(\"[outer] target present in outer doc — installing inner observer here\");installInnerDocObserver(outerDoc)}}catch(_){}var W=outerDoc.defaultView||window;var onceMo=new W.MutationObserver(function(ms){var i,j,n,found;for(i=0;i<ms.length;i++){var added=ms[i].addedNodes;if(!added)continue;for(j=0;j<added.length;j++){n=added[j];if(!n||n.nodeType!==1)continue;if(n.tagName===\"IFRAME\"&&n.id===INNER_ID){Log(\"[outer] inner iframe inserted\");wireInnerIframe(n);try{onceMo.disconnect()}catch(_){}return}if(n.querySelector){try{found=n.querySelector(\"#\"+INNER_ID);if(found){Log(\"[outer] inner iframe inserted (subtree)\");wireInnerIframe(found);try{onceMo.disconnect()}catch(_){}return}}catch(_){}}}}});onceMo.observe(outerDoc.documentElement,{childList:true,subtree:true})}catch(e){Log(\"[outer] wireInnerInOuterDoc error: \"+String(e&&e.message))}}function handleOuterIframe(outerIframe){if(!outerIframe||outerIframe.__safedk_imdsp_wiredOuter)return;outerIframe.__safedk_imdsp_wiredOuter=true;function tryOuter(){try{var d1=outerIframe.contentDocument||outerIframe.contentWindow&&outerIframe.contentWindow.document;if(!d1||!d1.documentElement){Log(\"[top] outer doc not ready\");return}wireInnerInOuterDoc(d1)}catch(e){Log(\"[top] tryOuter error: \"+String(e&&e.message))}}tryOuter();outerIframe.addEventListener(\"load\",function(){Log(\"[top] outer iframe load\");tryOuter()},false)}function scanExistingOuterIframe(){var rootDoc=document;try{var el=rootDoc.querySelector?rootDoc.querySelector(OUTER_IFRAME_SELECTOR):null;if(el){Log(\"[top] found outer iframe via selector\");handleOuterIframe(el);return true}}catch(_){}return false}function watchForOuterIframe(){var rootDoc=document;var W=rootDoc.defaultView||window;var mo=new W.MutationObserver(function(ms){var i,j,n,found;for(i=0;i<ms.length;i++){var added=ms[i].addedNodes;if(!added)continue;for(j=0;j<added.length;j++){n=added[j];if(!n||n.nodeType!==1)continue;if(n.tagName===\"IFRAME\"){if(n.matches&&n.matches(OUTER_IFRAME_SELECTOR)||n.getAttribute&&n.getAttribute(\"test-id\")===\"mraid-frame\"){handleOuterIframe(n);continue}}if(n.querySelector){try{found=n.querySelector(OUTER_IFRAME_SELECTOR);if(found){handleOuterIframe(found)}}catch(_){}}}}});mo.observe(rootDoc.documentElement,{childList:true,subtree:true});rootDoc.__safedk_imdsp_outerWatch=mo;Log(\"[top] outer-iframe watcher installed\")}function start(){var doc=document;Log(\"[top] document ready state=\"+doc.readyState);var had=scanExistingOuterIframe();if(!had){watchForOuterIframe();Log(\"[top] no outer iframe right now; watcher will catch it\")}}start()})();\n".replace("{{webviewAddress}}", str2).replace("{{SDK_ID}}", str).replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.requestNoSampling");
    }

    @JavascriptInterface
    public void requestNoSampling(String sdkPackageName, String address, int height, int width) {
        Logger.d(f62915a, Logger.FeatureTag.AD_CAPTURE, "request no sampling : PP detection for address = ", address, ", height = ", Integer.valueOf(height), " , width = ", Integer.valueOf(width));
        if (!com.safedk.android.analytics.brandsafety.b.e(address, l.f62662q)) {
            com.safedk.android.analytics.brandsafety.b.a(address, l.f62662q, new l.a[0]);
        }
        if (height == 0 && width == 0) {
            CreativeInfoManager.a(sdkPackageName, address);
            return;
        }
        if (n.a(width, height)) {
            Logger.d(f62915a, "request no sampling calling banner requestNoSampling, : address = ", address);
            CreativeInfoManager.a(sdkPackageName, BrandSafetyUtils.AdType.BANNER, address);
        } else if (n.b(width, height)) {
            Logger.d(f62915a, "request no sampling calling MREC requestNoSampling, : address = ", address);
            CreativeInfoManager.a(sdkPackageName, BrandSafetyUtils.AdType.MREC, address);
        } else if (b.getInstance().isInterstitialActivity(b.getInstance().getForegroundActivity())) {
            Logger.d(f62915a, "request no sampling calling interstitial requestNoSampling, : address = ", address);
            CreativeInfoManager.b(sdkPackageName, address);
        } else {
            Logger.d(f62915a, "request no sampling WebView is non a banner nor an interstitial, probably MREC, : address = ", address);
        }
    }

    private boolean b(String str) {
        for (String str2 : f62914A) {
            if (str != null && str.contains(str2)) {
                Logger.d(f62915a, "should add text : skipping text ", str);
                return false;
            }
        }
        Logger.d(f62915a, "should add text : eligible text ", str);
        return true;
    }

    public static void a(String str, final WebView webView, final String str2, final boolean z2) {
        final String strA = BrandSafetyUtils.a((Object) webView);
        String str3 = n.a((Object) str2) ? str2 : AppLovinEventTypes.USER_VIEWED_CONTENT;
        SafeDK safeDK = SafeDK.getInstance();
        Logger.d(f62915a, "addJScript started sdkPackage=", str, ", webView=", strA, ", url=", str3, ", isMaxInit=", Boolean.valueOf(SafeDK.ab()));
        if (!SafeDK.ab() || safeDK == null || str2 == null) {
            Logger.d(f62915a, "addJScript loaded url is empty or app not initialized yet, skipping.");
            return;
        }
        if (webView == null || webView.getContext() == null) {
            Logger.d(f62915a, "addJScript WebView is null or WebView context is null. skipping.");
            return;
        }
        final String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (CreativeInfoManager.j(mainSdkPackage) == null) {
            Logger.d(f62915a, "addJScript not supported sdkPackage: ", mainSdkPackage, XIvb.XhmCFNnuUL);
            return;
        }
        if (!safeDK.i() || str2.contains(f62938y) || str2.contains(f62939z)) {
            if (str2.startsWith("javascript:")) {
                Logger.d(f62915a, "addJScript loaded data is javascript, ignoring. url : ", str3);
                return;
            } else {
                SafeDKApplication.runOnUiThread(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (z2) {
                            SafeDKWebAppInterface.b(webView, strA);
                        } else {
                            SafeDKWebAppInterface.b(mainSdkPackage, webView, str2, strA);
                        }
                    }
                });
                return;
            }
        }
        Logger.d(f62915a, "addJScript skipped url ", str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(WebView webView, String str) {
        webView.addJavascriptInterface(new SafeDKWebAppInterface(webView.getContext()), f62915a);
        Logger.d(f62915a, "addJScript javascript interface added, WebView address is ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2, String str3) {
        if (SafeDK.S() && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        Logger.d(f62915a, "addJScript javascript interface added, WebView address is ", str3);
        if (SafeDK.S() && Build.VERSION.SDK_INT >= 19) {
            Logger.d(f62915a, "addJScript testing javascript call. WebView address is ", str3);
            webView.evaluateJavascript("javascript:console.log('adding js interface. success : ' + (typeof(window.SafeDKWebAppInterface.logMessage)=='function'));", null);
            webView.evaluateJavascript("javascript:window.SafeDKWebAppInterface.logMessage('adding js interface');", null);
        }
        b(str, webView, str2);
    }

    public static String a(String str, String str2, String str3) {
        return str3.replace("window.webkit.", "window.").replace("messageHandlers.safedkNoSamplingExc.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.requestNoSampling").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("{{SDK_ID}}", str).replace("{{ADDRESS}}", str2);
    }

    public static String c(String str, String str2) {
        String strReplace = f62926l.replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkVideoExc.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkVideo", f62915a).replace("{{SDK_ID}}", str).replace("{{ADDRESS}}", str2);
        com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(str);
        if (bVarK != null && bVarK.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
            return strReplace.replace("{{shouldTraverseIframes}}", "true");
        }
        return strReplace;
    }

    public static String b(String str, String str2, String str3) {
        Logger.d(f62915a, "getting Resources Collection JS of webpage: ", str2);
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        String strReplace = f62929o.replace("{{webviewAddress}}", str2).replace("{{sdkPackage}}", str).replace("@@SafeDKWebAppInterface@@", f62915a);
        if (str3 == null) {
            str3 = "";
        }
        sb.append(strReplace.replace("{{eventId}}", str3));
        return sb.toString();
    }

    @JavascriptInterface
    public void onResourcesCollected(String packageName, String webviewAddress, String eventId, String msg) {
        Boolean bool;
        Boolean bool2;
        Logger.printFullVerboseLog(f62915a, "on resources collected - package: ", packageName, " webviewAddress: ", webviewAddress, ", msg: ", msg);
        try {
            if (!f62932r.containsKey(webviewAddress)) {
                Logger.d(f62915a, "no webview found for address: ", webviewAddress);
                return;
            }
            JSONObject jSONObject = new JSONObject(msg);
            ArrayList arrayList = new ArrayList(com.safedk.android.utils.d.b(jSONObject.getJSONArray("urls")));
            arrayList.addAll(com.safedk.android.utils.d.b(jSONObject.getJSONArray("dataUris")));
            ArrayList arrayList2 = new ArrayList(com.safedk.android.utils.d.b(jSONObject.getJSONArray("unfilteredUrls")));
            JSONArray jSONArray = jSONObject.getJSONArray("videoUrls");
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList3.add(CreativeInfo.aq + jSONArray.getString(i2));
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("textResources");
            ArrayList arrayList4 = new ArrayList();
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                String string = jSONArray2.getString(i3);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        if (b(string)) {
                            arrayList4.add(string);
                        }
                    } catch (Throwable th) {
                        th = th;
                        Logger.d(f62915a, Logger.FeatureTag.JS_RESOURCES, "on Resources Collected error with json: ", th);
                        return;
                    }
                }
            }
            if (!jSONObject.has("isDD")) {
                bool = null;
            } else {
                bool = jSONObject.getBoolean("isDD") ? Boolean.TRUE : Boolean.FALSE;
            }
            if (!jSONObject.has("isHI")) {
                bool2 = null;
            } else {
                bool2 = jSONObject.getBoolean("isHI") ? Boolean.TRUE : Boolean.FALSE;
            }
            ArrayList arrayList5 = new ArrayList(com.safedk.android.utils.d.b(jSONObject.getJSONArray("hidden")));
            WeakReference<WebView> weakReference = f62932r.get(webviewAddress);
            com.safedk.android.analytics.brandsafety.creatives.g.a(packageName, webviewAddress, weakReference, eventId, arrayList, false, bool, bool2, arrayList5);
            com.safedk.android.analytics.brandsafety.creatives.g.a(packageName, webviewAddress, weakReference, eventId, arrayList2, true, bool, bool2, null);
            com.safedk.android.analytics.brandsafety.creatives.g.a(packageName, webviewAddress, weakReference, eventId, arrayList3, true, bool, bool2, null);
            com.safedk.android.analytics.brandsafety.creatives.g.a(packageName, webviewAddress, weakReference, eventId, arrayList4, true, bool, bool2, null);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void b(String str, WebView webView, String str2) {
        Object obj;
        String strA = BrandSafetyUtils.a((Object) webView);
        SafeDK safeDK = SafeDK.getInstance();
        if (SafeDK.ab() && safeDK != null && !SafeDK.getInstance().i()) {
            com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(str);
            if (bVarK == null) {
                Logger.d(f62915a, "attachJsScript configBundle is empty, existing");
                return;
            }
            if (!bVarK.b(AdNetworkConfiguration.INJECT_SCRIPTS_IF_URL_IS_NULL) && (str2 == null || str2.equalsIgnoreCase("about:blank") || str2.trim().length() == 0)) {
                Logger.d(f62915a, "attachJsScript url is blank, skipping scripts injection. sdkPackage = ", str, ", webView = ", webView);
                return;
            }
            if (str2.length() < 20480) {
                Logger.d(f62915a, "attachJsScript sdkPackage = ", str, ", webView = ", webView, " url = ", str2);
            } else {
                Logger.d(f62915a, "attachJsScript sdkPackage = ", str, ", webView = ", webView, " url too long (probably html, size is ", Integer.valueOf(str2.length()), " ) ");
            }
            HashMap map = new HashMap();
            if (bVarK == null) {
                Logger.d(f62915a, "attachJsScript sdk ", str, " config bundle is empty");
            } else {
                Logger.d(f62915a, "attachJsScript sdk ", str, " items: js privacy fullscreen  : ", Boolean.valueOf(bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, false)), ", js privacy banner  : ", Boolean.valueOf(bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false)), ", js privacy mrec  : ", Boolean.valueOf(bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false)), ", js video : ", Boolean.valueOf(bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false)), ", js text extraction : ", Boolean.valueOf(bVarK.a(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true)));
            }
            if (bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, false) || bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false) || bVarK.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false)) {
                String strA2 = bVarK.a(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, (String) null);
                if (strA2 == null || strA2.length() <= 0) {
                    Logger.d(f62915a, "attachJsScript privacy button click detection script is empty, skipping.");
                } else {
                    map.put(f62933t, a(str, strA, strA2));
                    Logger.d(f62915a, "attachJsScript added ", str, " privacy button click detection script to list, address=", strA);
                }
            }
            if (!bVarK.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION) || bVarK.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
                Logger.d(f62915a, "attachJsScript no need to add video state detection script. WebView : ", strA);
            } else {
                map.put(f62934u, c(str, strA));
                Logger.d(f62915a, "attachJsScript added ", str, " video state detection script to list. for webview: ", webView);
            }
            String strA3 = a(str, strA);
            Logger.d(f62915a, "attachJsScript adding Xml Http Request Js Script . WebView : ", strA);
            map.put(f62936w, strA3);
            for (String str3 : map.keySet()) {
                String str4 = "javascript:" + f62931q.replace("{{SCRIPT_TO_WRAP}}", (CharSequence) map.get(str3));
                if (!TextUtils.isEmpty(str4)) {
                    Logger.d(f62915a, "attachJsScript Injecting script for ", str, " WebView : ", strA, ", script : ", str3);
                    try {
                        if (Build.VERSION.SDK_INT >= 19) {
                            obj = null;
                            try {
                                webView.evaluateJavascript(str4, null);
                            } catch (Throwable th) {
                                th = th;
                                Logger.d(f62915a, "attachJsScript Exception injecting text extraction script : ", th.getMessage());
                            }
                        } else {
                            obj = null;
                            webView.loadUrl(str4);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                } else {
                    obj = null;
                }
            }
        }
    }

    public static void a(String str, final WebView webView, final String str2) {
        Logger.d(f62915a, "add Script For WebView started with sdk package: ", str, " and webview address: ", BrandSafetyUtils.a((Object) webView));
        webView.post(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        String strA = BrandSafetyUtils.a((Object) webView);
                        synchronized (SafeDKWebAppInterface.f62932r) {
                            SafeDKWebAppInterface.f62932r.put(strA, new WeakReference<>(webView));
                        }
                        webView.evaluateJavascript(str2, null);
                    }
                } catch (Throwable th) {
                    Logger.d(SafeDKWebAppInterface.f62915a, "add Script For WebView Exception injecting text extraction script : ", th.getMessage(), th);
                }
            }
        });
    }

    public static void a(String str) {
        synchronized (f62932r) {
            if (f62932r.remove(str) != null) {
                Logger.d(f62915a, "WebView address removed : ", str);
            }
        }
    }
}
