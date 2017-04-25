import {
    NativeModules
} from 'react-native';
const FaceRecoNative = NativeModules.FaceNativeModule;
export default class FaceReco {
    static startFaceReco() {
        FaceRecoNative.startFaceRecognition();
    }

}