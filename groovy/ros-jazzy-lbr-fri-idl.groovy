node {
    git url: 'https://github.com/lbr-stack/lbr_fri_idl.git', branch: 'fri-1'
    registerROS('ros:jazzy-ros-base', [
        'ros-jazzy-fri-client-sdk'
    ], [])
}
