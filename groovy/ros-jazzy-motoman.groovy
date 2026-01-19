node {
    git url: 'https://github.com/Yaskawa-Global/motoman_ros2_support_packages.git', branch: 'main'
    registerROS('ros:jazzy-ros-base', [], [
        'ros-jazzy-controller-manager',
        'ros-jazzy-joint-state-broadcaster',
        'ros-jazzy-joint-trajectory-controller'
    ])
}
