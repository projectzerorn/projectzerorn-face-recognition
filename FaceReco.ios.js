import {
	NativeModules
} from 'react-native';
const FaceRecoNative = NativeModules.RNFaceReconition;
export default class FaceReco {
	static startFaceReco() {
		FaceRecoNative.startFaceRecognition();
	}

}