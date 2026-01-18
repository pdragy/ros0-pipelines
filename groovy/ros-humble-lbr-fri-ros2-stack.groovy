node {
    git url: 'https://github.com/lbr-stack/lbr_fri_ros2_stack.git', branch: 'humble'
    registerROS('ros:humble-ros-base', [
        'ros-humble-controller-interface',
        'ros-humble-fri-client-sdk',
        'ros-humble-kinematics-interface',
        'ros-humble-lbr-fri-idl',
        'ros-humble-moveit-ros-planning-interface',
        'ros-humble-realtime-tools'
    ], [])
}
