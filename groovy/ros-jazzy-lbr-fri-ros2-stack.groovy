node {
    git url: 'https://github.com/lbr-stack/lbr_fri_ros2_stack.git', branch: 'jazzy'
    registerROS('ros:jazzy-ros-base', [
        'ros-jazzy-controller-interface',
        'ros-jazzy-fri-client-sdk',
        'ros-jazzy-kinematics-interface',
        'ros-jazzy-lbr-fri-idl',
        'ros-jazzy-moveit-ros-planning-interface',
        'ros-jazzy-realtime-tools'
    ], [
        'ros-jazzy-controller-manager',
        'ros-jazzy-joint-state-broadcaster',
        'ros-jazzy-joint-trajectory-controller'
    ])
}
