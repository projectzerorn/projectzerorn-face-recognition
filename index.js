import React,{Component,PropTypes} from 'react';
import{ requireNativeComponent, View, Platform } from 'react-native';
const FaceRecoNative = NativeModules.FaceNativeModule;
if (Platform.OS === 'ios') {

} else {
    var LibFaceRecoView = requireNativeComponent('RCTRecoFaceView', FaceRecoView);
}

class FaceRecoView extends Component {
    constructor(props) {
        super(props);
    }

    render() {

        return (
            <LibFaceRecoView {...this.props}/>
        );
    }
}
export default FaceRecoView;