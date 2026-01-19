node {
    git url: 'https://github.com/ivanrulik/motoman_moveit_config.git', branch: 'main'
    registerROS('ros:jazzy-desktop-full', [
        'ros-jazzy-moveit-common',
        'ros-jazzy-moveit-ros-move-group',
        'ros-jazzy-moveit-ros-planning',
        'ros-jazzy-moveit-ros-planning-interface',
        'ros-jazzy-moveit-ros-visualization',
        'ros-jazzy-moveit-simple-controller-manager',
        'ros-jazzy-pilz-industrial-motion-planner',
        'ros-jazzy-ros2-control'
    ], [])
}
